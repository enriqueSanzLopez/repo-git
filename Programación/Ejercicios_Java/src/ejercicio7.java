import java.util.Scanner;
public class ejercicio7 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		double a=0;
		double b=0;
		double c=0;
		System.out.print("Ingresa a: ");
		a=teclado.nextFloat();
		System.out.print("\nIngresa b: ");
		b=teclado.nextFloat();
		System.out.println("\nAl principio del programa el valor de a es "+a+" y el valor de b es "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("Después del intercambio, el valor de a es "+a+" y el valor de b es "+b);
		}
}
