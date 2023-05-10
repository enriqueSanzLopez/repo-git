@extends('layout')
@section('titulo', __('crear').' sprint')
@section('contenido')
    <form action="{{ route('sprints.store') }}" method="POST">
        @csrf
        <div>
            <label for="project_id">{{__('proyecto')}}*:</label>
            <select name="project_id" id="project_id">
                @forelse ($projects as $project)
                    <option value="{{ $project->id }}">{{ $project->name }}</option>
                @empty
                    ---
                @endforelse
            </select>
        </div>
        <div>
            <label for="name"> {{__('nombre')}}*:
            </label>
            <input type="text" name="name" id="name" value="{{ old('name') }}">
        </div>
        <div>
            <label for="start_date">{{__('fecha-inicio')}}*:</label>
            <input type="date" name="start_date" id="start_date" value="{{ old('start_date') }}">
        </div>
        <div>
            <label for="limit_date">{{__('fecha-limite')}}*:</label>
            <input type="date" name="limit_date" id="limit_date" value="{{ old('limit_date') }}">
        </div>
        <div>
            <label for="backlog">Backlog:</label>
            <textarea rows="10" name="backlog" id="backlog">{{ old('backlog') }}</textarea>
        </div>
        <div>
            <label for="description">{{__('descripcion')}}:</label>
            <textarea rows="10" name="description" id="description">{{ old('description') }}</textarea>
        </div>
        <div>
            <label for="retrospective">Retrospective:</label>
            <textarea rows="10" name="retrospective" id="retrospective">{{ old('retrospective') }}</textarea>
        </div>
        <div id="login">
            <button type="submit" class="btn btn-primary">{{__('crear')}}</button>
        </div>
    </form>
    @if ($errors->any())
        <ul>
            @foreach ($errors->all() as $error)
                <li>{{ $error }}</li>
            @endforeach
        </ul>
    @endif
@endsection
