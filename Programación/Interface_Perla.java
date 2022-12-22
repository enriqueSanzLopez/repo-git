public interface Interface_Perla {
	
	//Calcula un peso aleatorio entre 50 y 100g
	public int peso_aleatorio();
	
	//Devuelve un material aleatorio entre (oro,plata,platino y rodio)
	public String material_aleatorio();
	
	//Calcula el precio de la perla teniendo en cuenta que:
	//		-cada gramo de plata vale 2.25 €
	//		-cada gramo de oro vale 7.5 €
	//		-cada gramo de platino vale 10 €
	//		-cada gramo de rodio vale 12 €
	public double calcular_precio();
	
	//Devuelve la descripción de la perla con el formato:
	//"-Perla de " + material + " que pesa " + peso + "g. PVP:"+precio+" €."
	public String toString();
}
