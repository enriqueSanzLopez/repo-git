@extends('layout')
@section('titulo', 'Iniciar sesión')
@section('contenido')
    <form action="{{route('loginddbb')}}" method="POST">
        @csrf
        <div>
            <label for="name"> {{__('nombre')}}:
            </label>
            <input type="text" name="name" id="name" value="{{ old('name') }}">
        </div>
        <div>
            <label for="password"> {{__('password')}}:
            </label>
            <input type="password" name="password" id="password" value="{{ old('password') }}">
        </div>
        <div id="login">
            <button type="submit" class="btn btn-primary">{{__('login')}}</button>
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
