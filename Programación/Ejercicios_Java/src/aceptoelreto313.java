import java.util.Scanner;
public class aceptoelreto313 {
	public static void main(String arg[]) {
		Scanner teclado=new Scanner(System.in);
		int s=0, c=0, k=0, i;
		k=teclado.nextInt();
		for(i=0;i<k;i++) {
			do {
				s=teclado.nextInt();
			}while(s<-10000||s>10000);
			do {
				c=teclado.nextInt();
			}while(c<-10000||c>10000);
			if((s+c)>=0) {
				System.out.print("SI\n");
			}else {
				System.out.print("NO\n");
			}
		}
	}
}
