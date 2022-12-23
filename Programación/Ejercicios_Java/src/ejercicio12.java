import java.util.Scanner;
public class ejercicio12 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int Podemos=0;
		int PSOE=0;
		int Ciudadanos=0;
		int PP=0;
		int VOX=0;
		int G_Izquierda=0;
		int G_Derecha=0;
		double P1;
		System.out.print("Ingresa los votos de Podemos: ");
		Podemos=teclado.nextInt();
		System.out.print("\nIngresa los votos del PSOE: ");
		PSOE=teclado.nextInt();
		System.out.print("\nIngresa los votos de Ciudadanos: ");
		Ciudadanos=teclado.nextInt();
		System.out.print("\nIngresa los votos del PP: ");
		PP=teclado.nextInt();
		System.out.print("\nIngresa los votos de VOX: ");
		VOX=teclado.nextInt();
		G_Izquierda=Podemos+PSOE;
		G_Derecha=Ciudadanos+PP+VOX;
		P1=Math.round(10000.0*G_Izquierda/(G_Izquierda+G_Derecha))/100.0;
		System.out.println("\nLos votos de la izquierda son "+G_Izquierda+" que constituyen el porcentaje "+P1+"% del total y los\n"
				+ "votos de la derecha son "+G_Derecha+" que constituyen el "+(100-P1)+"% del total.");
	}
}
