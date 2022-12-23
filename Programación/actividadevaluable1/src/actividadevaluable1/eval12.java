package actividadevaluable1;
import java.util.Scanner;
public class eval12 {
	public static void main(String arg[]) {
		Scanner teclado=new Scanner(System.in);
		//j=columna, i=fila
		int altura=0, i=0, j=0;
		//Leer altura y comprobar que es un dato válido
		do {
			System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
			altura=teclado.nextInt();
			if(altura<5||(altura%2)==0) {
				System.out.print("\nLa altura introducida no es correcta\n");
			}
		}while(altura<5||(altura%2)==0);
		System.out.print("\n");
		for(i=0;i<altura;i++) {
			for(j=0;j<6;j++) {
				if(i==0||i==(altura-1)||i==((altura/2))) {
					//Primera fila, fila de en medio o Última fila
					if(j!=5) {
						//no es última columna
						System.out.print("M");
					}else {
						//es la última columna
						System.out.print("M\n");
					}
				}else {
					//No es ninguna de las filas anteriormente mencinadas
					if(j==0) {
						//Primera columna
						System.out.print("M");
					}else if(j==5) {
						//Última columna
						System.out.print("M\n");
					}else {
						//Cualquier otra columna
						System.out.print(" ");
					}
				}
			}
		}
		teclado.close();
	}
}
