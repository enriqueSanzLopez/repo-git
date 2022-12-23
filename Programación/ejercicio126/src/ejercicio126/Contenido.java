package ejercicio126;
public class Contenido {
	protected String titulo;
	protected String productora;
	protected int fecha;
	protected boolean visto;
	public Contenido (String titulo, String productora, int fecha) {
		this.titulo=titulo;
		this.productora=productora;
		this.fecha=fecha;
		this.visto=false;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getProductora() {
		return productora;
	}
	public void setProductora(String productora) {
		this.productora = productora;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public boolean isVisto() {
		return visto;
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	@Override
	public String toString() {
		return (titulo+"|"+productora+"|"+fecha+"|"+visto);
	}
}