<header class="bg-dark text-white sticky-top">
    <div>
        <img src="{{asset('img/T.png')}}" class="img-fluid img-thumbnail" alt="Icono de NoTebeo">
        <h1>NoTebeo</h1>
    </div>
    <ul class="nav justify-content-end flex-row align-middle text-white">
        {{-- Independiente de la sesión se deben mostrar estos enlaces --}}
        <li class="nav-item text-white">
            <a class="nav-link text-white" href="{{route('inicio')}}">Inicio</a>
        </li>
        <li class="nav-item text-white">
            <a class="nav-link text-white" href="{{route('events.index')}}">Eventos</a>
        </li>
        <li class="nav-item text-white">
            <a class="nav-link text-white" href="{{route('lugar')}}">Donde estamos</a>
        </li>
        <li class="nav-item text-white">
            <a class="nav-link text-white" href="{{route('messages.create')}}">Contacto</a>
        </li>
        <li class="nav-item text-white">
            <a class="nav-link text-white" href="{{route('members')}}">Miembros</a>
        </li>
        {{-- Solo si no se ha abierto sesión se deben mostrar estos enlaces --}}
        @if (!isset(Auth::user()->name))
            <li class="nav-item text-white">
                <a class="nav-link text-white" href="{{route('registro')}}">Crear cuenta</a>
            </li>
            <li class="nav-item text-white">
                <a class="nav-link text-white" href="{{route('login')}}">Iniciar sesión</a>
            </li>
        @else
            {{-- Solo si se ha abierto sesión se deben mostrar estos enlaces --}}
            <li class="nav-item text-white">
                <a class="nav-link text-white" href="{{route('users.account')}}">Cuenta</a>
            </li>
            {{-- Solo si el usuario es administrador --}}
            @if (isset(Auth::user()->rol) && Auth::user()->rol == 'admin')
                <li class="nav-item text-white">
                    <a class="nav-link text-white" href="{{route('events.create')}}">Añadir evento</a>
                </li>
                <li class="nav-item text-white">
                    <a class="nav-link text-white" href="{{route('messages.index')}}">Mensajes</a>
                </li>
            @endif
            <li class="nav-item text-white">
                <a class="nav-link text-white" href="{{route('logout')}}">Cerrar sesión</a>
            </li>
        @endif
    </ul>
</header>
