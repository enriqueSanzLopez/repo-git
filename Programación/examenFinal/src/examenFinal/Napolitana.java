package examenFinal;
public class Napolitana extends Bolleria {
	private String relleno;
	public Napolitana(double peso, String relleno) {
		super(peso);
		// TODO Auto-generated constructor stub
		this.relleno=relleno;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Napolitana de "+peso+" g. con relleno de sabor "+relleno+". PVP:"+precio+" €.";
	}	
}