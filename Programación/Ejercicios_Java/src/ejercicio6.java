
import java.util.Scanner;
public class ejercicio6 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		double x1=0;
		double x2=0;
		System.out.print("a*X^2+b*X+c=0\nIngrese a: ");
		a=teclado.nextInt();
		System.out.print("Ingrese b: ");
		b=teclado.nextInt();
		System.out.print("Ingrese c: ");
		c=teclado.nextInt();
		x1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		x2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		System.out.printf("Las soluciones son: %.2f y %.2f",x1,x2);
	}
}
