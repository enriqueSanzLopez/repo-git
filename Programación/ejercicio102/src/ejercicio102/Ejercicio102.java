package ejercicio102;
import java.io.*;
public class Ejercicio102 {
	private static final String ERROR_CREACION = "ERROR! El archivo no ha podido ser creado!";
	private static final String ARCHIVO_EXISTENTE = "El archivo ya existía";
	private static final String CREACION_EXITOSA = "El archivo ha sido creado exitosamente";
	private static final String ERROR_ESCRITURA = "ERROR! no se ha podido escribir en el documento el número ";

	public static void main(String[] args) {
		File Archivo1=new File("salida1.txt");//Crear los archivos de salida
		File Archivo2=new File("salida2.txt");
		crearArchivo(Archivo1);
		crearArchivo(Archivo2);
		llenarArchivos(Archivo1, Archivo2);//Llenar los archivos de salida
	}

	private static void llenarArchivos(File Archivo1, File Archivo2) {
		for(int i=0;i<50;i++) {
			if(i%2==0) {//Es par
				escribirArchivo(Archivo1, i);
			}else {//Es impar
				escribirArchivo(Archivo2, i);	
			}
		}
	}

	private static void escribirArchivo(File Archivo1, int i) {
		try {//Escribir en el archivo
			FileWriter file=new FileWriter(Archivo1, true);
			file.write(i+"\n");
			file.close();
		}catch(Exception e) {
			System.out.println(ERROR_ESCRITURA+i);
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
}