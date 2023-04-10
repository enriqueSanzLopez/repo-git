<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="#"><img src="{{ asset('img/Scrum Admin.png') }}"
                alt="Logotipo de Scrum Admin"></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="/">Inicio</a>
                </li>
                @if (!isset(Auth::user()->name))
                    <li class="nav-item">
                        <a class="nav-link" href="{{route('registro')}}">Registro</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="{{route('login')}}">Iniciar sesión</a>
                    </li>
                @else
                    <li class="nav-item">
                        <a class="nav-link" href="{{route('projects')}}">Proyectos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="{{route('sprints')}}">Sprints</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="{{route('tasks')}}">Tareas</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="{{route('contacts')}}">Contactos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="{{route('logout')}}">Cerrar sesión</a>
                    </li>
                @endif
            </ul>
        </div>
    </div>
</nav>
