package ejercicio131;

import java.util.ArrayList;

public class Mesa implements Interface_Mesa {
	private int numMesa;
	private int numPersonas;
	private String ubicacion;
	private String estado;
	private double factura;
	private ArrayList<Plato> menu;
	static int contador=0;
	public Mesa(int numPersonas, String ubicacion) {
		this.numPersonas=numPersonas;
		this.ubicacion=ubicacion;
		estado="LIBRE";
		contador=contador+1;
		numMesa=contador;
		menu=new ArrayList<Plato>();
	}
	@Override
	public String obtenerDatosMesa() {
		// TODO Auto-generated method stub
		return "("+numMesa+", "+numPersonas+", "+ubicacion+", "+estado+")";
	}
	@Override
	public int getnumMesa() {
		// TODO Auto-generated method stub
		return numMesa;
	}
	@Override
	public void liberarMesa() {
		// TODO Auto-generated method stub
		estado="LIBRE";
	}
	@Override
	public void ocuparMesa() {
		// TODO Auto-generated method stub
		estado="OCUPADA";
	}
	@Override
	public void pedirPlato(Plato p) {
		// TODO Auto-generated method stub
		menu.add(p);
	}
	@Override
	public void detalle_platos() {
		// TODO Auto-generated method stub
		for(int i=0;i<menu.size();i++) {
			System.out.println(menu.get(i).getNombre());
		}
	}
	@Override
	public double calcular_factura() {
		// TODO Auto-generated method stub
		factura=0;
		for(int i=0;i<menu.size();i++) {
			factura=factura+menu.get(i).getPrecio();
		}
		return factura;
	}
}