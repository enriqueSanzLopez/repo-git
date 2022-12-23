package ejercicio127;
public class Gato extends Mascota {
	public Gato(String nombre) {
		super(nombre);
	}
	@Override
	public String sonido() {
		return "Hola me llamo "+nombre+", soy un gato y hago miauuu";
	}
}