package ejercicio98;

public class Escenario {
	private int ronda;
	private String nombre;
	public Escenario(String nombre, int ronda) {
		this.ronda=ronda;
		this.nombre=nombre;
	}
	public int getRonda() {
		return ronda;
	}
	public void setRonda(int ronda) {
		this.ronda = ronda;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}