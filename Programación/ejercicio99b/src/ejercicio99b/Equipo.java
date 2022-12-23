package ejercicio99b;
import java.util.*;
public class Equipo {
	private String nombre;
	private Jugador j1;
	private Jugador j2;
	private Jugador j3;
	public Equipo(String nombre, String j1, String j2, String j3) {
		this.nombre=nombre;
		this.j1=new Jugador(j1.substring(1,j1.length()), j1.substring(0,1));
		this.j2=new Jugador(j2.substring(1,j2.length()), j2.substring(0,1));
		this.j3=new Jugador(j3.substring(1,j3.length()), j3.substring(0,1));
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Jugador getJ1() {
		return j1;
	}
	public void setJ1(Jugador j1) {
		this.j1 = j1;
	}
	public Jugador getJ2() {
		return j2;
	}
	public void setJ2(Jugador j2) {
		this.j2 = j2;
	}
	public Jugador getJ3() {
		return j3;
	}
	public void setJ3(Jugador j3) {
		this.j3 = j3;
	}
}