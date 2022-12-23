package pescado;

public class Pez {
	protected String nombre;
	private int escamas;
	protected int peso;
	public Pez(String nombre, int escamas, int peso) {
		this.nombre=nombre;
		this.escamas=escamas;
		this.peso=peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEscamas() {
		return escamas;
	}
	public void setEscamas(int escamas) {
		this.escamas = escamas;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String categoria() {
		String categoria;
		if(peso<100) {
			categoria="pequeño";
		}else if(peso>=100 && peso<300) {
			categoria="mediano";
		}else if(peso>=300 && peso<500) {
			categoria="grande";
		}else {
			categoria="cachalote";
		}
		return categoria;
	}
}