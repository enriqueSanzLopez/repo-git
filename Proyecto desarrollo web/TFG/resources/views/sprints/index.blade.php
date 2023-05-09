@extends('layout')
@section('titulo', 'Sprints')
@section('contenido')
    <a href="{{route('sprints.create')}}" class="btn btn-primary">{{__('crear')}} sprint</a>
    @if (count($sprints) == 0)
        <h1>{{__('no-sprint')}}</h1>
    @else
        <section class="listado">
            @foreach ($sprints as $sprint)
                <div class="card" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title">{{ $sprint->name }}</h5>
                        <p class="card-text">{{ $sprint->description }}</p>
                        <p>{{$sprint->start_date}} - {{$sprint->limit_date}}</p>
                        <a href="{{route('sprints.show', $sprint->id)}}" class="btn btn-primary">{{__('entrar')}}</a>
                    </div>
                </div>
            @endforeach
        </section>
    @endif
@endsection
