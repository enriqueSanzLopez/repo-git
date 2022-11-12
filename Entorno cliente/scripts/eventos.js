document.getElementById("eTeclado").addEventListener("keyup", fecha);
document.getElementById("nombre").addEventListener("input", escribe);
document.getElementById("nombre").addEventListener("focus", color1);
document.getElementById("nombre").addEventListener("blur", color2);
document.getElementById("eRaton").addEventListener("click", fondo);
document.getElementById("imagen").addEventListener("mouseover", imagen1);
document.getElementById("imagen").addEventListener('mouseout', imagen2);
document.getElementById("imagen").addEventListener("click", imagen3);
function fecha(){
    document.getElementById("teclado").innerHTML=Date();
    document.getElementById("teclado").style.color="white";
}
function escribe(){
    var x=document.getElementById("nombre").value;
    document.getElementById("eFormulario").innerHTML="¡Hola "+x+"!";
}
function color1(){
    document.getElementById("eFormulario").style.color="yellow";
}
function color2(){
    document.getElementById("eFormulario").style.color="white";
}
function fondo(){
    var color=document.getElementById("eRaton").style.backgroundColor;
    if(color=="aquamarine"){
        document.getElementById("eRaton").style.backgroundColor="pink";
    }else{
        document.getElementById("eRaton").style.backgroundColor="aquamarine";
    }
}
function imagen1(){
    document.getElementById("imagen").src="img/monete.jpg";
}
function imagen2(){
    document.getElementById("imagen").src="img/ardilla.jpg"
}
function imagen3(){
    document.getElementById("imagen").src="img/caballo.jpg"
}