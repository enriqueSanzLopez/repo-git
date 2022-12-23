import java.util.*;
public class ejercicio35 {
	public static void main(String arg[]) {
		Scanner teclado=new Scanner(System.in);
		double altura=0, anchura=0, precio=0;
		String escudo="n";
		do {
			System.out.print("Introduzca la altura de la bandera en cm: ");
			altura=teclado.nextDouble();
			if(altura<=0) {
				System.out.println("\nDato incorrecto");
			}
		}while(altura<=0);
		do {
			System.out.print("\nIntroduzca la anchura: ");
			anchura=teclado.nextDouble();
			if(anchura<=0) {
				System.out.println("\nDato incorrecto");
			}
		}while(anchura<=0);
		precio=(anchura*altura)/100;
		precio=precio+3.25;
		teclado.nextLine();
		do {
			System.out.print("\n¿Quiere escudo bordado? (s/n): ");
			escudo=teclado.nextLine();
			if(escudo!="s"||escudo!="n") {
				System.out.println("\nDato incorrecto");
			}
		}while(!escudo.equals("s") && !escudo.equals("n"));
		if(escudo=="s") {
			precio=precio+2.5;
			System.out.printf("\nGracias. Aquí tiene el desglose de su compra.\n"
					+ "Bandera de\t %.0f cm2:\t%.2f €\n"
					+ "Con escudo:\t\t2.50 €\n"
					+ "Gastos de envío:\t3.25 €\n"
					+ "Total:\t\t%.2f €",(anchura*altura),((anchura*altura)/100),precio);
		}else {System.out.printf("\nGracias. Aquí tiene el desglose de su compra.\n"
				+ "Bandera de\t %.0f cm2:\t%.2f €\n"
				+ "Sin escudo:\t\t\t0.00 €\n"
				+ "Gastos de envío:\t\t3.25 €\n"
				+ "Total:\t\t\t\t%.2f €",(anchura*altura),((anchura*altura)/100),precio);}
	}

}
