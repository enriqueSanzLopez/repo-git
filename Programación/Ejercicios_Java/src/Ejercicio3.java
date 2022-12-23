
import java.util.Scanner;
public class Ejercicio3 {
	public static void main (String args[]) {
		String DNI="";
		String Nombre="";
		String Fecha="";
		String Direccion="";
		String C_Postal="";
		String Poblacion="";
		int T_Fijo=0;
		int T_Movil=0;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingresa tu NIF: ");
		DNI=teclado.nextLine();
		System.out.println("Ingresa tu nombre: ");
		Nombre=teclado.nextLine();
		System.out.println("Ingresa tu fecha de nacimiento: ");
		Fecha=teclado.nextLine();
		System.out.println("Ingresa tu dirección actual: ");
		Direccion=teclado.nextLine();
		System.out.println("Ingresa tu código postal: ");
		C_Postal=teclado.nextLine();
		System.out.println("Ingresa tu poblacion: ");
		Poblacion=teclado.nextLine();
		System.out.println("Ingresa tu teléfono fijo: ");
		T_Fijo=teclado.nextInt();
		System.out.println("Ingresa tu teléfono móvil: ");
		T_Movil=teclado.nextInt();
		System.out.println("El alumno "+Nombre+" de NIF "+DNI+", nació el "+Fecha+" y reside actualmente en\n"+Direccion+", "+C_Postal+", "+Poblacion+". Sus teléfonos de contactos son: "+T_Fijo+" y\n"+T_Movil+".");
	}
}
