package ejercicio100;
import java.util.*;
public class Flota {
	private String nombre;
	private ArrayList<String> naves;
	public Flota(String nombre) {
		this.nombre=nombre;
		naves=new ArrayList<String>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<String> getNaves() {
		return naves;
	}
	public void setNaves(ArrayList<String> naves) {
		this.naves = naves;
	}
}