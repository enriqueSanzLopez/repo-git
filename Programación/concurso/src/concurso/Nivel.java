package concurso;
import java.util.Scanner;
public class Nivel {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int n=sca.nextInt();
		int[] peso=new int[n];
		for(int i=0;i<n;i++) {
			peso[i]=sca.nextInt();
		}
		int sub=1;
		while(sub!=0) {
			sub=sca.nextInt();
			if(sub==0) {
				System.out.print("---");
				break;
			}
			for(int j=0;j<sub;j++) {
				int a=sca.nextInt();
				int b=sca.nextInt();
				int suma=0;
				if(a-b!=1&&a-b!=-1) {
					if(a<b) {
						for(int i=a-1;i<b-1;i++) {
							if(i!=a-1&&i!=b-1) {
								suma=suma+peso[i];
							}
						}
					}else {
						for(int i=a-1;i>b-1;i--) {
							if(i!=a-1&&i!=b-1) {
								suma=suma-peso[i];
							}
						}
					}
				}
				System.out.println(suma);
			}
		}
	}
}