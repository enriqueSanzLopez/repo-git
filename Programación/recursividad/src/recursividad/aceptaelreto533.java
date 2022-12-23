package recursividad;
import java.util.Scanner;
public class aceptaelreto533 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int casos=sca.nextInt(), it=0;
		while(it<casos){
			it=it+1;
			int suma=0, botella=-1, b=1;
			int C=sca.nextInt();
			while(botella!=0) {
				botella=sca.nextInt();
				if(botella==0) {
					break;
				}
				suma=suma+botella;
				if(suma/8<C) {
					b=b+1;
				}
			}
			if(suma/8<C) {
				System.out.println("SIGAMOS RECICLANDO");
			}else {
				System.out.println(b);
			}
		}
		sca.close();
	}
}