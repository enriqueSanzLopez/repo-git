<?php

namespace App\Http\Controllers\Api;

use App\Http\Controllers\Controller;
use App\Models\Task;
use App\Models\User;
use Illuminate\Http\Request;

class TaskApiController extends Controller
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
        //
    }

    /**
     * Display the specified resource.
     *
     * @param  \App\Models\Task  $task
     * @return \Illuminate\Http\Response
     */
    public function show(Task $task)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \App\Models\Task  $task
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, Task $task)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Models\Task  $task
     * @return \Illuminate\Http\Response
     */
    public function destroy(Task $task)
    {
        //
    }
    public function apuntar(Request $request){
        $task=Task::findOrFail($request->get('task'));
        $user = User::findOrFail($request->get('id'));
        $task->users()->attach($user->id);
        return response()->json(['success' => 'Exito en actualizar']);
    }
    public function desapuntar(Request $request){
        $task=Task::findOrFail($request->get('task'));
        $user = User::findOrFail($request->get('id'));
        $task->users()->detach($user->id);
        return response()->json(['success' => 'Exito en actualizar']);
    }
    public function cambiarEstado(Request $request){
        $task=Task::findOrFail($request->get('id'));
        $task->state=$request->get('estado');
        $task->save();
        return response()->json(['success' => 'Exito en actualizar']);
    }
}
