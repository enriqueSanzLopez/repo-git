package ejercicio99a;
import java.util.*;
public class Principal {
	private static final String PEDIR_SALA = "¿Sobre que sala desea realizar la operación?";
	private static final String SALA_INEXISTENTE = "Valor de sala introducido erróneo. Introduzca valores desde el 1 hasta el ";
	private static final String SALAS_ERRONEAS = "ERROR! El número de salas tiene que ser positivo!";
	private static final String FRASE_SALIDA = "Gracias por venir a Kinepolis.";
	private static final String OPCION_INEXISTENTE = "ERROR! La opción seleccionada no existe!";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		int cine=0;
		cine = crearCine();
		Sala[] matriz=new Sala[cine];//Crear la matriz de salas
		llenarCine(matriz);
		bucleEjecucion(sca, cine, matriz);
		sca.close();
	}

	private static void llenarCine(Sala[] matriz) {
		for(int i=0;i<matriz.length;i++) {
			Sala a=new Sala(i+1);
			matriz[i]=a;
		}
	}

	private static int crearCine() {
		int cine;
		do {
			System.out.println("Bienvenido a Kinepolis, ¿de cuantas salas dispone tu cine?");
			cine=LectorEntradas.leerEntero(-1);
			if(cine==-1) {
				System.out.println(SALAS_ERRONEAS);
			}
		}while(cine==-1);
		return cine;
	}

	private static void bucleEjecucion(Scanner sca, int cine, Sala[] matriz) {
		int opcion;
		do {
			pintarMenu();
			opcion=LectorEntradas.leerEntero(-1);//Lee un valor entero y valida que sea entero, en caso de no ser validado, devuelve -1
			int numero;
			boolean correcto=false;
			switch(opcion) {
			case 1://Encolar cliente en una sala
				encolarCliente(sca, matriz);
				break;
			case 2://Desencolar cliente de la sala
				desencolarCliente(matriz);
				break;
			case 3://Información de una sala
				pintaCola(matriz);
				break;
			case 4://Estado del cine
				for(int i=1;i<=matriz.length;i++) {
					pintarSala(matriz, i);
				}
				break;
			case 5://Salir
				System.out.println(FRASE_SALIDA);
				break;
			default://Opcion inexistente
				System.out.println(OPCION_INEXISTENTE);
				break;
			}
		}while(opcion!=5);
	}

	private static void pintaCola(Sala[] matriz) {
		int numero;
		System.out.println(PEDIR_SALA);
		numero=pedirSala(matriz);
		pintarSala(matriz, numero);
	}

	private static void pintarSala(Sala[] matriz, int numero) {
		Sala habitacion=matriz[numero-1];
		Queue<Cliente>cola=habitacion.getCola();
		if(cola.size()==0) {//No hay nadie en cola
			System.out.println("La sala "+numero+" no tiene clientes en espera.");
		}else {
			System.out.println("La sala "+numero+" tiene esperando a los siguientes clientes:");
			for(int i=0;i<cola.size();i++) {
				Cliente c=cola.remove();
				System.out.println(c.getNombre()+","+c.getEdad()+".");
			}
		}
	}

	private static void desencolarCliente(Sala[] matriz) {
		int numero;
		System.out.println(PEDIR_SALA);
		numero=pedirSala(matriz);
		Sala habitacion=matriz[numero-1];
		Queue<Cliente>cola=habitacion.getCola();
		if(cola.size()==0) {
			System.out.println("La sala no tiene clientes en espera");
		}else {
			cola.remove();//ELiminar cliente de la cola
			habitacion.setCola(cola);
			matriz[numero-1]=habitacion;
			System.out.println("Desencolamos al primero de la cola de la sala "+numero);
		}
	}

	private static void encolarCliente(Scanner sca, Sala[] matriz) {
		int numero;
		boolean correcto;
		System.out.println(PEDIR_SALA);
		numero = pedirSala(matriz);
		int edad;
		Sala habitacion=matriz[numero-1];
		Queue<Cliente>cola=habitacion.getCola();
		System.out.println("Introduzca nombre del nuevo cliente para la cola "+numero+":");
		String nombre=sca.nextLine();
		do {
			correcto=true;
			System.out.println("Introduzca su edad:");
			edad=LectorEntradas.leerEntero(-1);
			if(edad<0) {
				correcto=false;
				System.out.println("ERROR! Edad incorrecta!");
			}
		}while(correcto==false);
		Cliente persona=new Cliente(nombre, edad);
		cola.add(persona);
		habitacion.setCola(cola);
		matriz[numero-1]=habitacion;
	}

	private static int pedirSala(Sala[] matriz) {
		int numero;
		boolean correcto;
		do {
			correcto=true;
			numero=LectorEntradas.leerEntero(-1);
			if(numero<=0||numero>matriz.length) {
				correcto=false;
				System.out.println(SALA_INEXISTENTE+" hasta el "+matriz.length);
			}
		}while(correcto==false);
		return numero;
	}

	private static void pintarMenu() {
		System.out.println("----------- Menu Kinepolis -------------\n"
				+ "1-Encolar cliente en una sala\n"
				+ "2-Desencolar cliente de la sala\n"
				+ "3-Información de una sala\n"
				+ "4-Estado del cine\n"
				+ "5-Salir");
	}
}