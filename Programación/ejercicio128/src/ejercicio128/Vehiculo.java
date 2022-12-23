package ejercicio128;
public class Vehiculo {
	protected String matricula;
	protected int velocidad;
	public Vehiculo(String matricula) {
		this.matricula=matricula;
		this.velocidad=0;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int aceleracion) {
		this.velocidad = velocidad+aceleracion;
	}
	@Override
	public String toString() {
		return matricula+"|"+velocidad;
	}
}