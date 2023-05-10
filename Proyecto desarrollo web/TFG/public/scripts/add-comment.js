'use strict';
let boton = document.getElementById('comment');//boton para enviar el comentario
let comentario = document.getElementById('commentario');//Comentario
boton.addEventListener('click', function () {
    $.ajaxSetup({
        headers: {
            'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
        }
    });//Introducir el token de seguridad para que permita guardar datos
    let tarea = document.getElementById('tarea').value;//Conseguir la id del tarea
    let url_parcial = window.location.href;//Conseguir la URL actual
    url_parcial = url_parcial.replace("/tasks.show/" + tarea, "");//Cambiarla por la URL raiz
    let url = url_parcial + "/api/comments"; //URL para la API
    let user = document.getElementById('user');
    $.ajax({
        data: {
            user: user.value,
            tarea: tarea,
            comment: comentario.value
        },
        url: url,
        type: 'POST',
        dataType: 'json',
        success: function(data){
            console.log(data);
            let comentarios=document.getElementById('comentarios');//Conseguir la zona en la que se ven los comentarios
            let nuevo=document.createElement('article');//Generar el comentario para que el usuario lo pueda ver
            let div=document.createElement('div');
            let nombre=document.createElement('span');
            let nombreTexto=document.createTextNode(data['name']+' - '+data['email']);//Conseguir el nombre del usuario del comentario junto con su email
            nombre.appendChild(nombreTexto);
            div.appendChild(nombre);
            let fecha=document.createElement('span');
            let fechaTexto=document.createTextNode(data['fecha']);//Indicar la fecha del comentario
            fecha.appendChild(fechaTexto);
            div.appendChild(fecha);
            nuevo.appendChild(div);
            let parrafo=document.createElement('p');//Crear el parrafo de texto con el comentario
            let parrafoTexto=document.createTextNode(comentario.value);
            parrafo.appendChild(parrafoTexto);
            nuevo.appendChild(parrafo);
            comentarios.appendChild(nuevo);//Insertar el comentario
        },
        failure: function(data){
            console.log('Fracaso');
        }
    });//Peticion ajax para guardar el comentario y en caso de exito montarlo
});//Evento para enviar el comentario
