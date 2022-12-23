package recursividad;
import java.util.Scanner;
public class ejercicio78 {
	public static void pinta(int n) {
		//Printea errores del ahorcado en funcion de n
		switch(n) {
		case 1:
			System.out.println("Error 1 de 8: Te pinto la horca");
			break;
		case 2:
			System.out.println("Error 2 de 8: Te pinto la cabeza");
			break;
		case 3:
			System.out.println("Error 3 de 8: Te pinto el cuerpo");
			break;
		case 4:
			System.out.println("Error 4 de 8: Te pinto el brazo izquierdo");
			break;
		case 5:
			System.out.println("Error 5 de 8: Te pinto el brazo derecho");
			break;
		case 6:
			System.out.println("Error 6 de 8: Te pinto la pierna izquierda");
			break;
		case 7:
			System.out.println("Error 7 de 8: Te pinto la pierna derecha");
			break;
		case 8:
			System.out.println("Error 8 de 8: AHORCADO!");
			break;
		default:
			System.out.println("Error en la función");
			break;
		}
	}
	public static int[] coincidencias(String palabra, char letra) {
		int[] posiciones=new int[palabra.length()];
		//Llenar de -1 la matriz
		for(int i=0;i<palabra.length();i++) {
			posiciones[i]=-1;
		}
		int acumulador=0;
		for(int i=0;i<palabra.length();i++) {
			//Si la letra de la palabra y la seleccionada son la misma, guarda la posicion
			if(palabra.charAt(i)==letra) {
				posiciones[acumulador]=i;
				acumulador=acumulador+1;
			}
		}
		return posiciones;
	}
	public static char[] llenarincognita(int n) {
		char[] incognita=new char[n];
		for(int i=0;i<n;i++) {
			incognita[i]='*';
		}
		return incognita;
	}
	public static char[] sustituye(String palabra, char[] incognita, int[] posiciones) {
		//Sustituir * por la letra
		for(int i=0;i<palabra.length();i++) {
			if(posiciones[i]!=-1) {
				incognita[posiciones[i]]=palabra.charAt(posiciones[i]);
			}else {
				break;
			}
		}
		return incognita;
	}
	public static int llenado(int[] posiciones) {
		int l=0;
		for(int i=0;i<posiciones.length;i++) {
			if(posiciones[i]!=-1) {
				l=l+1;
			}else {
				break;
			}
		}
		return l;
	}
	public static int buscar(char[] incognita) {
		int posicion=-1;
		for(int i=0;i<incognita.length;i++) {
			if(incognita[i]=='*') {
				posicion=i;
				break;
			}
		}
		return posicion;
	}
	public static void mostrar(char[] incognita) {
		for(int i=0;i<incognita.length;i++) {
			System.out.printf("%s",incognita[i]);
		}
		System.out.println();
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		String palabra;
		char letra;
		int errores=0, a, posicion=0;
		//Obtener la palabra secreta
		System.out.println("JUGADOR1: Introduzca palabra para adivinar:");
		palabra=sca.nextLine();
		//Llenar de * incognita
		char[] incognita=llenarincognita(palabra.length());
		//Iniciar adivinanza
		System.out.println("JUGADOR2: La palabra para adivinar es la siguiente: ");
		mostrar(incognita);
		//Bucle para llenar la palabra y contabilizar errores
		while(errores<8&&posicion!=-1) {
			//Leer el caracter del JUGADOR2
			System.out.println("Introduzca letra:");
			letra=sca.next().charAt(0);
			//Conseguir las posiciones en las que la letra aparece
			int[] posiciones=coincidencias(palabra,letra);
			if(posiciones[0]==-1) {
				//La letra no esta en la palabra
				errores=errores+1;
				System.out.println("La letra "+letra+" no se encuentra en la palabra");
				pinta(errores);
			}else {
				//La letra esta en la palabra
				a=llenado(posiciones);
				System.out.println("La letra "+letra+" estaba "+a+" veces.");
				//Llena la incognita con las palabras
				incognita=sustituye(palabra, incognita, posiciones);
				//Mostrar incognita
				mostrar(incognita);
				System.out.println("");
			}
			//Buscar la posicion de *
			posicion=buscar(incognita);
			if(posicion==-1) {
				System.out.println("Palabra adivinada! Gracias por jugar al ahorcado!");
			}
		}
		sca.close();
	}
}