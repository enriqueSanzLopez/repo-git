<?php

namespace App\Http\Controllers\Api;

use App\Http\Controllers\Controller;
use App\Models\PMessage;
use Illuminate\Http\Request;

class PMessageApiController extends Controller
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
        $pMessage=new PMessage();
        $pMessage->user_id=$request->get('user_id');
        $pMessage->project_id=$request->get('project_id');
        $pMessage->fecha=$request->get('fecha');
        $pMessage->comentario=$request->get('comentario');
        $pMessage->save();
        return response()->json(['success' => 'El mensaje se ha guardado en la base de datos']);
    }

    /**
     * Display the specified resource.
     *
     * @param  \App\Models\PMessage  $pMessage
     * @return \Illuminate\Http\Response
     */
    public function show(PMessage $pMessage)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \App\Models\PMessage  $pMessage
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, PMessage $pMessage)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Models\PMessage  $pMessage
     * @return \Illuminate\Http\Response
     */
    public function destroy(PMessage $pMessage)
    {
        //
    }
}
