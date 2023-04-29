@extends('layout')
@section('titulo', 'Editar - ' . $sprint->start_date)
@section('contenido')
    <form action="{{route('sprints.update', $sprint->id)}}" method="POST">
        @csrf
        <div>
            <label for="project_id">Proyecto*:</label>
            <select name="project_id" id="project_id">
                @forelse ($projects as $project)
                    <option value="{{ $project->id }}">{{ $project->name }}</option>
                @empty
                    ---
                @endforelse
            </select>
        </div>
        <div>
            <label for="name"> Nombre*:
            </label>
            <input type="text" name="name" id="name" value="{{$sprint->name}}">
        </div>
        <div>
            <label for="start_date">Fecha de inicio*:</label>
            <input type="date" name="start_date" id="start_date" value="{{$sprint->start_date}}">
        </div>
        <div>
            <label for="limit_date">Fecha límite*:</label>
            <input type="date" name="limit_date" id="limit_date" value="{{$sprint->limit_date}}">
        </div>
        <div>
            <label for="backlog">Backlog:</label>
            <textarea rows="10" name="backlog" id="backlog">{{$sprint->backlog}}</textarea>
        </div>
        <div>
            <label for="description">Descripción:</label>
            <textarea rows="10" name="description" id="description">{{$sprint->description}}</textarea>
        </div>
        <div>
            <label for="retrospective">Retrospective:</label>
            <textarea rows="10" name="retrospective" id="retrospective">{{$sprint->retrospective}}</textarea>
        </div>
        <div id="login">
            <a href="{{ route('sprints.show', $sprint->id) }}" class="btn btn-secondary">Cancelar</a>
            <button type="submit" class="btn btn-primary">Guardar cambios</button>
        </div>
    </form>
@endsection
