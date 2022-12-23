import java.util.*;
public class ejercicio25 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		double a;
		double b;
		double resultado;
		System.out.print("Ingresa a: ");
		a=teclado.nextDouble();
		System.out.print("\nIngresa b: ");
		b=teclado.nextDouble();
		resultado=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		System.out.printf("\nEl valor de la hipotenusa es: %.2f",resultado);
	}
}