@extends('layout')
@section('titulo', 'Enviar correo')
@section('contenido')
    <main class="bg-light text-dark">
        <form action="{{ route('messages.store') }}" method="POST" class="d-flex flex-column col-md-10 justify-content-center">
            @csrf
            <div class="form-group col-md-3">
                <label for="name">Nombre: </label>
                @if (isset(Auth::user()->name))
                <input type="text" class="form-control" id="name" name="name" placeholder="Introduce tu nombre"
                    value="{{Auth::user()->name}}">
                @else
                <input type="text" class="form-control" id="name" name="name" placeholder="Introduce tu nombre"
                    value="{{ old('name') }}">
                @endif
            </div>
            <div class="form-group col-md-10">
                <label for="subject">Asunto: </label>
                <input type="subject" class="form-control" id="subject" name="subject" value="{{ old('subject') }}"
                    placeholder="Asunto">
            </div>
            <div class="mb-3 col-md-10">
                <label for="text" class="form-label">Contenido:</label>
                <textarea class="form-control" rows="10" name="text" id="text"></textarea>
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
