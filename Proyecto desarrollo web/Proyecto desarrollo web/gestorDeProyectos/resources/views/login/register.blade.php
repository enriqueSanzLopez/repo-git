@extends('layout')
@section('titulo', 'Registro')
@section('contenido')
    <form action="{{route('registroddbb')}}" method="POST">
        @csrf
        <div>
            <label for="name"> Nombre:
            </label>
            <input type="text" name="name" id="name" value="{{ old('name') }}">
        </div>
        <div>
            <label for="name"> Email:
            </label>
            <input type="email" name="email" id="email" value="{{ old('email') }}">
        </div>
        <div>
            <label for="password"> Contraseña:
            </label>
            <input type="password" name="password" id="password" value="{{ old('password') }}">
        </div>
        <div>
            <label for="password_confirmation"> Repite la Contraseña:
            </label>
            <input type="password" name="password_confirmation" id="password_confirmation" value="{{ old('password_confirmation') }}">
        </div>
        <div id="login">
            <button type="submit" class="btn btn-primary">Registrarme</button>
        </div>
    </form>
    @if ($errors->any())
        <ul>
            @foreach ($errors->all() as $error)
                <li>{{$error}}</li>
            @endforeach
        </ul>
    @endif
@endsection
