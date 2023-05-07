<?php

namespace App\Http\Controllers\Api;

use App\Http\Controllers\Controller;
use App\Models\TMessage;
use Illuminate\Http\Request;

class TMessageApiController extends Controller
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
        $tMessage=new TMessage();
        $tMessage->user_id=$request->get('user_id');
        $tMessage->task_id=$request->get('task_id');
        $tMessage->fecha=$request->get('fecha');
        $tMessage->comentario=$request->get('comentario');
        $tMessage->save();
        return response()->json(['success' => 'Exito en actualizar']);
    }

    /**
     * Display the specified resource.
     *
     * @param  \App\Models\TMessage  $tMessage
     * @return \Illuminate\Http\Response
     */
    public function show(TMessage $tMessage)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \App\Models\TMessage  $tMessage
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, TMessage $tMessage)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Models\TMessage  $tMessage
     * @return \Illuminate\Http\Response
     */
    public function destroy(TMessage $tMessage)
    {
        //
    }
}
