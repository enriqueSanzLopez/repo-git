package ejercicio102;
import java.io.*;
import java.util.*;
public class Ejercicio103 {
	private static final String ERROR_CREACION = "ERROR! El archivo no ha podido ser creado!";
	private static final String ARCHIVO_EXISTENTE = "El archivo ya existía";
	private static final String CREACION_EXITOSA = "El archivo ha sido creado exitosamente";
	private static final String ERROR_ESCRITURA = "ERROR! no se ha podido escribir en el documento el número";
	
	public static void main(String[] args) {
		File Archivo1=new File("salida1.txt");
		File Archivo2=new File("salida2.txt");
		File Archivo3=new File("salida3.txt");
		crearArchivo(Archivo3);//Crear el archivo salida3.txt
		try {//Intentar construir el archivo
			Scanner sca1=new Scanner(Archivo1);
			Scanner sca2=new Scanner(Archivo2);
			bucleLlenado(Archivo3, sca1, sca2);
			sca1.close();
		}catch(Exception e) {//En caso de fallo
			System.out.println("No se ha podido escribir correctamente salida3.txt");
		}
	}
	
	private static void crearArchivo(File Archivo1) {
		try {//Intentar crear el archivo
			if(Archivo1.createNewFile()){
				System.out.println(CREACION_EXITOSA);
			}else {
				System.out.println(ARCHIVO_EXISTENTE);
			}
		}catch(Exception e) {//Avisar en caso de fallo
			System.out.println(ERROR_CREACION);
		}
	}

	private static void bucleLlenado(File Archivo3, Scanner sca1, Scanner sca2) {
		String linea;
		for(int i=0;i<50;i++) {//Llenar Archivo3
			if(i%2==0) {//Le toca a Archivo1
				linea=sca1.nextLine();//leer una linea
			}else {//Le toca a Archivo2
				linea=sca2.nextLine();
			}
			llenarArchivo(Archivo3, linea);
		}
	}

	private static void llenarArchivo(File Archivo3, String linea) {
		try {//Escribir en el archivo
			FileWriter file=new FileWriter(Archivo3, true);
			file.write(linea+"\n");
			file.close();
		}catch(Exception e) {
			System.out.println(ERROR_ESCRITURA);
		}
	}
}