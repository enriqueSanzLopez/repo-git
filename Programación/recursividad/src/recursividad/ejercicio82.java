package recursividad;
import java.util.Scanner;
public class ejercicio82 {
	public static int divisores(int n, int divisor) {
		boolean es=false;
		int k=0;
		while(es!=true&&divisor>0) {
			if(n%divisor==0) {
				es=true;
				k=divisor;
				System.out.print(k+",");
			}else {
				divisor=divisor-1;
			}
		}
		if(k==0) {
			//No quedan mas divisores
			return n;
		}else {
			//Pueden haber mas divisores
			return n+divisores(n,k-1);
		}
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int n, a;
		System.out.println("Introduzca un número para calcular sus divisores:");
		n=sca.nextInt();
		System.out.print("Los divisores son: ");
		a=divisores(n, n);
		sca.close();
	}
}