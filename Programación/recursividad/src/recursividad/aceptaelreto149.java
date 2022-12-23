package recursividad;
import java.util.Scanner;
public class aceptaelreto149 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		while(sca.hasNext()) {
			int max=0, vel=0, toros=sca.nextInt();
			for(int i=0;i<toros;i++) {
				vel=sca.nextInt();
				if(max<vel) {
					max=vel;
				}
			}
			System.out.println(max);
		}
	}
}