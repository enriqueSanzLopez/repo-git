<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Sprint;
use App\Models\Task;
use App\Http\Requests\TaskCreateRequest;
use App\Http\Requests\TaskEditRequest;
use Illuminate\Support\Facades\Auth;

class TaskController extends Controller
{
    //
    public function index(){
        $tasks=Auth::user()->tasks;
        return view('tasks.index', compact('tasks'));
    }
    public function create()
    {
        if(Auth::user()->rol=='admin'){
            $sprints=Sprint::all();
        }else{
            $projects=Auth::user()->projects;
            $ids=[];
            foreach($projects as $project){
                $ids[]=$project->id;
            }
            $sprints=Sprint::whereIn('project_id', $ids)->get();
        }
        return view('tasks.create', compact('sprints'));
    }
    public function store(TaskCreateRequest $request){
        $task=new Task();
        $task->sprint_id=$request->get('sprint_id');
        $task->name=$request->get('name');
        $task->description=$request->get('description');
        $task->save();
        $task->users()->attach(Auth::user()->id);//Apuntar al creador de la tarea como trabajador del mismo
        return redirect('tasks');
    }
    public function show(Task $task){
        return view('tasks.show', compact('task'));
    }
    public function borrar(Task $task){
        if($task->sprint->project->owner!=Auth::user()->id and Auth::user()->rol!='admin'){
            return redirect('inicio');
        }
        return view('tasks.borrar', compact('task'));
    }
    public function destroy(Task $task)
    {
        if($task->sprint->project->owner!=Auth::user()->id and Auth::user()->rol!='admin'){
            return redirect('inicio');
        }
        Task::findOrFail($task->id)->delete();
        return redirect('tasks');
    }
    public function edit(Task $task)
    {
        if($task->sprint->project->owner!=Auth::user()->id and Auth::user()->rol!='admin'){
            return redirect('inicio');
        }
        $sprints=Sprint::all();
        return view('tasks.edit', compact('task'))->with('sprints', $sprints);
    }
    public function update(Task $task, TaskEditRequest $request){
        if($task->sprint->project->owner!=Auth::user()->id and Auth::user()->rol!='admin'){
            return redirect('inicio');
        }
        $task->sprint_id=$request->get('sprint_id');
        $task->name=$request->get('name');
        $task->description=$request->get('description');
        $task->save();
        return redirect('tasks');
    }
}
