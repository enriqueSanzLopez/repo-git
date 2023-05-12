<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\User;
use Illuminate\Support\Facades\Auth;
use Spatie\IcalendarGenerator\Components\Calendar;

class CalendarController extends Controller
{
    //
    public function show(User $user){//En esta funcion se va a intentar crear un calendario y enviarlo a la vista
        if(!isset(Auth::user()->name)){
            return redirect('/');
        }
        $calendar=Calendar::create()->name('Calendario de usuario');//Crear el calendario
        $sprints=Auth::user()->tasks;//Conseguir todos los sprints del usuario
    }
}
