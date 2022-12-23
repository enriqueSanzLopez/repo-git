import java.util.Scanner;
public class aceptoelreto116 {
	public static void main(String arg[]) {
		Scanner teclado=new Scanner(System.in);
		int i, n=0;
		do {
			n=teclado.nextInt();
		}while(n<0||n>=6);
		for(i=0;i<n;i++) {
			System.out.println("Hola mundo.");
		}
		teclado.close();
	}
}
