package recursividad;
import java.util.*;
public class ejercicio85 {
	public static void opcion(int n) {
		Scanner sca=new Scanner(System.in);
		double a, b, B, area;
		switch(n) {
		case 1:
			//Llamar al cuadrado
			System.out.println("Introduce la longitud del lado del cuadrado:");
			a=sca.nextDouble();
			area=a*a;
			break;
		case 2:
			//Llamar al rectangulo
			System.out.println("Introduce los lados del rectangulo:");
			a=sca.nextDouble();
			b=sca.nextDouble();
			area=a*b;
			break;
		case 3:
			//Llamar al triangulo
			System.out.println("Introduce la base y la altura del triángulo:");
			b=sca.nextDouble();
			a=sca.nextDouble();
			area=(a*b)/2;
			break;
		case 4:
			//Llamar al paralelogramo
			System.out.println("Introduce la base y la altura del paralelogramo:");
			b=sca.nextDouble();
			a=sca.nextDouble();
			area=a*b;
			break;
		case 5:
			//Llamar al trapecio
			System.out.println("Introduce la base superior, la base inferior, y la altura del trapecio:");
			B=sca.nextDouble();
			b=sca.nextDouble();
			a=sca.nextDouble();
			area=((B+b)/2)*a;
			break;
		case 6:
			//Llamar al circulo
			System.out.println("Introduce el radio del círculo:");
			a=sca.nextDouble();
			area=Math.PI*a*a;
			break;
		case 7:
			//Salir
			area=0;
			break;
		default:
			System.out.println("ERROR! Opción inexistente");
			area=0;
			break;
		}
		System.out.printf("El área es %.2f\n", area);
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Selecciona el polígono del que quieres saber el área:\n"
					+ "1-Cuadrado\n"
					+ "2-Rectángulo\n"
					+ "3-Triángulo\n"
					+ "4-Paralelogramo\n"
					+ "5-Trapecio\n"
					+ "6-Círculo\n"
					+ "7-Salir");
			opcion=sca.nextInt();
			if(opcion==7) {
				break;
			}
			opcion(opcion);
		}while(opcion!=7);
		sca.close();
	}
}