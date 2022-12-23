package pizzatime;

public class Pizza {
	private String tamano;
	private String tipo;
	private String estado;
	/*Número de ordenador asignado automáticamente indice se va acumulando,
	 * sin embargo, num es específico de cada ordenador, pero indice no.*/
	static int totalpedidas=0;
	static int totalservidas=0;
	/*Método constructor*/
	public Pizza(String tipo, String tamano) {
		this.tipo=tipo;
		this.tamano=tamano;
		this.estado="pedida";
		this.totalpedidas=this.totalpedidas+1;
	}
	//Métodos
	public void servir() {
		if(estado.equals("servida")) {
			System.out.println("Esta pizza ya se ha servido");
		}else {
			totalpedidas=totalpedidas-1;
			estado="servida";
			totalservidas=totalservidas+1;
		}
	}
	public String estado_pizza() {
		System.out.print("Pizza de tipo "+tipo+" y tamaño "+tamano+". Estado: ");
		return estado;
	}
	//Getters
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public String getTipo() {
		return tipo;
	}
	//Setters
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}