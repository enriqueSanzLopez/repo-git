import java.util.*;
public class ejercicio36c {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		double nota1=0, nota2=0, recu=0, media=0;
		do {
			System.out.print("Nota del primer control: ");
			nota1=teclado.nextDouble();
			if(nota1<0) {
				System.out.println("\nNota incorrecta, por favor vuelva a imprimirla");
			}
		}while(nota1<0);
		do {
			System.out.print("\nNota del segundo control: ");
			nota2=teclado.nextDouble();
			if(nota2<0) {
				System.out.println("\nNota incorrecta, por favor vuelva a imprimirla");
			}
		}while(nota2<0);
		media=(nota1+nota2)/2;
		if(media>=5) {
			System.out.println("\n¿Cual ha sido el resultado de la recuperación? (apto/no apto): apto");
			System.out.printf("Tu nota de Programación es %.2f",media);
		}else {do{
			System.out.print("Nota de la recuperación: ");
			recu=teclado.nextDouble();
			if(recu<0) {
				System.out.println("\nNota incorrecta, por favor vuelva a imprimirla");
			}
		}while(recu<0);
		if(recu>=5) {
			System.out.printf("\nNota del primer control: %.1f\n"
					+ "Nota del segundo control: %.1f\n"
					+ "¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto\n"
					+ "Tu nota de Programación es 5",nota1,nota2);
		}else{
			System.out.printf("\nNota del primer control: %.1f\n"
				+ "Nota del segundo control: %.1f\n"
				+ "¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto\n"
				+ "Tu nota de Programación es %.1f",nota1,nota2,media);}
		}
		teclado.close();
	}
}
