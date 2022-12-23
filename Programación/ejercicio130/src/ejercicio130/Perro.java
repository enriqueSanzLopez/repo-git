package ejercicio130;
public class Perro extends Animal {
	private RazaPerro raza;
	private String microchip;
	public Perro(String nombre, String fecha, double peso, RazaPerro raza, String microchip) {
		super(nombre, fecha, peso);
		this.raza=raza;
		this.microchip=microchip;
	}
	@Override
	public String ToString() {
		// TODO Auto-generated method stub
		return "Ficha de Perro\nNombre: "+nombre+"\nRaza: "+raza+"\nFecha de Nacimiento: "+fechaNacimiento+"\nPeso: "+peso+" kg\n"+"Microchip: "+microchip+"\nComentarios: "+comentarios+"\n";
	}
}