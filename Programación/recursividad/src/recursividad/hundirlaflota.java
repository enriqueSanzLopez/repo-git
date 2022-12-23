package recursividad;
import java.util.Scanner;
public class hundirlaflota {
	public static boolean fin(String[][] tablero, String[][] mascara) {
		boolean fin=true;
		//Comprobar que se han mostrado todos los barcos al completo
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(!tablero[i][j].equals(mascara[i][j])) {
					fin=false;
					break;
				}
			}
		}
		return fin;
	}
	public static boolean agua(int fila, int columna, String[][] tablero, String[][] mascara) {
		boolean agua=false;
		if(!tablero[fila][columna].equals("_")) {
			//No es agua
			mascara[fila][columna]=tablero[fila][columna];
			System.out.println("IMPACTO!, parece que le hemos dado a algo!");
		}else {
			//Es agua
			agua=true;
		}
		return agua;
	}
	public static void mostrar(String[][] tablero) {
		//Mostrar un tablero por pantalla
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(tablero[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void lancha(String[][] tablero, int[] barcos) {
		//Como mucho pueden haber 3 transatlanticos y tienen que estar en horizontal
		Scanner sca=new Scanner(System.in);
		//Inicializar variables
		barcos[2]=0;
		String entrada="0 0";
		int i=1;
		do {
			//Llenar de transatlanticos
			System.out.println("Introduzca la posición de su carguero número "+i+" de 5 o 'stop' para dejar de introducir datos:");
			entrada=sca.nextLine();
			if(entrada.equals("stop")) {
				break;
			}else {
				//Divido la entrada por los espacios
				String[] a=entrada.split(" ");
				//Convertir la matriz de String en numeros enteros
				int fila=Character.getNumericValue(a[0].charAt(0));
				int columna=Character.getNumericValue(a[1].charAt(0));
				if((fila>=6&&columna>=6)||!tablero[fila][columna].equals("_")) {
					//Se sale del tablero
					System.out.println("ERROR! el barco tiene que estar dentro del tablero y no puede estar encima de otro barco");
				}else {
					//No se sale del tablero
					tablero[fila][columna]="L";
					//Se ha introducido un transatlantico, aumentar el indice
					i=i+1;
					barcos[2]=barcos[2]+1;
				}
			}
		}while(!entrada.equals("stop")&&i<=5);
	}
	public static void carguero(String[][] tablero, int[]barcos) {
		//Como mucho pueden haber 3 transatlanticos y tienen que estar en horizontal
		Scanner sca=new Scanner(System.in);
		//Inicializar variables
		barcos[1]=0;
		String entrada="0 0";
		int i=1;
		do {
			//Llenar de transatlanticos
			System.out.println("Introduzca la posición de su carguero número "+i+" de 3 o 'stop' para dejar de introducir datos:");
			entrada=sca.nextLine();
			if(entrada.equals("stop")) {
				break;
			}else {
				//Divido la entrada por los espacios
				String[] a=entrada.split(" ");
				//Convertir la matriz de String en numeros enteros
				int fila=Character.getNumericValue(a[0].charAt(0));
				int columna=Character.getNumericValue(a[1].charAt(0));
				if(fila+2>=6||!tablero[fila][columna].equals("_")||!tablero[fila+1][columna].equals("_")||!tablero[fila+2][columna].equals("_")) {
					//Se sale del tablero
					System.out.println("ERROR! el barco tiene que estar dentro del tablero y no puede estar encima de otro barco");
				}else {
					//No se sale del tablero
					tablero[fila][columna]="C";
					tablero[fila+1][columna]="C";
					tablero[fila+2][columna]="C";
					//Se ha introducido un transatlantico, aumentar el indice
					i=i+1;
					barcos[1]=barcos[1]+1;
				}
			}
		}while(!entrada.equals("stop")&&i<=3);
	}
	public static void transatlantico(String[][] tablero, int[] barcos) {
		//Como mucho pueden haber 3 transatlanticos y tienen que estar en horizontal
		Scanner sca=new Scanner(System.in);
		//Inicializar variables
		barcos[0]=0;
		String entrada="0 0";
		int i=1;
		do {
			//Llenar de transatlanticos
			System.out.println("Introduzca la posición de su transatlántico número "+i+" de 3 o 'stop' para dejar de introducir datos:");
			entrada=sca.nextLine();
			if(entrada.equals("stop")) {
				break;
			}else {
				//Divido la entrada por los espacios
				String[] a=entrada.split(" ");
				//Convertir la matriz de String en numeros enteros
				int fila=Character.getNumericValue(a[0].charAt(0));
				int columna=Character.getNumericValue(a[1].charAt(0));
				if(columna+3>=6||!tablero[fila][columna].equals("_")||!tablero[fila][columna+1].equals("_")||!tablero[fila][columna+2].equals("_")||!tablero[fila][columna+3].equals("_")) {
					//Se sale del tablero
					System.out.println("ERROR! el barco tiene que estar dentro del tablero y no puede estar encima de otro barco");
				}else {
					//No se sale del tablero
					tablero[fila][columna]="T";
					tablero[fila][columna+1]="T";
					tablero[fila][columna+2]="T";
					tablero[fila][columna+3]="T";
					//Se ha introducido un transatlantico, aumentar el indice
					i=i+1;
					barcos[0]=barcos[0]+1;
				}
			}
		}while(!entrada.equals("stop")&&i<=3);
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		//Definir dimensiones del tablero
		String[][] tablero=new String[6][6];
		String[][] mascara=new String[6][6];
		int[] barcos=new int[3];
		String nombre;
		int disparo=0, agua=0, fila, columna;
		boolean fin=false, water=false;
		//Llenar la mascara de _
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				mascara[i][j]="_";
				tablero[i][j]="_";
			}
		}
		System.out.println("Bienvenido al juego hudir la flota 6x6, introduzca su nombre:");
		nombre=sca.nextLine();
		System.out.println("Hola, Capitán "+nombre+". Déjeme que le ayude a configurar su flota.");
		transatlantico(tablero, barcos);
		System.out.println("Capitán "+nombre+" aquí están sus transatlánticos...");
		mostrar(tablero);
		System.out.println("Ahora vamos a ubicar los cargueros...");
		carguero(tablero, barcos);
		System.out.println("Capitán "+nombre+" aquí están sus transatlánticos y sus cargueros...");
		mostrar(tablero);
		System.out.println("Ahora vamos a ubicar las lanchas...");
		lancha(tablero, barcos);
		System.out.println("Capitán "+nombre+" aquí están sus transatlánticos, sus cargueros y sus lanchas...");
		mostrar(tablero);
		System.out.println("Ahora es el momento de jugar, grumete!, has de hacer frente a "+barcos[0]+" transatlánticos, "+barcos[1]+" cargueros y "+barcos[2]+" lanchas.\n"
				+ "Acuérdate de qe puedes hacer agua solo en 5 ocasiones!");
		do {
			mostrar(mascara);
			disparo=disparo+1;
			System.out.println("¿Cuál será tu disparo número "+disparo+"?");
			fila=sca.nextInt();
			columna=sca.nextInt();
			water=agua(fila, columna, tablero, mascara);
			if(water==true) {
				//Es agua
				agua=agua+1;
				System.out.println("AGUA!, y llevas: "+agua);
			}
			//Comprobar si se han hundido todos los barcos
			fin=fin(tablero, mascara);
			if(fin==true) {
				break;
			}
		}while(fin!=true&&agua<5);
		//Comprobar si se ha ganado o perdido
		if(fin==true) {
			System.out.println("¡Enhorabuena grumete! Has ganado la partida en solo "+disparo+" tiradas.\n"
					+ "GAME OVER");
		}else {
			System.out.println("Has perdido\n"
					+ "GAME OVER");
		}
		sca.close();
	}
}