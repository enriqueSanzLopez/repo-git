import java.util.Scanner;
public class aceptoelreto380 {
	public static void main(String arg []) {
		Scanner sc=new Scanner(System.in);
		int n=1, i=0, s=0;
		while(n!=0) {
			s=0;
			i=0;
			n=sc.nextInt();
			if(n==0) {
				break;
			}
			while(i<n) {
				s+=sc.nextInt();
				i=i+1;
			}
			System.out.print(s+"\n");
		}
	}
}
