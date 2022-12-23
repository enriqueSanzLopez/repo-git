package ensayo;
import java.util.Scanner;
public class aceptaelreto427 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int casos;
		casos=sca.nextInt();
		sca.nextLine();
		for(int i=0;i<casos;i++) {
			String p1=sca.nextLine();
			String p2=sca.nextLine();
			if(p1.equals("Luke")&&p2.equals("padre")) {
				System.out.println("TOP SECRET");
			}else {
				System.out.println(p1+", yo soy tu "+p2);
			}
		}
	}
}