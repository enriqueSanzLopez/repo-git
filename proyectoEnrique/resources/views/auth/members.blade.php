@extends('layout')
@section('titulo', 'Miembros')
@section('contenido')
    <main class="bg-light text-dark">
        @if(count($users)==0)
            <h1>La aplicación todavía no tiene usuarios</h1>
        @else
            <h1>Usuarios de la aplicación:</h1>
            <table class="table">
                <tbody>
                    @forelse($users as $user)
                        <tr>
                            <td></td>{{--Hay que poner las imágenes de usuario y los en laces a la página de miembro--}}
                            <td><a href="{{ route('member', $user->id) }}" alt="Enlace a la hoja de usuario">{{$user->name}}</a></td>
                        </tr>
                    @empty
                        <h3>Ha habido un problema, inténtelo más tarde</h3>
                    @endforelse
                </tbody>
            </table>
        @endif
    </main>
@endsection
