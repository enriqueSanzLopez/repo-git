package actividadevaluable1;
import java.util.Scanner;
public class eval11 {
	public static void main(String arg[]) {
		Scanner teclado=new Scanner(System.in);
		//n=Contraseña (2705), r=guardado de digitos de respuesta, i=intentos, condicion=condicion de contrasea correcta
		boolean condicion=false;
		int n1=2, n2=7, n3=0, n4=5, i=1, r1, r2, r3, r4;
		System.out.println("Bienvenido al ejercicio de la caja fuerte\n"
				+ "------------------------------------------");
		do {
			//Leer los digitos
			System.out.printf("Intento numero %d de 15:\n", i);
			System.out.println("Introduzca el digito numero 1:");
			r1=teclado.nextInt();
			System.out.println("Introduzca el digito numero 2:");
			r2=teclado.nextInt();
			System.out.println("Introduzca el digito numero 3:");
			r3=teclado.nextInt();
			System.out.println("Introduzca el digito numero 4:");
			r4=teclado.nextInt();
			i=i+1;
			//Comprobar si todos los digitos son correctos
			if(r1==n1&&r2==n2&&r3==n3&&r4==n4) {
				condicion=true;
				System.out.printf("Correcto!, la clave era %d%d%d%d\n",r1,r2,r3,r4);
			}else {
				System.out.printf("Lo siento, la clave %d%d%d%d no es correcta!\n",r1,r2,r3,r4);
			}
		}while(i<=15&&condicion==false);
		teclado.close();
	}
}
