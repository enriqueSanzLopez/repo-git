import java.util.*;
public class ejercicio38 {
	public static void main(String arg[]) {
		Scanner teclado=new Scanner(System.in);
		int a=0, b=0;
		System.out.print("Introduce a: ");
		a=teclado.nextInt();
		System.out.print("\nIntrocduce b: ");
		b=teclado.nextInt();
		if(a<0&&b<0 || a>=0&&b>=0) {
			System.out.println("\nEl producto de los 2 números es positivo");
		}else {
			System.out.println("\nEl producto de los 2 números es negativo");
		}
		teclado.close();
	}
}