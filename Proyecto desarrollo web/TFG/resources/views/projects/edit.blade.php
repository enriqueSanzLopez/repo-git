@extends('layout')
@section('titulo', $project->name.' - '.__('editar'))
@section('contenido')
    <form action="{{route('projects.update', $project->id)}}" method="POST">
        @csrf
        <div>
            <label for="name"> {{__('nombre')}}*:
            </label>
            <input type="text" name="name" id="name" value="{{ $project->name }}">
        </div>
        <div>
            <label for="sprint_planning">Sprint planning:</label>
            <textarea rows="10" name="sprint_planning" id="sprint_planning">{{ $project->sprint_planning }}</textarea>
        </div>
        <div>
            <label for="backlog">Backlog:</label>
            <textarea rows="10" name="backlog" id="backlog">{{ $project->backlog }}</textarea>
        </div>
        <div>
            <label for="description">{{__('descripcion')}}:</label>
            <textarea rows="10" name="description" id="description">{{ $project->description }}</textarea>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="checkbox" id="visibility" name="visibility"
                @if ($project->visibility == 1) checked @endif>
            <label class="form-check-label" for="visibility">
                Visible
            </label>
        </div>
        <div id="login">
            <a href="{{ route('projects.show', $project->id) }}" class="btn btn-secondary">{{__('cancelar')}}</a>
            <button type="submit" class="btn btn-primary">{{__('guardar-cambios')}}</button>
        </div>
    </form>
@endsection
