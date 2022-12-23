package ensayo;
import java.util.Scanner;
public class aceptaelreto124 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int n1=1, n2=1;
		while(n1!=0||n2!=0) {
			int contador=0, r11, r12, r13, r21, r22, r23;;
			n1=sca.nextInt();
			n2=sca.nextInt();
			if(n1==0&&n2==0) {
				break;
			}
			r11=n1%10;
			r12=(n1%100-r11)/10;
			r13=(n1%1000-r12-r11)/100;
			r21=n2%10;
			r22=(n2%100-r21)/10;
			r23=(n2%1000-r22-r21)/100;
			if(r11+r21>=10) {
				contador=contador+1;
				r12=r12+1;
			}
			if(r12+r22>=10) {
				contador=contador+1;
				r13=r13+1;
			}
			if(r13+r23>=10) {
				contador=contador+1;
			}
			System.out.println(contador);
		}
	}
}