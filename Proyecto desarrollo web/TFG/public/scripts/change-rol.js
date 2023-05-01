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
    lista.innerHTML='';//Eliminar los componentes de la lista
});
