package ejerciciosdocumentados;
import java.util.*;
public class Cifrado2 {
	private static final int LONGITUD_DE_LA_EXPRESION = 10;
	private static final String MODIFICADOR_DEL_TEXTO = "Murcia";
	private static final String TEXTO_A_MODIFICAR = "el area 51";

	/**
	 * Esta clase convierte un texto solicitado al usuario por consola
	 * y finalizado con un salto de línea y sustituyendo todas las
	 * apariciones de la expresión "el area 51" por "Murcia" y si no se
	 * encuentra la expresión devuelve el texto
	 * "el area 51 no aparece en la transmisión"
	 * @param args No se va a utilizar porque se solicita el texto por consola
	 * @author enrlop
	 * @version 1.3
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String parte1="";
		String parte2="";
		int pos;//Guarda la posición del carácter en el que empieza la expresión "el area 51"
		System.out.println("Introduzca la transmisión a cifrar:");
		String transmision_original = s.nextLine();
		if (transmision_original.indexOf(TEXTO_A_MODIFICAR) == -1) {
			System.out.println(TEXTO_A_MODIFICAR+" no aparece en la transmisión");
		}else {
			while (transmision_original.indexOf(TEXTO_A_MODIFICAR) != -1) {//Comprobar si la expresion "el area 51" está en alguna parte de la expresión, si da -1, es que no encuentra la expresión
				pos = transmision_original.indexOf(TEXTO_A_MODIFICAR);
				parte1 = "";
				parte2 = "";
				parte1 = transmision_original.substring(0, pos);
				parte2 = transmision_original.substring(pos+LONGITUD_DE_LA_EXPRESION);//10 son los carácteres de "el area 51"
				transmision_original = parte1 + MODIFICADOR_DEL_TEXTO + parte2;
			}
			System.out.println(transmision_original);
		}
	}//La clase finaliza mostrando un mensaje por pantalla
}