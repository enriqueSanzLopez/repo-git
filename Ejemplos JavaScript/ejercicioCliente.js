function ejercicio3_1 (numero) {
    numero=Number(numero);
    if (numero%2==0) {
        return "El número "+numero+" es par.";
    } else {
        return "El número "+numero+" es impar.";
    }
}
function ejercicio3_2 (cadena) {
    var mayus=cadena.toUpperCase();
    var minus=cadena.toLowerCase();
    if (cadena==mayus) {
        return "La cadena está compuesta por mayúsculas.";
    } else if (cadena==minus) {
        return "La cadena está compuesta por minúsculas.";
    } else {
        return "La cadena contiene tanto minúsculas como mayúsculas.";
    }
}