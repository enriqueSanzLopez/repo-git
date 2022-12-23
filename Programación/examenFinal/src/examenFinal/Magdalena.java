package examenFinal;
public class Magdalena extends Bolleria {
	private String tipo;
	private boolean lleva_papel;
	public Magdalena(double peso, String tipo, boolean lleva_papel) {
		super(peso);
		// TODO Auto-generated constructor stub
		this.tipo=tipo;
		this.lleva_papel=lleva_papel;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(lleva_papel==true) {
			return "Magdalena de "+peso+" g. con forma "+tipo+" y lleva papel. PVP:"+precio+" €.";
		}else {
			return "Magdalena de "+peso+" g. con forma "+tipo+" y no lleva papel. PVP:"+precio+" €.";
		}
	}
}