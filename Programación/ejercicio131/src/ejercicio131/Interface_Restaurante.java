package ejercicio131;

public interface Interface_Restaurante {
	//Añade la mesa m al ArrayList de mesas
	public void montarMesa(Mesa m);
	//Busca en el array de mesas aquella con el NumMesa de m y borrarla
	public void recogerMesa(Mesa m);
	//Por cada mesa del restaurante, llamar a obtenerDatosMesa()
	public void listarMesas();
	//Recorrer el array de mesas acumulando las facturas de todas
	public double calcular_caja();
}