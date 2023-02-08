<header class="bg-dark text-white">
    <div>
        <img src="img/T.png" class="img-fluid img-thumbnail" alt="Icono de NoTebeo">
        <h1>NoTebeo</h1>
    </div>
    <ul class="nav justify-content-end flex-row align-middle text-white">
        <!--A partir de aquí, solo deberían verlo usuarios logeados-->
        <li class="nav-item text-white">
            <a class="nav-link text-white" href="{{route('inicio')}}">Inicio</a>
        </li>
        <li class="nav-item text-white">
            <a class="nav-link text-white" href="#">Miembros</a>
        </li>
        <li class="nav-item text-white">
            <a class="nav-link text-white" href="{{route('events.index')}}">Eventos</a>
        </li>
        <li class="nav-item text-white">
            <a class="nav-link text-white" href="{{route('lugar')}}">Contacto</a>
        </li>
        <li class="nav-item text-white">
            <a class="nav-link text-white" href="#">Donde estamos</a>
        </li>
        <!--A partir de aquí son cosas que solo deberían ver los administradores-->
        <li class="nav-item text-white">
            <a class="nav-link text-white" href="#">Añadir evento</a>
        </li>
        <li class="nav-item text-white">
            <a class="nav-link text-white" href="{{route('messages.index')}}">Mensajes</a>
        </li>
    </ul>
</header>
