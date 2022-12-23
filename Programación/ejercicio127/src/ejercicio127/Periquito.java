package ejercicio127;
public class Periquito extends Mascota {
	public Periquito(String nombre) {
		super(nombre);
	}
	@Override
	public String sonido() {
		return "Hola me llamo "+nombre+", soy un periquito y hago pio pio piooo";
	}
}