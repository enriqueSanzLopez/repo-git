@extends('layout')
@section('titulo', 'Crear proyecto')
@section('contenido')
    <form action="{{route('projects.store')}}" method="POST">
        @csrf
        <div>
            <label for="name"> {{__('nombre')}}*:
            </label>
            <input type="text" name="name" id="name" value="{{ old('name') }}">
        </div>
        <div>
            <label for="sprint_planning">Sprint planning:</label>
            <textarea rows="10" name="sprint_planning" id="sprint_planning">{{ old('sprint_planning') }}</textarea>
        </div>
        <div>
            <label for="backlog">Backlog:</label>
            <textarea rows="10" name="backlog" id="backlog">{{ old('backlog') }}</textarea>
        </div>
        <div>
            <label for="description">{{__('descripcion')}}:</label>
            <textarea rows="10" name="description" id="description">{{ old('description') }}</textarea>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="checkbox" id="visibility" name="visibility" checked>
            <label class="form-check-label" for="visibility">
            Visible
            </label>
        </div>
        <div id="login">
            <button type="submit" class="btn btn-primary">{{__('crear')}}</button>
        </div>
    </form>
    @if ($errors->any())
        <ul>
            @foreach ($errors->all() as $error)
                <li>{{$error}}</li>
            @endforeach
        </ul>
    @endif
@endsection
