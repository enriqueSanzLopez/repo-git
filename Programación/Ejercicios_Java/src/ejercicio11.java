import java.util.Scanner;
public class ejercicio11 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		double altura=1;
		double peso=0;
		double IMC=0;
		System.out.print("Ingresa la altura en centímetros: ");
		altura=teclado.nextDouble();
		System.out.print("\nIngresa tu peso en gramos: ");
		peso=teclado.nextDouble();
		peso=peso/1000;
		altura=altura/100;
		altura=Math.pow(altura, 2);
		IMC=Math.round(100.0*peso/altura)/100.0;
		System.out.println("\nEl IMC calculado es "+IMC);
	}
}
