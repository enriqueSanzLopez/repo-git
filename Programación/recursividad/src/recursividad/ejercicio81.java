package recursividad;
import java.util.Scanner;
public class ejercicio81 {
	public static int mayor(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	public static int mayor(int a, int b, int c) {
		int mayor=a;
		if(mayor<b) {
			mayor=b;
		}
		if(mayor<c) {
			mayor=c;
		}
		return mayor;
	}
	public static int mayor(int a, int b, int c, int d) {
		int mayor=a;
		if(mayor<b) {
			mayor=b;
		}
		if(mayor<c) {
			mayor=c;
		}
		if(mayor<d) {
			mayor=d;
		}
		return mayor;
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int a, b, c, d, mayor;
		System.out.println("Escribe 4 números:");
		a=sca.nextInt();
		b=sca.nextInt();
		c=sca.nextInt();
		d=sca.nextInt();
		mayor=mayor(a,b);
		System.out.println("El mayor entre los 2 primeros es: "+mayor);
		mayor=mayor(a,b,c);
		System.out.println("El mayor entre los 3 primeros es: "+mayor);
		mayor=mayor(a,b,c,d);
		System.out.println("El mayor entre los 4 primeros es: "+mayor);
		sca.close();
	}
}