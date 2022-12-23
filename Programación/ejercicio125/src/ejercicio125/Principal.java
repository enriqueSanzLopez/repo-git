package ejercicio125;
import java.util.*;
import java.io.*;
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		ListaMultimedia ejemplo=new ListaMultimedia(10);
		for(int i=0;i<3;i++) {
			System.out.println("Indica título:");
			String titulo=sca.nextLine();
			System.out.println("Indica autor:");
			String autor=sca.nextLine();
			System.out.println("Indica formato:");
			String formato=sca.nextLine();
			System.out.println("Indica duración:");
			int duracion=sca.nextInt();
			sca.nextLine();
			System.out.println("Indica género:");
			String genero=sca.nextLine();
			Disco a=new Disco(titulo, autor, formato, duracion, genero);
			ejemplo.add(a);
		}
		System.out.println(ejemplo.size());
		System.out.println(ejemplo);
		Disco compara=new Disco("titulo", "autor", "formato", 1, "rock");
		int posicion=ejemplo.indexOf(compara);
		System.out.println(posicion);
		if(posicion!=-1) {
			Multimedia ultimo=ejemplo.get(posicion);
			System.out.println(ultimo);
		}
		sca.close();
	}
}