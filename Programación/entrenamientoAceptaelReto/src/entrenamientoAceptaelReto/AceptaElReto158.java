package entrenamientoAceptaelReto;
import java.util.Scanner;
public class AceptaElReto158 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int casos=sca.nextInt();
		for(int i=0;i<casos;i++) {
			int arriba=0;
			int abajo=0;
			int muros=sca.nextInt();
			int muro0=sca.nextInt();
			for(int j=0;j<muros-1;j++) {
				int muro=sca.nextInt();
				if(muro0<muro) {
					arriba++;
				}else if(muro0>muro) {
					abajo++;
				}
				muro0=muro;
			}
			System.out.println(arriba+" "+abajo);
		}
	}
}