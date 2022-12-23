package recursividad;
import java.util.Scanner;
public class ejercicio76 {
	public static void sumatorio(int n) {
		int suma=0;
		for(int i=1;i<=n;i++) {
			suma=suma+i;
		}
		System.out.println("El sumatorio de "+n+" es: "+suma);
	}
	public static void factorial(int n) {
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac=fac*i;
		}
		System.out.println("El factorial de "+n+" es: "+fac);
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int n, o;
		do {
			System.out.println("Introduzca un número:");
			n=sca.nextInt();
			System.out.println("Introduzca una opción:\n"
					+ "1-Realizar el sumatorio de "+n+"\n"
					+ "2-Realizar el factorial de "+n+"\n"
					+ "3-Salir de este programa");
			o=sca.nextInt();
			if(o==3) {
				break;
			}
			switch(o) {
			case 1:
				//Sumatorio
				sumatorio(n);
				break;
			case 2:
				//Factorial
				factorial(n);
				break;
			case 3:
				//Salir
				break;
			default:
				System.out.println("ERROR");
				break;
			}
		}while(o!=3);
		sca.close();
	}
}