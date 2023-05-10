@extends('layout')
@section('titulo', __('tareas') . ' - ' . $task->name)
@section('contenido')
    <section>
        <header>
            @if ($task->sprint->project->owner == Auth::user()->id or Auth::user()->rol == 'admin')
                <input type="hidden" id="rol" value="true" name="rol">
            @else
                <input type="hidden" id="rol" value="false" name="rol">
            @endif
            <input type="hidden" id="user" value="{{ Auth::user()->id }}" name="user">
            <h1>{{ $task->name }}</h1>
            @if ($task->sprint->project->owner == Auth::user()->id or Auth::user()->rol == 'admin')
                <a href="{{ route('tasks.edit', $task->id) }}" class="btn btn-primary">{{ __('editar') }}</a>
                <a href="{{ route('tasks.borrar', $task->id) }}" class="btn btn-danger">{{ __('eliminar') }}</a>
                <button type="button" class="btn btn-primary" id="imprimir">{{__('imprimir')}}</button>
            @endif
        </header>
    </section>
    <section class="contenedor-horizontal">
        <section class="caracteristicas">
            <select name="estado" id="estado" class="selectpicker">
                <option value="Sin empezar" @if ($task->state == 'Sin empezar') selected="selected" @endif>
                    {{ __('sin-empezar') }}
                </option>
                <option value="En progreso" @if ($task->state == 'En progreso') selected="selected" @endif>
                    {{ __('en-progreso') }}
                </option>
                <option value="A validar" @if ($task->state == 'A validar') selected="selected" @endif>{{ __('a-validar') }}
                </option>
                <option value="Finalizada" @if ($task->state == 'Finalizada') selected="selected" @endif>
                    {{ __('finalizada') }}</option>
                <option value="En revisión" @if ($task->state == 'En revisión') selected="selected" @endif>
                    {{ __('en-revision') }}
                </option>
            </select>
            <h3>{{ __('descripcion') }}</h3>
            <p>{{ $task->description }}</p>
            <h3>{{ __('comments') }}</h3>
            <div id="form-comentario">
                <input type="text" id="commentario" name="commentario" placeholder="{{ __('escribir-comment') }}">
                <button type="button" id="comment" class="btn btn-primary">{{ __('enviar') }}</button>
                <hr>
            </div>
            <section class="cometarios" id="comentarios">
                @forelse ($task->comments as $comment)
                    <article>
                        <div>
                            <span>
                                {{ $comment->user->name }} - {{ $comment->user->email }}
                            </span>
                            <span>
                                {{ $comment->date }}
                            </span>
                        </div>
                        <p>
                            {{ $comment->comment }}
                        </p>
                    </article>
                @empty
                    <h4>{{ __('no-comments') }}</h4>
                @endforelse
            </section>
        </section>
        <section>
            <h3>{{ __('trabajadores') }}</h3>
            <section id="listado-trabajadores">
                @forelse ($task->users as $user)
                    <ul class="list-group" id="lista-{{ $user->id }}">
                        <li>{{ $user->name }}</li>
                        @if (Auth::user()->id == $task->sprint->project->owner or Auth::user()->rol == 'admin')
                            <li class="borrar-user" id="borrar-user-{{ $user->id . '-' . $task->id }}">x</li>
                        @endif
                        <li class="pequenyo">{{ $user->email }}</li>
                    </ul>
                @empty
                    <h4>{{ __('no-trabajadores') }}</h4>
                @endforelse
            </section>
            <div class="busqueda">
                <input type="hidden" id="tarea" name="tarea" value="{{ $task->id }}">
                <input type="search" id="busqueda" name="busqueda" placeholder="{{ __('add-trabajadores') }}">
            </div>
            <section class="listado-users escondido" id="usuarios">
            </section>
            <script src="{{ asset('scripts/add-comment.js') }}"></script>
            <script src="{{ asset('scripts/add-user-task.js') }}"></script>
            <script src="{{ asset('scripts/change-task-status.js') }}"></script>
            <script src="{{ asset('scripts/print-task.js') }}"></script>
        </section>
    </section>
@endsection
