@extends('layout')
@section('titulo', 'Sprints')
@section('contenido')
    <a href="{{route('sprints.create')}}" class="btn btn-primary">Crear sprint</a>
    @if (count($sprints) == 0)
        <h1>No hay sprints</h1>
    @else
        <section class="listado">
            @foreach ($sprints as $sprint)
                <div class="card" style="width: 18rem;">
                    <div class="card-body">
                        <p class="card-text">{{ $sprint->description }}</p>
                        <p>{{$sprint->start_date}} - {{$sprint->limit_date}}</p>
                        <a href="{{route('sprints.show', $sprint->id)}}" class="btn btn-primary">Entrar</a>
                    </div>
                </div>
            @endforeach
        </section>
    @endif
@endsection
