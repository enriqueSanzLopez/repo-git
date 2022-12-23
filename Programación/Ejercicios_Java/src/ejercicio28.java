import java.util.*;
public class ejercicio28 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		double radio=0, longitud=0, area=0, volumen=0;
		System.out.println("Bienvenido al programa donde todo sale redondo!\n"
				+ "--------------------------------------------------------\n"
				+ "Introduzca el valor del radio:");
		radio=teclado.nextDouble();
		area=Math.PI*Math.pow(radio,2);
		longitud=2*radio*Math.PI;
		volumen=Math.PI*Math.pow(radio,3)*4/3;
		System.out.printf("La longitud de la circunferencia es: %.3f\n"
				+ "El area de la circunferencia es: %.3f\n"
				+ "Si fuera una esfera, su volumen seria: %.3f",longitud,area,volumen);
	}
}
