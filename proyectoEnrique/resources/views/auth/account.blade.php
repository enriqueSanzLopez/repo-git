@extends('layout')
@section('titulo', 'Cuenta')
@section('contenido')
    <main class="bg-light text-dark">
        {{--Falta poner imagen de perfil--}}
        <div class="d-flex flex-column col-md-10 justify-content-center">
            <h3>Nombre: <b>{{Auth::user()->name}}</b></h3>
            <h3>Email: <b>{{Auth::user()->email}}</b></h3>
            <h3>Fecha de nacimiento: <b>{{Auth::user()->birthday}}</b></h3>
            <h3>Twitter: <b>{{Auth::user()->twitter}}</b></h3>
            <h3>Instagram: <b>{{Auth::user()->instagram}}</b></h3>
            <h3>Twitch: <b>{{Auth::user()->twitch}}</b></h3>
        </div>
        <img src="{{asset('storage/img/usuarios/'.Auth::user()->id.'.png')}}" alt="Imagen de usuario">
        <a href="{{ route('edit', Auth::user()->id) }}" class="btn btn-primary">Editar</a>
    </main>
@endsection
