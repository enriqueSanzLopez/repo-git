@extends('layout')
@section('titulo', 'Eventos')
@section('contenido')
    <main class="bg-light text-dark" id="lista-events">
        @isset($events)
            <section class="lista-events  col-md-10">
                @forelse($events as $event)
                    <div class="card" style="width: 18rem;">
                        <div class="card-body event">
                            <h5 class="card-title">{{$event->name}}
                                @if($event->visible==0)
                                    (No es visible)
                                @endif
                            </h5>
                            <p class="card-text text-justify">{{$event->description}}</p>
                            @isset(Auth::user()->id)
                            <a href="{{route('events.show', $event->id)}}" class="btn btn-primary">Consultar</a>
                            @endisset
                        </div>
                    </div>
                @empty
                    <h1>Ha sucedido un error, inténtalo más tarde</h1>
                @endforelse
            </section>
        @else
            <h1>No hay eventos preparados en estos momentos</h1>
        @endisset
    </main>
@endsection
