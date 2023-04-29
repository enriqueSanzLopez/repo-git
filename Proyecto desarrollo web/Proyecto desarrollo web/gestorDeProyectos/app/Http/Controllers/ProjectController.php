<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Project;
use Illuminate\Support\Facades\Auth;
use App\Http\Requests\ProjectCreateRequest;
use App\Http\Requests\ProjectEditRequest;

class ProjectController extends Controller
{
    //
    public function index()
    {
        if (Auth::user()->rol == 'admin') {
            $projects = Project::all();
        } else {
            $projects = Auth::user()->projects;
        }
        return view('projects.index', compact('projects'));
    }
    public function create()
    {
        return view('projects.create');
    }
    public function store(ProjectCreateRequest $request)
    {
        if (!isset(Auth::user()->name)) {
            return redirect('/');
        }
        $project = new Project();
        $project->name = $request->get('name');
        $project->owner = Auth::user()->id; //El creador es el propietario del proyecto
        $project->visibility = $request->has('visibility') ? 1 : 0; //Se indica si el proyecto es visible o no
        $project->sprint_planning = $request->get('sprint_planning');
        $project->backlog = $request->get('backlog');
        $project->description = $request->get('description');
        $project->save();
        $project->users()->attach(Auth::user()->id); //Apuntar al propietario como trabajador del proyecto
        return redirect('projects');
    }
    public function show(Project $project)
    {
        return view('projects.show', compact('project'));
    }
    public function edit(Project $project)
    {
        return view('projects.edit', compact('project'));
    }
    public function update(ProjectEditRequest $request, Project $project)
    {
        $project->name = $request->get('name');
        $project->visibility = $request->has('visibility') ? 1 : 0;
        $project->sprint_planning = $request->get('sprint_planning');
        $project->backlog = $request->get('backlog');
        $project->description = $request->get('description');
        $project->save();
        return redirect(route('projects.show', $project->id));
    }
    public function borrar(Project $project)
    {
        return view('projects.borrar', compact('project'));
    }
    public function destroy(Project $project)
    {
        Project::findOrFail($project->id)->delete();
        return redirect('projects');
    }
}
