package ejercicio101;

public class Animal {
	private String nombre;
	private char tipo;
	private int peso;
	public Animal(String nombre, char tipo, int peso) {
		this.nombre=nombre;
		this.tipo=tipo;
		this.peso=peso;
	}
	public void pintarAnimal() {
		if(this.tipo=='l'){
			System.out.println("León de nombre "+nombre+" y peso "+peso+" Kg.");
		}else {
			System.out.println("Tigre de nombre "+nombre+" y peso "+peso+" Kg.");
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getTipo() {
		return tipo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
}