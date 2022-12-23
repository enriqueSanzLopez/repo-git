package aceptaelreto_ejemplos;
import java.util.Scanner;
public class acep149 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		while(sca.hasNext()) {
			int casos=sca.nextInt();
			int max=0, velocidad;
			for(int i=0;i<casos;i++) {
				velocidad=sca.nextInt();
				if(velocidad>max) {
					max=velocidad;
				}
			}
			System.out.println(max);
		}
	}
}