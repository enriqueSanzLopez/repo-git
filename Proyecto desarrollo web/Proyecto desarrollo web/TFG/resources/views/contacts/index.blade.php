@extends('layout')
@section('titulo', 'Contactos')
@section('contenido')
    <section class="listado-users" id="lugar">
        @forelse ($users as $user)
            <ul class="list-group list-group-horizontal">
                <li class="list-group-item">{{ $user->name }}</li>
                <li class="list-group-item">{{ $user->email }}</li>
                <li class="list-group-item">
                    <select name="rol" id="{{ 'rol-' . $user->id }}" class="form-select form-select-lg"
                        aria-label=".form-select-lg example">
                        @if ($user->rol == 'admin')
                            <option value="0">Usuario</option>
                            <option value="1"selected>Administrador</option>
                        @else
                            <option value="0" selected>Usuario</option>
                            <option value="1">Administrador</option>
                        @endif
                    </select>
                </li>
            </ul>
        @empty
            <h1>No hay usuarios registrados</h1>
        @endforelse
    </section>
    <script src="{{ asset('scripts/change-rol.js') }}">
        const url_parcial="{{route('inicio')}}";
        createEvent(url_parcial);
    </script>
@endsection
