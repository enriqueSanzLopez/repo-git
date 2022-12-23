package recursividad;
import java.util.Scanner;
public class aceptaelreto171 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int n=-1;
		while(n!=0) {
			n=sca.nextInt();
			if(n==0) {
				break;
			}
			int[] a=new int[n];
			int max=0, b=0;
			for(int i=0;i<n;i++) {
				a[i]=sca.nextInt();
			}
			for(int i=n-1;i>=0;i--) {
				if(max<a[i]) {
					max=a[i];
					b=b+1;
				}
			}
			System.out.println(b);
		}
		sca.close();
	}
}