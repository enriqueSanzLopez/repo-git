package ejercicio127;
public class Conejo extends Mascota {
	public Conejo(String nombre) {
		super(nombre);
	}
	@Override
	public String sonido() {
		return "Hola me llamo "+nombre+", soy un conejo y hago raabit raaaabit";
	}
}