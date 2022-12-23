package ejercicio127;
public abstract class Mascota {
	protected String nombre;
	public Mascota(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public abstract String sonido();
	@Override
	public String toString() {
		return nombre;
	}
}