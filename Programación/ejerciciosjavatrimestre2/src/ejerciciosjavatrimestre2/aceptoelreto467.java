package ejerciciosjavatrimestre2;
import java.util.Scanner;
public class aceptoelreto467 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int n=sca.nextInt();
		sca.nextLine();
		for(int i=0;i<n;i++) {
			String frase=sca.nextLine();
			String[] palabras=frase.split(" es ");
			if(palabras[0].equalsIgnoreCase(palabras[1])) {
				System.out.print("TAUTOLOGIA\n");
			}else {
				System.out.print("NO TAUTOLOGIA\n");
			}
		}
	}
}