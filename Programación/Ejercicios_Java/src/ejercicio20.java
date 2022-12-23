import java.util.*;
public class ejercicio20 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		double a=0;
		double b=0;
		System.out.print("Ingresa la base: ");
		b=teclado.nextDouble();
		System.out.print("\nIngresa la altura: ");
		a=teclado.nextDouble();
		System.out.println("\nEl triángulo de base "+b+" y altura "+a+" tiene un área de "+((a*b)/2));
		teclado.close();
	}
}
