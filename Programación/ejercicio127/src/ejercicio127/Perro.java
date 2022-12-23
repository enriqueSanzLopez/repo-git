package ejercicio127;
public class Perro extends Mascota {
	public Perro(String nombre) {
		super(nombre);
	}
	@Override
	public String sonido() {
		return "Hola me llamo "+nombre+", soy un perro y hago guauuu";
	}
}