package ejercicio131;

public class Reserva {
	private String fecha;
	private int hora;
	private int numPersonas;
	private Cliente persona;
	private Mesa meson;
	public Reserva(String fecha, int hora, int numPersonas, Mesa m, Cliente c) {
		this.fecha=fecha;
		this.hora=hora;
		this.numPersonas=numPersonas;
		this.persona=c;
		this.meson=m;
		meson.ocuparMesa();
	}
	@Override
	public String toString() {
		return fecha+", "+hora+", "+numPersonas+", "+persona.getNombre()+", "+meson.getnumMesa();
	}
}