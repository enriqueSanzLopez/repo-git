<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Project;
use Illuminate\Support\Facades\Auth;
use App\Http\Requests\ProjectCreateRequest;

class ProjectController extends Controller
{
    //
    public function index(){
        if(Auth::user()->rol=='admin'){
            $projects=Project::all();
        }else{
            $projects=Auth::user()->projects;
        }
        return view('projects.index', compact('projects'));
    }
    public function create(){
        return view('projects.create');
    }
    public function store(ProjectCreateRequest $request){
        if(!isset(Auth::user()->name)){
            return redirect('/');
        }
        $project=new Project();
        $project->name=$request->get('name');
        $project->owner=Auth::user()->id;//El creador es el propietario del proyecto
        $project->visibility= $request->has('visibility')? 1: 0;//Se indica si el proyecto es visible o no
        $project->sprint_planning=$request->get('sprint_planning');
        $project->backlog=$request->get('backlog');
        $project->description=$request->get('description');
        $project->save();
        $project->users()->attach(Auth::user()->id);//Apuntar al propietario como trabajador del proyecto
        return redirect('projects');
    }
}
