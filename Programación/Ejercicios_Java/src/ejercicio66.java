import java.util.*;
public class ejercicio66 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		//Tablero de juego de 3x3
		int fila, columna;
		boolean fin=false, llena;
		int[][] a= {{0, 0, 0},{0, 0, 0},{0, 0, 0}};
		Random r=new Random();
		System.out.println("Bienvenidos al juego del 3 en raya");
		//Mostrar el tablero vacio
		System.out.println("-\t-\t-\n"
				+ "-\t-\t-\n"
				+ "-\t-\t-");
		while(fin!=true) {
			llena=true;
			//Comprobar si se puede llenar el tablero
			if(a[0][0]!=0&&a[0][1]!=0&&a[0][2]!=0&&a[1][0]!=0&&a[1][1]!=0&&a[1][2]!=0&&a[2][0]!=0&&a[2][1]!=0&&a[2][2]!=0) {
				//El tablero está lleno
				System.out.println("No quedan movimientos restantes. Empate!");
				fin=true;
				break;
			}
			//Indicar posicion
			System.out.println("Introduce la fila y columna de tu tirada:");
			fila=sca.nextInt();
			columna=sca.nextInt();
			//Comprobar si la posicion es valida
			if(fila<0||fila>=3) {
				System.out.println("La fila está fuera del tablero!. Valores posibles: 0, 1, 2");
				llena=false;
			}
			if(columna<0||columna>=3) {
				System.out.println("La columna está fuera del tablero!. Valores posibles: 0, 1, 2");
				llena=false;
			}
			//Comprobar que la casilla seleccionada este en rango
			if(llena==false) {
				continue;
			}else {
				//Comprobar que la posicion del jugador no este llena
				if(a[fila][columna]==0) {
					//La casilla esta vacia por lo que la llenamos
					a[fila][columna]=1;
				}else {
					//La casilla esta llena
					System.out.println("La casilla indicada ya está llena, por favor seleccione otra casilla.");
					continue;
				}
				//Mostrar por pantalla el tablero
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						if(a[i][j]==0) {
							//Casilla vacia
							System.out.print("-\t");
						}
						if(a[i][j]==1) {
							//Casilla del jugador
							System.out.print("X\t");
						}
						if(a[i][j]==2) {
							//Casilla de la maquina
							System.out.print("O\t");
						}
					}
					System.out.print("\n");
				}

				//Comprobar si alguien ganna
				//Si gana el jugador o la maquina
				//Comprobar si se da el 3 en raya en las filas y columnas
				for(int i=0;i<3;i++) {
					if(a[0][i]==1&&a[1][i]==1&&a[2][i]==1) {
						System.out.println("Gana el jugador!");
						fin=true;
					}
					if(a[i][0]==1&&a[i][1]==1&&a[i][2]==1) {
						System.out.println("Gana el jugador!");
						fin=true;
					}
					if(a[0][i]==2&&a[1][i]==2&&a[2][i]==2) {
						System.out.println("Gana la máquina!");
						fin=true;
					}
					if(a[i][0]==2&&a[i][1]==2&&a[i][2]==2) {
						System.out.println("Gana la máquina!");
						fin=true;
					}
				}
				//Comprobar las diagonales
				if(a[0][0]==1&&a[1][1]==1&&a[2][2]==1||a[0][2]==1&&a[1][1]==1&&a[2][0]==1) {
					System.out.println("Gana el jugador!");
					fin=true;
				}
				if(a[0][0]==2&&a[1][1]==2&&a[2][2]==2||a[0][2]==2&&a[1][1]==2&&a[2][0]==2) {
					System.out.println("Gana la máquina!");
					fin=true;
				}
				if(fin==true) {
					//Fin de la partida
					break;
				}
				//Tirada de la maquina
				System.out.println("Ahora tira la máquina...");
				//Selecciona posicion y comprueba que este vacia
				do {
					//Selecciona la posicion de forma aleatoria
					fila=(int)(r.nextDouble()*3+0);
					columna=(int)(r.nextDouble()*3+0);
				}while(a[fila][columna]!=0);
				//Llenamos la casilla
				a[fila][columna]=2;
				//Volvemos a mostrar el tablero
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						if(a[i][j]==0) {
							//Casilla vacia
							System.out.print("-\t");
						}
						if(a[i][j]==1) {
							//Casilla del jugador
							System.out.print("X\t");
						}
						if(a[i][j]==2) {
							//Casilla de la maquina
							System.out.print("O\t");
						}
					}
					System.out.print("\n");
				}
				//Comprobar si alguien ganna
				//Si gana el jugador o la maquina
				//Comprobar si se da el 3 en raya en las filas y columnas
				for(int i=0;i<3;i++) {
					if(a[0][i]==1&&a[1][i]==1&&a[2][i]==1) {
						System.out.println("Gana el jugador!");
						fin=true;
					}
					if(a[i][0]==1&&a[i][1]==1&&a[i][2]==1) {
						System.out.println("Gana el jugador!");
						fin=true;
					}
					if(a[0][i]==2&&a[1][i]==2&&a[2][i]==2) {
						System.out.println("Gana la máquina!");
						fin=true;
					}
					if(a[i][0]==2&&a[i][1]==2&&a[i][2]==2) {
						System.out.println("Gana la máquina!");
						fin=true;
					}
				}
				//Comprobar las diagonales
				if(a[0][0]==1&&a[1][1]==1&&a[2][2]==1||a[0][2]==1&&a[1][1]==1&&a[2][0]==1) {
					System.out.println("Gana el jugador!");
					fin=true;
				}
				if(a[0][0]==2&&a[1][1]==2&&a[2][2]==2||a[0][2]==2&&a[1][1]==2&&a[2][0]==2) {
					System.out.println("Gana la máquina!");
					fin=true;
				}
			}
			if(fin==true) {
				//Fin de la partida
				break;
			}
		}
		sca.close();
	}
}