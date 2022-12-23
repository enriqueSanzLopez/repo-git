import java.util.*;
public class ejercicio34 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int cargo=0, dias=0, estado=1;
		double sueldo=950, IRPF=20, dietas=0;
		do {
			System.out.print("1 - Programador junior\n"
					+ "2 - Prog. senior\n"
					+ "3 - Jefe de proyecto\n"
					+ "Introduzca el cargo del empleado (1 - 3): ");
			cargo=teclado.nextInt();
			switch(cargo) {
			case 1:
				break;
			case 2:
				sueldo=1200;
				break;
			case 3:
				sueldo=1600;
				break;
			default:
				System.out.println("Valor incorrecto, introduzca de nuevo el valor");
			}}while(cargo<=0||cargo>3);
		do {
			System.out.print("\n¿Cuántos días ha estado de viaje visitando clientes? ");
			dias=teclado.nextInt();
			dietas=30*dias;}while(dias<0&&dias>31);
		do {
			System.out.print("\nIntroduzca su estado civil (1 - Soltero, 2 - Casado): ");
			estado=teclado.nextInt();
			if(estado==1) {
				IRPF=25;
			}else if(estado<=0){
				System.out.println("Valor incorrecto, introduzca de nuevo el valor");
			}}while(estado<=0||estado>2);
		System.out.printf("-------------------------------------------------------\n"
				+ "- Sueldo base\t\t%.2f euros\n"
				+ "- Dietas ( %d viajes)\t%.2f euros\n"
				+ "-------------------------------------------------------\n"
				+ "- Sueldo bruto\t\t%.2f euros\n"
				+ "- Retención IRPF (%.0f%%)\t%.2f euros\n"
				+ "-------------------------------------------------------\n"
				+ "- Sueldo neto\t\t%.2f euros\n"
				+ "-------------------------------------------------------\n",sueldo,dias,dietas,(sueldo+dietas),IRPF,(IRPF*(sueldo+dietas)/100),((100-IRPF)*(sueldo+dietas)/100));
	}
}
