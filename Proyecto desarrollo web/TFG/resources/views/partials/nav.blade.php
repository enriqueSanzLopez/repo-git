<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="#"><img src="{{ asset('img/Scrum Admin.png') }}"
                alt="{{__('logo-app')}}"></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="/">{{__('inicio')}}</a>
                </li>
                @if (!isset(Auth::user()->name))
                    <li class="nav-item">
                        <a class="nav-link" href="{{ route('registro') }}">{{__('registro')}}</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="{{ route('login') }}">{{__('login')}}</a>
                    </li>
                @else
                    <li class="nav-item">
                        <a class="nav-link" href="{{ route('projects') }}">{{__('proyectos')}}</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="{{ route('sprints') }}">Sprints</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="{{ route('tasks') }}">{{__('tareas')}}</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="{{ route('logout') }}">{{__('cerrar-sesion')}}</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="{{ route('calendar') }}">{{__('imprimir-calendario')}}</a>
                    </li>
                    @if (Auth::user()->rol == 'admin')
                        <li class="nav-item">
                            <a class="nav-link" href="{{ route('contacts') }}">{{__('users')}}</a>
                        </li>
                    @endif
                @endif
                <li>
                    <select name="lang" id="lang">
                        <option value="es"
                        @isset($_COOKIE['lenguaje'])
                        @if ($_COOKIE['lenguaje']=='es')
                        selected='selected'
                        @endif
                        @endisset
                        >Español</option>
                        <option value="en"
                        @isset($_COOKIE['lenguaje'])
                        @if ($_COOKIE['lenguaje']=='en')
                        selected='selected'
                        @endif
                        @endisset
                        >English</option>
                        <option value="ca"
                        @isset($_COOKIE['lenguaje'])
                        @if ($_COOKIE['lenguaje']=='ca')
                        selected='selected'
                        @endif
                        @endisset
                        >Català</option>
                    </select>
                    <script src="{{ asset('scripts/select-lang.js') }}"></script>
                </li>
            </ul>
        </div>
    </div>
</nav>
