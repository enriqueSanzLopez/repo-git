@extends('layout')
@section('titulo', 'Tareas')
@section('contenido')
    <a href="{{route('tasks.create')}}" class="btn btn-primary">Crear tarea</a>
    @if (count($tasks) == 0)
        <h1>No hay Tareas</h1>
    @else
        <section class="listado">
            @foreach ($tasks as $task)
                <div class="card" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title">{{ $task->name }}</h5>
                        <p class="card-text">{{ $task->description }}</p>
                        <a href="{{route('tasks.show', $task->id)}}" class="btn btn-primary">Entrar</a>
                    </div>
                </div>
            @endforeach
        </section>
    @endif
@endsection