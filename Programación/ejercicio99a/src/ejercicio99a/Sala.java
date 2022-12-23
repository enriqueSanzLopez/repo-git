package ejercicio99a;
import java.util.*;
public class Sala {
	private int nombre;//El nombre es el número de la salaç
	private Queue<Cliente> cola=new LinkedList<Cliente>();
	public Sala(int nombre) {
		this.nombre=nombre;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public Queue<Cliente> getCola() {
		return cola;
	}
	public void setCola(Queue<Cliente> cola) {
		this.cola = cola;
	}
}