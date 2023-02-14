@extends('layout')
@section('titulo', 'Crear evento')
@section('contenido')
    <main class="bg-light text-dark">
    <form action="{{ route('events.store') }}" method="POST" class="d-flex flex-column col-md-10 justify-content-center">
            @csrf
            <div class="form-group col-md-10">
                <label for="name">Nombre: </label>
                <input type="text" class="form-control" id="name" name="name" value="{{ old('name') }}"
                    placeholder="Nombre del evento">
            </div>
            <div class="form-group col-md-10">
                <label for="tags">Tags: </label>
                <input type="text" class="form-control" id="tags" name="tags" value="{{ old('tags') }}"
                    placeholder="Tags del evento">
            </div>
            <div class="form-group col-md-10">
                <label for="location">Lugar: </label>
                <input type="text" class="form-control" id="location" name="location" value="{{ old('location') }}"
                    placeholder="Localización">
            </div>
            <div class="form-group col-md-2">
                <label for="date">Fecha: </label>
                <input type="date" class="form-control" id="date" name="date" value="{{ old('date') }}">
            </div>
            <div class="form-group col-md-2">
                <label for="hour">Hora: </label>
                <input type="time" class="form-control" id="hour" name="hour" value="{{ old('hour') }}">
            </div>
            <div class="mb-3 col-md-10">
                <label for="description" class="form-label">Descripción:</label>
                <textarea class="form-control" rows="10" name="description" id="description"></textarea>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="visible" name="visible" checked>
                <label class="form-check-label" for="visible">
                Visible
                </label>
            </div>
            <button type="submit" class="btn btn-primary col-md-1">Enviar</button>
        </form>
        {{-- Si hay errores, se muestran aquí --}}
        @if ($errors->any())
            <ul>
                @foreach ($errors->all() as $error)
                    <li>{{ $error }}</li>
                @endforeach
            </ul>
        @endif
    </main>
@endsection
