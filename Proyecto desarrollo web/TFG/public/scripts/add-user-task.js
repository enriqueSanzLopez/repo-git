'use strict';
function desapuntar(){
    let usuarios=document.getElementsByClassName('borrar-user');
    for(let i=0;i<usuarios.length;i++){
        usuarios[i].addEventListener('click', function(){
            $.ajaxSetup({
                headers: {
                    'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
                }
            });
            let tarea = document.getElementById('tarea').value;//Conseguir la id del tarea
            let url_parcial = window.location.href;//Conseguir la URL actual
            url_parcial = url_parcial.replace("/tasks.show/" + tarea, "");//Cambiarla por la URL raiz
            let url = url_parcial + "/api/tasks.desapuntar"; //URL para la API
            let user=this.id.split('-')[2];
            $.ajax({
                data: {
                    task: tarea,
                    id: user
                },
                url: url,
                type: 'POST',
                dataType: 'json',
                success: function (data) {
                    console.log('Éxito');
                    let elemento=document.getElementById('lista-'+user);
                    elemento.remove();
                },
                error: function (data) {
                    console.log('Fracaso');
                }
            });
        });
    }
}
function apuntar() {
    let usuarios = document.getElementsByClassName('apuntar');
    for (let i = 0; i < usuarios.length; i++) {
        usuarios[i].addEventListener('click', function () {
            $.ajaxSetup({
                headers: {
                    'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
                }
            });
            let tarea = document.getElementById('tarea').value;//Conseguir la id del tarea
            let url_parcial = window.location.href;//Conseguir la URL actual
            url_parcial = url_parcial.replace("/tasks.show/" + tarea, "");//Cambiarla por la URL raiz
            let url = url_parcial + "/api/tasks.apuntar"; //URL para la API
            let user=this.id.split('-')[1];
            let nombre=this.id.split('-')[2];
            let email=this.id.split('-')[3];
            $.ajax({
                data: {
                    task: tarea,
                    id: user
                },
                url: url,
                type: 'POST',
                dataType: 'json',
                success: function (data) {
                    console.log('Éxito');
                    //Se ha logrado asignar al usuario al tarea, luego hay que montarlo en la lista de usuarios
                    let trabajadores=document.getElementById('listado-trabajadores');//Conseguir el listado de trabajadores actual para incluir al nuevo trabajador
                    let trabajador=document.createElement('ul');
                    trabajador.classList.add('list-group');
                    trabajador.setAttribute('id', 'lista-'+user);
                    let lista_nombre=document.createElement('li');
                    let lista_nombre_texto=document.createTextNode(nombre);
                    lista_nombre.appendChild(lista_nombre_texto);
                    trabajador.appendChild(lista_nombre);
                    let lista_email=document.createElement('li');
                    let salto1=document.createElement('br');
                    let salto2=document.createElement('br');
                    lista_email.appendChild(salto1);
                    lista_email.appendChild(salto2);
                    lista_email.classList.add('pequenyo');
                    let lista_email_texto=document.createTextNode(email);
                    lista_email.appendChild(lista_email_texto);
                    trabajador.appendChild(lista_email);
                    let rol=document.getElementById('rol');
                    if(rol.value=='true'){
                        let lista_borrar=document.createElement('li');
                        lista_borrar.classList.add('borrar-user');
                        lista_borrar.setAttribute('id', 'borrar-user-'+user+'-'+tarea);
                        let lista_borrar_texto=document.createTextNode('x');
                        lista_borrar.appendChild(lista_borrar_texto);
                        trabajador.appendChild(lista_borrar);
                    }
                    trabajadores.appendChild(trabajador);
                    desapuntar();
                },
                error: function (data) {
                    console.log('Fracaso');
                }
            });
        });
    }
}
let buscador = document.getElementById('busqueda');
buscador.addEventListener('input', function () {
    let tarea = document.getElementById('tarea').value;//Conseguir la id del tarea
    let url_parcial = window.location.href;//Conseguir la URL actual
    url_parcial = url_parcial.replace("/tasks.show/" + tarea, "");//Cambiarla por la URL raiz
    let url = url_parcial + "/api/users.buscaruser"; //URL para la API
    $.ajax({
        url: url,
        type: 'get',
        data: {
            name: this.value
        },
        success: function (response) {
            let lista = document.getElementById('usuarios');
            lista.innerHTML = '';//Vaciar la lista de sugerencias
            lista.style.display = 'block';//Mostrar la lista de resultados
            for (let i = 0; i < response.length; i++) {
                let user = document.createElement('ul');//Generar usuario
                user.setAttribute('id', 'user-' + response[i]['id']+'-'+response[i]['name']+'-'+response[i]['email']);
                // user.classList.add('list-group');
                user.classList.add('contenedor-horizontal');
                user.classList.add('marcar');
                user.classList.add('apuntar');
                let nombre = document.createElement('li');
                let nombreTexto = document.createTextNode(response[i]['name']);
                nombre.appendChild(nombreTexto);
                user.appendChild(nombre);
                let email = document.createElement('li');
                email.classList.add('pequenyo');
                let emailTexto = document.createTextNode(response[i]['email']);
                email.appendChild(emailTexto);
                user.appendChild(email);
                lista.appendChild(user);
            }
            apuntar();
        },
        failure: function (response) {
            console.log(response);
        }
    });
});
desapuntar();
