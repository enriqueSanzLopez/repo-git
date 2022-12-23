import java.util.*;
public class ejercicio18 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int x=0;
		System.out.print("Introduce un valor en Mb: ");
		x=teclado.nextInt();
		System.out.printf("\nMB\tBytes\t\tKb\t\tGB\t\tTB");
		System.out.printf("\n%d\t%d\t%d\t\t%.2f\t\t%.2f",x, (x*1024*1024),(x*1024),((float)x/1024), ((float)x/(1024*1024)));
		teclado.close();
	}
}
