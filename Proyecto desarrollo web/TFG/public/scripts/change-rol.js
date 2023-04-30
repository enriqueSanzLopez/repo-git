'use strict';
let selects = document.getElementsByTagName('select');
for (let i = 0; i < selects.length; i++) { //Crear un evento para cada elemento select de rol de usuario
    selects[i].addEventListener('change', function () {
        let id = this.id; //Conseguir la id actual del elemento
        let user = id.split('-')[1]; //Conseguir la id de usuario
        let valor = this.value; //Conseguir el valor del select
        let url_parcial=window.location.href;//Conseguir la URL actual
        url_parcial=url_parcial.replace("/contacts", "");//Cambiarla por la URL raiz
        let url = url_parcial + "/api/users.rol"; //URL para la API
        console.log(url, valor, user);
    });
}
