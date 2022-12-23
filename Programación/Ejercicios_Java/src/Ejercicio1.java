
import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String args[]){
		int año=0;
		System.out.println("Indica año: ");
		//Lectura de año
		Scanner teclado= new Scanner(System.in);
		año=teclado.nextInt();
		System.out.println("Buenas noches. En estos días tan especiales a finales del año "+año+" en los que siempre nos deben unir\nlos mejores sentimientos os deseo, junto a la Reina y nuestras hijas, una Feliz Navidad y que en el\npróximo año "+(año+1)+" podáis ver cumplidos vuestros anhelos y aspiraciones.");
	}

}
