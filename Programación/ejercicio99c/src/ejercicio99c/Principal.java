package ejercicio99c;
import java.util.*;
public class Principal {
	private static final String PEDIR_PAREJA = "Edad y nombre de la pareja:";
	private static final String PEDIR_CONCURSANTE = "Edad y nombre del concursante:";
	private static final int MAYORIA_EDAD = 18;
	private static final int EDAD_MINIMA_PARTICIPANTE = 0;
	private static final String FRASE_INICIO = "Bienvenido a las islas de las tentaciones";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		System.out.println(FRASE_INICIO);
		String islas = registrarIslas(sca);
		String[] separadas=islas.split("-");
		registrarParticipantes(sca, separadas);
		sca.close();
	}

	private static void registrarParticipantes(Scanner sca, String[] separadas) {
		boolean correcto;
		Isla a;
		int edad=MAYORIA_EDAD, edad1=MAYORIA_EDAD, edadp=MAYORIA_EDAD, edadp1=MAYORIA_EDAD;
		String nombre ="", nombre1="", pareja1="", pareja="";
		for(int i=0;i<separadas.length;i++) {
			System.out.println("Introduzca la pareja 1 de la isla "+separadas[i]);
			do {
				correcto=false;
				System.out.println(PEDIR_CONCURSANTE);
				try{
					edad=sca.nextInt();
					if(edad>=EDAD_MINIMA_PARTICIPANTE) {
						correcto=true;
					}
				}catch(InputMismatchException e) {
					System.out.println("ERROR! La edad tiene que ser un número!");
					correcto=false;
				}
				if(correcto==true) {//Si se ha validado la edad, se pide el nombre
					nombre=sca.nextLine();
				}
			}while(correcto==false);
			do {
				correcto=false;
				System.out.println(PEDIR_PAREJA);
				try{
					edadp=sca.nextInt();
					if(edadp>=EDAD_MINIMA_PARTICIPANTE) {
						correcto=true;
					}
				}catch(InputMismatchException e) {
					System.out.println("ERROR! La edad tiene que ser un número!");
					correcto=false;
				}
				if(correcto==true) {//Si se ha validado la edad, se pide el nombre
					pareja=sca.nextLine();
				}
			}while(correcto==false);
			System.out.println("Introduzca la pareja 2 de la isla "+separadas[i]);
			do {
				correcto=false;
				System.out.println(PEDIR_CONCURSANTE);
				try{
					edad1=sca.nextInt();
					if(edad1>=EDAD_MINIMA_PARTICIPANTE) {
						correcto=true;
					}
				}catch(InputMismatchException e) {
					System.out.println("ERROR! La edad tiene que ser un número!");
					correcto=false;
				}
				if(correcto==true) {//Si se ha validado la edad, se pide el nombre
					nombre1=sca.nextLine();
				}
			}while(correcto==false);
			do {
				correcto=false;
				System.out.println(PEDIR_PAREJA);
				try{
					edadp1=sca.nextInt();
					if(edadp1>=EDAD_MINIMA_PARTICIPANTE) {
						correcto=true;
					}
				}catch(InputMismatchException e) {
					System.out.println("ERROR! La edad tiene que ser un número!");
					correcto=false;
				}
				if(correcto==true) {//Si se ha validado la edad, se pide el nombre
					pareja1=sca.nextLine();
				}
			}while(correcto==false);
			a=new Isla(separadas[i], nombre, nombre1, pareja, pareja1, edad, edad1, edadp, edadp1);//Generar isla y concursantes
			pintarConcursantes(separadas, edad, edad1, edadp, edadp1, nombre, nombre1, pareja1, pareja, i);
		}
	}

	private static void pintarConcursantes(String[] separadas, int edad, int edad1, int edadp, int edadp1,
			String nombre, String nombre1, String pareja1, String pareja, int i) {
		System.out.println("Detalle de la isla "+separadas[i]+"\n"
				+ nombre+", de "+edad+" años y su pareja es: "+pareja+", de "+edadp+" años.\n"
						+ pareja+", de "+edadp+" años y su pareja es: "+nombre+", de "+edad+" años.\n"
								+ nombre1+", de "+edad1+" años y su pareja es: "+pareja1+", de "+edadp1+" años.\n"
										+ pareja1+", de "+edadp1+" años y su pareja es: "+nombre1+", de "+edad1+" años.\n");
	}

	private static String registrarIslas(Scanner sca) {
		boolean correcto;
		String islas;
		do {
			correcto=false;
			System.out.println("Introduzca los nombres de las islas separadas por '-':");
			islas=sca.nextLine();
			if(islas.indexOf("-")==-1) {//Validar el formato
				System.out.println("ERROR! Las islas tienen que estar separadas por '-'");
			}else {
				correcto=true;
			}
		}while(correcto==false);
		return islas;
	}
}