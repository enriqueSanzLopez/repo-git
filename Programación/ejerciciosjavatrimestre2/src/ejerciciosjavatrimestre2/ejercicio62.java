package ejerciciosjavatrimestre2;
import java.util.*;
public class ejercicio62 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int numeros, mayusculas, minusculas;
		String contrasena;
		boolean correcto;
		//Mostrar por pantalla las condiciones de la contrasena
		System.out.println("El password ha de tener las siguientes restricciones:\n"
				+ "1-Al menos 8 caracteres\n"
				+ "2-Al menos la mitad del password ha de estar en minusculas\n"
				+ "3-Al menos 2 mayúsculas\n"
				+ "4-Al menos 3 números\n"
				+ "5-No incluir el caracter '@'");
		//Pedir la contrasena
		do {
			//Reseteamos parametros
			numeros=0;
			mayusculas=0;
			minusculas=0;
			//En principio asumimos que la contrasena sera correcta
			correcto=true;
			System.out.print("Introduzca su password: ");
			contrasena=sca.nextLine();
			System.out.println("");
			//Validar la contrasena
			if(contrasena.length()<8) {
				//No tiene suficientes caracteres
				correcto=false;
				System.out.println("El tamaño del password ha de ser de, al menos, 8 caracteres, y el suyo es de "+contrasena.length());
			}
			//Recorrer el bucle para contar minusculas y mayusculas
			for(int i=0;i<contrasena.length();i++) {
				//Contar mayusculas
				if(Character.isUpperCase(contrasena.charAt(i))) {
					//El caracter es mayuscula, acumular en mayusculas
					mayusculas=mayusculas+1;
				}
				//Contar minusculas
				if(Character.isLowerCase(contrasena.charAt(i))) {
					//El caracter es minuscula, acumular en minusculas
					minusculas=minusculas+1;
				}
				//Contar numeros
				if(Character.isDigit(contrasena.charAt(i))) {
					//El caracter es un numero, acumular en numeros
					numeros=numeros+1;
				}
			}
			//Comprobar si la mitad o mas son minusculas
			if(minusculas<contrasena.length()/2) {
				correcto=false;
				System.out.println("La password tiene que tener al menos la mitad de los caracteres en minúsculas");
			}
			//Comprobar si hay al menos 2 mayusculas
			if(mayusculas<2) {
				correcto=false;
				System.out.println("La password tiene que tener al menos 2 mayúsculas, y tu contraseña tienes "+mayusculas);
			}
			//Comprobar si hay al menos 3 numeros
			if(numeros<3) {
				correcto=false;
				System.out.println("La password tiene que tener al menos 3 números y tu contraseña tienes "+numeros);
			}
			//Comprobar que no haya @
			if(contrasena.indexOf("@")!=-1) {
				correcto=false;
				System.out.println("La password no puede tener el caracter @");
			}
		}while(correcto==false);
		System.out.println("El password cumple todas las restricciones. Enhorabuena!");
		sca.close();
	}
}
