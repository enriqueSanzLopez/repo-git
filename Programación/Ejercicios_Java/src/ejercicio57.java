import java.util.*;
public class ejercicio57 {
	public static void main(String arg[]) {
		int[] a=new int[2];
		int i=0;
		Random r=new Random();
		System.out.println("Vamos a tirar los dados...");
		do {
			i=i+1;
			a[0]=(int)(r.nextDouble()*6+1);
			a[1]=(int)(r.nextDouble()*6+1);
			System.out.println("En la tirada "+i+" ha salido "+a[0]+" y el "+a[1]);
		}while(a[0]!=a[1]);
		System.out.print("Al fin han salido iguales!");
	}
}
