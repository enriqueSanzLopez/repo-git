@extends('layout')
@section('titulo', $project->name . ' - Eliminar')
@section('contenido')
    <div class="card" style="width: 18rem;">
        <div class="card-body">
            <h5 class="card-title">¿Seguro que quieres eliminar {{ $project->name }}?</h5>
            <section>
                <a href="{{route('projects.show', $project->id)}}" class="btn btn-secondary">Cancelar</a>
                <a href="{{route('projects.destroy', $project->id)}}" class="btn btn-danger">Eliminar</a>
            </section>
        </div>
    </div>
@endsection
