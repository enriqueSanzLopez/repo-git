package ejercicio130;

public class Gato extends Animal {
	private RazaGato raza;
	private String microchip;
	public Gato(String nombre, String fecha, double peso, RazaGato raza, String microchip) {
		super(nombre, fecha, peso);
		this.raza=raza;
		this.microchip=microchip;
	}
	@Override
	public String ToString() {
		// TODO Auto-generated method stub
		return "Ficha de Gato\nNombre: "+nombre+"\nRaza: "+raza+"\nFecha de Nacimiento: "+fechaNacimiento+"\nPeso: "+peso+" kg\n"+"Microchip: "+microchip+"\nComentarios: "+comentarios+"\n";
	}
}