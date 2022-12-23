package examenFinal;

public abstract class Bolleria {
	protected double peso;
	protected double precio;
	public Bolleria(double peso) {
		this.peso=peso;
		precio=peso/10;
	}
	public double getPrecio() {
		return precio;
	}
	public abstract String toString();
}