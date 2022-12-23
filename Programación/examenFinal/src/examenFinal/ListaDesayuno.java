package examenFinal;

import java.util.ArrayList;

public class ListaDesayuno {
	private ArrayList<Bolleria> comida;
	public ListaDesayuno() {
		comida=new ArrayList<Bolleria>();
	}
	public void anyadir_bollo(Bolleria b) {
		comida.add(b);
	}
	@Override
	public String toString() {
		String cadena="";
		double total=0;
		for(int i=0;i<comida.size();i++) {
			cadena=cadena+comida.get(i)+"\n";
			total=total+comida.get(i).getPrecio();
		}
		cadena=cadena+"Por lo que el precio total del desayuno es: "+total+" €.";
		return cadena;
	}
}