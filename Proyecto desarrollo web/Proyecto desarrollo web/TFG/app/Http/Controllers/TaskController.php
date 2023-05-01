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
        $tasks=Task::all();
        return view('tasks.index', compact('tasks'));
    }
    public function create()
    {
        $sprints=Sprint::all();
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
        return view('tasks.borrar', compact('task'));
    }
    public function destroy(Task $task)
    {
        Task::findOrFail($task->id)->delete();
        return redirect('tasks');
    }
    public function edit(Task $task)
    {
        $sprints=Sprint::all();
        return view('tasks.edit', compact('task'))->with('sprints', $sprints);
    }
    public function update(Task $task, TaskEditRequest $request){
        $task->sprint_id=$request->get('sprint_id');
        $task->name=$request->get('name');
        $task->description=$request->get('description');
        $task->save();
        return redirect('tasks');
    }
}