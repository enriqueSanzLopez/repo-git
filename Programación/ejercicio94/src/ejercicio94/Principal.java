package ejercicio94;
public class Principal {
	public static void main(String arg[]) {
		Cafetera cafet1=new Cafetera(1000);
		cafet1.llenar_cafetera();
		cafet1.servir_taza(90);
		cafet1.servir_taza(10);
		cafet1.agregar_cafe(50);
		cafet1.servir_taza(960);
		cafet1.servir_taza(1);
		cafet1.agregar_cafe(1200);
		cafet1.agregar_cafe(50);
		cafet1.vaciar_cafetera();
		cafet1.llenar_cafetera();
	}
}