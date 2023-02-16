@extends('layout')
@section('titulo', 'Crear cuenta')
@section('contenido')
    <main class="bg-light text-dark">
        <form action="{{ route('registro') }}" method="POST" enctype="multipart/form-data">
            @csrf
            <div class="form-group">
                <label for="name">Nombre de usuario: </label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Introduce tu nombre"
                    value="{{ old('name') }}">
            </div>
            <div class="form-group">
                <label for="email">Email: </label>
                <input type="email" class="form-control" id="email" name="email" value="{{ old('email') }}"
                    placeholder="Introduce tu email">
            </div>
            <div class="form-group">
                <label for="password">Contraseña: </label>
                <input type="password" class="form-control" id="password" name="password" value="{{ old('password') }}"
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
                    name="birthday" value="{{ old('birthday') }}">
            </div>
            <div class="form-group">
                <label for="image">Imagen de usuario (Opcional): </label>
                <input type="file" class="form-control" id="image"
                    name="image">
            </div>
            <div class="form-group">
                <label for="twitter">Cuenta de Twitter (Opcional): </label>
                <input type="text" class="form-control" id="twitter"
                    name="twitter" value="{{ old('twitter') }}">
            </div>
            <div class="form-group">
                <label for="instagram">Cuenta de Instagram (Opcional): </label>
                <input type="text" class="form-control" id="instagram"
                    name="instagram" value="{{ old('instagram') }}">
            </div>
            <div class="form-group">
                <label for="twitch">Cuenta de Twitch (Opcional): </label>
                <input type="text" class="form-control" id="twitch"
                    name="twitch" value="{{ old('twitch') }}">
            </div><br>
            <button type="submit" class="btn btn-primary">Crear usuario</button>
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
