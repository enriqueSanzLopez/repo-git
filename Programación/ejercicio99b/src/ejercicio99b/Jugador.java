package ejercicio99b;
public class Jugador {
	private String nombre;
	private String dorsal;
	public Jugador(String nombre, String dorsal) {
		this.nombre=nombre;
		this.dorsal=dorsal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDorsal() {
		return dorsal;
	}
	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}
}