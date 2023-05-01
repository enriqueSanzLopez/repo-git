'use strict';
let buscador = document.getElementById('busqueda');
let selects = document.getElementsByTagName('select');
function generarRol() {
    for (let i = 0; i < selects.length; i++) { //Crear un evento para cada elemento select de rol de usuario
        selects[i].addEventListener('change', function () {
            let id = this.id; //Conseguir la id actual del elemento
            let user = id.split('-')[1]; //Conseguir la id de usuario
            let valor = this.value; //Conseguir el valor del select
            let url_parcial = window.location.href;//Conseguir la URL actual
            url_parcial = url_parcial.replace("/contacts", "");//Cambiarla por la URL raiz
            let url = url_parcial + "/api/users.rol"; //URL para la API
            $.ajaxSetup({
                headers: {
                    'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
                }
            });
            $.ajax({
                data: {
                    id: user,
                    valor: valor
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
    }
}
generarRol();//Generar los eventos de cambio de rol iniciales
buscador.addEventListener('input', function(){
    let lista=document.getElementById('usuarios');//Conseguir el listado actual de usuario
    let url_parcial = window.location.href;//Conseguir la URL actual
    url_parcial = url_parcial.replace("/contacts", "");//Cambiarla por la URL raiz
    let url = url_parcial + "/api/users.buscaruser"; //URL para la API
    $.ajax({
        url: url,
        type: 'get',
        data:{
            name: this.value
        },
        success: function(response){
            lista.innerHTML='';//Eliminar los componentes de la lista
            for(let i=0;i<response.length;i++){//Generar la lista de usuarios resultante de la búsqueda
                let user=document.createElement('ul');//Generar usuario
                user.classList.add('list-group');
                user.classList.add('list-group-horizontal');
                let nombre=document.createElement('li');
                nombre.classList.add('list-group-item');
                let nombreTexto=document.createTextNode(response[i]['name']);
                nombre.appendChild(nombreTexto);
                user.appendChild(nombre);
                let email=document.createElement('li');
                email.classList.add('list-group-item');
                let emailTexto=document.createTextNode(response[i]['email']);
                email.appendChild(emailTexto);
                user.appendChild(email);
                let final=document.createElement('li');
                final.classList.add('list-group-item');
                let selector=document.createElement('select');
                selector.setAttribute('id', 'rol-'+response[i]['id']);
                selector.setAttribute('name', 'rol');
                selector.setAttribute('class', 'form-select form-select-lg');
                let rol0=document.createElement('option');
                rol0.setAttribute('value', '0');
                let rol0Texto=document.createTextNode('Usuario');
                if(response[i]['rol']=='user'){
                    rol0.setAttribute('selected', 'selected');
                }
                rol0.appendChild(rol0Texto);
                selector.appendChild(rol0);
                let rol1=document.createElement('option');
                rol1.setAttribute('value', '1');
                let rol1Texto=document.createTextNode('Administrador');
                if(response[i]['rol']=='admin'){
                    rol1.setAttribute('selected', 'selected');
                }
                rol1.appendChild(rol1Texto);
                selector.appendChild(rol1);
                final.appendChild(selector);
                user.appendChild(final);
                let borrar=document.createElement('li');
                borrar.classList.add('list-group-item');
                let boton=document.createElement('a');
                boton.setAttribute('class', 'btn btn-danger');
                boton.setAttribute('href', url_parcial+'/users.borrar/'+response[i]['id']);
                let botonTexto=document.createTextNode('Eliminar');
                boton.appendChild(botonTexto);
                borrar.appendChild(boton);
                user.appendChild(borrar);
                lista.appendChild(user);//Guardar el usuario en la lista de los mismos
            }
            generarRol();//Generar los eventos de cambio de rol para los usuarios que se muestren ahora
        },
        failure: function(response){
            console.log(response);
        }
    });
});
