'use strict';
let selector = document.getElementById('estado');
selector.addEventListener('change', function () {
    $.ajaxSetup({
        headers: {
            'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
        }
    });
    let tarea = document.getElementById('tarea').value;//Conseguir la id del tarea
    let url_parcial = window.location.href;//Conseguir la URL actual
    url_parcial = url_parcial.replace("/tasks.show/" + tarea, "");//Cambiarla por la URL raiz
    let url = url_parcial + "/api/tasks.estado"; //URL para la API
    let estado=selector.value;
    $.ajax({
        data: {
            id: tarea,
            estado: estado
        },
        url: url,
        type: 'POST',
        dataType: 'json',
        success: function (data) {
            console.log('Éxito');
        },
        error: function (data) {
            console.log('Fracaso');
        }
    });
});
