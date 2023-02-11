@extends('layout')
@section('titulo', 'Mensajes')
@section('contenido')
    <main class="bg-light text-dark">
        <table class="table">
            <thead>
                @if(count($messages)!=0)
                <tr>
                    <th scope="col">Asunto</th>
                    <th scope="col">Nombre</th>
                </tr>
                @endif
            </thead>
            <tbody>
                @forelse($messages as $message)
                    @if ($message->readed == 0)
                        <tr>
                            <td><b><a href="{{ route('messages.show', $message->id) }}"
                                        alt="Enlace a mensaje roto">{{ $message->subject }}</a></b></td>
                                <td><b><a href="{{ route('messages.show', $message->id) }}" alt="Enlace a mensaje roto">{{ $message->name }}</a></b></td>
                        </tr>
                    @else
                        <tr>
                            <td><a href="{{ route('messages.show', $message->id) }}"
                                    alt="Enlace a mensaje roto">{{ $message->subject }}</a></td>
                                <td><a href="{{ route('messages.show', $message->id) }}" alt="Enlace a mensaje roto">{{ $message->name }}</a></td>
                        </tr>
                    @endif
                @empty
                    <h3>No hay mensajes</h3>
                @endforelse
            </tbody>
        </table>
    </main>
@endsection
