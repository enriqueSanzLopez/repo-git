<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class StaticController extends Controller
{
    //
    public function inicio(){
        return view('index');
    }
    public function politica(){
        return view('cookies.politica');
    }
    public function privacidad(){
        return view('cookies.privacidad');
    }
    public function configuracion(){
        return view('cookies.configuracion');
    }
    public function lugar(){
        return view('lugar');
    }
    public function cuenta(){
        return view('auth.account');
    }
}
