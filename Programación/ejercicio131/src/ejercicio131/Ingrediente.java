package ejercicio131;

public class Ingrediente implements Interface_Ingrediente {
	private String nombre;
	private double cantidad;
	public Ingrediente(String nombre, double cantidad) {
		this.nombre=nombre;
		this.cantidad=cantidad;
	}
	@Override
	public String detalleIngrediente() {
		// TODO Auto-generated method stub
		return nombre+", "+cantidad;
	}
	
}