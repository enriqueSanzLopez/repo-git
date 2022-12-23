import java.util.Scanner;
public class aceptoelreto363 {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int E=1, N, i, s;
		while(E!=0) {
			i=0;
			s=0;
			E=sc.nextInt();
			if(E==0) {
				break;
			}
			N=sc.nextInt();
			while(i<N) {
				s+=sc.nextInt();
				i=i+1;
			}
			if(s%E==0) {
				s=s/E;
			}else {
				s=(s/E)+1;
			}
			System.out.print(s+"\n");
		}
	}
}
