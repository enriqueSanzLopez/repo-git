package ejerciciosjavatrimestre2;
import java.util.Scanner;
public class aceptoelreto456 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int casos, n, m, r, res;
		casos=sca.nextInt();
		for(int i=0;i<casos;i++) {
			n=sca.nextInt();
			m=sca.nextInt();
			r=sca.nextInt();
			res=r/(n*m);
			if(res<1) {
				System.out.print("1\n");
			}else if((r%(n*m))!=0) {
				System.out.print(res+1+"\n");
			}else {
				System.out.print(res+"\n");
			}
		}
	}
}