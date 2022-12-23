import java.util.*;
public class ejercicio70 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		String direccion;
		//fila_s y columna_s son la posicion de salida mientras que fila y columna son la posicion actual
		int fila=0, columna=0, fila_s=3, columna_s=3;
		//Diseno del laberinto false igual a camino o bifurcacion y true igual a muro
		boolean[][] laberinto= {{false, false, true, false},{true, false, false, false},{false, false, true, true},{true, false, false, false}};
		//Introduccion
		System.out.println("Bienvenido al laberinto de Enrique!.\n"
				+ "Pulse w para arriba, s para abajo, a para la izquierda, y d para derecha");
		//Introduccion de movimiento por el laberinto
		do {
			System.out.printf("Estás en la casilla %d,%d. ¿Cuál es tu próximo movimiento?\n", fila, columna);
			direccion=sca.nextLine();
			switch(direccion) {
			case "w":
				if(fila-1<0) {
					//Te sales del mapa
					System.out.println("ERROR!. Nos salimos del tablero!");
				}else if(laberinto[fila-1][columna]==true) {
					//Hay un muro
					System.out.println("ERROR!. En esa dirección hay una pared!");
				}else {
					//Se puede mover
					fila=fila-1;
					System.out.println("Te has movido hacia arriba");
				}
				break;
			case "a":
				if(columna-1<0) {
					//Te sales del mapa
					System.out.println("ERROR!. Nos salimos del tablero!");
				}else if(laberinto[fila][columna-1]==true) {
					//Hay un muro
					System.out.println("ERROR!. En esa dirección hay una pared!");
				}else {
					//Se puede mover
					columna=columna-1;
					System.out.println("Te has movido hacia la izquierda");
				}
				break;
			case "s":
				if(fila+1>3) {
					//Te sales del mapa
					System.out.println("ERROR!. Nos salimos del tablero!");
				}else if(laberinto[fila+1][columna]==true) {
					//Hay un muro
					System.out.println("ERROR!. En esa dirección hay una pared!");
				}else {
					//Se puede mover
					fila=fila+1;
					System.out.println("Te has movido hacia abajo");
				}
				break;
			case "d":
				if(columna+1>3) {
					//Te sales del mapa
					System.out.println("ERROR!. Nos salimos del tablero!");
				}else if(laberinto[fila][columna+1]==true) {
					//Hay un muro
					System.out.println("ERROR!. En esa dirección hay una pared!");
				}else {
					//Se puede mover
					columna=columna+1;
					System.out.println("Te has movido hacia la derecha");
				}
				break;
			default:
				System.out.println("ERROR!. Dirección inexistente");
				break;
			}
			if(fila==fila_s&&columna==columna_s) {
				//Has ganado
				System.out.println("Enhorabuena!, has llegado a la casilla 3,3 y por tanto has llegado al fina del laberinto!");
			}
		}while(fila!=fila_s||columna!=columna_s);
		sca.close();
	}
}