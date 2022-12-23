package ejercicio100;
public class Tripulante {
	private String nombre;
	private int edad;
	private String rango;
	public Tripulante(String nombre, int edad, String rango) {
		this.nombre=nombre;
		this.edad=edad;
		this.rango=rango;
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
	public String getRango() {
		return rango;
	}
	public void setRango(String rango) {
		this.rango = rango;
	}
}