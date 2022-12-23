package ex5;
public class Luchador {
	String nombre;
	int vida;
	int numroundsganados;

	public Luchador(String nom) {
		nombre = nom;
		vida = 100;
		numroundsganados = 0;
	}

	void setvida(int cantidad) {
		vida = cantidad;
	}

	int getvida() {
		return vida;
	}

	String getnombre() {
		return nombre;
	}

	int getnumroundsganados() {
		return numroundsganados;
	}

	void setnumroundsganados(int a) {
		numroundsganados = a;
	}

	void incrementar_numroundsganados() {
		numroundsganados++;
	}
}

