//Este es un ejemplo de comentario en línea
/*Este es un ejemplo de comentario de 
múltiples líneas*/
/*Los tipos de datos son undefined, null, boolean, string,
symbol, number, y object*/
console.log("Hola mundo");//Esto es el equivalente al print
var x = "B";//Ejemplo de declaración de variable
let y = "blacaerw";//Ejemplo de declaración de variable
const pi = 3.14;//Ejemplo de declaración de constante
/*Declarar una variable con var te permite volver a declararla
pero declararla con let no. Usar var hace que pueda ser global
o local, let siempre busca hacer la variable lo más local
posible. Por otra parte, si declaras con const, la variable no
puede ser cambiada. Si un array se declara con const, sus
valores si pueden ser cambiados.*/
y.length;//Longitud de una string
var ejemplo = [];//Así se declara un array
ejemplo.push("Hola");//Guarda un valor al final del array ampliando el array
var nuevoEjemplo = ejemplo.pop();//nuevoEjemplo pasa a ser equivalente al último elemento de ejemplo, y ejemplo pierde su último elemento
nuevoEjemplo = ejemplo.shift();//nuevoEjemplo pasa a ser equivalente al primer valor del array y ejemplo pierde su primer valor
ejemplo.unshift("Mundo");//Añade un elemento al principio del array
function miFuncion() {//Así se declara una función en JavaScript
    //Instrucciones
    return 10;
}
if (x == "A" && y == "Hola") {//Así se escribe un condicional
    x = "C";
} else if (x == "B") {
    y = "Hola";
}
else {
    x = "B";
}
switch (x) {//Así se escribe el switch
    case "A":
        break;
    case "B":
        break;
    default:
        break;
}
var Objeto={//Así se define un objeto
    "nombre":"E",
    "numero": 4,
    "otros": "no"
}
var cosa=Objeto.nombre;//Así se accede a una propiedad de un objeto
var coso=Objeto["nombre"];//Otra forma de acceder a la propiedad
Objeto.nombre="Hola";//Así se modifica la propiedad de un objeto
Objeto.final="Aquí";//Así se añade una propiedad nueva a un objeto
delete Objeto.final;//Así se elimina una propiedad de un objeto
var i=0;
while(i<9){//Ejemplo de bucle while
    i++;
}
for(i=0;i<9;i++){//Ejemplo de bucle for

}
i=0;
do{//Ejemplo de bucle do while
    i++;
}while(i<9);
//parseInt("Una string", 2); Retorna NaN en caso de no ser un número, o retorna la String convertida en un entero en base binaria con el argumento del 2, sin argumento en base decimal