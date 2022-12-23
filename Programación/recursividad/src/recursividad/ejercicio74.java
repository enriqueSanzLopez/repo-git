package recursividad;
import java.util.Scanner;
public class ejercicio74 {
	public static void bucle(int x) {
		for(int i=0;i<x;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void vacio(int x) {
		System.out.print("*");
		for(int i=0;i<x-2;i++) {
			System.out.print(" ");
		}
		System.out.println("*");
	}
	public static void imprimeCajaTexto(String s) {
		int x=s.length()+4;
		//Imprimir la frase
		bucle(x);
		vacio(x);
		System.out.println("* "+s+" *");
		vacio(x);
		bucle(x);
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		String s;
		System.out.println("Introduce una frase:");
		s=sca.nextLine();
		//Llamar a la funcion
		imprimeCajaTexto(s);
		sca.close();
	}
}