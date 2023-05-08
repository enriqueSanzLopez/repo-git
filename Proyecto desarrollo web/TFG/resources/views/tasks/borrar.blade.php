@extends('layout')
@section('titulo', 'Eliminar - '.$task->name)
@section('contenido')
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">¿Seguro que quieres eliminar {{$task->name}}?</h5>
            <section>
                <a href="{{route('tasks.show', $task->id)}}" class="btn btn-secondary">Cancelar</a>
                <a href="{{route('tasks.destroy', $task->id)}}" class="btn btn-danger">Eliminar</a>
            </section>
        </div>
    </div>
@endsection
