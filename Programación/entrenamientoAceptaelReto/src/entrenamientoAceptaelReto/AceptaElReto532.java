package entrenamientoAceptaelReto;
import java.util.Scanner;
public class AceptaElReto532 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int casos=sca.nextInt();
		for(int i=0;i<casos;i++) {
			int N=sca.nextInt();
			int T=sca.nextInt();
			System.out.println(T-N);
		}
	}
}