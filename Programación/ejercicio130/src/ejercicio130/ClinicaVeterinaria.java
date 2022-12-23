package ejercicio130;

import java.util.ArrayList;

public class ClinicaVeterinaria {
	private ArrayList<Animal> listaAnimales;
	public ClinicaVeterinaria() {
		listaAnimales=new ArrayList<Animal>();
	}
	public void InsertaAnimal(Animal a) {
		listaAnimales.add(a);
	}
	public Animal BuscaAnimal(String nombre) {
		for(int i=0;i<listaAnimales.size();i++) {
			if(listaAnimales.get(i).getNombre().equals(nombre)) {
				return listaAnimales.get(i);
			}
		}
		return null;
	}
	public void InsertaComentarioAnimal(String nombre, String comentario) {
		boolean existe=false;
		for(int i=0;i<listaAnimales.size();i++) {
			if(listaAnimales.get(i).getNombre().equals(nombre)) {
				listaAnimales.get(i).setComentarios(comentario);
				existe=true;
				break;
			}
		}
		if(existe==false) {
			System.out.println("ERROR!, El animal indicado no existe!");
		}
	}
	public void ToString() {
		for(int i=0;i<listaAnimales.size();i++) {
			System.out.println(listaAnimales.get(i).ToString());
		}
	}
}