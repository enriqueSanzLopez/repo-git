package ejercicio124;
import java.util.*;
public class Poligono {
	private ArrayList<Punto> esquinas;
	public Poligono(ArrayList<Punto> esquinas) {
		this.esquinas=esquinas;
	}
	public ArrayList<Punto> getEsquinas() {
		return esquinas;
	}
	public void setEsquinas(ArrayList<Punto> esquinas) {
		this.esquinas = esquinas;
	}
	public void trasladar(int x, int y) {
		for(int i=0;i<esquinas.size();i++) {//Recorrer el array
			Punto esquina=esquinas.get(i);
			int ax=esquina.getX();
			int ay=esquina.getY();
			esquina.setX(ax+x);
			esquina.setY(ay+y);
			esquinas.set(i, esquina);
		}
	}
	public void escalar(int x, int y) {
		for(int i=0;i<esquinas.size();i++) {//Recorrer el array
			Punto esquina=esquinas.get(i);
			int ax=esquina.getX();
			int ay=esquina.getY();
			esquina.setX(ax*x);
			esquina.setY(ay*y);
			esquinas.set(i, esquina);
		}
	}
	public int numVertices() {
		return esquinas.size();
	}
	@Override
	public String toString() {
		String frase="";
		for(int i=0;i<esquinas.size();i++) {
			Punto esquina=esquinas.get(i);
			frase=frase+esquina.toString()+"\n";
		}
		return frase;
	}
}