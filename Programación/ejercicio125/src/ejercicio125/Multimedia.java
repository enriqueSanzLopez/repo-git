package ejercicio125;
public class Multimedia {
	protected String titulo;
	protected String autor;
	protected String formato;
	protected int duracion;
	public Multimedia(String titulo, String autor, String formato, int duracion) {
		this.titulo=titulo;
		this.autor=autor;
		this.formato=formato;
		this.duracion=duracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public boolean equals(Multimedia comparado) {
		boolean correcto=false;
		String ntitulo=comparado.getTitulo();
		String nautor=comparado.getAutor();
		if(ntitulo.equals(titulo) && nautor.equals(autor)) {
			correcto=true;
		}
		return correcto;
	}
	@Override
	public String toString() {
		return ("Título: "+titulo+"\tAutor: "+autor+"\tFormato: "+formato+"\tDuración: "+duracion);
	}
}