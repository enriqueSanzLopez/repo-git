package ejerciciosjavatrimestre2;
import java.util.Scanner;
public class aceptaelreto369 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int numero=1;
		while(numero!=0) {
			numero=sca.nextInt();
			if(numero==0) {
				break;
			}
			for(int i=0;i<numero;i++) {
				System.out.print("1");
			}
			System.out.println("");
		}
	}
}