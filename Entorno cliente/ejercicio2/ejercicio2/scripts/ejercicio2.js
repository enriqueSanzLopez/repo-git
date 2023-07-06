'use strict';
var pagina=0;//Página a mostrar
function tabla() {
    $('#salida').fadeOut('slow');
    setTimeout(3000);
    document.getElementById('salida').innerHTML='';//Vaciar la tabla
    let cabecera=document.createElement('tr');//Crear la fila de los títulos de las columnas
    let cabecera_nombre=document.createElement('th');
    let cabecera_nombre_contenido=document.createTextNode('Nombre');
    cabecera_nombre.appendChild(cabecera_nombre_contenido);
    cabecera.appendChild(cabecera_nombre);
    let cabecera_departamento=document.createElement('th');
    let cabecera_departamento_contenido=document.createTextNode('Departamento');
    cabecera_departamento.appendChild(cabecera_departamento_contenido);
    cabecera.appendChild(cabecera_departamento);
    let cabecera_sueldo=document.createElement('th');
    let cabecera_sueldo_contenido=document.createTextNode('Sueldo');
    cabecera_sueldo.appendChild(cabecera_sueldo_contenido);
    cabecera.appendChild(cabecera_sueldo);
    document.getElementById('salida').appendChild(cabecera);
    const peticion = new XMLHttpRequest();//Crear una petición AJAX
    const url = 'php/ejercicio2.php?pagina='+pagina;//Generar la url a la que pedir el json
    peticion.onload = function () {//Trabajar con el resultado de la petición cuando llega
        const json = this.responseText;//Conseguir los datos de JSON
        let matriz = JSON.parse(json);//Convertir el JSON en una matriz de datos
        let tabla = document.getElementById('salida');//Conseguir el lugar en el que generar la tabla
        for (let i = 0; i < matriz.length; i++) {
            let fila = document.createElement('tr');//Crear la fila
            let nombre = document.createElement('td');//Crear celda del nombre
            let contenido_nombre = document.createTextNode(matriz[i]['nombres']);
            nombre.appendChild(contenido_nombre);
            fila.appendChild(nombre);
            let departamento = document.createElement('td');//Crear la celda del departamento
            let contenido_departamento = document.createTextNode(matriz[i]['departamento']);
            departamento.appendChild(contenido_departamento);
            fila.appendChild(departamento);
            let sueldo = document.createElement('td');//Crear la celda del sueldo
            let contenido_sueldo = document.createTextNode(matriz[i]['sueldo']);
            sueldo.appendChild(contenido_sueldo);
            fila.appendChild(sueldo);
            tabla.appendChild(fila);//Guardar la fila en la tabla
        }
    }
    peticion.open('GET', url);//Enviar la petición
    peticion.send();
    setTimeout(3000);
    $('#salida').fadeIn(3000);
}
document.getElementById('primero').addEventListener('click', function(){
    if(pagina!=0){
        pagina=0;
        tabla();
    }
});
document.getElementById('anterior').addEventListener('click', function(){
    if(pagina>0){
        pagina-=1;
        tabla();
    }
});
document.getElementById('siguiente').addEventListener('click', function(){
    if(pagina<4){
        pagina+=1;
        tabla();
    }
});
document.getElementById('ultimo').addEventListener('click', function(){
    if(pagina!=4){
        pagina=4;
        tabla();
    }
});
tabla();//Llamar a la tabla