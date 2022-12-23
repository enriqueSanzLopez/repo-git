package recuperacion;
import java.util.*;
public class recup03 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		Random r=new Random();
		int[][] a=new int[3][3];
		int divisor, numero;
		char otra='n';
		boolean fin, primo;
		//Comprobar si un numero es primo
		do {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					do {
						primo=true;
						numero=(int)(r.nextDouble()*100+1);
						//Comprobar si el numero es primo
						for(divisor=2;divisor<numero;divisor++) {
							if(numero%divisor==0) {
								//No es primo
								primo=false;
							}
						}
					}while(primo==false);
					//Guardar el numero primo
					a[i][j]=numero;
				}
			}
			//Mostrar la matriz de primos
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			//Preguntar si quiere otra
			System.out.println("¿otra? (S/N)");
			//next().charAt() es para leer solo el primer dígito de entrada
			otra=sca.next().charAt(0);
			switch(otra) {
			case 's':
				fin=false;
				break;
			case 'S':
				fin=false;
				break;
			case 'n':
				fin=true;
				break;
			case 'N':
				fin=true;
				break;
			default:
				fin=false;
				break;
			}
		}while(fin==false);
		sca.close();
	}
}