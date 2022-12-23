import java.util.*;
public class ejercicio30 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		double nota1=0, nota2=0, notaf=0;
		System.out.print("Introduce la nota del primer examen: ");
		nota1=teclado.nextDouble();
		System.out.print("\n¿Que nota quieres sacar en el trimestre? ");
		notaf=teclado.nextDouble();
		nota2=(notaf-0.4*nota1)/0.6;
		System.out.printf("\nPara tener un %.1f en el trimestre necesitas sacar un %.2f en el segundo examen.",notaf,nota2);
	}
}
