package dinamicas;
import java.util.*;
public class ejercicio90 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		HashMap<String, String> diccionario=new HashMap<String, String>();
		diccionario.put("Hola", "Hello");
		diccionario.put("Lunes", "Monday");
		diccionario.put("Adios", "Goodbye");
		diccionario.put("Gracias", "Thanks");
		diccionario.put("Comida", "Food");
		int aciertos=0, errores=0;
		String[] palabra = new String[5];
		for(int i=0;i<5;i++) {
			palabra[i]=sca.nextLine();
		}
		for(int i=0;i<palabra.length;i++) {
			if(diccionario.get("Hola").equals(palabra[i])||diccionario.get("Lunes").equals(palabra[i])||diccionario.get("Adios").equals(palabra[i])||diccionario.get("Gracias").equals(palabra[i])||diccionario.get("Comida").equals(palabra[i])) {
				aciertos=aciertos+1;
			}else {
				errores=errores+1;
			}
		}
		System.out.println("Aciertos: "+aciertos+"\nErrores: "+errores);
		sca.close();
	}
}