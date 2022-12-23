package ejercicio100;
import java.util.*;
public class Nave {
	private String nombre;
	private ArrayList<Tripulante> tripulacion;
	public Nave(String nombre) {
		this.nombre=nombre;
		tripulacion=new ArrayList<Tripulante>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Tripulante> getTripulacion() {
		return tripulacion;
	}
	public void setTripulacion(ArrayList<Tripulante> tripulacion) {
		this.tripulacion = tripulacion;
	}
}