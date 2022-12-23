package ejercicio99c;
public class Isla {
	private String nombre;
	private Concursante p1;
	private Concursante p2;
	private Concursante p3;
	private Concursante p4;
	public Isla(String nombreIsla, String nombreC1, String nombreC2, String nombreP1, String nombreP2, int edadC1, int edadC2, int edadP1, int edadP2) {
		this.nombre=nombreIsla;
		this.p1=new Concursante(nombreC1, edadC1, nombreP1);
		this.p2=new Concursante(nombreC2, edadC2, nombreP2);
		this.p3=new Concursante(nombreP1, edadP1, nombreC1);
		this.p4=new Concursante(nombreP2, edadP2, nombreC2);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Concursante getP1() {
		return p1;
	}
	public void setP1(Concursante p1) {
		this.p1 = p1;
	}
	public Concursante getP2() {
		return p2;
	}
	public void setP2(Concursante p2) {
		this.p2 = p2;
	}
	public Concursante getP3() {
		return p3;
	}
	public void setP3(Concursante p3) {
		this.p3 = p3;
	}
	public Concursante getP4() {
		return p4;
	}
	public void setP4(Concursante p4) {
		this.p4 = p4;
	}
}