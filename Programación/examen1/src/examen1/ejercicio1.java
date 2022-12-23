package examen1;
import java.util.*;
public class ejercicio1 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int filas, columnas, divisor=0,P=0, a=0, c=0, o=0;
		String nombre="Paco";
		//Conseguir dimensiones de la bandera
		do {
			System.out.println("Introduzca dimensiones de la bandera de Paco (min. 4x4):");
			filas=sca.nextInt();
			columnas=sca.nextInt();
			if(filas<4) {
				System.out.println("La dimensión Y es inferior a 4");
			}
			if(columnas<4) {
				System.out.println("La dimensión X es inferior a 4");
			}
		}while(filas<4||columnas<4);
		//Tener en cuenta el marco
		filas=filas+2;
		columnas=columnas+2;
		//Crear la matriz de bandera
		char[][] bandera=new char[filas][columnas];
		//Introducir el nombre en el interior de la bandera
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				//Comprobar que no este en ningun borde
				if(i!=0&&j!=0&&i!=filas-1&&j!=columnas-1) {
					//No estoy en los bordes de la bandera
					divisor=divisor+1;
					//Comprobar que la siguiente letra no sea la P
					if(divisor-1==0) {
						//Es la P mayuscula
						P=P+1;
					}
					if(divisor-1==1) {
						//Es la a
						a=a+1;
					}
					if(divisor-1==2) {
						//Es la c
						c=c+1;
					}
					if(divisor-1==3) {
						//Es la o
						o=o+1;
					}
					bandera[i][j]=nombre.charAt(divisor-1);
					if(divisor==4) {
						//Hemos llegado al final del nombre eseteamos la posicion
						divisor=0;
					}
				}
			}
		}
		//Mostrar la bandera en pantalla
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				if(i==0||j==0||i==filas-1||j==columnas-1) {
					//Es un borde, mostrar arrobas
					System.out.print("@");
				}else {
					//No es un borde, mostrar nombre
					System.out.printf("%s",bandera[i][j]);
				}
			}
			System.out.print("\n");
		}
		System.out.printf("Imprimir esta bandera costaría: %d € ya que hay que imprimir:\n"
				+ "-%d letras P por valor de: %d €\n"
				+ "-%d letras a por valor de: %d €\n"
				+ "-%d letras c por valor de: %d €\n"
				+ "-%d letras o por valor de: %d €\n",(P*10+a*5+c*5+o*5), P, (P*10), a, (a*5), c, (c*5), o, (o*5));
		sca.close();
	}
}
