//Este es un ejemplo de comentario en línea
/*Este es un ejemplo de comentario de 
múltiples líneas*/
/*Los tipos de datos son undefined, null, boolean, string,
symbol, number, y object*/
console.log("Hola mundo");//Esto es el equivalente al print
var x = "B";//Ejemplo de declaración de variable global
let y = "blacaerw";//Ejemplo de declaración de variable local
const pi = 3.14;//Ejemplo de declaración de constante
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