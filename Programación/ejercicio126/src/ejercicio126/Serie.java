package ejercicio126;
public class Serie extends Contenido {
	private int ntemporadas;
	private boolean finalizada;
	public Serie(String titulo, String productora, int fecha, int temporadas, boolean finalizada) {
		super(titulo, productora, fecha);
		ntemporadas=temporadas;
		this.finalizada=finalizada;
	}
	public int getNtemporadas() {
		return ntemporadas;
	}
	public void setNtemporadas(int ntemporadas) {
		this.ntemporadas = ntemporadas;
	}
	public boolean isFinalizada() {
		return finalizada;
	}
	public void setFinalizada(boolean finalizada) {
		this.finalizada = finalizada;
	}
	@Override
	public String toString() {
		return (titulo+"|"+productora+"|"+fecha+"|"+visto+"|"+ntemporadas+"|"+finalizada);
	}
}