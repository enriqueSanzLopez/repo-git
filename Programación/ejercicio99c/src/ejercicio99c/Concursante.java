package ejercicio99c;

public class Concursante {
	private String nombre;
	private int edad;
	private String pareja;
	public Concursante(String nombre, int edad, String pareja) {
		this.nombre=nombre;
		this.edad=edad;
		this.pareja=pareja;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPareja() {
		return pareja;
	}
	public void setPareja(String pareja) {
		this.pareja = pareja;
	}
}