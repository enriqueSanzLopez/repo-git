package ejercicio126;
import java.util.*;
import java.io.*;
public class Principal {
	private static final String ERROR_ENTERO = "ERROR! El valor tiene que ser un valor entero superior a 0!";
	private static final String ERROR_NOMINADOS_GANADOS = "ERROR!, mas oscars ganados que nominaciones!";
	private static final String ERROR_OSCAR = "ERROR! El valor tiene que ser un entero positivo o 0!";
	private static final String OPCION_INEXISTENTE = "ERROR! Opción inexistente!";
	private static final String FRASE_SALIDA = "Gracias por utilizar Netflix";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		ArrayList <Contenido> catalogo=new ArrayList<Contenido>();
		int menu=-1;
		do {
			pintarMenu();
			menu = leerOpcion(sca);
			sca.nextLine();
			opciones(sca, catalogo, menu);
		}while(menu!=6);
		sca.close();
	}

	private static void opciones(Scanner sca, ArrayList<Contenido> catalogo, int menu) {
		switch(menu) {
		case 1://Alta película
			altaPelicula(sca, catalogo);
			break;
		case 2://Alta serie
			altaSerie(sca, catalogo);
			break;
		case 3://Ver un contenido
			marcarVisto(sca, catalogo);
			break;
		case 4://Listar contenido
			verCatalogo(catalogo);
			break;
		case 5://Listar contenido pendiente por ver
			listarPendiente(catalogo);
			break;
		case 6:
			System.out.println(FRASE_SALIDA);
			break;
		default:
			System.out.println(OPCION_INEXISTENTE);
			break;
		}
	}

	private static void listarPendiente(ArrayList<Contenido> catalogo) {
		for(int i=0;i<catalogo.size();i++) {
			Contenido c=catalogo.get(i);
			if(c.isVisto()==false) {
				System.out.println(c);
			}
		}
	}

	private static void verCatalogo(ArrayList<Contenido> catalogo) {
		for(int i=0;i<catalogo.size();i++) {
			System.out.println(catalogo.get(i));
		}
	}

	private static void marcarVisto(Scanner sca, ArrayList<Contenido> catalogo) {
		System.out.println("Introduzca el titulo del contenido que quiere visualizar:");
		boolean existe=false;
		String titulo=sca.nextLine();
		for(int i=0;i<catalogo.size();i++) {//Recorrer el catálogo buscando la serie o película
			Contenido a=catalogo.get(i);
			if(a.getTitulo().equalsIgnoreCase(titulo)) {//Es la serie que estamos buscando
				existe=true;
				a.setVisto(true);//Marcar como vista
				System.out.println("El contenido "+a.getTitulo()+" marcado como visto!.");
				break;
			}
		}
		if(existe==false) {
			System.out.println("El contenido de "+titulo+" no existe en Netflix.");
		}
	}

	private static void altaSerie(Scanner sca, ArrayList<Contenido> catalogo) {
		System.out.println("Introduzca el título de la serie:");
		String titulo=sca.nextLine();
		System.out.println("Introduzca productora de la serie:");
		String productora=sca.nextLine();
		int temporadas,fecha;
		boolean finalizada;
		do {
			System.out.println("Introduzca año de publicación:");
			fecha=leerOpcion(sca);
			if(fecha==-1) {
				System.out.println(ERROR_ENTERO);
			}
		}while(fecha<0);
		do {
			System.out.println("Introduzca numero de temporadas:");
			temporadas=leerOpcion(sca);
			if(temporadas==-1) {
				System.out.println(ERROR_ENTERO);
			}
			if(temporadas==0) {
				temporadas=-1;
				System.out.println("ERROR!, "+titulo+" debería tener, al menos 1 temporada!");
			}
		}while(temporadas<0);
		sca.nextLine();
		char letra;
		do {
			System.out.println("¿La serie está finalizada o no? (S/N)");
			letra=sca.nextLine().charAt(0);
			if(letra=='s' || letra=='S') {
				finalizada=true;
			}else {
				finalizada=false;
			}
		}while(letra!='s' && letra!='S' && letra!='n' && letra!='N');
		Serie s=new Serie(titulo, productora, fecha, temporadas, finalizada);
		catalogo.add(s);
		System.out.println("La serie "+titulo+" ha sido dad de alta correctamente!");
	}

	private static void altaPelicula(Scanner sca, ArrayList<Contenido> catalogo) {
		System.out.println("Introduzca el título de la película:");
		String titulo=sca.nextLine();
		System.out.println("Introduzca productora de la película:");
		String productora=sca.nextLine();
		int nominados, ganados, fecha;
		do {
			System.out.println("Introduzca año de publicación:");
			fecha=leerOpcion(sca);
			if(fecha==-1) {
				System.out.println(ERROR_ENTERO);
			}
		}while(fecha<0);
		do {
			do {
				System.out.println("Número de nominaciones a los oscars:");
				nominados=leerOpcion(sca);
				if(nominados==-1) {
					System.out.println(ERROR_OSCAR);
				}
			}while(nominados<0);
			do {
				System.out.println("Número de oscars ganados:");
				ganados=leerOpcion(sca);
				if(ganados==-1) {
					System.out.println(ERROR_OSCAR);
				}
			}while(ganados<0);
			if(ganados>nominados) {
				System.out.println(ERROR_NOMINADOS_GANADOS);
			}
		}while(ganados>nominados);
		Pelicula p=new Pelicula(titulo, productora, fecha, nominados, ganados);
		catalogo.add(p);
		System.out.println("La película "+titulo+" ha sido dada de alta correctamente!");
	}

	private static int leerOpcion(Scanner sca) {
		int menu;
		try {
			menu=sca.nextInt();
		}catch(InputMismatchException e) {
			menu=-1;
		}
		return menu;
	}

	private static void pintarMenu() {
		System.out.println("-----------------------------\n"
				+"1-Dar de alta una película\n"
				+ "2-Dar de alta una serie\n"
				+ "3-Ver un contenido\n"
				+ "4-Listar contenido\n"
				+ "5-Listar contenido pendiente por ver\n"
				+ "6-Salir\n"
				+ "-----------------------------");
	}
}