package ejercicio127;
import java.util.*;
public class Principal {
	private static final String OPCION_INCORRECTA = "ERROR! Opción inexistente!";
	private static final String FRASE_SALIDA = "Gracias por utilizar el programa de Mascotas";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		int opcion;
		ArrayList<Mascota> animales=new ArrayList<Mascota>();
		do {
			pintarMenu();
			opcion = leerEntero(sca, -1);
			sca.nextLine();
			opciones(sca, opcion, animales);
		}while(opcion!=6);
		sca.close();
	}

	private static void opciones(Scanner sca, int opcion, ArrayList<Mascota> animales) {
		switch(opcion) {
		case 1://Alta mascota
			altaAnimal(sca, animales);
			break;
		case 2://Escuchar perros y gatos
			cantaAnimales(animales, "perro", "gato");
			break;
		case 3://Escuchar periquitos y conejos
			cantaAnimales(animales, "periquito", "conejo");
			break;
		case 4://Escuchar gatos y periquitos
			cantaAnimales(animales, "periquito", "gato");
			break;
		case 5://Escuchar perros y conejos
			cantaAnimales(animales, "perro", "conejo");
			break;
		case 6://Salida
			System.out.println(FRASE_SALIDA);
			break;
		default://Opción inexistente
			System.out.println(OPCION_INCORRECTA);
			break;
		}
	}

	private static void cantaAnimales(ArrayList<Mascota> animales, String a1, String a2) {
		for(int i=0;i<animales.size();i++) {
			String frase=animales.get(i).sonido();
			if(frase.indexOf(a1)!=-1 || frase.indexOf(a2)!=-1) {
				System.out.println(frase);
			}
		}
	}

	private static void altaAnimal(Scanner sca, ArrayList<Mascota> animales) {
		char letra;
		do {
			System.out.println("Introduzca el tipo de mascota a dar de alta (P-Perro/G-gato/Q-Periquito/C-Conejo):");
			letra=sca.nextLine().charAt(0);
			if(letra=='P' || letra=='p') {
				letra='P';
			}
			if(letra=='G' || letra=='g') {
				letra='G';
			}
			if(letra=='Q' || letra=='q') {
				letra='Q';
			}
			if(letra=='C' || letra=='c') {
				letra='C';
			}
		}while(letra!='P' && letra!='G' && letra!='Q' && letra!='C');
		System.out.println("Introduzca el nombre de la mascota");
		String nombre=sca.nextLine();
		switch(letra) {
		case 'P'://Es un perro
			Perro p=new Perro(nombre);
			animales.add(p);
			System.out.println("Se ha dado de alta a un perro de nombre "+nombre);
			break;
		case 'G'://Es un gato
			Gato g=new Gato(nombre);
			animales.add(g);
			System.out.println("Se ha dado de alta a un gato de nombre "+nombre);
			break;
		case 'Q'://Es un periquito
			Periquito q=new Periquito(nombre);
			animales.add(q);
			System.out.println("Se ha dado de alta a un periquito de nombre "+nombre);
			break;
		case 'C'://Es un conejo
			Conejo c=new Conejo(nombre);
			animales.add(c);
			System.out.println("Se ha dado de alta a un conejo de nombre "+nombre);
			break;
		}
	}

	private static int leerEntero(Scanner sca, int b) {
		int opcion;
		try {
			opcion=sca.nextInt();
		}catch(Exception e) {
			opcion=b;
		}
		return opcion;
	}

	private static void pintarMenu() {
		System.out.println("-----------------------------\n"
				+ "1-Dar de alta una mascota\n"
				+ "2-Escuchar perros y gatos\n"
				+ "3-Escuchar periquitos y conejos\n"
				+ "4-Escuchar gatos y periquitos\n"
				+ "5-Escuchar perros y conejos\n"
				+ "6-Salir\n"
				+ "-----------------------------");
	}
}