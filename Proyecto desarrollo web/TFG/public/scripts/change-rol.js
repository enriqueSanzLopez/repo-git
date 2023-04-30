'use strict';
// $.ajaxSetup({
//     headers: {
//        'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
//     }
//  });
let selects = document.getElementsByTagName('select');
for (let i = 0; i < selects.length; i++) { //Crear un evento para cada elemento select de rol de usuario
    selects[i].addEventListener('change', function () {
        let id = this.id; //Conseguir la id actual del elemento
        let user = id.split('-')[1]; //Conseguir la id de usuario
        let valor = this.value; //Conseguir el valor del select
        let url_parcial = window.location.href;//Conseguir la URL actual
        url_parcial = url_parcial.replace("/contacts", "");//Cambiarla por la URL raiz
        let url = url_parcial + "/api/users.rol"; //URL para la API
        console.log(url, valor, user);
        // const xhttp = new XMLHttpRequest();//Abrir la petición AJAX
        // xhttp.onload = function () { }
        // xhttp.open("POST", url);//Enviar la petición por POST a la URL correspondiente
        // xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");//Indicar que se le va a enviar información a través de post por la petición
        // xhttp.send("id=" + user + "&valor=" + valor);//Indicar la información que se envía
        // console.log({id: user,
        //     valor: valor,
        //     _token: $('meta[name="csrf-token"]').attr('content')
        // });
        // $.ajax({
        //     url: url,
        //     method: 'POST',
        //     data:{id: user,
        //         valor: valor,
        //         _token: $('meta[name="csrf-token"]').attr('content')
        //     }
        // }).done(function(res){});
        // const xhttp = new XMLHttpRequest();//Abrir la petición AJAX
        // xhttp.onload = function () { }
        // xhttp.open("GET", url+"?id="+user+"&valor="+valor);//Enviar la petición por POST a la URL correspondiente
        // xhttp.send();
    });
}
