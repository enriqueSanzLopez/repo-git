@extends('layout')
@section('titulo', __('eliminar').' - '.$task->name)
@section('contenido')
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">{{__('seguro-eliminar')}} {{$task->name}}?</h5>
            <section>
                <a href="{{route('tasks.show', $task->id)}}" class="btn btn-secondary">{{__('cancelar')}}</a>
                <a href="{{route('tasks.destroy', $task->id)}}" class="btn btn-danger">{{__('eliminar')}}</a>
            </section>
        </div>
    </div>
@endsection
