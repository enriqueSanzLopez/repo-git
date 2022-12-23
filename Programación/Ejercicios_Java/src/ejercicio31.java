import java.util.*;
public class ejercicio31 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int n=0;
		System.out.print("Introduzca el valor de N: ");
		n=teclado.nextInt();
		System.out.printf("\nPrimera cifra de %d --> %d",n,((n-(n%100))/100));
		System.out.printf("\nCifra central de %d --> %d",n,+(((n%100)-(n%10))/10));
		System.out.printf("\nÚltima cifra de  %d --> %d",n,+(n%10));
	}
}
