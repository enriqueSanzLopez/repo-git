import java.util.Scanner;
public class ejercicio14 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		double a;
		double b;
		double resultado;
		System.out.print("Ingresa a: ");
		a=teclado.nextDouble();
		System.out.print("\nIngresa b: ");
		b=teclado.nextDouble();
		resultado=(a*b)/2;
		System.out.println("\nSi "+a+" fuera la altura y "+b+"fuera la base del triángulo, el área del triángulo sería "+resultado);
		resultado=Math.pow(a,2);
		System.out.println("Si "+a+"fuera un lado de un cuadrado, su área sería "+resultado);
		resultado=Math.round(100.0*(Math.PI*Math.pow(a,2)))/100.0;
		System.out.println("Si "+a+" fuera un radio de un círculo, su área sería "+resultado);
	}
}
