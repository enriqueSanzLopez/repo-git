package blabla;
public class Ordenador {
	private String procesador;
	private int memoria;
	private int disco;
	/*Número de ordenador asignado automáticamente indice se va acumulando,
	 * sin embargo, num es específico de cada ordenador, pero indice no.*/
	static int indice=0;
	private int num=0;
	/*Constructor de clase*/
	public Ordenador(String procesador, int memoria, int disco) {
		this.procesador=procesador;
		this.memoria=memoria;
		this.disco=disco;
		this.indice=this.indice+1;
		this.num=indice;
	}
	/*Getters*/
	public String get_procesador() {
		return procesador;
	}
	public int get_memoria() {
		return memoria;
	}
	public int get_disco() {
		return disco;
	}
	public int get_num() {
		return num;
	}
	/*Setters*/
	public void set_procesador(String procesador) {
		this.procesador=procesador;
	}
	public void set_memoria(int memoria) {
		this.memoria=memoria;
	}
	public void set_disco(int disco) {
		this.disco=disco;
	}
}