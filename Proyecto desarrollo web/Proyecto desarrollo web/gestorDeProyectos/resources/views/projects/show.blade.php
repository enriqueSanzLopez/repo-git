@extends('layout')
@section('titulo', $project->name)
@section('contenido')
    <section>
        <header>
            <h1>{{ $project->name }}</h1>
            @if ($project->owner == Auth::user()->id)
                {{-- El usuario viendo el proyecto es el propietario del mismo --}}
                <a href="{{route('projects.edit', $project->id)}}" class="btn btn-primary">Editar</a>
                <a href="{{route('sprints.create')}}" class="btn btn-primary">Crear Sprint</a>
                <a href="{{route('projects.borrar', $project->id)}}" class="btn btn-danger">Eliminar</a>
            @endif
        </header>
    </section>
    <section class="caracteristicas">
        <h3>Descripción</h3>
        <p>{{ $project->description }}</p>
        <h3>Backlog</h3>
        <p>{{ $project->backlog }}</p>
        <h3>Sprint planning</h3>
        <p>{{ $project->sprint_planning }}</p>
        <h3>Listado de Sprints</h3>
    </section>
@endsection
