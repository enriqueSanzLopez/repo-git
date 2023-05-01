@extends('layout')
@section('titulo', $user->name . ' - Eliminar')
@section('contenido')
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">¿Seguro que quieres eliminar {{ $user->name }}?</h5>
            <section>
                <a href="{{route('contacts')}}" class="btn btn-secondary">Cancelar</a>
                <a href="{{route('users.destroy', $user->id)}}" class="btn btn-danger">Eliminar</a>
            </section>
        </div>
    </div>
@endsection
