@extends('layout')
@section('titulo', $project->name)
@section('contenido')
    <section>
        <header>
            <input type="hidden" id="user" value="{{Auth::user()->id}}">
            @if ($project->owner == Auth::user()->id || Auth::user()->rol == 'admin')
                <input type="hidden" id="rol" value="true" name="rol">
            @else
                <input type="hidden" id="rol" value="false" name="rol">
            @endif
            <h1>{{ $project->name }}</h1>
            @if ($project->owner == Auth::user()->id or Auth::user()->rol == 'admin')
                {{-- El usuario viendo el proyecto es el propietario del mismo --}}
                <a href="{{ route('projects.edit', $project->id) }}" class="btn btn-primary">{{__('editar')}}</a>
                <a href="{{ route('sprints.create') }}" class="btn btn-primary">{{__('crear')}} Sprint</a>
                <a href="{{ route('projects.borrar', $project->id) }}" class="btn btn-danger">{{__('eliminar')}}</a>
            @endif
        </header>
    </section>
    <section class="contenedor-horizontal">
        <section class="caracteristicas">
            <h3>{{__('descripcion')}}</h3>
            <p>{{ $project->description }}</p>
            <h3>Backlog</h3>
            <p>{{ $project->backlog }}</p>
            <h3>Sprint planning</h3>
            <p>{{ $project->sprint_planning }}</p>
            <h3>Listado de Sprints</h3>
            @if (count($project->sprints) == 0)
                <h4>{{__('no-sprint-actualmente')}}</h4>
            @else
                <ul>
                    @foreach ($project->sprints as $sprint)
                        <li>
                            <div class="card" style="width: 18rem;">
                                <div class="card-body">
                                    <p class="card-text">{{ $sprint->description }}</p>
                                    <p>{{ $sprint->start_date }} - {{ $sprint->limit_date }}</p>
                                    <a href="{{ route('sprints.show', $sprint->id) }}" class="btn btn-primary">{{__('entrar')}}</a>
                                </div>
                            </div>
                        </li>
                    @endforeach
                </ul>
            @endif
            <h3>{{__('list-task')}}</h3>
            <section class="listado">
                @forelse ($project->sprints as $sprint)
                    @forelse ($sprint->tasks as $task)
                        <div class="card" style="width: 18rem;">
                            <div class="card-body">
                                <h5 class="card-title">{{ $task->name }}</h5>
                                <p>{{ $task->state }}</p>
                                <p class="card-text">{{ $task->description }}</p>
                                <a href="{{ route('tasks.show', $task->id) }}" class="btn btn-primary">{{__('entrar')}}</a>
                            </div>
                        </div>
                    @empty
                        <h4>{{__('no-task-sprint')}}</h4>
                    @endforelse
                @empty
                    <h4>{{__('no-task-sprint')}}</h4>
                @endforelse
            </section>
        </section>
        <section>
            <h3>{{__('trabajadores')}}</h3>
            <section id="listado-trabajadores">
                @forelse ($project->users as $user)
                    <ul class="list-group" id="lista-{{ $user->id }}">
                        <li>{{ $user->name }}</li>
                        @if (Auth::user()->id == $project->owner || Auth::user()->rol == 'admin')
                            <li class="borrar-user" id="borrar-user-{{ $user->id . '-' . $project->id }}">x</li>
                        @endif
                        <li class="pequenyo">{{ $user->email }}</li>
                    </ul>
                @empty
                    <h4>{{__('no-trabajadores')}}</h4>
                @endforelse
            </section>
            <div class="busqueda">
                <input type="hidden" id="proyecto" name="proyecto" value="{{ $project->id }}">
                <input type="search" id="busqueda" name="busqueda" placeholder="{{__('add-trabajadores')}}">
            </div>
            <section class="listado-users escondido" id="usuarios">
            </section>
            <script src="{{ asset('scripts/add-user-project.js') }}"></script>
        </section>
    </section>
@endsection
