package ejercicio131;

import java.util.ArrayList;

public class Plato implements Interface_Plato {
	private String nombre;
	private double precio;
	private ArrayList<Ingrediente> componentes;
	public Plato(String nombre) {
		this.nombre=nombre;
		componentes=new ArrayList<Ingrediente>();
		String primera=nombre.charAt(0)+"";
		if(primera.equalsIgnoreCase("a") || primera.equalsIgnoreCase("e") || primera.equalsIgnoreCase("i") || primera.equalsIgnoreCase("o") || primera.equalsIgnoreCase("u")) {
			precio=10;
		}else {
			precio=5;
		}
	}
	@Override
	public void anyadir_ingrediente(Ingrediente i) {
		// TODO Auto-generated method stub
		componentes.add(i);
	}
	@Override
	public String consultar_ingredientes() {
		// TODO Auto-generated method stub
		String compounds="";
		for(int i=0;i<componentes.size();i++) {
			Ingrediente j=componentes.get(i);
			compounds=compounds+j.detalleIngrediente()+"\n";
		}
		return compounds;
	}
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
}