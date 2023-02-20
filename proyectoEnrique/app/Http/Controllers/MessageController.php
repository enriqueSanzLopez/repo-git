<?php

namespace App\Http\Controllers;

use App\Models\Message;
use Illuminate\Http\Request;
use App\Http\Requests\MessageRequest;
use Illuminate\Support\Facades\Auth;

class MessageController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        //
        if(!isset(Auth::user()->name)){
            return redirect('inicio');
        }else if(Auth::user()->rol!='admin'){
            return redirect('inicio');
        }
        $messages=Message::orderBy('created_at', 'DESC')->get();
        return view('messages.index', compact('messages'));
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        //
        return view('messages.create');
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(MessageRequest $request)
    {
        //
        $message=new Message();//Crear objeto de mensaje
        $message->name=$request->get('name');//Rellenar los campos obligatorios de mensaje
        $message->subject=$request->get('subject');
        $message->text=$request->get('text');
        $message->save();//Guardar el mensaje
        return redirect('/');//redirigir a la pagina principal
    }

    /**
     * Display the specified resource.
     *
     * @param  \App\Models\Message  $message
     * @return \Illuminate\Http\Response
     */
    public function show(Message $message)
    {
        //
        if(!isset(Auth::user()->name)){
            return redirect('inicio');
        }else if(Auth::user()->rol!='admin'){
            return redirect('inicio');
        }
        $message->readed=1;//Actualizar el mensaje a visto
        $message->save();
        return view('messages.show', compact('message'));
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  \App\Models\Message  $message
     * @return \Illuminate\Http\Response
     */
    public function edit(Message $message)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \App\Models\Message  $message
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, Message $message)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Models\Message  $message
     * @return \Illuminate\Http\Response
     */
    public function destroy(Message $message)
    {
        //
        if(!isset(Auth::user()->name)){
            return redirect('inicio');
        }else if(Auth::user()->rol!='admin'){
            return redirect('inicio');
        }
        Message::findOrFail($message->id)->delete();
        return redirect()->route('messages.index');
    }
}
