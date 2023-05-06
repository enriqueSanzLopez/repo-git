'use strict';
function apuntar() {
    let usuarios = document.getElementsByClassName('apuntar');
    for (let i = 0; i < usuarios.length; i++) {
        usuarios[i].addEventListener('click', function () {
            $.ajaxSetup({
                headers: {
                    'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
                }
            });
            let proyecto = document.getElementById('proyecto').value;//Conseguir la id del proyecto
            let url_parcial = window.location.href;//Conseguir la URL actual
            url_parcial = url_parcial.replace("/projects.show/" + proyecto, "");//Cambiarla por la URL raiz
            let url = url_parcial + "/api/projects.apuntar"; //URL para la API
            let user=this.id.split('-')[1];
            let nombre=this.id.split('-')[2];
            let email=this.id.split('-')[3];
            $.ajax({
                data: {
                    project: proyecto,
                    id:user
                },
                url: url,
                type: 'POST',
                dataType: 'json',
                success: function (data) {
                    console.log('Éxito');
                    //Se ha logrado asignar al usuario al proyecto, luego hay que montarlo en la lista de usuarios
                    let trabajadores=document.getElementById('listado-trabajadores');//Conseguir el listado de trabajadores actual para incluir al nuevo trabajador
                    let trabajador=document.createElement('ul');
                    trabajador.classList.add('list-group');
                    let lista_nombre=document.createElement('li');
                    let lista_nombre_texto=document.createTextNode(nombre);
                    lista_nombre.appendChild(lista_nombre_texto);
                    trabajador.appendChild(lista_nombre);
                    let lista_email=document.createElement('li');
                    lista_email.classList.add('pequenyo');
                    let lista_email_texto=document.createTextNode(email);
                    lista_email.appendChild(lista_email_texto);
                    trabajador.appendChild(lista_email);
                    trabajadores.appendChild(trabajador);
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
    let proyecto = document.getElementById('proyecto').value;//Conseguir la id del proyecto
    let url_parcial = window.location.href;//Conseguir la URL actual
    url_parcial = url_parcial.replace("/projects.show/" + proyecto, "");//Cambiarla por la URL raiz
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
