package ejercicio98;

public class Luchador {
	private int vida;
	private String nombre;
	public Luchador(String nombre) {
		this.vida=100;
		this.nombre=nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		if(vida<0) {
			this.vida=0;
		}else {
			this.vida = vida;
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}