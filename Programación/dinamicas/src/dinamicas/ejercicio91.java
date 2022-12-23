package dinamicas;
import java.util.*;
public class ejercicio91 {
	public static void menu() {
		System.out.println("-GRUPOS MUSICALES-\n"
				+ "1-Agregar grupos al final de la lista\n"
				+ "2-Agregar grupo en una posición concreta\n"
				+ "3-Recuperar un grupo en una posición determinada\n"
				+ "4-Modificar grupo en una posición determinada\n"
				+ "5-Posición del grupo en la lista\n"
				+ "6-Imprimir lista\n"
				+ "7-Salir del programa\n"
				+ "Introduzca una opción:");
	}
	public static void nuevo(ArrayList<String> grupos) {
		Scanner sca=new Scanner(System.in);
		String nombre;
		System.out.println("Introduzca el nombre de la banda:");
		nombre=sca.nextLine();
		grupos.add(nombre);
	}
	public static void exacto(ArrayList<String> grupos) {
		Scanner sca=new Scanner(System.in);
		String nombre;
		int posicion;
		System.out.println("Introduzca el nombre de la banda:");
		nombre=sca.nextLine();
		System.out.println("Introduzca la posición en la que guardar al grupo:");
		posicion=sca.nextInt();
		grupos.add(posicion, nombre);
	}
	public static void banda(ArrayList<String> grupos) {
		Scanner sca=new Scanner(System.in);
		int posicion;
		System.out.println("Indica la posición del grupo:");
		posicion=sca.nextInt();
		//Comprobar que el elemento existe
		if(posicion>=grupos.size()) {
			System.out.println("No existe ningún grupo en la posición indicada");
		}else {
			System.out.println(grupos.get(posicion));
		}
	}
	public static void modificar(ArrayList<String> grupos) {
		Scanner sca=new Scanner(System.in);
		int posicion;
		String nombre;
		System.out.println("Introduzca la posición a modificar:");
		posicion=sca.nextInt();
		sca.nextLine();
		if(posicion>=grupos.size()) {
			System.out.println("La posición indicada no existe");
		}else {
			System.out.println("Indica el nuevo nombre");
			nombre=sca.nextLine();
			grupos.set(posicion, nombre);
		}
	}
	public static void posicion(ArrayList<String> grupos) {
		Scanner sca=new Scanner(System.in);
		int posicion;
		String nombre;
		System.out.println("Introduzca el nombre del grupo:");
		nombre=sca.nextLine();
		posicion=grupos.indexOf(nombre);
		System.out.println("El grupo "+nombre+" está en la posición "+posicion);
	}
	public static void imprimir(ArrayList<String> grupos) {
		System.out.println("Lista de grupos:");
		for(int i=0;i<grupos.size();i++) {
			System.out.println(grupos.get(i));
		}
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		ArrayList<String> grupos=new ArrayList<String>();
		int opcion=0;
		do {
			menu();
			opcion=sca.nextInt();
			switch(opcion) {
			case 1:
				nuevo(grupos);
				break;
			case 2:
				exacto(grupos);
				break;
			case 3:
				banda(grupos);
				break;
			case 4:
				modificar(grupos);
				break;
			case 5:
				posicion(grupos);
				break;
			case 6:
				imprimir(grupos);
				break;
			case 7:
				System.out.println("Gracias por utilizar este menú");
				break;
			default:
				System.out.println("Opción inexistente! Introduzca otra opción:");
				break;
			}
		}while(opcion!=7);
		sca.close();
	}
}