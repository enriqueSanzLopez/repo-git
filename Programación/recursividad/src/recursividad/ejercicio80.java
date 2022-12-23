package recursividad;
import java.util.Scanner;
public class ejercicio80 {
	public static void binario(int n) {
		if(n==0) {
			System.out.println("0");
		}else {
			String icadena="";
			int k;
			while(n!=1) {
				//Mientras el decimal es distinto de 1, obtener coeficientes
				k=n%2;
				n=n/2;
				icadena=icadena+Integer.toString(k);
			}
			//Poner el 1 final
			icadena=icadena+"1";
			//Separar los caracteres
			String[] cadena=icadena.split("");
			//Mostrar el resultado
			System.out.print("El resultado es: ");
			//Leer la cadena al reves
			for(int i=cadena.length-1;i>=0;i--) {
				System.out.print(cadena[i]);
			}
		}
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int decimal;
		System.out.println("Introduzca el número para pasar a binario:");
		decimal=sca.nextInt();
		binario(decimal);
		sca.close();
	}
}