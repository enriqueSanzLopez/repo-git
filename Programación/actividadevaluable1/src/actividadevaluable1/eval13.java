package actividadevaluable1;
import java.util.Scanner;
public class eval13 {
	public static void main(String arg[]) {
		Scanner teclado=new Scanner(System.in);
		int n=-1, i, j, resultado;
		do {
			System.out.print("Introduzca n: ");
			n=teclado.nextInt();
			if(n<0) {
				System.out.print("\nNúmero incorrecto\n");
			}
		}while(n<0);
		System.out.println("");
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(j<i) {
				}else {
					resultado=i+j+2*i*j;
					System.out.printf("Par %d,%d: %d+%d+2*%d*%d vale %d\n",i,j,i,j,i,j,resultado);
				}
			}
		}
		teclado.close();
	}
}
