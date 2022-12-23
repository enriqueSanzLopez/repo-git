import java.util.*;
public class ejercicio39 {
	public static void main(String arg[]) {
		Scanner teclado=new Scanner(System.in);
		double salario=0, Phora=0;
		int horas=0;
		do {
			System.out.print("Indique las horas trabajadas a la semana: ");
			horas=teclado.nextInt();
			if(horas<0) {
				System.out.print("\nDato incorrecto\n");
			}
		}while(horas<0);
		do {
			System.out.print("\nIndique el salario por hora: ");
			Phora=teclado.nextInt();
			if(Phora<0) {
				System.out.print("\nDato incorrecto\n");
			}
		}while(Phora<0);
		if(horas>40) {
			salario=40*Phora+1.5*(horas-40)*Phora;
		}else {
			salario=horas*Phora;
		}
		System.out.printf("\nSu salario es %.2f",salario);
		teclado.close();
	}
}
