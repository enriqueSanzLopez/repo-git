package actividadevaluabletrimestre2_3;
import java.util.*;
public class eval03 {
	public static void menu() {//Función encargada de mostrar el menú por consola
		System.out.println("---- TICKETEA ----\n"
				+ "1-Añadir nombre a la lista de interesados\n"
				+ "2-Comprar entradas\n"
				+ "3-Mostrar sala\n"
				+ "4-Salir");
	}
	public static int asientos() {//Esta funcion lee y valida el número de asientos de la sala
		Scanner sca_asientos=new Scanner(System.in);
		int tamano;//Número de asientos
		do {//Bucle validador del número de asientos, tiene que ser positivo y distindo de 0
			tamano=sca_asientos.nextInt();
			if(tamano<=0) {//Número de asientos inválido
				System.out.println("ERROR! Número de asientos inválido\n"
						+ "Introduzca la capacidad de la sala de conciertos:");
			}
		}while(tamano<=0);
		return tamano;
	}
	public static void lista(Queue<String> cola, int[] sala) {//Introduce personas en la lista de espera
		Scanner sca_lista=new Scanner(System.in);
		int espacios=contar_vacios(sala);
		System.out.println("Introduzca su nombre:");
		String nombre=sca_lista.nextLine();
		cola.add(nombre);//Registrar nombre en la lista
		System.out.println(nombre+", estás en la posición "+cola.size()+" de la lista de interesados\n"
				+ "Tenemos libres "+espacios+" butacas para el concierto");
	}
	public static void vacia_sala(int[] sala) {//Esta función vacía la sala poniendo a 0 todos sus valores
		for(int i=0;i<sala.length;i++) {//Recorrer todo el espacio de la sala
			sala[i]=0;
		}
	}
	public static int contar_vacios(int[] sala) {//Esta función cuenta los espacios vacios restantes en una sala
		int espacios=0;
		for(int i=0;i<sala.length;i++) {//Bucle para recorrer la sala
			if(sala[i]==0) {//Aumentar el contador por cada asiento sin reserva
				espacios=espacios+1;
			}
		}
		return espacios;
	}
	public static void comprar(Queue<String> cola, int[] sala) {//Esta función compra el asiento de una sala
		Scanner sca_comprar=new Scanner(System.in);
		if(cola.size()!=0) {//Hay gente en cola
			int entrada;
			boolean correcto=false;
			System.out.println(cola.element()+" va a comprar su entrada, ¿que butaca quiere comprar?");
			do {//Bucle validador de si existe el asiento y está libre
				correcto=true;
				entrada=sca_comprar.nextInt();
				if(entrada<0||entrada>=sala.length) {//Asiento inexistente
					System.out.println("Esa butaca no existe, introduzca otro número:");
					correcto=false;
				}else if(sala[entrada]!=0) {//Asiento ocupado
					System.out.println("Butaca ocupada, introduzca otro número:");
					correcto=false;
				}
			}while(correcto==false);
			sala[entrada]=1;//Llenar el asiento
			System.out.println("Butaca "+entrada+" asignada a "+cola.element());
			cola.remove();//Eliminar al individuo de la lista
		}else {//No queda gente en cola
			System.out.println("ERROR: ¡No existen personas interesadas!");
		}
	}
	public static void pintar(int[] sala) {//Esta función dibuja la sala por consola, mostrando los asientos disponibles como [L] y los ocupados como [X]
		for(int i=0;i<sala.length;i++) {//Bucle para recorrer la sala y asignar índices
			System.out.print(i+"\t");
		}
		System.out.println();//Salto de línea
		for(int i=0;i<sala.length;i++) {//Bucle para recorrer la sala
			if(sala[i]==0) {//La butaca está libre
				System.out.print("[L]\t");
			}else {
				System.out.print("[X]\t");
			}
		}
		System.out.println();//Salto de línea
	}
	public static void main(String arg[]) {//Los argumentos arg no serán usados
		Scanner sca=new Scanner(System.in);//Escanner para leer entradas por consola
		Queue<String> cola=new LinkedList<String>();//Lista de espera para comprar entradas
		boolean correcto=false;
		int opcion;
		System.out.println("¡Bienvenidos al concierto de Kiko Rivera!\n"
				+ "Introduzca la capacidad de la sala de conciertos:");
		int entradas=asientos();//Leer el tamaño de la sala
		int[] sala=new int[entradas];//Definir la sala de conciertos
		vacia_sala(sala);
		do {//Bucle para que trabaje el usuario, se sale cuando termina la función
			menu();//Pintar el menú por pantalla
			opcion=sca.nextInt();
			switch(opcion) {//Buscar la función seleccionada
			case 1://Añadir nombre a la lista de interesados
				if(entradas>=0) {//Comprobar si quedan entradas
					lista(cola, sala);
					break;
				}else {
					System.out.println("SOLD OUT! No hay mas tickets!");
					break;
				}
			case 2://Comprar entradas
				if(entradas>=0) {//Comprobar si quedan entradas
					comprar(cola, sala);
					entradas=entradas-1;
					break;
				}else {
					System.out.println("SOLD OUT! No hay mas tickets!");
					break;
				}
			case 3://Mostrar sala
				pintar(sala);
				break;
			case 4://Salir
				correcto=true;
				break;
			default://Opción inexistente
				System.out.println("ERROR! Opción inexistente, por favor, seleccione otra opción!");
				break;
			}
		}while(correcto==false);
		System.out.println("Gracias por utilizar Ticketea!");
		sca.close();//Cerrar el escáner
	}
}