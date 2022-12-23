package ejercicio94;

public class Cafetera {
	//Atributos de cafetera
	private int capacidad_maxima;
	private int cantidad_actual;
	//Constructor
	public Cafetera(int capacidad_maxima) {
		this.capacidad_maxima=capacidad_maxima;
		this.cantidad_actual=0;
	}
	//Métodos
	public void llenar_cafetera() {
		cantidad_actual=capacidad_maxima;
		System.out.println("La cafetera está llena, hay disponibles "+cantidad_actual+"cl.");
	}
	public void servir_taza(int cantidad_solicitada) {
		if(cantidad_actual==0) {
			System.out.println("Lo siento, la cafetera está vacía.");
		}else if(cantidad_solicitada>cantidad_actual) {
			System.out.println("Lo siento, solo te he podido servir "+cantidad_actual+"cl.");
			cantidad_actual=0;
		}else {
			cantidad_actual=cantidad_actual-cantidad_solicitada;
			System.out.println("Servimos una taza de "+cantidad_solicitada+"cl. y quedan en la cafetera "+cantidad_actual+"cl.");
		}
	}
	public void vaciar_cafetera() {
		cantidad_actual=0;
		System.out.println("Cafetera vacia");
	}
	public void agregar_cafe(int cantidad) {
		if(cantidad_actual+cantidad>capacidad_maxima) {
			System.out.println("La cantidad_actual es: "+cantidad_actual+"cl. en una cafetera de: "+capacidad_maxima+"cl. No se puede agregar "+cantidad+"cl. porque desbordaría la cafetera!");
		}else {
			cantidad_actual=cantidad_actual+cantidad;
			System.out.println("Agregamos "+cantidad+"cl. y quedan en la cafetera "+cantidad_actual+"cl.");
		}
	}
}