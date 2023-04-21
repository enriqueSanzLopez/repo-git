@extends('layout')
@section('titulo', 'Sprint - '.$sprint->start_date)
@section('contenido')
    <section>
        <header>
            <h1>Del {{ $sprint->start_date }} hasta el {{$sprint->limit_date}}</h1>
            <?php
            var_dump($sprint->project()->name);
            ?>
        </header>
    </section>
    <section class="caracteristicas">
        <h3>Descripción</h3>
        <p>{{ $sprint->description }}</p>
        <h3>Backlog</h3>
        <p>{{ $sprint->backlog }}</p>
        <h3>Retrospectiva</h3>
        <p>{{ $sprint->retrospective }}</p>
        <h3>Listado de Tareas</h3>
    </section>
@endsection
