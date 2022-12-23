import java.util.*;
public class ejercicio37 {
	public static void main(String arg[]) {
		Scanner teclado=new Scanner(System.in);
		double x=0, y=0;
		System.out.print("Introduce la coordenada x: ");
		x=teclado.nextDouble();
		System.out.print("\nIntroduce la coordenada y: ");
		y=teclado.nextDouble();
		if(x>=0) {
			if(y>=0) {
				System.out.println("\nEl centro del círculo está en el primer cuadrante");
			}else {
				System.out.println("\nEl centro del círculo está en el cuarto cuadrante");
			}
		}else if(y>=0) {
			System.out.println("\nEl centro del círculo está en el segundo cuadrante");
		}else {System.out.println("\nEl centro del círculo está en el tercer cuadrante");}
		teclado.close();
	}
}
