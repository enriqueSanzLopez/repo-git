package actividadevaluabletrimestre3_3;

public abstract class Criatura_sin_alas extends Criatura {
	protected int edad;
	protected char temible;
	protected char tiene_anillo;
	public Criatura_sin_alas(String nombre, int edad) {
		super(nombre);
		this.edad=edad;
		tiene_anillo='N';
		temible='N';
	}
	public void dar_o_quitar_anillo(String accion) {
		if(accion.equals("dar") && portador_anillo.equals("")) {
			tiene_anillo='S';
			portador_anillo=nombre;
			System.out.println("Le damos el anillo a "+nombre);
		}else if(accion.equals("quitar") && tiene_anillo=='S') {
			tiene_anillo='N';
			portador_anillo="";
			System.out.println("Le quitamos el anillo a "+nombre);
		}else if(accion.equals("dar") && !portador_anillo.equals("")) {
			System.out.println("No le podemos dar el anillo a "+nombre+" porque el que lo tiene es: "+portador_anillo+"!");
		}else if(accion.equals("quitar") && tiene_anillo=='N') {
			System.out.println("No le podemos quitar el anillo a "+nombre+" porque no lo tiene, quien lo tiene es: "+portador_anillo+"!");
		}
	}
	public char getTemible() {
		return temible;
	}
	public void setTemible(char temible) {
		this.temible = temible;
	}
	public char getTiene_anillo() {
		return tiene_anillo;
	}
	public abstract void presentarse();
	public abstract String getClase();
}