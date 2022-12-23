package recursividad;
import java.util.Scanner;
public class ejercicio75 {
	public static String digito(char dig) {
		int numero=Character.getNumericValue(dig);
		String digito="";
		switch(numero) {
		case 0:
			digito="cero";
			break;
		case 1:
			digito="uno";
			break;
		case 2:
			digito="dos";
			break;
		case 3:
			digito="tres";
			break;
		case 4:
			digito="cuatro";
			break;
		case 5:
			digito="cinco";
			break;
		case 6:
			digito="seis";
			break;
		case 7:
			digito="siete";
			break;
		case 8:
			digito="ocho";
			break;
		case 9:
			digito="nueve";
			break;
		default:
			digito="ERROR";
			break;
		}
		return digito;
	}
	public static String convierteEnPalabras(int n) {
		//Numero de digitos del numero
		char dig;
		int longitud=Integer.toString(n).length();
		String numero=Integer.toString(n);
		String frase="";
		for(int i=0;i<longitud;i++) {
			dig=numero.charAt(i);
			if(i<longitud-1) {
				//No es la ultima iteracion
				frase=frase+digito(dig)+", ";
			}else {
				//Es la ultima iteracion
				frase=frase+digito(dig);
			}
		}
		return frase;
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		System.out.println("Introduce un número:");
		int x=sca.nextInt();
		sca.close();
		String frase=convierteEnPalabras(x);
		System.out.println(frase);
	}
}