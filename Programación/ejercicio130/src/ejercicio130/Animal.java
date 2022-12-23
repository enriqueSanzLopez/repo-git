package ejercicio130;
public abstract class Animal {
	protected String nombre;
	protected String fechaNacimiento;
	protected double peso;
	protected String comentarios;
	public Animal(String nombre, String fecha, double peso) {
		this.nombre=nombre;
		fechaNacimiento=fecha;
		this.peso=peso;
		this.comentarios="";
	}
	public String getNombre() {
		return nombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public abstract String ToString();
}