package ejercicio131;

public interface Interface_Plato {
	//Añadir ingrediente
	public void anyadir_ingrediente(Ingrediente i);
	//Mostrar todos los ingredientes
	public String consultar_ingredientes();
	//Devolver el precio
	public double getPrecio();
	//Devolver el nombre del plato
	public String getNombre();
}