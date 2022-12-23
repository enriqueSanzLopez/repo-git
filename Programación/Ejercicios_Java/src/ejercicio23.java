import java.util.*;
public class ejercicio23 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String Fecha, DNI, Nombre, Direccion;
		double Salario, Retencion;
		System.out.println("Introduzca fecha de nacimiento en formato AAAA MM DD:");
		Fecha=teclado.nextLine();
		System.out.println("Introduzca NIF:");
		DNI=teclado.nextLine();
		System.out.println("Introduzca nombre:");
		Nombre=teclado.nextLine();
		System.out.println("Introduzca dirección:");
		Direccion=teclado.nextLine();
		System.out.println("Introduzca salario:");
		Salario=teclado.nextDouble();
		System.out.println("Introduzca retención:");
		Retencion=teclado.nextDouble();
		System.out.printf("INFORME DEL TRABAJADOR\n"
				+ "-------------------------------------------------------------------------"
				+ "\nNombre.............................:\t%s\n"
				+ "Dirección..........................:\t%s\n\n"
				+ "NIF................................:\t%s\n"
				+ "Fecha de nacimiento................:\t%s\n\n"
				+ "Salario bruto......................:\t%.2f\n"
				+ "Retencion..........................:\t%.0f\n"
				+ "Salario neto.......................:\t%.2f\n"
				+ "--------------------------------------------------------------------------",Nombre,Direccion,DNI,Fecha,Salario,Retencion,((100-Retencion)*Salario/100));
	}
}
