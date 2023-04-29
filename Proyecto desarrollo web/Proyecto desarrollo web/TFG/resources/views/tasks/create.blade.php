@extends('layout')
@section('titulo', 'Crear tarea')
@section('contenido')
    <form action="{{route('tasks.store')}}" method="POST">
        @csrf
        <div>
            <label for="sprint_id">Sprint*:</label>
            <select name="sprint_id" id="sprint_id">
                @forelse ($sprints as $sprint)
                    <option value="{{ $sprint->id }}">{{ $sprint->name }}</option>
                @empty
                    ---
                @endforelse
            </select>
        </div>
        <div>
            <label for="name"> Nombre*:
            </label>
            <input type="text" name="name" id="name" value="{{ old('name') }}">
        </div>
        <div>
            <label for="description">Descripción:</label>
            <textarea rows="10" name="description" id="description">{{ old('description') }}</textarea>
        </div>
        <div id="login">
            <button type="submit" class="btn btn-primary">Crear</button>
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
