@extends('layout')
@section('titulo', 'Iniciar sesión')
@section('contenido')
    <main class="bg-light text-dark">
        <form action="{{ route('login') }}" method="POST">
            @csrf
            <div class="form-group">
                <label for="name">Nombre o email: </label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Introduce tu nombre o email">
            </div>
            <div class="form-group">
                <label for="password">Contraseña: </label>
                <input type="password" class="form-control" id="password" name="password"
                    placeholder="Introduce una contraseña">
            </div>
            <button type="submit" class="btn btn-primary">Abrir sesión</button>
        </form>
    </main>
@endsection
