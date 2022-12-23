package ejercicio100;
import java.util.*;
public class Principal {
	private static final String FRASE_OPCION_INEXISTENTE = "ERROR! La opción seleccionada no existe";
	private static final String FRASE_SALIDA = "Que la fuerza te acompañe...";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		int opcion=-1;
		ArrayList<Nave> naves=new ArrayList<Nave>();
		ArrayList<Flota> flotas=new ArrayList<Flota>();
		do {
			pintarMenu();
			opcion = leerEntero(sca);
			sca.nextLine();
			seleccionarOpcion(opcion, sca, naves, flotas);
		}while(opcion!=0);
		sca.close();
	}
	private static void seleccionarOpcion(int opcion, Scanner sca, ArrayList<Nave> naves, ArrayList<Flota> flotas) {
		switch(opcion) {
		case 0://Salir
			System.out.println(FRASE_SALIDA);
			break;
		case 1://Alta de nave
			crearNave(sca, naves);
			break;
		case 2://Alta de tripulante
			altaTripulante(sca, naves);
			break;
		case 3://Alta de flota
			crearFlota(sca, flotas);
			break;
		case 4://Consultar nave
			consultaNave(sca, naves);
			break;
		case 5://Consultar flota
			consultarFlota(sca, flotas);
			break;
		default://Opción inexistente
			System.out.println(FRASE_OPCION_INEXISTENTE);
			break;
		}
	}
	private static void consultarFlota(Scanner sca, ArrayList<Flota> flotas) {
		System.out.println("Introduzca el nombre de la flota:");
		String nombre=sca.nextLine();
		Flota a=null;
		Flota b=null;
		int i, contador=0;
		for(i=0;i<flotas.size();i++) {
			a=flotas.get(i);
			if(a.getNombre().equals(nombre)) {
				b=a;
				contador=contador+1;
				break;
			}
		}
		if(contador!=0) {
			ArrayList<String> w=b.getNaves();
			System.out.println("Encontrada la flota "+b.getNombre()+" con "+w.size()+" naves:");
			for(int j=0;j<w.size();j++) {
				System.out.println("\t- "+w.get(j));
			}
		}else {
			System.out.println("ERROR! La flota indicada no existe!");
		}
	}
	private static void consultaNave(Scanner sca, ArrayList<Nave> naves) {
		System.out.println("Introduzca el nombre de la nave:");
		String nombre=sca.nextLine();
		int i;
		Nave a=null;
		Nave b=null;
		int contador=0;
		for(i=0;i<naves.size();i++) {
			a=naves.get(i);
			if(a.getNombre().equals(nombre)) {//Es la nave que estamos buscando
				b=a;
				contador=contador+1;
				break;
			}
		}
		if(contador!=0) {//La nave existe
			ArrayList<Tripulante> t=b.getTripulacion();//Conseguir la tripulacion de la misma
			System.out.println("Encontrada la nave "+b.getNombre()+" con "+t.size()+" tripulantes:");
			for(int j=0;j<t.size();j++) {
				Tripulante marinero=t.get(j);
				System.out.println("\t- "+marinero.getRango()+" "+marinero.getNombre()+"("+marinero.getEdad()+")");
			}
		}else {
			System.out.println("ERROR! La nave indicada no existe!");
		}
	}
	private static void crearFlota(Scanner sca, ArrayList<Flota> flotas) {
		System.out.println("Introduzca nombre para su flota:");
		String nombre=sca.nextLine();
		Flota f=new Flota(nombre);//Crear la flota
		String nave="", comprobacion;
		ArrayList<String> k=f.getNaves();
		do {
			System.out.println("Introduzca nombre de nave para añadir a la flota "+nombre+" (hasta teclear 'salir'):");
			nave=sca.nextLine();//Leer nombre de la nave
			comprobacion=nave.toLowerCase();
			if(!comprobacion.equals("salir")) {
				k.add(nave);//Registrar la nave
				System.out.println("La nave "+nave+" se añade a la flota "+f.getNombre());
			}
		}while(!comprobacion.equals("salir"));
		f.setNaves(k);
		flotas.add(f);//Guardar la flota
	}
	private static void altaTripulante(Scanner sca, ArrayList<Nave> naves) {
		System.out.println("Introduzca nombre de la nave donde desea dar de alta al tripulante:");
		String nombre=sca.nextLine();
		int i;
		Nave a = null;
		Nave b=null;
		int contador=0;
		for(i=0;i<naves.size();i++) {//Recorrer el array buscando la nave correcta
			a=naves.get(i);
			if(a.getNombre().equals(nombre)) {//Es la nave que estamos buscando
				b=a;
				contador=contador+1;
				break;
			}
		}
		if(contador!=0) {//Existe la nave
			ArrayList<Tripulante> tripulantes=b.getTripulacion();//Obtener la tripulacion de la nave
			System.out.println("Introduzca el nombre del tripulante para la nave "+b.getNombre()+":");
			nombre=sca.nextLine();
			System.out.println("Introduzca la edad del nuevo tripulante:");
			int edad=0;
			do {
				edad=leerEntero(sca);
				if(edad<0) {
					System.out.println("ERROR! La edad no puede ser menor que 0!");
				}
			}while(edad<0);
			sca.nextLine();//Vaciar buffer
			System.out.println("Introduzca su rango (Soldado, Capitan, Comandante):");
			String rango=sca.nextLine();
			Tripulante e=new Tripulante(nombre, edad, rango);
			tripulantes.add(e);//Guardar el tripulante
			b.setTripulacion(tripulantes);//Actualizar datos de la nave
			naves.set(i, b);//Actualizar los datos de las naves
		}else {
			System.out.println("ERROR! La nave seleccionada no existe!, creála primero, y luego crea su tripulación");
		}
	}
	private static void crearNave(Scanner sca, ArrayList<Nave> naves) {
		System.out.println("Introduzca nombre de la nave:");
		String nombre=sca.nextLine();
		Nave a=new Nave(nombre);
		naves.add(a);//Guardar la nave
	}
	private static int leerEntero(Scanner sca) {
		int opcion;
		try {//Control de excepciones
			opcion=sca.nextInt();
		}catch(InputMismatchException e) {
			opcion=-1;
			sca.next();//Termina con el uso del catch y evita que se salte la lectura en la siguiente iteración del bucle
		}
		return opcion;
	}
	private static void pintarMenu() {
		System.out.println("----------- Menú de la galaxia -----------\n"
				+"1-Alta de nave\t\t4-Consultar nave\n"
				+ "2-Alta de tripulante\t5-Consultar flota\n"
				+ "3-Alta de flota\t\t0-Salir\n"
				+ "------------------------------------------\n"
				+ "Introduzca opción:");
	}
}