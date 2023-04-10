<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Sprint;

class SprintController extends Controller
{
    //
    public function index(){
        return view('sprints.index');
    }
}
