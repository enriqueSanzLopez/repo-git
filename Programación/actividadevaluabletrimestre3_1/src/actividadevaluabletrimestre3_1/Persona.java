package actividadevaluabletrimestre3_1;

public class Persona {
	private String nombre;
	private int edad;//Existe pero no se usa!!!
	private int oscars;
	private String posicion;
	public Persona(String nombre, int edad, int oscars, String posicion) {//Constructor
		this.nombre=nombre;
		this.edad=edad;
		this.oscars=oscars;
		this.posicion=posicion;
	}
	//Getters y setters
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
	public int getOscars() {
		return oscars;
	}
	public void setOscars(int oscars) {
		this.oscars = oscars;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
}