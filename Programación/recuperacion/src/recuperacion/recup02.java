package recuperacion;
import java.util.*;
public class recup02 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int filas, columnas;
		boolean correcto;
		//Leer las filas
		do {
			correcto=true;
			System.out.println("Introduzca las filas:");
			filas=sca.nextInt();
			System.out.println("Introduzca las columnas:");
			columnas=sca.nextInt();
			if(filas%2!=0||columnas%2!=0) {
				//La matriz no es de lado par
				correcto=false;
				System.out.println("ERROR, la matriz ha de ser de lado par");
			}
			if(filas!=columnas) {
				//La matriz no es cuadrada
				correcto=false;
				System.out.println("ERROR, la matriz ha de ser cuadrada");
			}
		}while(correcto!=true);
		//Imprimir la matriz
		System.out.println("Esta es tu matriz "+filas+"x"+columnas);
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				if(i<filas/2&&j<columnas/2) {
					System.out.print("1 ");
				}
				if(i<filas/2&&j>=columnas/2) {
					System.out.print("2 ");
				}
				if(i>=filas/2&&j<columnas/2) {
					System.out.print("3 ");
				}
				if(i>=filas/2&&j>=columnas/2) {
					System.out.print("4 ");
				}
			}
			System.out.println("");
		}
		sca.close();
	}
}
