package ejercicio131;

public interface Interface_Mesa {
	//Devolver los datos de la mesa
	public String obtenerDatosMesa();
	//Devolver el número de mesas
	public int getnumMesa();
	//Poner mesa a LIBRE
	public void liberarMesa();
	//Poner mesa a OCUPADO
	public void ocuparMesa();
	//Añadir al ArrayList de Platos el plato p
	public void pedirPlato(Plato p);
	//Informar de todos los platos pedidos por la mesa
	public void detalle_platos();
	//Calcular la factura de la mesa
	public double calcular_factura();
}