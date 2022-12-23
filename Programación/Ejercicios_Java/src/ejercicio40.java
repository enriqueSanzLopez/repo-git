import java.util.*;
public class ejercicio40 {
	public static void main(String arg[]) {
		Scanner teclado=new Scanner(System.in);
		int altura=0, i, j;
		do {
			System.out.print("Por favor, introduzca la altura de la X: ");
			altura=teclado.nextInt();
			if(altura%2==0||altura<3) {
				System.out.println("\nDato incorrecto, el valor tiene que ser impar e igual o superior a 3");
			}
		}while(altura%2==0||altura<3);
		for(i=0;i<altura;i++) {
			for(j=0;j<altura;j++) {
				if(i==j||(i+j)==(altura-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		teclado.close();
	}
}
