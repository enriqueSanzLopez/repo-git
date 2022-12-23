import java.util.*;
public class ejercicio53 {
	public static void main(String arg[]) {
		Scanner src=new Scanner(System.in);
		int T=0, max=0, min=0, suma=0;
		Random rnd=new Random();
		do {
			System.out.println("Introduzca el tamaño del array:");
			T=src.nextInt();
			if(T<=0) {
				System.out.println("Valor incorrecto");
			}
		}while(T<=0);
		int[] a=new int[T];
		System.out.println("Introduzca los límites superior e inferior para generar números aleatorios:");
		max=src.nextInt();
		min=src.nextInt();
		System.out.println("Se ha generado el siguiente array de "+T+" posiciones:");
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(rnd.nextDouble()*(max-min)+min);
			suma=suma+a[i];
			System.out.printf("[%d] ",a[i]);
		}
		System.out.print("\nLa suma de los elementos es: "+suma);
		src.close();
	}
}