package ensayo;
import java.util.Scanner;
public class aceptaelreto140 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int Num=1;
		while(Num>=0) {
			int suma=0;
			int[] a=new int[10];
			Num=sca.nextInt();
			if(Num<0) {
				break;
			}
			a[0]=Num%10;
			a[1]=Num/10%10;
			a[2]=Num/100%10;
			a[3]=Num/1000%10;
			a[4]=Num/10000%10;
			a[5]=Num/100000%10;
			a[6]=Num/1000000%10;
			a[7]=Num/10000000%10;
			a[8]=Num/100000000%10;
			a[9]=Num/1000000000%10;
			for(int i=0;i<a.length;i++) {
				suma=a[i]+suma;
				int j=i+1;
				if(j>9) {
					j=9;
				}
				if(a[i]!=0&&a[j]!=0) {
					System.out.print(a[i]);
					if(i!=9) {
						System.out.print(" + ");
					}
				}else if(a[i]!=0&&a[j]==0){
					System.out.print(a[i]);
				}
			}
			System.out.println(" = "+suma);
		}
	}
}