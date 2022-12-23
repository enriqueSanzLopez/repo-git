import java.util.Scanner;
public class ejercicio10 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int N_Niños=0;
		int N_Niñas=0;
		double P1=0;
		System.out.print("Ingresa el número de niños: ");
		N_Niños=teclado.nextInt();
		System.out.print("\nIngresa el número de niñas: ");
		N_Niñas=teclado.nextInt();
		P1=(Math.round((double)(10000*N_Niños/(N_Niños+N_Niñas))))/100.0;
		System.out.println("Tenemos matriculados "+N_Niños+" niños y "+N_Niñas+" niñas. En total, tenemos matriculados\n"
				+(N_Niños+N_Niñas)+" alumnos, siendo un "+P1+"% perteneciente a los niños y "+(100-P1)+"%\nperteneciente a las niñas.");
		}
}
