package actividadevaluabletrimestre3_3;

public class Orco extends Criatura_sin_alas {
	public char colmillos;
	public String arma;
	public Orco(String nombre, int edad, char colmillos) {
		super(nombre, edad);
		this.colmillos=colmillos;
		arma="";
	}
	public void armar(String arma) {
		this.arma=arma;
		if(this.arma.equals("hacha") && colmillos=='S') {
			temible='S';//El orco pasa a ser temible
		}
	}
	@Override
	public void presentarse() {
		// TODO Auto-generated method stub
		if(arma.equals("")) {
			System.out.println("Soy un orco, me llamo "+nombre+" tengo "+edad+" años y voy desarmado.");
		}else if(temible=='S') {
			System.out.println("Soy un orco, me llamo "+nombre+" tengo "+edad+" años y mi arma es una "+arma+" y soy temible!");
		}else {
			System.out.println("Soy un orco, me llamo "+nombre+" tengo "+edad+" años y mi arma es una "+arma);
		}
	}
	@Override
	public String getClase() {
		// TODO Auto-generated method stub
		return "Orco";
	}
}