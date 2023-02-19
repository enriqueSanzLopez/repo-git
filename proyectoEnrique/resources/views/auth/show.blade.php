@extends('layout')
@section('titulo', 'Miembro')
@section('contenido')
    <main class="bg-light text-dark">
        <div class="d-flex flex-column col-md-10 justify-content-center">
            <h3>Nombre: <b>{{$user->name}}</b></h3>
            <h3>Email: <b>{{$user->email}}</b></h3>
            <h3>Fecha de nacimiento: <b>{{$user->birthday}}</b></h3>
            <h3>Twitter: <b>{{$user->twitter}}</b></h3>
            <h3>Instagram: <b>{{$user->instagram}}</b></h3>
            <h3>Twitch: <b>{{$user->twitch}}</b></h3>
        </div>
        <img src="{{asset('storage/img/usuarios/'.$user->id.'.png')}}" alt="Imagen de usuario">
    </main>
@endsection
