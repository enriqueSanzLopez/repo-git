package aviones;
import java.util.*;
public class Principal {
	public static void pintar_menu() {
		System.out.print("---------------------------------------------------------------------\n"
				+ "1-Comprar billete de avión\n"
				+ "2-Cancelar billete de avión\n"
				+ "3-Estado de mi reserva\n"
				+ "S-Salir\n"
				+ "OPCIÓN: ");
	}
	public static int contarCaracteres(String cadena, char caracter) {//Cuenta las veces que aparece un caracter
		int contador=0, posicion;
		posicion=cadena.indexOf(caracter);
		while(posicion!=-1) {//Mientras encuentre el caracter se cuenta
			contador=contador+1;
			posicion=cadena.indexOf(caracter, posicion+1);
		}
		return contador;
	}
	public static void pintar_entradas(ArrayList<Billete> tickets, char letra) {
		String estado=letra+"";
		if(!estado.equals("T")) {
			for(int i=0;i<tickets.size();i++) {
				Billete entrada=tickets.get(i);
				if(entrada.getEstado().equals(estado)) {
					if(!entrada.getEstado().equals("C")) {
						System.out.println(entrada.getId()+":"+entrada.getOrigen()+"-"+entrada.getDestino()+" IDA: dia "+entrada.getDia_ida()+" VUELTA: dia "+entrada.getDia_vuelta());
					}else {
						System.out.println(entrada.getId()+":"+entrada.getOrigen()+"-"+entrada.getDestino()+" IDA: dia "+entrada.getDia_ida()+" VUELTA: dia "+entrada.getDia_vuelta()+" CANCELADO");
					}
				}
			}
		}else {
			for(int i=0;i<tickets.size();i++) {
				Billete entrada=tickets.get(i);
				if(!entrada.getEstado().equals("C")) {
					System.out.println(entrada.getId()+":"+entrada.getOrigen()+"-"+entrada.getDestino()+" IDA: dia "+entrada.getDia_ida()+" VUELTA: dia "+entrada.getDia_vuelta());
				}else {
					System.out.println(entrada.getId()+":"+entrada.getOrigen()+"-"+entrada.getDestino()+" IDA: dia "+entrada.getDia_ida()+" VUELTA: dia "+entrada.getDia_vuelta()+" CANCELADO");
				}
			}	
		}
	}
	public static void main(String arg[]) {
		System.out.println("Bienvenido a las aerolíneas Paco Airways, ¿qué desea hacer?");
		Scanner sca=new Scanner(System.in);
		ArrayList<Billete> tickets=new ArrayList<Billete>();
		bucleEjecucion(sca, tickets);
	}
	private static void bucleEjecucion(Scanner sca, ArrayList<Billete> tickets) {
		boolean correcto;
		String datos;
		char opcion;
		char letra;
		int contador;
		do {
			pintar_menu();//Mostrar el menu por pantalla
			opcion=sca.nextLine().charAt(0);//Leer la opción
			switch(opcion) {
			case '1'://Crear billete
				datos = validaBillete(sca);
				Billete entrada=new Billete(datos);//Crear el billete
				tickets.add(entrada);//Guardar el billete
				break;
			case '2'://Cancelar billete
				System.out.println("Introduzca id del billete a cancelar:");
				contador=sca.nextInt();
				cancelaBillete(sca, contador, tickets);
				break;
			case '3'://Estado de mi reserva
				do {
					correcto=false;
					System.out.println("¿Que vuelos desea ver? (V-Vigentes,C-Cancelados,T-Todos)");
					letra=sca.nextLine().charAt(0);
					correcto=mostrarBilletes(letra, tickets);
				}while(correcto==false);
				break;
			case 'S'://Salir
				System.out.println("Paco Airways no le agradece su confianza. Gracias por nada.");
				break;
			case 's':
				System.out.println("Paco Airways no le agradece su confianza. Gracias por nada.");
				opcion='S';
				break;
			default:
				System.out.println("Opción inexistente!, por favor seleccione otra opción:");
				break;
			}
		}while(opcion!='S');
	}
	private static boolean mostrarBilletes(char letra, ArrayList<Billete> tickets) {
		boolean correcto=false;
		switch(letra) {
		case 'V':
			pintar_entradas(tickets, 'V');
			correcto=true;
			break;
		case 'v':
			pintar_entradas(tickets, 'V');
			correcto=true;
			break;
		case 'C':
			pintar_entradas(tickets, 'C');
			correcto=true;
			break;
		case 'c':
			pintar_entradas(tickets, 'C');
			correcto=true;
			break;
		case 'T':
			pintar_entradas(tickets, 'T');
			correcto=true;
			break;
		case 't':
			pintar_entradas(tickets, 'T');
			correcto=true;
			break;
		default:
			System.out.println("ERROR! Opción inexistente, por favor, seleccione una opción válida:");
			correcto=false;
			break;
		}
		return correcto;
	}
	private static void cancelaBillete(Scanner sca, int contador, ArrayList<Billete> tickets) {
		boolean correcto;
		char letra;
		if(contador-1>=tickets.size()) {
			System.out.println("La id del billete a cancelar no existe!");
		}else {//Existe la id
			Billete cancelado=tickets.get(contador-1);
			if(cancelado.getEstado().equals("C")) {
				System.out.println("El billete a cancelar ya estaba cancelado!");
			}else {//El billete todavía no se ha cancelado
				do {//Validar la confirmación
					correcto=false;
					System.out.println("Billete encontrado, ¿Confirma su cancelación (S/N)?");
					sca.nextLine();
					letra=sca.nextLine().charAt(0);
					switch(letra) {
					case 'S':
						cancelado.setEstado("C");
						tickets.set(contador-1, cancelado);
						System.out.println("Billete cancelado.");
						correcto=true;
						break;
					case 's':
						cancelado.setEstado("C");
						tickets.set(contador-1, cancelado);
						System.out.println("Billete cancelado.");
						correcto=true;
						break;
					case 'N':
						System.out.println("Operación de cancelación cancelada a su vez");
						correcto=true;
						break;
					case 'n':
						System.out.println("Operación de cancelación cancelada a su vez");
						correcto=true;
						break;
					default:
						System.out.println("ERROR! Opción inexistente, indique si desea continuar la operación:");
						correcto=false;
						break;
					}
				}while(correcto==false);
			}
		}
	}
	private static String validaBillete(Scanner sca) {
		String datos;
		int contador;
		boolean correcto;
		do {//Recoger datos del billete y validarlos
			correcto=false;
			System.out.println("Introduzca origen, destino, dia de ida y dia de vuelta separados por @:");
			datos=sca.nextLine();
			contador=contarCaracteres(datos, '@');
			if(contador==3) {
				correcto=true;
			}else {
				System.out.println("ERROR! Formato de datos incorrecto, introduzca de nuevo los datos:");
			}
		}while(correcto==false);
		return datos;
	}
}