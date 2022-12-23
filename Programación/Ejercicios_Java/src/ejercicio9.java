import java.util.Scanner;
public class ejercicio9 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int edad=0;
		System.out.print("Ingresa tu edad: ");
		edad=teclado.nextInt();
		edad=1492/edad;
		edad=edad-20;
		edad=(int) Math.sqrt(edad);
		System.out.println("\nEl número secreto es: "+edad);
	}
}
