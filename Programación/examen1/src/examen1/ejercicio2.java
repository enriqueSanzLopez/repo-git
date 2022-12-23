package examen1;
import java.util.*;
public class ejercicio2 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int n_jugadores, ronda=1, eliminados, posicion, inicial;
		Random r=new Random();
		//Obtener el numero de jugadores
		do {
			System.out.println("Introduzca el número de jugadores para el juego:");
			n_jugadores=sca.nextInt();
		}while(n_jugadores<20);
		inicial=n_jugadores;
		//Crear la matriz de jugadores y llenarla
		int[] jugadores=new int[n_jugadores];
		int[] guardados=new int[n_jugadores];
		for(int i=0;i<n_jugadores;i++) {
			jugadores[i]=i+1;
		}
		//PASO1
		do {
			System.out.println("---------------");
			System.out.printf("Ronda numero: %d\n"
					+ "Luz verde\n"
					+ "ya puedes correr..\n"
					+ "y parar!\n", ronda);
			//Determinar el numero de jugadores eliminados por ronda
			eliminados=(int)(r.nextDouble()*(n_jugadores+1)+0);
			System.out.printf("De %d, vamos a eliminar a %d concursantes\n", n_jugadores, eliminados);
			n_jugadores=n_jugadores-eliminados;
			//Eliminar a los jugadores de forma aleatoria
			for(int i=0;i<eliminados;i++) {
				//Determinar la posicion a eliminar si se le cambia el numero a 0 a un jugador es que esta eliminado
				do {
					posicion=(int)(r.nextDouble()*inicial+0);
				}while(jugadores[posicion]==0);
				//Mostrar por pantalla al eliminado
				System.out.printf("Jugador %d: ELIMINADO\n",jugadores[posicion]);
				jugadores[posicion]=0;
			}
			//Mostrar por pantalla a los jugadores restantes si es que hay
			if(n_jugadores!=0) {
				System.out.printf("Quedan vivos %d concursantes: ", n_jugadores);
				for(int i=0;i<inicial;i++) {
					if(jugadores[i]!=0) {
						//El jugador esta vivo
						System.out.printf("%d ", jugadores[i]);
					}
				}
				System.out.print("\n");
			}
			ronda=ronda+1;
		}while(n_jugadores!=0&&ronda<=5);
		//PASO3 Final del juego
		if(n_jugadores!=0) {
			//Hay supervivientes tras todas las rondas
			System.out.println("GAME OVER");
		}else {
			//No hay supervivientes
			System.out.println("El juego ya ha finalizado. No hay mas concursantes que eliminar.\n\nGAME OVER");
		}
		sca.close();
	}
}
