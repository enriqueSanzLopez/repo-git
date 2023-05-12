'use strict';
let boton=document.getElementById('calendario');//Conseguir el boton de impresion del calendario
boton.addEventListener('click', function(){
    let url_parcial = window.location.href;//Conseguir la URL actual
    let url = url_parcial + "api/calendar"; //URL para la API
    console.log(url);
    // fetch(url+'/'+user_id, {//Metodo de llamada de la peticion Get
    //     method: 'GET',
    // })
    // .then(response => response.blob())
    // .then(blob => {//Crear una url temporal para descargar el fichero
    //     const url = URL.createObjectURL(blob);
    //     const link = document.createElement('a');
    //     link.href = url;
    //     link.download = 'calendar.ics';
    //     link.click();//Descargar de la url temporal
    //     URL.revokeObjectURL(url);//Eliminar la url temporal
    // })
    // .catch(error => {//En caso de que haya cualquier error, se muestra por pantalla
    //     console.error('Error:', error);
    // });
    let ventana=window.open(url);
    ventana.close();
});
