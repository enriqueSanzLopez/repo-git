@extends('layout')
@section('titulo', __('tareas'))
@section('contenido')
    <a href="{{route('tasks.create')}}" class="btn btn-primary">{{__('crear-task')}}</a>
    @if (count($tasks) == 0)
        <h1>{{__('no-task')}}</h1>
    @else
        <section class="listado">
            @foreach ($tasks as $task)
                <div class="card" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title">{{ $task->name }}</h5>
                        <h6 class="card-title">{{$task->state}}</h6>
                        <p class="card-text">{{ $task->description }}</p>
                        <a href="{{route('tasks.show', $task->id)}}" class="btn btn-primary">{{__('entrar')}}</a>
                    </div>
                </div>
            @endforeach
        </section>
    @endif
@endsection
