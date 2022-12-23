package ejercicio126;

public class Pelicula extends Contenido {
	private int nominados;
	private int ganados;
	public Pelicula(String titulo, String productora, int fecha, int nominados, int ganados) {
		super(titulo, productora, fecha);
		this.nominados=nominados;
		this.ganados=ganados;
	}
	public int getNominados() {
		return nominados;
	}
	public void setNominados(int nominados) {
		this.nominados = nominados;
	}
	public int getGanados() {
		return ganados;
	}
	public void setGanados(int ganados) {
		this.ganados = ganados;
	}
	@Override
	public String toString() {
		return (titulo+"|"+productora+"|"+fecha+"|"+visto+"|"+nominados+"|"+ganados);
	}
}