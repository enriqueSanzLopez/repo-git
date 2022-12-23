import java.util.*;
public class ejercicio59 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		//Tamaño del array, opcion del menu, y posición en el array
		int tamaño, menu=0, posicion;
		System.out.println("Indique el tamaño del array:");
		tamaño=sca.nextInt();
		//Declarar el array
		int[] a=new int[tamaño];
		//Declarar aleatorio
		Random r=new Random();
		do {
			//Mostrar el menú
			System.out.println("-------------Pulse una opción del menú-------------\n"
					+ "1-Rellenar el vector por teclado\n"
					+ "2-Rellenar el vector de forma aleatoria (nums de 1 a 100)\n"
					+ "3-Modificar una posición del vector\n"
					+ "4-Consultar una posición del vector\n"
					+ "5-Mostrar todo el vector\n"
					+ "6-Ordenar ascendentemente el vector\n"
					+ "9-Salir\n"
					+ "----------------------------------------------------------");
			menu=sca.nextInt();
			//Entrar en el menú real
			switch(menu) {
			//1-Rellenar el vector por teclado
			case 1:
				System.out.println("Indique los valores del array:");
				for(int i=0;i<a.length;i++) {
					a[i]=sca.nextInt();
				}
				break;
				//2-Rellenar el vector de forma aleatoria (nums de 1 a 100)
			case 2:
				for(int i=0;i<a.length;i++) {
					a[i]=(int)(r.nextDouble()*100+1);
				}
				break;
				//3-Modificar una posición del vector
			case 3:
				//Obtener posicion
				System.out.println("Indica la posición a modificar");
				posicion=sca.nextInt();
				//Modificar el valor de la posicion del array
				System.out.println("Indica el nuevo valor");
				a[posicion]=sca.nextInt();
				break;
				//4-Consultar una posición del vector
			case 4:
				//Obtener posicion
				System.out.println("Indica la posición a consultar");
				posicion=sca.nextInt();
				//Mostrar el valor de la posicion
				System.out.printf("El valor en la posicion %d es %d\n", posicion, a[posicion]);
				break;
				//5-Mostrar todo el vector
			case 5:
				System.out.println("Los valores del array son:");
				for(int i=0;i<a.length;i++) {
					System.out.printf("%d ",a[i]);
				}
				System.out.print("\n");
				break;
				//6-Ordenar ascendentemente el vector
			case 6:
				//Organizar el array
				Arrays.sort(a);
				break;
				//9-Salir
			case 9:
				break;
				//Todo lo demás
			default:
				System.out.println("ERROR: Esa opción no existe en el menú\n"
						+ "Seleccione otra");
				break;
			}
		}while(menu!=9);
		System.out.print("Gracias por usar este menú");
		sca.close();
	}
}
