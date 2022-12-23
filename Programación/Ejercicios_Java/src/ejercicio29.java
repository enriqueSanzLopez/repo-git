import java.util.*;
public class ejercicio29 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String frase;
		System.out.println("Introduzca una frase para pasarla a mayúsculas:");
		frase=teclado.nextLine();
		System.out.printf("Tu frase en minúsculas es:\t%s\n"
				+ "y en MAYÚSCULAS es:\t%S",frase,frase);
	}
}
