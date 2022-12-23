import java.util.*;
public class Matrizdepizarra {
	public static void main(String arg[]) {
		Scanner src=new Scanner(System.in);
		double[] a=new double[10];
		int i=0;
		System.out.println("Introduzca un valor:");
		a[i]=src.nextDouble();
		for(i=1;i<a.length;i++) {
			System.out.println("Introduzca un nuevo valor:");
			a[i]=src.nextDouble();
			if(a[i-1]>a[i]) {
				System.out.println("Valor incorrecto");
				i=i-1;
			}
		}
		System.out.print("El array es: ");
		for(i=0;i<a.length;i++) {
			System.out.printf("%.2f ", a[i]);
		}
		src.close();
	}
}
