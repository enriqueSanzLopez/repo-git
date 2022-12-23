import java.util.*;
public class ejercicio67 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int filas, columnas, inferior, superior, numero, contador;
		String opcion="";
		Random r=new Random();
		//1- Leer el numero de filas
		do {
			System.out.println("Introduzca las filas de la matriz:");
			filas=sca.nextInt();
			if(filas<=0) {
				System.out.println("ERROR: El número de filas de la matriz tiene que ser un número entero mayor que 0");
			}
		}while(filas<=0);
		//2- Leer el numero de columnas
		do {
			System.out.println("Introduzca las columnas de la matriz:");
			columnas=sca.nextInt();
			if(columnas<=0) {
				System.out.println("ERROR: El número de columnas de la matriz tiene que ser un número entero mayor que 0");
			}
		}while(columnas<=0);
		//3- Leer el rango inferior de los numeros aleatorios
		System.out.println("Introduzca el número inferior del rango:");
		inferior=sca.nextInt();
		//4- Leer el rango superior de los numeros aleatorios
		System.out.println("Introduzca el número superior del rango:");
		superior=sca.nextInt();
		//5- Crear la matriz y llenarla
		int[][] a=new int[filas][columnas];
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				a[i][j]=(int)(r.nextDouble()*(superior-inferior+1)+inferior);
			}
		}
		//Mostrar la matriz por pantalla
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.print(a[i][j]);
				if(j<(columnas-1)) {
					System.out.print(", ");
				}
			}
			System.out.print("\n");
		}
		//Vaciar el Buffer
		sca.nextLine();
		//6- Crear el bucle de lectura de la matriz
		//Matriz para guardar las direcciones de numeros repetidos
		int[][] direcciones=new int[filas*columnas][2];
		do {
			contador=0;
			System.out.println("Introduce un número o salir:");
			opcion=sca.nextLine();
			if(opcion.equals("salir")) {
				//El usuario quiere salir
				System.out.println("Gracias por utilizar el programa de la matriz");
				break;
			}else {
				//El usuario quiere comprobar un numero
				numero=Integer.valueOf(opcion);
				if(numero<inferior||numero>superior) {
					//Es imposible que el valor se encuentre en la matriz
					System.out.printf("El valor %d está fuera del rango [%d,%d]\n",numero,inferior,superior);
				}else {
					//El valor puede estar en la matriz
					//Recorrer array
					for(int i=0;i<filas;i++) {
						for(int j=0;j<columnas;j++) {
							if(numero==a[i][j]) {
								//Aumentar el contador, guardar la direccion
								direcciones[contador][0]=i;
								direcciones[contador][1]=j;
								contador=contador+1;
							}
						}
					}
					//Si no aparece el numero en la matriz
					if(contador==0) {
						System.out.printf("El valor %d no se encuentra en la matriz\n",numero);
					}else {
						//Aparece el numero en la matriz
						System.out.printf("El valor %d está en la matriz y aparece %d veces:\n",numero,contador);
						for(int i=0;i<contador;i++) {
							//Mostrar las direcciones
							System.out.printf("Lo encuentro en la posición [%d,%d].\n",direcciones[i][0],direcciones[i][1]);
						}
					}
				}
			}
		}while(!opcion.equals("salir"));
		sca.close();
	}
}
