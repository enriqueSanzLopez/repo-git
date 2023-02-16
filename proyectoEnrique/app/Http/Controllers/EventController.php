<?php

namespace App\Http\Controllers;

use App\Models\Event;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;
use App\Http\Requests\EventRequest;
use App\Http\Requests\EventEditRequest;

class EventController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        //
        if(Auth::user()->rol=='admin'){//Si es el administrador, se le envian todas para que pueda acceder a ellas y modificarlas
            $events=Event::all();
        }else{//Si no, solo ve las visibles
            $events=Event::where('visible',1)->get();
        }
        return view('events.index', compact('events'));
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        //
        return view('events.create');
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(EventRequest $request)
    {
        //
        $event=new Event();
        $event->name=$request->get('name');
        $event->tags=$request->get('tags');
        $event->location=$request->get('location');
        $event->date=$request->get('date');
        $event->hour=$request->get('hour');
        $event->description=$request->get('description');
        $event->visible= $request->has('visible')? 1: 0;
        $event->save();
        return redirect(route('inicio'));
    }

    /**
     * Display the specified resource.
     *
     * @param  \App\Models\Event  $event
     * @return \Illuminate\Http\Response
     */
    public function show(Event $event)
    {

        $participa=0;
        if ($event->visible==1 or Auth::user()->rol=='admin') {
            return view('events.show', compact('event', 'participa'));
        } else {
            return redirect(route('inicio'));
        }
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  \App\Models\Event  $event
     * @return \Illuminate\Http\Response
     */
    public function edit(Event $event)
    {
        //
        return view('events.edit', compact('event'));
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \App\Models\Event  $event
     * @return \Illuminate\Http\Response
     */
    public function update(EventEditRequest $request, Event $event)
    {
        //
        $event->name=$request->get('name');
        $event->tags=$request->get('tags');
        $event->location=$request->get('location');
        $event->date=$request->get('date');
        $event->hour=$request->get('hour');
        $event->description=$request->get('description');
        $event->visible=$request->has('visible')? 1: 0;
        $event->save();
        return redirect(route('events.index'));
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Models\Event  $event
     * @return \Illuminate\Http\Response
     */
    public function destroy(Event $event)
    {
        //
        Event::findOrFail($event->id)->delete();
        return redirect(route('events.index'));
    }
}
