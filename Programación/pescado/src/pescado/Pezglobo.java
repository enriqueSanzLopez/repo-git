package pescado;

public class Pezglobo extends Pez {
	private int toxinas;
	public Pezglobo(String nombre, int escamas, int peso, int toxinas) {
		super(nombre, escamas, peso);
		this.toxinas=toxinas;
	}
	public int getToxinas() {
		return toxinas;
	}
	public void setToxinas(int toxinas) {
		this.toxinas = toxinas;
	}
	public String nivel() {
		String peligro;
		int porcentaje=(100*toxinas)/peso;
		if(porcentaje<10) {
			peligro="inofensivo";
		}else if(porcentaje>=10 && porcentaje<20) {
			peligro="riesgo moderado";
		}else {
			peligro="yo no lo haría";
		}
		return peligro;
	}
}