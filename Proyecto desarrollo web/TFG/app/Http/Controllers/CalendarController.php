<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\User;
use Illuminate\Support\Facades\Auth;
use Spatie\IcalendarGenerator\Components\Calendar;
use Spatie\IcalendarGenerator\Components\Event;
use Carbon\Carbon;

class CalendarController extends Controller
{
    //
    public function show(){//En esta funcion se va a intentar crear un calendario y enviarlo a la vista
        if(!isset(Auth::user()->name)){
            return redirect('/');
        }
        $calendar=Calendar::create()->name('Calendario de usuario');//Crear el calendario
        $sprints=Auth::user()->sprints;//Conseguir todos los sprints del usuario
        foreach($sprints as $sprint){//Recorrer los sprints del usuario para crear los eventos del usuario
            $event=Event::create()->name($sprint->name)->description($sprint->description)->startsAt(Carbon::parse($sprint->start_date))->endsAt(Carbon::parse($sprint->limit_date));//Definir un evento por cada sprint
            foreach($sprint->users as $user){//Se recorre a todos los usuarios del sprint, y se los incluye en el evento
                $event->attendee($user->email, $user->name);
            }
            $calendar->event($event);//Una vez creado el evento, se incluye en el calendario
        }
        return response($calendar->get())->header('Content-Type', 'text/calendar; charset=utf-8');//Devolver el calendario
    }
}
