package examenFinal;

import java.util.Random;

public class Perla implements Interface_Perla {
	private int peso;
	private double precio;
	private String material;
	public Perla() {
		peso=peso_aleatorio();
		material=material_aleatorio();
		precio=calcular_precio();
	}
	@Override
	public int peso_aleatorio() {
		// TODO Auto-generated method stub
		Random r=new Random();
		int cantidad=(int)(r.nextDouble()*(101-50)+50);;
		return cantidad;
	}

	@Override
	public String material_aleatorio() {
		// TODO Auto-generated method stub
		Random r=new Random();
		String materia;
		int tipo=(int)(r.nextDouble()*4+0);
		switch(tipo) {
		case 0:
			materia="plata";
			break;
		case 1:
			materia="oro";
			break;
		case 2:
			materia="platino";
			break;
		case 3:
			materia="rodio";
			break;
		default:
			materia="error";
			break;
		}
		return materia;
	}

	@Override
	public double calcular_precio() {
		// TODO Auto-generated method stub
		double coste;
		switch(material) {
		case "plata":
			coste=2.25*peso;
			break;
		case "oro":
			coste=7.5*peso;
			break;
		case "platino":
			coste=10*peso;
			break;
		case "rodio":
			coste=12*peso;
			break;
		default:
			coste=0;
			break;
		}
		return coste;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "-Perla de "+material+" que pesa "+peso+"g. PVP:"+precio+" €.";
	}

}
