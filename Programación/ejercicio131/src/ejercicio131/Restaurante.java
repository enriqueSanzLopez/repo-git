package ejercicio131;

import java.util.ArrayList;

public class Restaurante implements Interface_Restaurante {
	private String nombre;
	private String telefono;
	private ArrayList<Mesa> sitios;
	public Restaurante(String nombre, String telefono) {
		this.nombre=nombre;
		this.telefono=telefono;
		sitios=new ArrayList<Mesa>();
	}
	@Override
	public void montarMesa(Mesa m) {
		// TODO Auto-generated method stub
		sitios.add(m);
	}
	@Override
	public void listarMesas() {
		// TODO Auto-generated method stub
		if(sitios.size()==0) {
			System.out.println("Todas las mesas están recogidas");
		}else {
			for(int i=0;i<sitios.size();i++) {
				System.out.println(sitios.get(i).obtenerDatosMesa());
			}
		}
	}
	@Override
	public double calcular_caja() {
		// TODO Auto-generated method stub
		double caja=0;
		for(int i=0;i<sitios.size();i++) {
			caja=caja+sitios.get(i).calcular_factura();
			System.out.println(caja);
		}
		return caja;
	}
	@Override
	public void recogerMesa(Mesa m) {
		// TODO Auto-generated method stub
		for(int i=0;i<sitios.size();i++) {
			if(sitios.get(i).equals(m)) {
				sitios.remove(i);
				break;
			}
		}
	}
}