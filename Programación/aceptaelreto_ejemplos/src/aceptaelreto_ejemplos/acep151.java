package aceptaelreto_ejemplos;
import java.util.Scanner;
public class acep151 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		while(sca.hasNext()) {
			int n=sca.nextInt();
			if(n==0) {
				break;
			}
			int[][] a=new int[n][n];
			boolean correcto=true;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					a[i][j]=sca.nextInt();
					if(i==j&&a[i][j]!=1) {
						correcto=false;
					}else if(i!=j&&a[i][j]!=0) {
						correcto=false;
					}
				}
			}
			if(correcto==true) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
		}
	}
}