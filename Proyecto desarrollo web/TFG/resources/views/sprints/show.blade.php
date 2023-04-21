@extends('layout')
@section('titulo', 'Sprint - ' . $sprint->name)
@section('contenido')
    <section>
        <header>
            <h1>{{ $sprint->name }}</h1>
            <h5>Del {{ $sprint->start_date }} hasta el {{ $sprint->limit_date }}</h5>
            @if ($sprint->project->owner == Auth::user()->id or Auth::user()->rol == 'admin')
                <a href="{{ route('sprints.edit', $sprint->id) }}" class="btn btn-primary">Editar</a>
                <a href="{{ route('tasks.create') }}" class="btn btn-primary">Crear Tarea</a>
                <a href="{{ route('sprints.borrar', $sprint->id) }}" class="btn btn-danger">Eliminar</a>
            @endif
        </header>
    </section>
    <section class="caracteristicas">
        <h3>Descripción</h3>
        <p>{{ $sprint->description }}</p>
        <h3>Backlog</h3>
        <p>{{ $sprint->backlog }}</p>
        <h3>Retrospectiva</h3>
        <p>{{ $sprint->retrospective }}</p>
        <h3>Listado de Tareas</h3>
    </section>
@endsection
