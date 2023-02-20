@extends('layout')
@section('titulo', 'Inicio')
@section('contenido')
    <main class="bg-light text-dark">
        <div class="card" style="width: 18rem;">
            <img src="img/T.png" class="card-img-top" alt="Icono NoTebeo">
            <div class="card-body">
                <h5 class="card-title">Bienvenido a NoTebeo</h5>
                <p class="card-text text-justify">La página para forofos de los tebeos y los comics, consulta nuestros eventos.<br>
                    Aquí puedes encontrar a otros fanes de los comics como tú e informarte de los eventos en los que participamos.
                </p>
                <a href="{{route('events.index')}}" class="btn btn-primary">Consultar</a>
            </div>
        </div>
    </main>
@endsection
