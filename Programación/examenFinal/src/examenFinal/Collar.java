package examenFinal;

import java.util.ArrayList;

public class Collar implements Interface_Collar {
	private ArrayList<Perla> perlas;
	private double longitud;
	private double precio;
	public Collar(double longitud) {
		perlas=new ArrayList<Perla>();
		this.longitud=longitud;
	}
	public ArrayList<Perla> getPerlas() {
		return perlas;
	}
	public void setPerlas(ArrayList<Perla> perlas) {
		this.perlas = perlas;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public void addPerla(Perla p) {
		perlas.add(p);
	}
	@Override
	public double calcular_precio() {
		// TODO Auto-generated method stub
		double coste=0;
		for(int i=0;i<perlas.size();i++) {
			coste=coste+perlas.get(i).getPrecio();
		}
		return coste;
	}
	@Override
	public String toString() {
		String cadena="El collar tiene una cadena de "+longitud+" cm. y las siguientes perlas:\n";
		double suma=0;
		for(int i=0;i<perlas.size();i++) {
			cadena=cadena+perlas.get(i)+"\n";
			suma=suma+perlas.get(i).getPrecio();
		}
		precio=suma;
		cadena=cadena+"Por lo que el precio total del collar es de "+precio+" €.";
		return cadena;
	}

}
