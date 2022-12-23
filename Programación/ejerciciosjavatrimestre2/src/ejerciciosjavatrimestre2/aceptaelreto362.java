package ejerciciosjavatrimestre2;
import java.util.Scanner;
public class aceptaelreto362 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int N, dia, mes;
		N=sca.nextInt();
		for(int i=0;i<N;i++) {
			dia=sca.nextInt();
			mes=sca.nextInt();
			if(dia==25&&mes==12) {
				System.out.print("SI\n");
			}else {
				System.out.print("NO\n");
			}
		}
	}
}