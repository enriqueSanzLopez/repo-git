package actividadevaluabletrimestre2_2;
import java.util.*;
public class eval02 {
	public static String leer_nombre() {
		Scanner sca=new Scanner(System.in);
		String nombre="";
		int contador;
		do {
			contador=0;
			nombre=sca.nextLine();
			//Dividir el nombre en caracteres
			String[] letras=nombre.split("");
			//Comprobar que haya al menos 3 consonantes seguidas
			for(int i=0;i<nombre.length();i++) {
				if(!letras[i].equals("a")&&!letras[i].equals("e")&&!letras[i].equals("i")&&!letras[i].equals("o")&&!letras[i].equals("u")) {
					contador=contador+1;
				}else {
					contador=0;
				}
				if(contador==3) {
					break;
				}
			}
			if(contador<3) {
				System.out.println("ERROR!: Nombre incorrecto!, Introduzca el nombre de nuevo:");
			}
		}while(contador<3);
		return nombre;
	}
	public static int pintar_menu() {
		Scanner sca=new Scanner(System.in);
		int opcion=-1;
		boolean correcto=false;
		//Bucle validador de opcion
		do {
			System.out.println("------------------\n"
					+ "1-Colocar libro\n"
					+ "2-Quitar libro\n"
					+ "3-Pintar estanteria\n"
					+ "4-Salir\n"
					+ "------------------\n"
					+ "Introduzca opcion:");
			opcion=sca.nextInt();
			if(opcion>=1&&opcion<=4) {
				//Opcion existente
				correcto=true;
			}else {
				//Opcion inexistente
				System.out.println("ERROR!: La opcion "+opcion+" no existe!");
			}
		}while(correcto==false);
		return opcion;
	}
	public static void colocar_libro(String[][] estanteria) {
		Scanner sca=new Scanner(System.in);
		String nombre;
		int fila, columna;
		boolean correcto;
		//Leer nombre
		System.out.println("Introduce el titulo del nuevo libro:");
		nombre=sca.nextLine();
		//Bucle validador de la posicion
		do {
			correcto=true;
			System.out.println("Introduzca posicion para poner "+nombre+":");
			fila=sca.nextInt();
			columna=sca.nextInt();
			//Validar posicion
			if(fila>estanteria.length-1) {
				System.out.println("ERROR!: El valor de fil: "+fila+" no es correcto");
				correcto=false;
			}
			if(columna>estanteria[0].length-1) {
				System.out.println("ERROR!: El valor de col: "+columna+" no es correcto");
				correcto=false;
			}
			//Validar que la posicion este vacia
			if(correcto==true) {
				if(!estanteria[fila][columna].equals("*")) {
					//No esta vacia
					System.out.println("ERROR!: Esa posición ya está ocupada por "+estanteria[fila][columna]);
					correcto=false;
				}
			}
		}while(correcto==false);
		//Posicion valida, introduce titulo
		System.out.println("OK!: Colocamos "+nombre+" en la posición ["+fila+","+columna+"]");
		estanteria[fila][columna]=nombre;
	}
	public static void quitar_libro(String[][] estanteria) {
		Scanner sca=new Scanner(System.in);
		String nombre;
		boolean correcto;
		//bucle comprobador de que el nombre existe
		do {
			correcto=false;
			//Obtener el nombre a borrar
			System.out.println("Introduce el titulo del libro a quitar:");
			nombre=sca.nextLine();
			//Recorrer la matriz eliminando el nombre
			for(int i=0;i<estanteria.length;i++) {
				for(int j=0;j<estanteria[0].length;j++) {
					if(estanteria[i][j].equals(nombre)) {
						//Si es el mismo titulo se elimina
						correcto=true;
						System.out.println("OK!: Quito "+estanteria[i][j]+" de la posicion ["+i+","+j+"]");
						estanteria[i][j]="*";
					}
				}
			}
			//Indicar si no existe el nombre en la libreria
			if(correcto==false) {
				System.out.println("ERROR!: No puedo quitar a "+nombre+" porque no existe!");
			}
		}while(correcto==false);
	}
	public static void pintar_estanteria(String[][] estanteria) {
		//Bucle para recorrer la estanteria
		for(int i=0;i<estanteria.length;i++) {
			for(int j=0;j<estanteria[0].length;j++) {
				//Imprimir elementos de la estanteria
				System.out.print(estanteria[i][j]+"\t");
			}
			//Salto de estante
			System.out.println();
		}
	}
	public static void main(String arc[]) {
		Scanner sca=new Scanner(System.in);
		String nombre;
		int opcion=-1, estantes, libros;
		//Darle nombre a la estanteria
		System.out.println("¿Como quieres llamar a tu estanteria?");
		nombre=leer_nombre();
		//Definir las dimensiones de la estanteria
		System.out.println("Introduzca el numero de estantes:");
		estantes=sca.nextInt();
		System.out.println("Introduzca el numero de libros por estantes:");
		libros=sca.nextInt();
		String[][] estanteria=new String[estantes][libros];
		//Llenar la estanteria de vacios
		for(int i=0;i<estantes;i++) {
			for(int j=0;j<libros;j++) {
				estanteria[i][j]="*";
			}
		}
		//Bucle de opciones de la estanteria
		do {
			opcion=pintar_menu();
			switch(opcion) {
			case 1:
				//Colocar titulo
				colocar_libro(estanteria);
				break;
			case 2:
				//Quitar libro
				quitar_libro(estanteria);
				break;
			case 3:
				//Pintar estanteria
				pintar_estanteria(estanteria);
				break;
			case 4:
				//Salir
				System.out.println("¡Gracias por usar este software tan divertido!");
				break;
			default:
				//Error
				System.out.println("ERROR!");
				break;
			}
		}while(opcion!=4);
		sca.close();
	}
}