package dinamicas;
import java.util.*;
public class ejercicio94 {
	public static boolean decidir_nombre_rico(String nombre_rico) {
		boolean correcto=false;
		nombre_rico=nombre_rico.toLowerCase();
		if(nombre_rico.indexOf("e")!=-1&&nombre_rico.indexOf("o")!=-1) {
			//Hay al menos 1 e y una o
			correcto=true;
		}
		return correcto;
	}
	public static boolean decidir_pasta_rico(int pasta_rico) {
		boolean correcto=false;
		if(pasta_rico>6000) {
			correcto=true;
		}
		return correcto;
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int revista, dinero, j=0;
		boolean salir=false, correcto;
		String nombre;
		//PASO 1
		ArrayList<String> lista=new ArrayList<String>();
		do {
			System.out.println("Introduzca el número de la revista:");
			revista=sca.nextInt();
		}while(revista<2000);
		sca.nextLine();
		//PASO 2
		while(salir==false) {
			System.out.println("Introduzca nombre de rico para la revista "+revista+":");
			nombre=sca.nextLine();
			//Comprobar si se sale
			if(nombre.toUpperCase().equals("SALIR")) {
				break;
			}
			System.out.println("Introduzca el dinero que dice tener "+nombre+":");
			dinero=sca.nextInt();
			sca.nextLine();
			//Validar el nombre
			correcto=decidir_nombre_rico(nombre);
			if(correcto==true) {
				correcto=decidir_pasta_rico(dinero);
			}
			//Añadir a la lista
			if(correcto==true) {
				j=j+1;
				System.out.println(nombre+" insertado en el Arraylist de forbes en la posición "+j+".\n");
				lista.add(nombre);
			}else {
				System.out.println(nombre+" es muy pobre y no puede aparecer en forbes!\n");
			}
		}
		System.out.println("Los ricos introducidos son los siguientes:");
		//Recorrer la lista de ricos
		for(String i:lista) {
			System.out.print(i+" ");
		}
		sca.close();
	}
}