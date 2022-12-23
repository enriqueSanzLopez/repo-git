package actividadevaluabletrimestre3_3;

public class Hobbit extends Criatura_sin_alas {
	private int velocidad;
	public Hobbit(String nombre, int edad, int velocidad) {
		super(nombre, edad);
		this.velocidad=velocidad;
	}
	@Override
	public void presentarse() {
		// TODO Auto-generated method stub
		if(nombre.equals("Sam") && velocidad<10) {
			System.out.println("Soy un hobbit, me llamo "+nombre+", tengo "+edad+" y voy a "+velocidad+"Km/h. Sam va lentin!");
		}else if(nombre.equals("Smeagol") && tiene_anillo=='S') {
			System.out.println("Soy un hobbit, me llamo Gollum, tengo "+edad+" años y voy a "+velocidad+"KM/h. Es mioo! Mi tesoooro!");
		}else {
			System.out.println("Soy un hobbit, me llamo "+nombre+", tengo "+edad+" y voy a "+velocidad+"Km/h.");
		}
	}
	@Override
	public String getClase() {
		// TODO Auto-generated method stub
		return "Hobbit";
	}
}