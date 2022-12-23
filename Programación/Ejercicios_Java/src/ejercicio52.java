import java.util.*;
public class ejercicio52 {
	public static void main(String arg[]) {
		int suma=0, media=0;
		int[] a=new int[100];
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
			suma=suma+a[i];
		}
		media=suma/100;
		System.out.printf("La suma de todos los valores es %d\n"
				+ "La media es %d\n",suma, media);
	}
}
