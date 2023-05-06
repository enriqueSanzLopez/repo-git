@extends('layout')
@section('titulo', 'Tarea - ' . $task->name)
@section('contenido')
    <section>
        <header>
            <h1>{{ $task->name }}</h1>
            @if ($task->sprint->project->owner == Auth::user()->id or Auth::user()->rol == 'admin')
                <a href="{{route('tasks.edit', $task->id)}}" class="btn btn-primary">Editar</a>
                <a href="{{route('tasks.borrar', $task->id)}}" class="btn btn-danger">Eliminar</a>
            @endif
        </header>
    </section>
    <section class="caracteristicas">
        <h3>Descripción</h3>
        <p>{{ $task->description }}</p>
        <h3>Trabajadores</h3>
        @forelse ($task->users as $user)
            <ul class="list-group list-group-horizontal">
                <li>{{ $user->name }}</li>
                <li>{{ $user->email }}</li>
            </ul>
        @empty
            <h4>No hay trabajadores</h4>
        @endforelse
    </section>
@endsection
