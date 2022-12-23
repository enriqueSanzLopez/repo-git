import java.util.*;
public class ejercicio60 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		Random r=new Random();
		int tamano;
		//Obtener el tamaño del array
		System.out.println("Indique el tamaño del array");
		tamano=sca.nextInt();
		int[] a=new int[tamano];
		int[] b=new int[tamano];
		//Llenar el array con números aleatorios y mostrarlo
		System.out.println("El array resultante es:");
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(r.nextDouble()*100+0);
			System.out.printf("%d ", a[i]);
		}
		System.out.print("\n");
		//Copiar el array creado
		b=Arrays.copyOfRange(a, 0, a.length);
		//Ordenar el array copiado
		Arrays.sort(b);
		//Comprobar si ya estaba ordenado
		if(Arrays.equals(a,b)) {
			//Está ordenado
			System.out.println("El array está ordenado");
		}else {
			//No está ordenado
			System.out.println("El array no está ordenado");
		}
		sca.close();
	}
}
