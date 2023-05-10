<?php

namespace App\Http\Controllers\Api;

use App\Http\Controllers\Controller;
use App\Models\Comment;
use App\Models\Task;
use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Validation\ValidationException;
use Symfony\Component\HttpFoundation\Response;
use Carbon\Carbon;
use Illuminate\Support\Facades\DB;

class CommentApiController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        $validatedData = $request->validate([
            'tarea' => 'required|integer',
            'user' => 'required|integer',
            'comment' => 'required|string',
        ]);
        $user_id=User::findOrFail($validatedData['user'])->id;
        $task_id=Task::findOrFail($validatedData['tarea'])->id;
        $fecha=date('Y-m-d H:i:s');
        DB::table('comments')->insert([
            'task_id'=>$task_id,
            'user_id'=>$user_id,
            'comment'=>$validatedData['comment'],
            'date'=>$fecha
        ]);
        return response()->json(['success' => 'Exito en actualizar', 'fecha'=>$fecha, 'name'=>User::findOrFail($validatedData['user'])->name, 'email'=>User::findOrFail($validatedData['user'])->email]);
    }

    /**
     * Display the specified resource.
     *
     * @param  \App\Models\Comment  $comment
     * @return \Illuminate\Http\Response
     */
    public function show(Comment $comment)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \App\Models\Comment  $comment
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, Comment $comment)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Models\Comment  $comment
     * @return \Illuminate\Http\Response
     */
    public function destroy(Comment $comment)
    {
        //
    }
}
