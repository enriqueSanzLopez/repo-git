package aviones;

public class Billete {
	/*Parámetros del billete*/
	private String origen;
	private String destino;
	private String dia_ida;
	private String dia_vuelta;
	private String estado;
	/*Id con autoincrement del billete*/
	static int num=0;
	private int id=0;
	public Billete(String datos) {
		/*Método constructor*/
		this.estado="V";
		String[] matriz=datos.split("@");
		this.origen=matriz[0];
		this.destino=matriz[1];
		this.dia_ida=matriz[2];
		this.dia_vuelta=matriz[3];
		//Id del billete
		this.num=this.num+1;
		this.id=this.num;
		System.out.println("Billete comprado!!\n"
				+ "Identificador del billete: "+this.id);//Mostrar por pantalla
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getDia_ida() {
		return dia_ida;
	}
	public void setDia_ida(String dia_ida) {
		this.dia_ida = dia_ida;
	}
	public String getDia_vuelta() {
		return dia_vuelta;
	}
	public void setDia_vuelta(String dia_vuelta) {
		this.dia_vuelta = dia_vuelta;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}