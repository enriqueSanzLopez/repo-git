@extends('layout')
@section('titulo', 'Mensajes')
@section('contenido')
    <main class="bg-light text-dark">
        <div class="d-flex flex-column col-md-10 justify-content-center">
            <h3>Nombre: <b>{{$message->name}}</b></h3>
            <h3>Asunto: <b>{{$message->subject}}</b></h3>
            <p>{{$message->text}}</p>
            <form action="{{route('messages.destroy', $message->id)}}" method="post">
                @csrf
                @method('delete')
                <button type="submit" class="btn btn-danger">Borrar</button>
            </form>
        </div>
    </main>
@endsection
