import java.util.Scanner;
public class aceptoelreto411 {
	public static void main(String arg[]) {
		Scanner teclado=new Scanner(System.in);
		int k, s, i, e;
		do {
			i=0;
			s=0;
			k=teclado.nextInt();
			if(k==0) {
				break;
			}
			do {
				e=teclado.nextInt();
				s=s+e;
				if(s<=k&&e!=0) {
					i=i+1;
				}
			}while(e!=0);
			System.out.print(i+"\n");
		}while(k!=0);
	}
}
