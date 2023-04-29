function createEvent(url_parcial) {
    let selects = document.getElementsByTagName('select');
    for (let i = 0; i < selects.length; i++) { //Crear un evento para cada elemento select de rol de usuario
        selects[i].addEventListener('change', function () {
            let id = this.id; //Conseguir la id actual del elemento
            let user = id.split('-')[1]; //Conseguir la id de usuario
            let valor = this.value; //Conseguir el valor del select
            let url = url_parcial + "/api/users.rol"; //URL para la API
            const peticion = new XMLHttpRequest();//Crear una petición AJAX
            peticion.onload = function () { }
            peticion.open('POST', url);//Enviar la petición
            xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            xhttp.send("id=" + user + "&valor=" + valor);//Indicar los valores a pasar por POST
            peticion.send();
        });
    }
}
