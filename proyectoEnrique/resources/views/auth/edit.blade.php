@extends('layout')
@section('titulo', 'Ajustes')
@section('contenido')
    <main class="bg-light text-dark" id="lista-events">
        <form action="{{ route('update', Auth::user()->id) }}" method="POST" class="d-flex flex-column col-md-10 justify-content-center">
            @csrf
            @method('put')
            <div class="form-group">
                <label for="password">Nueva contraseña: </label>
                <input type="password" class="form-control" id="password" name="password" value=""
                    placeholder="Introduce una contraseña">
            </div>
            <div class="form-group">
                <label for="password_confirmation">Repite la contraseña: </label>
                <input type="password" class="form-control" id="password_confirmation"
                    name="password_confirmation" placeholder="Repite la contraseña">
            </div>
            <div class="form-group">
                <label for="birthday">Fecha de nacimiento: </label>
                <input type="date" class="form-control" id="birthday"
                    name="birthday" value="{{Auth::user()->birthday}}">
            </div>
            <div class="form-group">
                <label for="image">Imagen de usuario: </label>
                <input type="file" class="form-control" id="image"
                    name="image">
            </div>
            <div class="form-group">
                <label for="twitter">Cuenta de Twitter: </label>
                <input type="text" class="form-control" id="twitter"
                    name="twitter" value="{{Auth::user()->twitter}}">
            </div>
            <div class="form-group">
                <label for="instagram">Cuenta de Instagram: </label>
                <input type="text" class="form-control" id="instagram"
                    name="instagram" value="{{Auth::user()->instagram}}">
            </div>
            <div class="form-group">
                <label for="twitch">Cuenta de Twitch: </label>
                <input type="text" class="form-control" id="twitch"
                    name="twitch" value="{{Auth::user()->twitch}}">
            </div><br>
            <button type="submit" class="btn btn-primary col-md-1">Editar</button>
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
