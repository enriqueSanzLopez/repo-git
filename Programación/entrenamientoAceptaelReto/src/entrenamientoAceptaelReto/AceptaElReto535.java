package entrenamientoAceptaelReto;
import java.util.Scanner;
public class AceptaElReto535 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int D=-1;
		while(D!=0) {
			int total=0;
			D=sca.nextInt();
			if(D==0) {
				break;
			}
			int[] alturas=new int[D];
			for(int i=0;i<alturas.length;i++) {
				alturas[i]=sca.nextInt();
			}
			for(int i=0;i<alturas.length-1;i++) {
				total=total+(alturas[alturas.length-1]-alturas[i]);
			}
			System.out.println(total);
		}
	}
}