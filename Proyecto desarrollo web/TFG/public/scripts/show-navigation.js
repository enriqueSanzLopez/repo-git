'use strict';
let estado=0;
let nav_boton=document.getElementById('nav-boton');
nav_boton.addEventListener('click', function(){
    let navegacion=document.getElementById('navbarNav');
    if(estado==0){
        navegacion.style.display='block';
        estado=1;
    }else{
        navegacion.style.display='none';
        estado=0;
    }
});
