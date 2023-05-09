'use strict';
let lang=document.getElementById('lang');
lang.addEventListener('change', function(){//Generar cookie de lenguaje
    document.cookie="lenguaje="+lang.value;//Crear la cookie
    location.reload();//Recargar la página con la cookie de lenguaje
});
