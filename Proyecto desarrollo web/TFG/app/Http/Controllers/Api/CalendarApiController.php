<?php

namespace App\Http\Controllers\Api;

use App\Http\Controllers\Controller;
use App\Models\User;
use Illuminate\Http\Request;
use Spatie\IcalendarGenerator\Components\Calendar;
use Spatie\IcalendarGenerator\Components\Event;
use Carbon\Carbon;

class CalendarApiController extends Controller
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
     * @param  \App\Models\User  $user
     * @return \Illuminate\Http\Response
     */
    public function show(User $user)
    {
        //
        $calendar=Calendar::create()->name('Calendario de usuario');//Crear el calendario
        $sprints=$user->sprints;//Conseguir todos los sprints del usuario
        foreach($sprints as $sprint){//Recorrer los sprints del usuario para crear los eventos del usuario
            $event=Event::create()->name($sprint->name)->description($sprint->description)->startsAt(Carbon::parse($sprint->start_date))->endsAt(Carbon::parse($sprint->limit_date));//Definir un evento por cada sprint
            foreach($sprint->users as $usuario){//Se recorre a todos los usuarios del sprint, y se los incluye en el evento
                $event->attendee($usuario->email, $usuario->name);
            }
            $calendar->event($event);//Una vez creado el evento, se incluye en el calendario
        }
        return response($calendar->get())->header('Content-Type', 'text/calendar; charset=UTF-8')->header('Content-Disposition', 'attachment; filename="calendar.ics"');//Devolver el calendario
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \App\Models\User  $user
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, User $user)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Models\User  $user
     * @return \Illuminate\Http\Response
     */
    public function destroy(User $user)
    {
        //
    }
}
