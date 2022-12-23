import java.util.Scanner;
public class ejercicio17 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int x;
		int y;
		System.out.println("Introduce x:");
		x=teclado.nextInt();
		System.out.println("Introduce y:");
		y=teclado.nextInt();
		System.out.println();
		System.out.println("Los valores son: "+x+ " y "+y);
		System.out.printf("\t\tSUMA\tRESTA\tPRODUCTO\t\tCOCIENTE");
		System.out.println("\n----------------------------------------------------------------------------------");
		System.out.printf("x=%dy=%d\t\t%d\t%d\t%d\t\t\t%d",x,y,(x+y),(x-y),(x*y),(x/y));
		System.out.println("\n----------------------------------------------------------------------------------");
		teclado.close();
	}
}
