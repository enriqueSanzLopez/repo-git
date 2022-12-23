package ex5;
import java.util.*;
public class Principal {
	public static void main(String[] args) {
		//Pelea entre Ryu y Ken
		Luchador lu1 = new Luchador("Ryu");
		Luchador lu2 = new Luchador("Ken");
		Luchador luch_ganador;
		Escenario e = new Escenario("El Templo de Pekin",lu1,lu2);
		System.out.println(e.cabecera_pelea());
		pelear(e,lu1,lu2);

		if (lu1.getnumroundsganados() > lu2.getnumroundsganados()) {
			System.out.println("El ganador de esta pelea ha sido: " + lu1.getnombre());
			luch_ganador = lu1;
			System.out.println(lu1.getnombre() + ": " + lu2.getnombre() + ", pensaba que eras mas fuerte coleguilla");
		}else {
			System.out.println("El ganador de la pelea ha sido: " + lu2.getnombre());
			luch_ganador = lu2;
			System.out.println(lu2.getnombre() + ": " + lu1.getnombre() + ", no vales ni para ser Youtuber");
		}

		//Pelea entre el ganador anterior y Mr Bison
		luch_ganador.setnumroundsganados(0);
		Luchador lu3 = new Luchador("Mr Bison");
		Escenario e2 = new Escenario("Bison Mansion",luch_ganador,lu3);

		System.out.println(e2.cabecera_pelea());
		pelear(e2,luch_ganador,lu3);

		if (luch_ganador.getnumroundsganados() > lu3.getnumroundsganados()) {
			System.out.println("El ganador de esta pelea ha sido: " + luch_ganador.getnombre());
			System.out.println(luch_ganador.getnombre() + ": " + lu3.getnombre() + ",pensaba que eras mas fuerte coleguilla");
		}else {
			System.out.println("El ganador de la pelea ha sido: " + lu3.getnombre());
			System.out.println(lu3.getnombre() + ": " + luch_ganador.getnombre() + ", no vales ni para ser Youtuber");
		}
	}

	public static void pelear(Escenario e, Luchador lu1, Luchador lu2) {

		int countrounds=1;
		while ((lu1.getnumroundsganados() < 2) && (lu2.getnumroundsganados() < 2)) {
			System.out.println("ROUND " + countrounds + "....FIGHT!!!");
			e.pelea(1);
			countrounds++;
		}
	}
}