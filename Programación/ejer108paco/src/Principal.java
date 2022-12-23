import java.util.*;
import java.io.*;
public class Principal {
	public static void main(String[] args) {
		int n;
		File agenda=new File("agenda.txt");
		crearArchivo(agenda);
		ArrayList<String> contactos=new ArrayList<String>();
		leeAgenda(agenda, contactos);
		Scanner sca=new Scanner(System.in);
		do {
			pintarMenu();
			n = selectorOpcion(sca, agenda, contactos);
		}while(n!=4);
		sca.close();
	}

	private static void leeAgenda(File agenda, ArrayList<String> contactos) {
		try {//Leer los contactos de la agenda
			Scanner sc=new Scanner(agenda);
			while(sc.hasNext()) {
				contactos.add(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static int selectorOpcion(Scanner sca, File agenda, ArrayList<String> contactos) {
		int n;
		try {
			n=sca.nextInt();
			if(n>=5) {//Opción inexistente asignada a 6
				n=6;
			}
		}catch(Exception e) {
			System.out.println("ERROR! Tiene que ser un número entero!");
			n=5;
		}
		sca.nextLine();
		switch(n) {
		case 1://Dar de alta
			altaContacto(sca, contactos);
			break;
		case 2://Dar de baja
			bajaContacto(sca, contactos);
			break;
		case 3://Listar
			pintarAgenda(contactos);
			break;
		case 4://Salir
			guardarCambios(agenda, contactos);
			break;
		case 5://Letra en lugar de número
			break;
		default://Opción inexistente
			System.out.println("ERROR! Opción inexistente!");
			break;
		}
		return n;
	}

	private static void guardarCambios(File agenda, ArrayList<String> contactos) {
		System.out.println("Gracias por utilizar esta agenda");
		try {//Vaciar archivo
			FileWriter archivo=new FileWriter(agenda);
			archivo.write("");
			archivo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileWriter archivoreal=new FileWriter(agenda,true);
			for(int i=0;i<contactos.size();i++) {//Escribir archivo
				archivoreal.write(contactos.get(i)+"\n");
			}
			archivoreal.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void crearArchivo(File agenda) {
		try {
			if(agenda.createNewFile()) {//Intentar crear el archivo o comprobar que ya existe
				System.out.println("Creado el archivo agenda.txt");
			}else {
				System.out.println("El archivo agenda.txt ya existe");
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private static void pintarAgenda(ArrayList<String> contactos) {
		for(int i=0;i<contactos.size();i++) {
			System.out.println(contactos.get(i));
		}
	}

	private static void bajaContacto(Scanner sca, ArrayList<String> contactos) {
		System.out.println("Introduzca nombre del contacto a dar de baja:");
		String nombre=sca.nextLine();
		boolean correcto=contactos.remove(nombre);
		if(correcto) {
			System.out.println("Baja realizada con éxito!. Numero de contactos en la agenda: "+contactos.size());
		}else {
			System.out.println("ERROR: El contacto no existe en la agenda");
		}
	}

	private static void altaContacto(Scanner sca, ArrayList<String> contactos) {
		boolean correcto=true;
		System.out.println("Introduzca nombre del nuevo contacto:");
		String nombre=sca.nextLine();//Leer contacto
		for(int i=0;i<contactos.size();i++) {
			if(nombre.equalsIgnoreCase(contactos.get(i))) {//Comprobar si el contacto ya existe
				correcto=false;
				System.out.println("ERROR: El contacto ya existe en la agenda");
				break;
			}
		}
		if(correcto==true) {
			contactos.add(nombre);//Añadir el nombre a los contactos
			System.out.println("Alta realizada con éxito!. Numero de contactos en la agenda: "+contactos.size());
		}
	}

	private static void pintarMenu() {
		System.out.println("-----MENU-----\n"
				+ "1-Dar de alta un contacto de la agenda\n"
				+ "2-Dar de baja un contacto de la agenda\n"
				+ "3-Listar agenda\n"
				+ "4-Salir");
	}
}