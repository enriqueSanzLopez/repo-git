package ejercicio125;
public class Pelicula extends Multimedia{
	private String actor_principal;
	private String actriz_principal;
	public Pelicula(String titulo, String autor, String formato, int duracion, String actor, String actriz){
		super(titulo, autor, formato, duracion);
		actor_principal=actor;
		actriz_principal=actriz;
	}
	public String getActor_principal() {
		return actor_principal;
	}
	public void setActor_principal(String actor_principal) {
		this.actor_principal = actor_principal;
	}
	public String getActriz_principal() {
		return actriz_principal;
	}
	public void setActriz_principal(String actriz_principal) {
		this.actriz_principal = actriz_principal;
	}
	@Override
	public String toString() {
		return ("Título: "+titulo+"\tAutor: "+autor+"\tFormato: "+formato+"\tDuración: "+duracion+"\tActor principal: "+actor_principal+"\tActriz principal: "+actriz_principal);
	}
}