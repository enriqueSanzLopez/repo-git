package actividadevaluabletrimestre3_3;

public class Elfo extends Criatura_sin_alas {
	private String color;
	private Criatura_sin_alas pareja;
	public Elfo(String nombre, int edad, String color) {
		super(nombre, edad);
		this.color=color;
		pareja=new Hobbit("", 0, 0);
	}
	public void emparejar(Criatura_sin_alas otro) {
		if(nombre.equals("Arwen")) {
			if(otro.nombre.equals("Aragorn") && otro.getClase().equals("Hombre")) {
				//Es Aragorn
				pareja=otro;				
			}else {
				System.out.println("Arwen dice: 'No me gusta! No es mi Aragorn!'");
			}
		}else {
			pareja=otro;
		}
	}
	@Override
	public void presentarse() {
		// TODO Auto-generated method stub
		if(pareja.getNombre().equals("")) {//Esta soltero
			System.out.println("Soy un elfo de color "+color+", me llamo "+nombre+" tengo "+edad+" años y estoy soltera/o.");
		}else {
			System.out.println("Soy un elfo de color "+color+", me llamo "+nombre+" tengo "+edad+" años y mi pareja se va a presentar:");
			pareja.presentarse();
		}
	}
	@Override
	public String getClase() {
		// TODO Auto-generated method stub
		return "Elfo";
	}
}