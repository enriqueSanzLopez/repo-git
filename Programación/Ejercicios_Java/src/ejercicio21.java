import java.util.*;
public class ejercicio21 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		String Nombre;
		String DNI;
		String Domicilio;
		double Ca1;
		double Ca2;
		double Ca3;
		double Ca4;
		double Ca5;
		String Co1;
		String Co2;
		String Co3;
		String Co4;
		String Co5;
		double P1;
		double P2;
		double P3;
		double P4;
		double P5;
		double Descuento;
		System.out.print("Ingresa el nombre: ");
		Nombre=teclado.nextLine();
		System.out.print("\nIngresa el N.I.F.: ");
		DNI=teclado.nextLine();
		System.out.print("\nIngresa el domicilio: ");
		Domicilio=teclado.nextLine();
		System.out.print("\nIngresa el primer concepto: ");
		Co1=teclado.nextLine();
		System.out.print("\nIngresa la cantidad: ");
		Ca1=teclado.nextDouble();
		System.out.print("\nIngresa el precio: ");
		P1=teclado.nextDouble();
		teclado.nextLine();
		System.out.print("\nIngresa el segundo concepto: ");
		Co2=teclado.nextLine();
		System.out.print("\nIngresa la cantidad: ");
		Ca2=teclado.nextDouble();
		System.out.print("\nIngresa el precio: ");
		P2=teclado.nextDouble();
		teclado.nextLine();
		System.out.print("\nIngresa el tercer concepto: ");
		Co3=teclado.nextLine();
		System.out.print("\nIngresa la cantidad: ");
		Ca3=teclado.nextDouble();
		System.out.print("\nIngresa el precio: ");
		P3=teclado.nextDouble();
		teclado.nextLine();
		System.out.print("\nIngresa el cuarto concepto: ");
		Co4=teclado.nextLine();
		System.out.print("\nIngresa la cantidad: ");
		Ca4=teclado.nextDouble();
		System.out.print("\nIngresa el precio: ");
		P4=teclado.nextDouble();
		teclado.nextLine();
		System.out.print("\nIngresa el quinto concepto: ");
		Co5=teclado.nextLine();
		System.out.print("\nIngresa la cantidad: ");
		Ca5=teclado.nextDouble();
		System.out.print("\nIngresa el precio: ");
		P5=teclado.nextDouble();
		System.out.print("\nIngresa el procentaje de descuento: ");
		Descuento=teclado.nextDouble();
		System.out.printf("\nCliente: %s\t\t\tN.I.F.: %s\n"
				+ "Domicilio: %s\n"
				+ "Cantidad\tConcepto·Referencia\tPrecio\t\tImporte\n"
				+ "%.2f\t\t%s\t\t\t%.2f\t\t%.2f\n"
				+ "%.2f\t\t%s\t\t\t%.2f\t\t%.2f\n"
				+ "%.2f\t\t%s\t\t\t%.2f\t\t%.2f\n"
				+ "%.2f\t\t%s\t\t\t%.2f\t\t%.2f\n"
				+ "%.2f\t\t%s\t\t\t%.2f\t\t%.2f\n"
				+"\t\t\tTotal bruto\tDescuento\tTotal\n"
				+"\t\t\t%.2f\t\t%% %.2f\t\t%.2f",Nombre,DNI,Domicilio,Ca1,Co1,P1,(P1*Ca1),Ca2,Co2,P2,(P2*Ca2),Ca3,Co3,P3,(P3*Ca3),Ca4,Co4,P4,(P4*Ca4),Ca5,Co5,P5,(P5*Ca5),(P1*Ca1+P2*Ca2+P3*Ca3+P4*Ca4+P5*Ca5),Descuento,((100-Descuento)*(P1*Ca1+P2*Ca2+P3*Ca3+P4*Ca4+P5*Ca5)/100));
		teclado.close();
	}
}
