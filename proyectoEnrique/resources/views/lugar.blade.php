@extends('layout')
@section('titulo', 'Inicio')
@section('contenido')
    <main class="bg-light text-dark">
        <section id="lugar">
            <h3>Puedes visitarnos a C/ del Dr. Trueta, 183, 6, 5, 08005 Barcelona</h3>
            <div class="mapouter">
                <div class="gmap_canvas"><iframe width="600" height="500" id="gmap_canvas"
                        src="https://maps.google.com/maps?q=C/%20del%20Dr.%20Trueta,%20183,%206,%205,%2008005%20Barcelona&t=&z=13&ie=UTF8&iwloc=&output=embed"
                        frameborder="0" scrolling="no" marginheight="0" marginwidth="0"></iframe><a
                        href="https://123movies-i.net">123movies</a><br>
                    <style>
                        .mapouter {
                            position: relative;
                            text-align: right;
                            height: 500px;
                            width: 600px;
                        }
                    </style><a href="https://www.embedgooglemap.net">embedgooglemap.net</a>
                    <style>
                        .gmap_canvas {
                            overflow: hidden;
                            background: none !important;
                            height: 500px;
                            width: 600px;
                        }
                    </style>
                </div>
            </div>
        </section>
    </main>
@endsection
