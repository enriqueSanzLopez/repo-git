package ejercicio124;
import java.util.*;
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		ArrayList<Punto> poligono=new ArrayList<Punto>();
		Punto a=new Punto(0,0);
		poligono.add(a);
		Punto b=new Punto(2,0);
		poligono.add(b);
		Punto c=new Punto(2,2);
		poligono.add(c);
		Punto d=new Punto(0,2);
		poligono.add(d);
		Poligono poli=new Poligono(poligono);
		System.out.println(poli);
		poli.trasladar(4, -3);
		System.out.println(poli);
		poli.escalar(2, 2);
		System.out.println(poli);
		System.out.println(poli.numVertices());
		sca.close();
	}
}