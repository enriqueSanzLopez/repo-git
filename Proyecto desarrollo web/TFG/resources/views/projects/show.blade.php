@extends('layout')
@section('titulo', $project->name)
@section('contenido')
    <section>
        <header>
            <h1>{{ $project->name }}</h1>
            @if ($project->owner == Auth::user()->id or Auth::user()->rol == 'admin')
                {{-- El usuario viendo el proyecto es el propietario del mismo --}}
                <a href="{{ route('projects.edit', $project->id) }}" class="btn btn-primary">Editar</a>
                <a href="{{ route('sprints.create') }}" class="btn btn-primary">Crear Sprint</a>
                <a href="{{ route('projects.borrar', $project->id) }}" class="btn btn-danger">Eliminar</a>
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
        <h3>Trabajadores</h3>
        @forelse ($project->users as $user)
            <ul class="list-group list-group-horizontal">
                <li>{{ $user->name }}</li>
                <li>{{ $user->email }}</li>
            </ul>
        @empty
            <h4>No hay trabajadores</h4>
        @endforelse
        <h3>Listado de Sprints</h3>
        @if (count($project->sprints) == 0)
            <h4>No hay Sprints actualmente</h4>
        @else
            <ul>
                @foreach ($project->sprints as $sprint)
                    <li>
                        <div class="card" style="width: 18rem;">
                            <div class="card-body">
                                <p class="card-text">{{ $sprint->description }}</p>
                                <p>{{ $sprint->start_date }} - {{ $sprint->limit_date }}</p>
                                <a href="{{ route('sprints.show', $sprint->id) }}" class="btn btn-primary">Entrar</a>
                            </div>
                        </div>
                    </li>
                @endforeach
            </ul>
        @endif
        <h3>Listado de tareas</h3>
        <section class="listado">
            @forelse ($project->sprints as $sprint)
                @forelse ($sprint->tasks as $task)
                    <div class="card" style="width: 18rem;">
                        <div class="card-body">
                            <h5 class="card-title">{{ $task->name }}</h5>
                            <p>{{ $task->state }}</p>
                            <p class="card-text">{{ $task->description }}</p>
                            <a href="{{ route('tasks.show', $task->id) }}" class="btn btn-primary">Entrar</a>
                        </div>
                    </div>
                @empty
                    <h4>No hay tareas en este Sprint</h4>
                @endforelse
            @empty
                <h4>No hay tareas en este Sprint</h4>
            @endforelse
        </section>
    </section>
@endsection
