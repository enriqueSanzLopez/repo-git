@extends('layout')
@section('titulo', __('eliminar').' - '.$sprint->name)
@section('contenido')
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">{{__('seguro-eliminar')}} {{ $sprint->name }}?</h5>
            <section>
                <a href="{{route('sprints.show', $sprint->id)}}" class="btn btn-secondary">{{__('cancelar')}}</a>
                <a href="{{route('sprints.destroy', $sprint->id)}}" class="btn btn-danger">{{__('eliminar')}}</a>
            </section>
        </div>
    </div>
@endsection
