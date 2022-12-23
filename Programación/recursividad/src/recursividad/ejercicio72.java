package recursividad;
import java.util.Scanner;
public class ejercicio72 {
	public static double Sumar(double a, double b) {
		double c=a+b;
		return c;
	}
	public static double Restar(double a, double b) {
		double c=a-b;
		return c;
	}
	public static double Multiplicar(double a, double b) {
		double c=a*b;
		return c;
	}
	public static double Dividir(double a, double b) {
		double c=a/b;
		return c;
	}
	public static double Potenciar(double a, double b) {
		double c=Math.pow(a, b);
		return c;
	}
	public static double RaizCuadrada(double a) {
		double b=Math.sqrt(a);
		return b;
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int opcion=0;
		double resultado, a, b;
		while(opcion!=9) {
			System.out.println("Bienvenido a la calculadora!\n"
					+ "Seleccione una opción:\n"
					+ "1.- Sumar\n"
					+ "2.- Restar\n"
					+ "3.- Multiplicar\n"
					+ "4.- Dividir\n"
					+ "5.- Potencia\n"
					+ "6.- Raíz cuadrada\n"
					+ "9.- Salir");
			opcion=sca.nextInt();
			if(opcion==9) {
				break;
			}
			switch(opcion) {
			case 1:
				System.out.println("Introduce 2 números a sumar:");
				a=sca.nextDouble();
				b=sca.nextDouble();
				resultado=Sumar(a,b);
				System.out.printf("El resultado de la suma es %.2f\n", resultado);
				break;
			case 2:
				System.out.println("Introduce 2 números a restar:");
				a=sca.nextDouble();
				b=sca.nextDouble();
				resultado=Restar(a,b);
				System.out.printf("El resultado de la resta es %.2f\n", resultado);
				break;
			case 3:
				System.out.println("Introduce 2 números a multiplicar:");
				a=sca.nextDouble();
				b=sca.nextDouble();
				resultado=Multiplicar(a,b);
				System.out.printf("El resultado de la multiplicación es %.2f\n", resultado);
				break;
			case 4:
				System.out.println("Introduce el numerador y el divisor:");
				a=sca.nextDouble();
				b=sca.nextDouble();
				resultado=Sumar(a,b);
				System.out.printf("El resultado de la división es %.2f\n", resultado);
				break;
			case 5:
				System.out.println("Introduce la base y el exponente:");
				a=sca.nextDouble();
				b=sca.nextDouble();
				resultado=Potenciar(a,b);
				System.out.printf("El resultado de la operación es %.2f\n", resultado);
				break;
			case 6:
				System.out.println("Introduce el número del que quieres la raíz cuadrada:");
				a=sca.nextDouble();
				resultado=RaizCuadrada(a);
				System.out.printf("El resultado es %.2f\n", resultado);
				break;
			case 9:
				break;
			default:
				System.out.println("Opción inexistente");
				break;
			}
		}
		sca.close();
	}
}