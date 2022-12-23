import java.util.Scanner;
public class aceptoelreto368 {
	public static void main(String arg[]) {
		Scanner teclado=new Scanner(System.in);
		int c=1, h=1, i;
		while(c!=0&&h!=0) {
			h=teclado.nextInt();
			c=teclado.nextInt();
			if(c>=h&&c!=0&&h!=0) {
				System.out.print("10\n");
			}else if(c!=0&&h!=0){
				i=10*((h/c)+(h%c));
				System.out.print(i+"\n");
			}
		}
	}
}
