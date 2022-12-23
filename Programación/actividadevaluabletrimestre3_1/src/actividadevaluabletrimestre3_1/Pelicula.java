package actividadevaluabletrimestre3_1;
import java.util.*;
public class Pelicula {
	private String titulo;
	private Persona director;
	private Persona productor;
	private ArrayList<Persona> actores;
	public Pelicula(String titulo, Persona director, Persona productor, ArrayList<Persona> actores) {//Constructor
		this.actores=actores;
		this.titulo=titulo;
		this.productor=productor;
		this.director=director;
	}
	//Getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Persona getDirector() {
		return director;
	}
	public void setDirector(Persona director) {
		this.director = director;
	}
	public Persona getProductor() {
		return productor;
	}
	public void setProductor(Persona productor) {
		this.productor = productor;
	}
	public ArrayList<Persona> getActores() {
		return actores;
	}
	public void setActores(ArrayList<Persona> actores) {
		this.actores = actores;
	}
}