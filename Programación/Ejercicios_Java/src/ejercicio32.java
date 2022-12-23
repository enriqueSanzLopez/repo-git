import java.util.*;
public class ejercicio32 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		double v=0;
		System.out.print("Ingresa la velocidad en km/h: ");
		v=teclado.nextDouble();
		v=1000*v/(60*60);
		System.out.printf("\nLa velocidad en m/s es: %.2f",v);
	}
}
