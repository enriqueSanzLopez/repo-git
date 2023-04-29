@extends('layout')
@section('titulo', 'Eliminar - '.$sprint->name)
@section('contenido')
    <div class="card" style="width: 18rem;">
        <div class="card-body">
            <h5 class="card-title">¿Seguro que quieres eliminar el sprint?</h5>
            <section>
                <a href="{{route('sprints.show', $sprint->id)}}" class="btn btn-secondary">Cancelar</a>
                <a href="{{route('sprints.destroy', $sprint->id)}}" class="btn btn-danger">Eliminar</a>
            </section>
        </div>
    </div>
@endsection
