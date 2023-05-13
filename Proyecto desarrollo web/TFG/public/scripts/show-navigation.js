'use strict';
let estado=0;
let nav_boton=document.getElementById('nav-boton');
nav_boton.addEventListener('click', function(){
    let navegacion=document.getElementById('navbarNav');
    if(estado==0){
        navegacion.style.display='block';
        let listado=navegacion.getElementsByTagName('li');
        for(let i=0;i<listado.length;i++){
            listado[i].style.paddingLeft='0';
            listado[i].style.paddingRight='0';
            listado[i].style.display='flex';
            listado[i].style.flexDirection='row';
            listado[i].style.justifyContent='center';
        }
        estado=1;
    }else{
        navegacion.style.display='none';
        estado=0;
    }
});
