package ex5;
import java.util.Random;
public class Escenario {
	String nombre;
	Luchador luch1;
	Luchador luch2;

	public Escenario(String nom, Luchador lu1, Luchador lu2) {
		nombre = nom;
		luch1 = lu1;
		luch2 = lu2;
	}

	public String cabecera_pelea() {
		return "Comienza la pelea entre " + luch1.getnombre() + " y " + luch2.getnombre() + " en " + nombre;
	}

	public String pelea(int ganador){

		Random r = new Random();
		int golpe_luch1;
		int golpe_luch2;
		int vida_aux;
		String mensajeFinal;

		if(ganador==1) { luch1.setvida(100);	luch2.setvida(1); }
		else  { luch1.setvida(1);	luch2.setvida(100); }

		while ((luch1.getvida() > 0) && (luch2.getvida() > 0)) {

			golpe_luch1 = (int)(r.nextDouble()*50 +1);
			vida_aux = luch2.getvida() - golpe_luch1;
			if (ganador == 1 ) {
				System.out.println(luch1.getnombre() + " fulmina a " + luch2.getnombre() + " y lo deja KO ");
				luch2.setvida(0);}
			retrasar1seg();
			if (ganador > 1 ) {
				System.out.println(luch2.getnombre() + " destroza a " + luch1.getnombre() + " y lo deja KO ");
				luch1.setvida(0);}
			retrasar1seg();
			if (ganador < 1 ) {
				System.out.println(luch2.getnombre() + " demuele a " + luch1.getnombre() + " y lo deja KO ");
				luch1.setvida(0);}
			retrasar1seg();
		}
		if (luch1.getvida() > 0) {
			
			luch1.incrementar_numroundsganados();
			return ("El ganador de este round es: " + luch1.getnombre());
		}else {
			luch2.incrementar_numroundsganados();
			return ("El ganador de este round es: " + luch2.getnombre());
		}
	}

	public void retrasar1seg() {
		//Retraso de 1 segundo entre golpe y golpe
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}