package ejercicio125;
public class Disco extends Multimedia {
	private String genero;
	public Disco(String titulo, String autor, String formato, int duracion, String genero) {
		super(titulo, autor, formato, duracion);
		this.genero=genero;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return ("Título: "+titulo+"\tAutor: "+autor+"\tFormato: "+formato+"\tDuración: "+duracion+"\tGénero: "+genero);
	}
}