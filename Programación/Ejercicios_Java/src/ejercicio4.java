
import java.util.Scanner;
public class ejercicio4 {
	public static void main (String args[]) {
		Scanner teclado=new Scanner(System.in);
		double x=0;
		System.out.println("Ingresa un valor: ");
		x=teclado.nextDouble();
		System.out.println(x+" x 1 = "+x+"\n"
				+x+" x 2 = "+(2*x)+"\n"
				+x+" x 3 = "+(3*x)+"\n"
				+x+" x 4 = "+(4*x)+"\n"
				+x+" x 5 = "+(5*x)+"\n"
				+x+" x 6 = "+(6*x)+"\n"
				+x+" x 7 = "+(7*x)+"\n"
				+x+" x 8 = "+(8*x)+"\n"
				+x+" x 9 = "+(9*x)+"\n"
				+x+" x 10 = "+(10*x));
	}
}
