package ejercicio128;

public class Coche extends Vehiculo {
	private int puertas;
	public Coche (String matricula, int puertas) {
		super(matricula);
		this.puertas=puertas;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	@Override
	public String toString() {
		return matricula+"|"+velocidad+"|"+puertas;
	} 
}