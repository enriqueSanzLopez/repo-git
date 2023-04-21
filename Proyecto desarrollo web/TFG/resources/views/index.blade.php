@extends('layout')
@section('titulo', 'Inicio')
@section('contenido')
    @if (!isset(Auth::user()->name))
        <div class="card" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title">Scrum Admin</h5>
                <p class="card-text">Desarrolla tus proyectos con nosotros<br><br>
                    Fácil, rápido, simple</p>
                <a href="{{ route('registro') }}" class="btn btn-primary">Registrarme</a>
            </div>
        </div>
    @endif
    <section class="novedades">
        {{-- Aquí irán las novedades --}}
        <h1>Hola mundo</h1>
    </section>
@endsection
