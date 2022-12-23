import java.util.Scanner;
public class aceptoelreto217 {
	public static void main(String arg[]) {
		Scanner teclado=new Scanner(System.in);
		int x;
		do {
			x=teclado.nextInt();
			if((x%2)==0&&x!=0) {
				System.out.println("DERECHA");
			}else if((x%2)!=0){
				System.out.println("IZQUIERDA");
			}
		}while(x!=0);
		teclado.close();
	}
}
