@extends('layout')
@section('titulo', 'Evento')
@section('contenido')
    <main class="bg-light text-dark" id="lista-events">
        <div class="card" style="width: 100rem;">
            <div class="card-body event">
                <h1 class="card-title"><b>{{$event->name}}</b>
                    @if($event->visible==0)
                        (No es visible)
                    @endif
                </h1>
                <h5>Tags: <b>{{$event->tags}}</b></h5>
                <h3>Lugar: <b>{{$event->location}}</b></h3>
                <h5>Fecha: <b>{{$event->date}}</b> a las <b>{{$event->hour}}</b></h5>
                <p class="card-text text-justify">{{$event->description}}</p>
                @if(isset(Auth::user()->name)){{--El usuario está logeado--}}
                    @if ($participa==0)
                        <a href="{{route('events.index')}}" class="btn btn-primary">Apuntarse</a>
                    @else
                        <a href="{{route('events.index')}}" class="btn btn-primary">Borrarse</a>
                    @endif
                    @if(Auth::user()->rol=='admin')
                        <a href="{{route('events.edit', $event->id)}}" class="btn btn-primary">Editar</a>
                        <br><br>
                        <form action="{{route('events.destroy', $event->id)}}" method="post">
                            @csrf
                            @method('delete')
                            <button type="submit" class="btn btn-danger">Borrar</button>
                        </form>
                    @endif
                @else{{--El usuario no está logeado--}}
                @endif
                <h3>Participantes:</h3>
                <ul class="list-group">
                @forelse($event->users as $user)
                    <li class="list-group-item">{{$user->name}}</li>
                @empty
                    <h5>No hay participantes todavía</h5>
                @endforelse
                </ul>
        </div>
    </main>
@endsection
