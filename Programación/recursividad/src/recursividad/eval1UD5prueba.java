package recursividad;
import java.util.*;
public class eval1UD5prueba {
	public static String Introducir_nombre_ciudad() {
		Scanner sca=new Scanner(System.in);
		String ciudad="";
		System.out.println("Introduzca nombre de la ciudad:");
		ciudad=sca.nextLine();
		return ciudad;
	}
	public static int pintar_menu() {
		Scanner sca=new Scanner(System.in);
		System.out.println("1-Introduce temperaturas de una ciudad\n"
				+ "2-Listar temperaturas de todas las ciudades\n"
				+ "3-Salir");
		int opcion=sca.nextInt();
		return opcion;
	}
	public static int Leer_temperatura(String nombre_ciudad, int orden_temperatura) {
		Scanner sca=new Scanner(System.in);
		System.out.println("Vamos a introducir la temperatura "+orden_temperatura+" de "+nombre_ciudad+":");
		int temperatura=sca.nextInt();
		return temperatura;
	}
	public static int Llamar_opcion(int opcion, int ciudad, String[] lista) {
		String nombre;
		int t1, t2, t3, t4;
		switch(opcion) {
		case 1:
			//Leer temperaturas
			nombre=Introducir_nombre_ciudad();
			t1=Leer_temperatura(nombre, 1);
			t2=Leer_temperatura(nombre, 2);
			t3=Leer_temperatura(nombre, 3);
			t4=Leer_temperatura(nombre, 4);
			lista[ciudad]=nombre+" tiene registradas las siguientes temperaturas: "+t1+", "+t2+", "+t3+", "+t4;
			ciudad=ciudad+1;
			break;
		case 2:
			//Listar
			for(int i=0;i<4;i++) {
				if(!lista[i].equals("")) {
					System.out.println(lista[i]);
				}else {
					break;
				}
			}
			break;
		case 3:
			//Salir
			break;
		default:
			System.out.println("ERROR! Opción inexistente!");
			break;
		}
		return ciudad;
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		//Inicializar variables
		int opcion=-1, ciudad=0;
		String[] lista= {"","","",""};
		do {
			//Mostrar el menu y guardar la opcion
			opcion=pintar_menu();
			if(opcion==3) {
				break;
			}
			//Entrar en la opcion seleccionada
			ciudad=Llamar_opcion(opcion, ciudad, lista);
		}while(opcion!=3);
		System.out.println("Gracias por consultar con nuestra estación metereológica");
		sca.close();
	}
}