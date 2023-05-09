@extends('layout')
@section('titulo', 'Usuarios')
@section('contenido')
    <section class="listado-users">
        <div class="busqueda">
            <input type="search" id="busqueda" name="busqueda" placeholder="{{__('buscar-user')}}">
        </div>
        <section class="listado-users" id="usuarios">
            @forelse ($users as $user)
                <ul class="list-group list-group-horizontal">
                    <li class="list-group-item">{{ $user->name }}</li>
                    <li class="list-group-item">{{ $user->email }}</li>
                    <li class="list-group-item">
                        <select name="rol" id="{{ 'rol-' . $user->id }}" class="form-select form-select-lg">
                            @if ($user->rol == 'admin')
                                <option value="0">{{__('user')}}</option>
                                <option value="1"selected>{{__('admin')}}</option>
                            @else
                                <option value="0" selected>{{__('user')}}</option>
                                <option value="1">{{__('admin')}}</option>
                            @endif
                        </select>
                    </li>
                    <li class="list-group-item">
                        <a href="{{route('users.borrar', $user->id)}}" class="btn btn-danger">{{__('eliminar')}}</a>
                    </li>
                </ul>
            @empty
                <h1>{{__('no-user-registered')}}</h1>
            @endforelse
        </section>
    </section>
    <script src="{{ asset('scripts/change-rol.js') }}"></script>
@endsection
