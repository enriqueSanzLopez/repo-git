@extends('layout')
@section('titulo', 'Sprint - ' . $sprint->name)
@section('contenido')
    <section>
        <header>
            <h1>{{ $sprint->name }}</h1>
            <h5>{{__('del')}} {{ $sprint->start_date }} {{__('hasta')}} {{ $sprint->limit_date }}</h5>
            @if ($sprint->project->owner == Auth::user()->id or Auth::user()->rol == 'admin')
                <a href="{{ route('sprints.edit', $sprint->id) }}" class="btn btn-primary">{{__('editar')}}</a>
                <a href="{{ route('tasks.create') }}" class="btn btn-primary">{{__('crear-task')}}</a>
                <a href="{{ route('sprints.borrar', $sprint->id) }}" class="btn btn-danger">{{__('eliminar')}}</a>
            @endif
        </header>
    </section>
    <section class="caracteristicas">
        <h3>{{__('descripcion')}}</h3>
        <p>{{ $sprint->description }}</p>
        <h3>Backlog</h3>
        <p>{{ $sprint->backlog }}</p>
        <h3>Retrospective</h3>
        <p>{{ $sprint->retrospective }}</p>
        <h3>{{__('list-task')}}</h3>
        <section class="listado">
            @forelse ($sprint->tasks as $task)
                <div class="card" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title">{{ $task->name }}</h5>
                        <p>{{ $task->state }}</p>
                        <p class="card-text">{{ $task->description }}</p>
                        <a href="{{ route('tasks.show', $task->id) }}" class="btn btn-primary">{{__('entrar')}}</a>
                    </div>
                </div>
            @empty
                <h4>{{__('no-task-sprint')}}</h4>
            @endforelse
        </section>
    </section>
@endsection
