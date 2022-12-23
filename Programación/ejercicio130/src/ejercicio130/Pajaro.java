package ejercicio130;

public class Pajaro extends Animal {
	private EspeciePajaro especie;
	private boolean cantor;
	public Pajaro(String nombre, String fecha, double peso, EspeciePajaro raza, boolean cantor) {
		super(nombre, fecha, peso);
		this.cantor=cantor;
		this.especie=raza;
	}
	@Override
	public String ToString() {
		// TODO Auto-generated method stub
		return "Ficha de Pájaro\nNombre: "+nombre+"\nEspecie: "+especie+"\nFecha de Nacimiento: "+fechaNacimiento+"\nPeso: "+peso+" kg\nCantor: "+cantor+"\nComentarios: "+comentarios+"\n";
	}
}