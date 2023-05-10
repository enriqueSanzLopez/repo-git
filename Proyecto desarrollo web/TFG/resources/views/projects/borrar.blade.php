@extends('layout')
@section('titulo', $project->name . ' - '.__('eliminar'))
@section('contenido')
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">{{__('seguro-eliminar')}} {{ $project->name }}?</h5>
            <section>
                <a href="{{route('projects.show', $project->id)}}" class="btn btn-secondary">{{__('cancelar')}}</a>
                <a href="{{route('projects.destroy', $project->id)}}" class="btn btn-danger">{{__('eliminar')}}</a>
            </section>
        </div>
    </div>
@endsection
