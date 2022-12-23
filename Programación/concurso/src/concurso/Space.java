package concurso;
import java.util.Scanner;
public class Space {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int casos, mejores;
		casos=sca.nextInt();
		for(int i=0;i<casos;i++) {
			mejores=sca.nextInt();
			sca.nextLine();
			for(int j=0;j<mejores;j++) {
				String a=sca.nextLine();
			}
			System.out.println("SPACE.INVADERS!");
		}
	}
}