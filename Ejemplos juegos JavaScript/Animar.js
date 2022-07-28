/*Guardar los datos del canvas*/
const canvas=document.getElementById("canvas1");
const ctx=canvas.getContext("2d");
const CANVAS_WIDTH=canvas.width=600;
const CANVAS_HEIGHT=canvas.height=600;
/*Traer una imagen a JavaScript*/
const JImagen=new Image();
Jimagen.src="archivo.png"/*Aquí iría la URL del Spritesheet*/