package ejercicio102;
import java.io.*;
import java.util.*;
public class Ejercicio104 {
	private static final String ERROR_PROGRAMA = "El programa ha fallado!";

	public static void main(String[] args) {
		File Archivo=new File("salida3.txt");
		ArrayList<Integer> resultado=new ArrayList<Integer>();
		try {
			Scanner sca=new Scanner(Archivo);
			llenarArray(resultado, sca);
			pintarArray(resultado);
			sca.close();
		}catch(Exception e) {
			System.out.println(ERROR_PROGRAMA);
		}
	}

	private static void pintarArray(ArrayList<Integer> resultado) {
		for(int i=0;i<resultado.size();i++) {
			System.out.println(resultado.get(i));
		}
	}

	private static void llenarArray(ArrayList<Integer> resultado, Scanner sca) {
		while(sca.hasNext()) {//Leer el valor de cada línea e incluirlo en el array
			int a=sca.nextInt();
			if(a%5==0) {//Comprobar que sea múltiplo de 5
				resultado.add(a);
			}
		}
	}
}