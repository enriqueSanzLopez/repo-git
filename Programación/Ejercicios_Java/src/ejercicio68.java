import java.util.*;
public class ejercicio68 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		Random r=new Random();
		int numero, posible, i=0;
		//Calcular el numero
		numero=(int)(r.nextDouble()*100+1);
		do {
			//Leer el numero
			System.out.println("Introduzca el número:");
			posible=sca.nextInt();
			//Acumular intentos
			i=i+1;
			if(posible==numero) {
				//Lo has encontrado
				System.out.printf("Enhorabuena! has acertado el número que era el %d!\n"
						+ "Lo has solucionado en %d intentos!\n",numero,i);
			}else if(posible<numero) {
				//El numero que buscas es superior
				System.out.println("El número mágico es mayor!");
			}else if(posible>numero) {
				//El numero que buscas es inferior
				System.out.println("El número mágico es menor!");
			}
		}while(numero!=posible);
		sca.close();
	}
}
