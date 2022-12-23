package recursividad;
import java.util.Scanner;
public class ejercicio79 {
	public static int explosion(int n) {
		int boom=0;
		if(n>0) {
			boom=n-1;
			System.out.println(boom);
			//Parar el programa 1 seg
			try {
				Thread.sleep(1000);//Tiempo de espera en mseg
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			//Retorno recursivo
			return boom+explosion(boom);
		}else {
			return boom;
		}
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int n=-1, boom;
		do {
			System.out.println("Introduzca el número a partir del cual haremos la cuenta atrás...");
			n=sca.nextInt();
			if(n<=0) {
				System.out.println("ERROR! el número tiene que ser superior a 0");
			}
		}while(n<=0);
		//Llamar a la cuenta regresiva recursiva
		System.out.println(n);
		try {
			Thread.sleep(1000);//Tiempo de espera en mseg
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		boom=explosion(n);
		System.out.println("BOOM!");
		sca.close();
	}
}