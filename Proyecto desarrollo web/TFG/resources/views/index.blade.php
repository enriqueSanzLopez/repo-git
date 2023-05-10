@extends('layout')
@section('titulo', __('inicio'))
@section('contenido')
    @if (!isset(Auth::user()->name))
        <div class="card" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title">Scrum Admin</h5>
                <p class="card-text">{{__('desarrolla')}}<br><br>
                    {{__('facil')}}</p>
                <a href="{{ route('registro') }}" class="btn btn-primary">{{__('registrarme')}}</a>
            </div>
        </div>
    @endif
    <section class="novedades">
        {{-- Aquí irán las novedades --}}
        <h1>{{__('crea-desarrolla')}}</h1>
    </section>
@endsection
