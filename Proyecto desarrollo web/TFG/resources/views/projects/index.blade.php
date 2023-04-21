@extends('layout')
@section('titulo', 'Proyectos')
@section('contenido')
    <a href="{{ route('projects.create') }}" class="btn btn-primary">Crear proyecto</a>
    @if (count($projects) == 0)
        <h1>No hay proyectos</h1>
    @else
        <section class="listado">
            @foreach ($projects as $project)
                <div class="card" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title">{{ $project->name }}</h5>
                        <p class="card-text">{{ $project->description }}</p>
                        <a href="{{route('projects.show', $project->id)}}" class="btn btn-primary">Entrar</a>
                    </div>
                </div>
            @endforeach
        </section>
    @endif
@endsection
