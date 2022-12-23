package dinamicas;
import java.util.*;
public class ejercicio89 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		HashMap<String, String> diccionario=new HashMap<String, String>();
		diccionario.put("Hola", "Hello");
		diccionario.put("Lunes", "Monday");
		diccionario.put("Adios", "Goodbye");
		boolean salir=false, existe;
		String palabra;
		do {
			System.out.println("Introduce una palabra:");
			palabra=sca.nextLine();
			//Comprobar si indica salir
			if(palabra.equals("salir")) {
				break;
			}
			existe=diccionario.containsKey(palabra);
			if(existe==true) {
				System.out.println(diccionario.get(palabra));
			}else {
				System.out.println("Lo sentimos, la palabra no existe en el diccionario.");
			}
		}while(salir==false);
		sca.close();
	}
}