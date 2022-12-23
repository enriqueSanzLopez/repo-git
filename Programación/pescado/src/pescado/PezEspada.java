package pescado;

public class PezEspada extends Pez {
	private String lugar;
	public PezEspada(String nombre, int escamas, int peso, String lugar) {
		super(nombre, escamas, peso);
		this.lugar=lugar;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public boolean espada() {
		boolean real;
		if(lugar.equals("Mediterraneo")) {
			real=false;
		}else if(lugar.equals("Atlántico") || lugar.equals("Pacífico")) {
			real=true;
		}else {
			real=false;
		}
		return real;
	}
}