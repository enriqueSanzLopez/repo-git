@extends('layout')
@section('titulo', 'Editar - ' . $task->name)
@section('contenido')
    <form action="{{route('tasks.update', $task->id)}}" method="POST">
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
            <input type="text" name="name" id="name" value="{{ $task->name }}">
        </div>
        <div>
            <label for="description">Descripción:</label>
            <textarea rows="10" name="description" id="description">{{ $task->description }}</textarea>
        </div>
        <div id="login">
            <a href="{{ route('tasks.show', $task->id) }}" class="btn btn-secondary">Cancelar</a>
            <button type="submit" class="btn btn-primary">Guardar cambios</button>
        </div>
    </form>
@endsection
