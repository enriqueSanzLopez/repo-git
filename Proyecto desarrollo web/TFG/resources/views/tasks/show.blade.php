@extends('layout')
@section('titulo', 'Tarea - ' . $task->name)
@section('contenido')
    <section>
        <header>
            @if ($task->sprint->project->owner == Auth::user()->id or Auth::user()->rol == 'admin')
                <input type="hidden" id="rol" value="true" name="rol">
            @else
                <input type="hidden" id="rol" value="false" name="rol">
            @endif
            <h1>{{ $task->name }}</h1>
            @if ($task->sprint->project->owner == Auth::user()->id or Auth::user()->rol == 'admin')
                <a href="{{ route('tasks.edit', $task->id) }}" class="btn btn-primary">Editar</a>
                <a href="{{ route('tasks.borrar', $task->id) }}" class="btn btn-danger">Eliminar</a>
            @endif
        </header>
    </section>
    <section class="contenedor-horizontal">
        <section class="caracteristicas">
            <select name="estado" id="estado" class="selectpicker">
                <option value="Sin empezar" @if ($task->state == 'Sin empezar') selected="selected" @endif>Sin empezar
                </option>
                <option value="En progreso" @if ($task->state == 'En progreso') selected="selected" @endif>En progreso
                </option>
                <option value="A validar" @if ($task->state == 'A validar') selected="selected" @endif>A validar</option>
                <option value="Finalizada" @if ($task->state == 'Finalizada') selected="selected" @endif>Finalizada</option>
                <option value="En revisión" @if ($task->state == 'En revisión') selected="selected" @endif>En revisión
                </option>
            </select>
            <h3>Descripción</h3>
            <p>{{ $task->description }}</p>
        </section>
        <section>
            <h3>Trabajadores</h3>
            <section id="listado-trabajadores">
                @forelse ($task->users as $user)
                    <ul class="list-group" id="lista-{{ $user->id }}">
                        <li>{{ $user->name }}</li>
                        @if (Auth::user()->id == $task->sprint->project->owner or Auth::user()->rol == 'admin')
                            <li class="borrar-user" id="borrar-user-{{ $user->id . '-' . $task->id }}">x</li>
                        @endif
                        <li class="pequenyo">{{ $user->email }}</li>
                    </ul>
                @empty
                    <h4>No hay trabajadores</h4>
                @endforelse
            </section>
            <div class="busqueda">
                <input type="hidden" id="tarea" name="tarea" value="{{ $task->id }}">
                <input type="search" id="busqueda" name="busqueda" placeholder="Añadir trabajadores...">
            </div>
            <section class="listado-users escondido" id="usuarios">
            </section>
            <script src="{{ asset('scripts/add-user-task.js') }}"></script>
            <script src="{{ asset('scripts/change-task-status.js') }}"></script>
        </section>
    </section>
@endsection
