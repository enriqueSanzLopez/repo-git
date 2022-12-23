import java.util.*;
public class ejerciciofantasma1 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int tamano;
		boolean repetido=false;
		//Leer tamaño del array
		System.out.println("Introduce el tamaño del array:");
		tamano=sca.nextInt();
		int[] a=new int[tamano];
		//Introducir el primer numero
		System.out.println("Introduce el término 1:");
		a[0]=sca.nextInt();
		for(int i=1;i<a.length;i++) {
			System.out.printf("Introduce el término %d:\n",(i+1));
			a[i]=sca.nextInt();
			//Comprobar si se repite en algún lugar
			for(int j=0;j<i;j++) {
				if(a[j]==a[i]) {
					//a[i] está repetido
					repetido=true;
				}
				if(repetido==true) {
					//Indicar que el número está repetido y bajar el índice para compensar la subida del bucle
					repetido=false;
					i=i-1;
					System.out.println("Ese número ya está repetido, por favor introduzca otro número");
				}
			}
		}
		System.out.println("El array resultante es este:");
		for(int i=0;i<a.length;i++) {
			//Imprimir el array
			if(i==a.length-1) {
				//Es el último término del array
				System.out.printf("%d",a[i]);
			}else {
				//Es cualquier otro término del array
				System.out.printf("%d, ",a[i]);
			}
		}
		sca.close();
	}
}
