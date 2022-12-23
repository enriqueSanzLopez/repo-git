package ejercicio130;
public class Reptil extends Animal {
	private EspecieReptil especie;
	private boolean venenoso;
	public Reptil(String nombre, String fecha, double peso, EspecieReptil especie, boolean venenoso) {
		super(nombre, fecha, peso);
		this.especie=especie;
		this.venenoso=venenoso;
	}
	@Override
	public String ToString() {
		// TODO Auto-generated method stub
		return "Ficha de Reptil\nNombre: "+nombre+"\nEspecie: "+especie+"\nFecha de Nacimiento: "+fechaNacimiento+"\nPeso: "+peso+" kg\nVenenoso: "+venenoso+"\nComentarios: "+comentarios+"\n";
	}
}