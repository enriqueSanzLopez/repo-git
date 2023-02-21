@extends('layout')
@section('titulo', 'Eventos')
@section('contenido')
    <main class="bg-light text-dark" id="lista-events">
        @isset($events)
            <section class="lista-events  col-md-10">
                @forelse($events as $event)
                    <div class="card" style="width: 18rem;">
                        <div class="card-body event">{{--Como asumo que el administrador puede ver los eventos invisibles, hay que avisarle de cuales son visibles y cuales no--}}
                            <h5 class="card-title">{{ $event->name }}
                                @if ($event->visible == 0)
                                    (No es visible)
                                @endif
                            </h5>
                            <p class="card-text text-justify">{{ $event->description }}</p>
                            @if ($event->visible == 1)
                                @isset(Auth::user()->id)
                                    <a href="{{ route('events.show', $event->id) }}" class="btn btn-primary">Consultar</a>
                                    @php
                                        $participa = 0;
                                        foreach ($event->users as $user) {
                                            //Reviso a todos los participantes del evento para ver si el usuario es uno de ellos
                                            if ($user->name == Auth::user()->name) {
                                                $participa = 1;
                                                break;
                                            }
                                        }
                                    @endphp
                                    @if ($participa == 0)
                                        <a href="{{ route('events.apuntar', $event->id) }}" class="btn btn-primary">Apuntarse</a>
                                    @else
                                        <a href="{{ route('events.apuntar', $event->id) }}" class="btn btn-danger">Borrarse</a>
                                    @endif
                                @endisset
                            @endif
                        </div>
                    </div>
                @empty
                    <h1>No hay eventos en estos momentos</h1>
                @endforelse
            </section>
        @else
            <h1>Ha sucedido un error, inténtalo más tarde</h1>
        @endisset
    </main>
@endsection
