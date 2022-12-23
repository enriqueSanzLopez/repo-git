package actividadevaluabletrimestre3_1;
import java.util.*;
public class Principal {
	private static final String OPCION_INEXISTENTE = "ERROR! Opción inexistente!";
	private static final String FRASE_SALIDA = "Gracias por utilizar nuestro Videoclub";

	public static void main(String[] arg) {
		Scanner sca=new Scanner(System.in);
		int opcion;
		String pedir_edad="Introduzca la edad de ";
		String pedir_oscars="Introduzca el numero de oscars que ha ganado ";
		String error_oscars="ERROR! Los oscars que ha ganado tienen que ser un número entero de 0 o más!";
		String error_edad="ERROR! La edad tiene que ser un número entero de 0 o más!";
		String pedir_director="Introduzca el director de ";
		String pedir_productor="Introduzca el productor de ";
		String posicion;
		ArrayList<Persona> directores=new ArrayList<Persona>();
		ArrayList<Persona> actores=new ArrayList<Persona>();
		ArrayList<Persona> productores=new ArrayList<Persona>();
		ArrayList<Pelicula> videos=new ArrayList<Pelicula>();
		do {//Bucle de ejecución
			pintarMenu();
			opcion=LectorEntradas.leerEntero(-1);
			switch(opcion) {//Opción a ejecutar
			case 1://Alta director
				posicion="Director";
				altaPersona(sca, pedir_edad, pedir_oscars, error_oscars, error_edad, posicion, directores);
				break;
			case 2://Alta actor
				posicion="Actor";
				altaPersona(sca, pedir_edad, pedir_oscars, error_oscars, error_edad, posicion, actores);
				break;
			case 3://Alta productor
				posicion="Productor";
				altaPersona(sca, pedir_edad, pedir_oscars, error_oscars, error_edad, posicion, productores);
				break;
			case 4://Alta película
				altaPeli(sca, pedir_director, pedir_productor, directores, actores, productores, videos);
				break;
			case 5://Listado películas
				pintarPeliculas(directores, actores, productores, videos);
				break;
			case 6://Salir
				System.out.println(FRASE_SALIDA);
				break;
			default://Opción inexistente
				System.out.println(OPCION_INEXISTENTE);
				break;
			}
		}while(opcion!=6);
		sca.close();
	}

	private static void pintarPeliculas(ArrayList<Persona> directores, ArrayList<Persona> actores,
			ArrayList<Persona> productores, ArrayList<Pelicula> videos) {
		contadorArrays(directores, actores, productores, videos);
		pintarPeli(videos);
	}

	private static void pintarPeli(ArrayList<Pelicula> videos) {
		int oscars;
		for(int i=0;i<videos.size();i++) {//Listar detalles de cada película
			oscars=0;//Poner el contador a 0
			Pelicula peli=videos.get(i);//Sacar la película y sus partes
			Persona director=peli.getDirector();
			Persona productor=peli.getProductor();
			ArrayList<Persona> plantilla=peli.getActores();
			oscars=director.getOscars()+productor.getOscars();
			System.out.println("--\n"
					+ "+'"+peli.getTitulo()+"', dirigida por : "+director.getNombre()+" producida por: "+productor.getNombre()+" e interpretada por:");
			for(int j=0;j<plantilla.size();j++) {
				Persona actor=plantilla.get(j);
				oscars=oscars+actor.getOscars();
				System.out.println("\t-"+actor.getNombre());
			}
			System.out.println("Entre el director, el productor, y los actores, "+peli.getTitulo()+" tiene "+oscars+" oscars.\n"
					+ "--");
		}
	}

	private static void contadorArrays(ArrayList<Persona> directores, ArrayList<Persona> actores,
			ArrayList<Persona> productores, ArrayList<Pelicula> videos) {
		System.out.println("Peliculas:"+videos.size()+"\n"
				+ "Directores:"+directores.size()+"\n"
						+ "Productores:"+productores.size()+"\n"
								+ "Actores:"+actores.size()+"\n");//Listar cantidades
	}

	private static void altaPeli(Scanner sca, String pedir_director, String pedir_productor,
			ArrayList<Persona> directores, ArrayList<Persona> actores, ArrayList<Persona> productores,
			ArrayList<Pelicula> videos) {
		String posicion;
		System.out.println("Introduzca el titulo de la nueva pelicula:");
		String nombre=sca.nextLine();//Obtener el nombre
		Persona director = null;
		Persona productor = null;
		ArrayList<Persona> plantilla=new ArrayList<Persona>();
		posicion="director";
		director = existOno(sca, pedir_director, posicion, directores, nombre, director);
		posicion="productor";
		productor = existOno(sca, pedir_productor, posicion, productores, nombre, productor);
		existeActor(sca, actores, plantilla);
		Pelicula p=new Pelicula(nombre, director, productor, plantilla);//Crear la película
		videos.add(p);//Registrar la película
	}

	private static void existeActor(Scanner sca, ArrayList<Persona> actores, ArrayList<Persona> plantilla) {
		boolean correcto;
		String nombrea;
		String minus;
		Persona actor;
		do {
			System.out.println("Introduzca nombre del actor número "+(plantilla.size()+1)+":");
			correcto=false;
			nombrea=sca.nextLine();//Pedir nombre del actor
			minus=nombrea.toLowerCase();
			if(minus.equals("salir")) {//Comprobar si se ha terminado de poner actores
				break;
			}
			for(int i=0;i<actores.size();i++) {
				actor=actores.get(i);
				if(actor.getNombre().equals(nombrea)) {//Es el actor que estamos buscando
					plantilla.add(actor);
					correcto=true;
					break;
				}
			}
			if(correcto==false) {//El actor no está registrado
				System.out.println("ERROR! El actor tiene que haber sido declarado previamente!");
			}
		}while(!minus.equals("salir"));
	}

	private static Persona existOno(Scanner sca, String pedir_director, String posicion, ArrayList<Persona> directores,
			String nombre, Persona director) {
		boolean correcto;
		String nombred;
		do {//Pedir y validar que el director exista
			correcto=false;
			System.out.println(pedir_director+nombre+":");
			nombred=sca.nextLine();
			for(int i=0;i<directores.size();i++) {//Validar la existencia del director
				director=directores.get(i);
				if(director.getNombre().equals(nombred)) {//El director existe y lo hemos encontrado
					correcto=true;
					break;
				}
			}
			if(correcto==false) {//El director no existe
				System.out.println("ERROR! El "+posicion+" debe haber sido declarado previamente!");
			}
		}while(correcto==false);
		return director;
	}

	private static void altaPersona(Scanner sca, String pedir_edad, String pedir_oscars, String error_oscars,
			String error_edad, String posicion, ArrayList<Persona> directores) {
		int edad;
		int oscars;
		System.out.println("Vamos a dar de alta un "+posicion+":\n"
				+ "Introduzca nombre:");
		String nombre=sca.nextLine();//Obtener el nombre
		edad = validarEntero(pedir_edad, error_edad, nombre);
		oscars = validarEntero(pedir_oscars, error_oscars, nombre);
		Persona d=new Persona(nombre, edad, oscars, posicion);//Crear el objeto
		directores.add(d);//Registrar al director en la lista
		System.out.println(posicion+" numero "+directores.size()+" dado de alta!");
	}

	private static int validarEntero(String pedir_edad, String error_edad, String nombre) {
		int edad;
		do {//Obtener y validar edad
			System.out.println(pedir_edad+nombre+":");
			edad=LectorEntradas.leerEntero(-1);
			if(edad<0) {
				System.out.println(error_edad);
			}
		}while(edad<0);
		return edad;
	}

	private static void pintarMenu() {
		System.out.println("--VIDEOCLUB BE KIND - REWIND --\n"
				+ "1-Dar de alta un Director\n"
				+ "2-Dar de alta un Actor\n"
				+ "3-Dar de alta un Productor\n"
				+ "4-Dar de alta una pelicula\n"
				+ "5-Listado de peliculas\n"
				+ "6-Salir");
	}
}