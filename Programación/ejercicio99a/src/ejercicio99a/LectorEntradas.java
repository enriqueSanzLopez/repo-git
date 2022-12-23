package ejercicio99a;
import java.util.*;
public class LectorEntradas {//Esta clase solo comprueba si el valor introducirdo es válido y reemplaza la entrada con un valor válido en caso de fallo
	public static int leerEntero(int valor_fallo) {
		Scanner teclado=new Scanner(System.in);
		int entero;
		try {
			entero=teclado.nextInt();
		}catch(InputMismatchException e) {
			entero=valor_fallo;
			teclado.nextLine();
		};
		return entero;
	}
	public static int leerEntero(int valor_fallo, int min, int max) {
		Scanner teclado=new Scanner(System.in);
		int entero;
		try {
			entero=teclado.nextInt();
			if(entero<min||entero>max) {
				entero=valor_fallo;
			}
		}catch(InputMismatchException e) {
			entero=valor_fallo;
			teclado.nextLine();
		};
		return entero;
	}
	public static double leerDouble(double valor_fallo) {
		Scanner teclado=new Scanner(System.in);
		double entero;
		try {
			entero=teclado.nextDouble();
		}catch(InputMismatchException e) {
			entero=valor_fallo;
			teclado.nextLine();
		};
		return entero;
	}
	public static double leerDouble(double valor_fallo, double min, double max) {
		Scanner teclado=new Scanner(System.in);
		double entero;
		try {
			entero=teclado.nextDouble();
			if(entero<min||entero>max) {
				entero=valor_fallo;
			}
		}catch(InputMismatchException e) {
			entero=valor_fallo;
			teclado.nextLine();
		};
		return entero;
	}
	public static boolean leerBoolean(boolean valor_fallo) {
		boolean correcto=false;
		Scanner teclado=new Scanner(System.in);
		try {
			correcto=teclado.nextBoolean();
		}catch(InputMismatchException e) {
			correcto=valor_fallo;
		}
		return correcto;
	}
}