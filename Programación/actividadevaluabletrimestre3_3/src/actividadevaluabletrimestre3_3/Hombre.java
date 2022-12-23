package actividadevaluabletrimestre3_3;
public class Hombre extends Criatura_sin_alas {
	private int peso;
	private String arma;
	public Hombre(String nombre, int edad, int peso) {
		super(nombre, edad);
		this.peso=peso;
		arma="";
	}
	public void dar_arma(String arma) {
		if(arma.length()*10<=peso/2) {
			this.arma=arma;
			System.out.println("Armamos a "+nombre+" con el arma: "+arma);
		}else {
			System.out.println("Ese arma es muy pesada!, pesa "+(arma.length()*10)+"Kg. y como mucho debería pesar "+(peso/2)+"Kg.!");
		}
	}
	@Override
	public void presentarse() {
		// TODO Auto-generated method stub
		if(arma.equals("")) {
			System.out.println("Soy un hombre, me llamo "+nombre+" tengo "+edad+" años, peso "+peso+"Kg. y voy desarmado.");
		}else {
			System.out.println("Soy un hombre, me llamo "+nombre+" tengo "+edad+" años, peso "+peso+"Kg. y mi arma es una "+arma);
		}
	}
	@Override
	public String getClase() {
		// TODO Auto-generated method stub
		return "Hombre";
	}
}