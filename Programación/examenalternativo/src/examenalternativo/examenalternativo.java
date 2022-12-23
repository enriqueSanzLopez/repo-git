package examenalternativo;
import java.util.*;
public class examenalternativo {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int n_concursantes, longitud;
		Random r=new Random();
		//Pedir el numero de concursantes
		do {
			System.out.println("Introduzca el numero de jugadores");
			n_concursantes=sca.nextInt();
			if(n_concursantes<=0) {
				System.out.println("ERROR!. Número de concursantes inválido");
			}
		}while(n_concursantes<=0);
		int restantes=n_concursantes;
		//Pedir la longitu del puente
		do {
			System.out.println("Introduzca la longitud");
			longitud=sca.nextInt();
			if(longitud<=0) {
				System.out.println("ERROR!. Longitud inválida");
			}
		}while(longitud<=0);
		//Llenar los jugadores
		int[] concursantes=new int[n_concursantes];
		for(int i=0;i<n_concursantes;i++) {
			concursantes[i]=i+1;
		}
		int[][] Puente=new int[2][longitud];
		int posicion;
		//Lenar el puente de cristales
		for(int i=0;i<longitud;i++) {
			Puente[0][i]=(int)(r.nextDouble()*2+0);
			if(Puente[0][i]==0) {
				//Hay al menos 1 camino en el puente
				Puente[1][i]=1;
			}else {
				//Ya hay un camino trampa
				Puente[1][i]=0;
			}
		}
		//Mostrar el puente
		System.out.println("Este es el puente que se ha construido:");
		for(int x=0;x<2;x++) {
			for(int y=0;y<longitud;y++) {
				if(Puente[x][y]==0) {
					System.out.print("N ");
				}else if(Puente[x][y]==1) {
					System.out.print("T ");
				}else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		//Mostrar jugadores
		System.out.print("Jugadores: ");
		for(int i=0;i<n_concursantes;i++) {
			System.out.print(concursantes[i]+" ");
		}
		System.out.println("\nComienza el juego...");
		//Comenzar el juego
		for(int i=0;i<n_concursantes;i++) {
			System.out.println("Lo va a cruzar el jugador..."+concursantes[i]);
			//Que el jugador pruebe las casillas del puente
			for(int j=0;j<longitud;j++) {
				if(j==longitud-1) {
					//El jugador ha llegado al final del puente
					System.out.println("El jugador "+concursantes[i]+" ha llegado al otro lado!");
					i=n_concursantes;
					break;
				}
				//Recorrer el puente
				if(Puente[0][j]!=0&&Puente[0][j]!=1) {
					//La primera fila esta rota, el jugador no pasa por ella
					System.out.println("El jugador "+concursantes[i]+" avanza a la casilla: [0,"+j+"]");
				}else if(Puente[1][j]!=0&&Puente[1][j]!=1){
					//La segunda fila esta rota, el jugador no pasa por ella
					System.out.println("El jugador "+concursantes[i]+" avanza a la casilla: [1,"+j+"]");
				}else {
					//No hay ninguna fila rota el jugador avanza aleatoriamente
					posicion=(int)(r.nextDouble()*2+0);
					System.out.println("El jugador "+concursantes[i]+" avanza a la casilla: ["+posicion+","+j+"]");
					if(Puente[posicion][j]==1) {
						//El puente se rompe nuevo jugador
						System.out.println("Ups, parece que ese cristal era templado...\n"
								+ "JUGADOR "+concursantes[i]+": ELIMINADO");
						Puente[posicion][j]=2;
						restantes=restantes-1;
						for(int x=0;x<2;x++) {
							for(int y=0;y<longitud;y++) {
								if(Puente[x][y]==0) {
									System.out.print("N ");
								}else if(Puente[x][y]==1) {
									System.out.print("T ");
								}else {
									System.out.print("- ");
								}
							}
							System.out.println();
						}
						break;
					}
				}
			}
		}
		if(restantes==0) {
			//No ha sobrevivido nadie
			System.out.println("Fin del juego, no quedan jugadores.");
		}
		sca.close();
	}
}