package recursividad;
import java.util.*;
public class ejercicio73 {
	public static boolean existe(String frase) {
		//True existe, false no existe
		boolean a=true;
		int b;
		//Comprobar si esta la frase el area 51
		b=frase.indexOf("el area 51");
		if(b==-1) {
			//No esta el area 51
			a=false;
		}
		return a;
	}
	public static void sustituir(String frase) {
		//Sustituye la frase el area 51 por Murcia
		if(frase.equals("el area 51")) {
			System.out.println("Murcia");
		}else{
			String cifrado=frase;
			String finale=frase.substring(frase.length()-11);
			if(finale.equals("el area 51")) {
				String[] CIFRADO=cifrado.split("el area 51");
				cifrado="";
				for(int i=0;i<CIFRADO.length;i++) {
					if(i!=CIFRADO.length-1) {
						//No es la ultima cadena
						cifrado=cifrado+CIFRADO[i]+"Murcia";
					}else {
						//Es la ultima cadena
						cifrado=cifrado+CIFRADO[i]+"Murcia";
					}
				}
			}else {
				String[] CIFRADO=cifrado.split("el area 51");
				cifrado="";
				for(int i=0;i<CIFRADO.length;i++) {
					if(i!=CIFRADO.length-1) {
						//No es la ultima cadena
						cifrado=cifrado+CIFRADO[i]+"Murcia";
					}else {
						//Es la ultima cadena
						cifrado=cifrado+CIFRADO[i];
					}
				}
				System.out.println(cifrado);
			}
		}
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		String frase;
		boolean area;
		System.out.println("Introduzca la transmisión a cifrar:");
		frase=sca.nextLine();
		area=existe(frase);
		if(area==true) {
			//Existe el area 51
			sustituir(frase);
		}else {
			System.out.println("el area 51 no aparece en la transmisión");
		}
		sca.close();
	}
}