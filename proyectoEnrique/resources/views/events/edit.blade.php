@extends('layout')
@section('titulo', 'Evento')
@section('contenido')
    <main class="bg-light text-dark" id="lista-events">
        <form action="{{ route('events.update', $event->id) }}" method="POST" class="d-flex flex-column col-md-10 justify-content-center">
            @csrf
            @method('put')
            <div class="form-group col-md-10">
                <label for="name">Nombre: </label>
                <input type="text" class="form-control" id="name" name="name" value="{{$event->name}}">
            </div>
            <div class="form-group col-md-10">
                <label for="tags">Tags: </label>
                <input type="text" class="form-control" id="tags" name="tags" value="{{$event->tags}}">
            </div>
            <div class="form-group col-md-10">
                <label for="location">Lugar: </label>
                <input type="text" class="form-control" id="location" name="location" value="{{$event->location}}">
            </div>
            <div class="form-group col-md-2">
                <label for="date">Fecha: </label>
                <input type="date" class="form-control" id="date" name="date" value="{{$event->date}}">
            </div>
            <div class="form-group col-md-2">
                <label for="hour">Hora: </label>
                <input type="time" class="form-control" id="hour" name="hour" value="{{$event->hour}}">
            </div>
            <div class="mb-3 col-md-10">
                <label for="description" class="form-label">Descripción:</label>
                <textarea class="form-control" rows="10" name="description" id="description">{{$event->description}}</textarea>
            </div>
            <div class="form-check">
                @if($event->visible==0)
                    <input class="form-check-input" type="checkbox" id="visible" name="visible">
                @else
                    <input class="form-check-input" type="checkbox" id="visible" name="visible" checked>
                @endif
                <label class="form-check-label" for="visible">
                Visible
                </label>
            </div>
            <button type="submit" class="btn btn-primary col-md-1">Editar</button>
        </form>
    </main>
@endsection
