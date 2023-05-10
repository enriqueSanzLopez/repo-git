@extends('layout')
@section('titulo', $user->name . ' - '.__('eliminar'))
@section('contenido')
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">{{__('seguro-eliminar')}} {{ $user->name }}?</h5>
            <section>
                <a href="{{route('contacts')}}" class="btn btn-secondary">{{__('cancelar')}}</a>
                <a href="{{route('users.destroy', $user->id)}}" class="btn btn-danger">{{__('eliminar')}}</a>
            </section>
        </div>
    </div>
@endsection
