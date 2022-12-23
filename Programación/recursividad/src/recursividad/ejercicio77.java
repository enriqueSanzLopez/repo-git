package recursividad;
import java.util.Scanner;
public class ejercicio77 {
	public static String convierteEnPalotes(int n) {
		String palos="";
		for(int i=0;i<n;i++) {
			palos=palos+"|";
		}
		return palos;
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int n, o;
		String palos="";
		//Obtener el numero
		System.out.println("Introduzca un número:");
		n=sca.nextInt();
		//Convertirlo a String
		String numero=Integer.toString(n);
		for(int i=0;i<numero.length();i++) {
			o=Character.getNumericValue(numero.charAt(i));
			palos=palos+convierteEnPalotes(o);
			if(i<numero.length()-1) {
				//No es la ultima
				palos=palos+"-";
			}
		}
		System.out.printf("%s",palos);
		sca.close();
	}
}