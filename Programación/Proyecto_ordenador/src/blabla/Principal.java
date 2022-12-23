package blabla;
import java.util.Scanner;
public class Principal {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		Ordenador ordenador1=new Ordenador("I7",16,512);
		Ordenador ordenador2=new Ordenador("I8",32,1024);
		Ordenador ordenador3=new Ordenador("I9",64,2048);
		System.out.println("El disco 1 es: "+ordenador1.get_disco());
		System.out.println("El índice 1 es: "+ordenador1.get_num());
		System.out.println("El disco 2 es: "+ordenador2.get_disco());
		System.out.println("El índice 2 es: "+ordenador2.get_num());
		System.out.println("El disco 3 es: "+ordenador3.get_disco());
		System.out.println("El índice 3 es: "+ordenador3.get_num());
		sca.close();
	}
}