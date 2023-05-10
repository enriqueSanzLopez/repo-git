<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Sprint;
use App\Models\Project;
use Illuminate\Support\Facades\Auth;
use App\Http\Requests\SprintCreateRequest;
use App\Http\Requests\SprintEditRequest;

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
        if(Auth::user()->rol=='admin'){
            $projects=Project::all();
        }else{
            $projects=Project::where('owner', Auth::user()->id)->get();
        }
        return view('sprints.create', compact('projects'));
    }
    public function store(SprintCreateRequest $request){
        if (!isset(Auth::user()->name)) {
            return redirect('/');
        }
        $sprint=new Sprint();
        $sprint->project_id=$request->get('project_id');
        $sprint->name=$request->get('name');
        $sprint->start_date=$request->get('start_date');
        $sprint->limit_date=$request->get('limit_date');
        $sprint->backlog=$request->get('backlog');
        $sprint->description=$request->get('description');
        $sprint->retrospective=$request->get('retrospective');
        $sprint->save();
        $sprint->users()->attach(Auth::user()->id);//Apuntar al creador del Sprint como trabajador del mismo
        return redirect('sprints');
    }
    public function show(Sprint $sprint){
        return view('sprints.show')->with('sprint', $sprint);
    }
    public function edit(Sprint $sprint)
    {
        if($sprint->project->owner!=Auth::user()->id and Auth::user()->rol!='admin'){
            return redirect('inicio');
        }
        $projects=Project::all();
        return view('sprints.edit', compact('sprint'))->with('projects', $projects);
    }
    public function update(Sprint $sprint, SprintEditRequest $request){
        if($sprint->project->owner!=Auth::user()->id and Auth::user()->rol!='admin'){
            return redirect('inicio');
        }
        $sprint->project_id=$request->get('project_id');
        $sprint->name=$request->get('name');
        $sprint->start_date=$request->get('start_date');
        $sprint->limit_date=$request->get('limit_date');
        $sprint->backlog=$request->get('backlog');
        $sprint->description=$request->get('description');
        $sprint->retrospective=$request->get('retrospective');
        $sprint->save();
        return redirect('sprints');
    }
    public function borrar(Sprint $sprint)
    {
        if($sprint->project->owner!=Auth::user()->id and Auth::user()->rol!='admin'){
            return redirect('inicio');
        }
        return view('sprints.borrar', compact('sprint'));
    }
    public function destroy(Sprint $sprint)
    {
        if($sprint->project->owner!=Auth::user()->id and Auth::user()->rol!='admin'){
            return redirect('inicio');
        }
        Sprint::findOrFail($sprint->id)->delete();
        return redirect('sprints');
    }
}
