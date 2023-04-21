<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Sprint;
use App\Models\Project;
use Illuminate\Support\Facades\Auth;
use App\Http\Requests\SprintCreateRequest;

class SprintController extends Controller
{
    //
    public function index(){
        if (Auth::user()->rol == 'admin') {
            $sprints = Sprint::all();
        } else {
            $sprints = Auth::user()->sprints;
        }
        return view('sprints.index', compact('sprints'));
    }
    public function create()
    {
        $projects=Project::all();
        return view('sprints.create', compact('projects'));
    }
    public function store(SprintCreateRequest $request){
        if (!isset(Auth::user()->name)) {
            return redirect('/');
        }
        $sprint=new Sprint();
        $sprint->project=$request->get('project');
        $sprint->start_date=$request->get('start_date');
        $sprint->limit_date=$request->get('limit_date');
        $sprint->backlog=$request->get('backlog');
        $sprint->description=$request->get('description');
        $sprint->retrospective=$request->get('retrospective');
        $sprint->save();
        return redirect('sprints');
    }
    public function show(Sprint $sprint){
        return view('sprints.show', compact('sprint'));
    }
}
