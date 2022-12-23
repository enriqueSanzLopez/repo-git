package ejercicio109;
import java.util.*;
import java.io.*;
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File XML=new File("ejer121.txt");//Crear el objeto archivo a leer
		int contador=0;
		double suma=0;
		try {
			Scanner sca=new Scanner(XML);
			for(int i=0;i<5;i++) {//Leer el encabezado del fichero
				sca.nextLine();
			}
			while(sca.hasNext()) {//Leer todo el fichero XML
				String linea=sca.nextLine();//Leer la etiqueta <LIBRO>, </LIBRO>, o </BIBLIOTECA>
				if(!linea.equals("</BIBLIOTECA>")) {//No es el final del documento
					String lineat=sca.nextLine();//Leer la etiqueta <TITULO>
					String[] partet1=lineat.split("<TITULO>");
					String[] partet2=partet1[1].split("</TITULO>");
					String titulo=partet2[0]+".txt";//Título del fichero
					String lineaa=sca.nextLine();//Leer la etiqueta <AUTOR>
					String[] partea1=lineaa.split("<AUTOR>");
					String[] partea2=partea1[1].split("</AUTOR>");
					String autor="Autor: "+partea2[0]+"\n";
					String lineae=sca.nextLine();//Leer la etiqueta <EDITORIAL>
					String[] partee1=lineae.split("<EDITORIAL>");
					String[] partee2=partee1[1].split("</EDITORIAL>");
					String editorial="Editorial: "+partee2[0]+"\n";
					String lineac=sca.nextLine();//Leer la etiqueta <CATEGORIA>
					String[] partec1=lineac.split("<CATEGORIA>");
					String[] partec2=partec1[1].split("</CATEGORIA>");
					String categoria="Categoria: "+partec2[0]+"\n";
					String lineai=sca.nextLine();//Leer la etiqueta <ISBN>
					String[] partei1=lineai.split("<ISBN>");
					String[] partei2=partei1[1].split("</ISBN>");
					String isbn="ISBN: "+partei2[0]+"\n";
					String linean=sca.nextLine();//Leer la etiqueta <NOTA>
					String[] parten1=linean.split("\"");
					String nota="NOTA: "+parten1[1]+"\n";
					String lineaco=sca.nextLine();//Leer la etiqueta <COMENTARIOS>
					String[] parteco1=lineaco.split("<COMENTARIOS>");
					String[] parteco2=parteco1[1].split("</COMENTARIOS>");
					String comentarios="COMENTARIOS: "+parteco2[0]+"\n";
					sca.nextLine();//Leer </LIBRO>
					suma=suma+Integer.parseInt(parten1[1]);//Sumar nota al total de notas
					contador=contador+1;//Aumentar el conteo de libros
					File Archivo=new File(titulo);//Crear el archivo del libro
					crearArchivo(titulo, Archivo);
					escribirArchivo(autor, editorial, categoria, isbn, nota, comentarios, Archivo);
				}else {//Es el final del documento
					break;
				}
			}
			sca.close();
			suma=suma/contador;
			System.out.printf("Se han procesado %d libros y la nota media es: %.2f\n",contador,suma);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void crearArchivo(String titulo, File Archivo) {
		try {
			if(Archivo.createNewFile()) {
				System.out.println("El archivo "+titulo+" ha sido creado");
			}else {
				System.out.println("El archivo "+titulo+" ya existía");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void escribirArchivo(String autor, String editorial, String categoria, String isbn, String nota,
			String comentarios, File Archivo) {
		try {//Escribir el fichero
			FileWriter file=new FileWriter(Archivo,true);
			file.write("---------------------\n");
			file.write(autor);
			file.write(editorial);
			file.write(categoria);
			file.write(isbn);
			file.write(nota);
			file.write(comentarios);
			file.write("---------------------\n");
			file.close();//Cerrar el fichero
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}