package ejercicio101;
import java.util.*;
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		ArrayList<Animal> zoo=new ArrayList<Animal>();
		int opcion, peso;
		char letra;
		String nombre;
		boolean correcto;
		do {
			int posicion=0;
			pintarMenu();
			try {
				opcion=leer_opcion();
			}catch(InputMismatchException el) {//Comprueba que la entrada es numérica
				System.out.println("ERROR: Debes ingresar valores enteros");
				opcion=0;
			}catch(Exception e) {
				opcion=0;
				System.out.println(e.getMessage());
			}
			switch(opcion) {
			case 1://Alta animal
				System.out.println("Introduzca el tipo de animal (l-leon, t-tigre):");
				try {
					letra=leer_letra();//Leer la letra
				}catch(Exception let) {
					System.out.println(let.getMessage());
					break;
				}
				System.out.println("Introduzca el nombre del animal (Sin incluir numeros!):");
				try {
					nombre=leer_nombre();//Leer el nombre
				}catch(Exception nam) {
					System.out.println(nam.getMessage());
					break;
				}
				System.out.println("Introduzca el peso del animal:");
				try {//Leer el peso
					peso=leer_peso();
				}catch(InputMismatchException nonum) {
					System.out.println("ERROR: Valor no numérico");
					break;
				}catch(Exception genum) {
					System.out.println(genum.getMessage());
					break;
				}
				Animal a=new Animal(nombre, letra, peso);//Declarar el animal
				zoo.add(a);//Guardar el animal en el zoo
				break;
			case 2://Baja animal
				correcto=false;
				System.out.println("Introduzca el nombre del animal para dar de baja:");
				nombre=sca.nextLine();//Pedir el nombre
				for(int i=0;i<zoo.size();i++) {//Recorrer la matriz buscando el nombre
					Animal b=zoo.get(i);//Seleccionar un animal
					if(b.getNombre().equals(nombre)) {//El animal existe
						correcto=true;
						posicion=i;
						break;
					}
				}
				if(correcto==false) {//El animal no existe
					System.out.println("ERROR: El animal seleccionado no existe");
				}else {
					zoo.remove(posicion);//Eliminar al animal
					System.out.println("Animal de nombre "+nombre+" dado de baja");
				}
				break;
			case 3://Modificar peso
				correcto=false;
				System.out.println("Introduzca el nombre del animal para modificar el peso:");
				nombre=sca.nextLine();
				for(int i=0;i<zoo.size();i++) {//Recorrer la matriz buscando el nombre
					Animal b=zoo.get(i);//Seleccionar un animal
					if(b.getNombre().equals(nombre)) {//El animal existe
						correcto=true;
						posicion=i;
						break;
					}
				}
				if(correcto==false) {
					System.out.println("ERROR: El animal seleccionado no existe");
					break;
				}else {
					System.out.println("Introduzca el nuevo peso para "+nombre);
					try {//Leer el peso
						peso=leer_peso();
					}catch(InputMismatchException nonum) {
						System.out.println("ERROR: Valor no numérico");
						break;
					}catch(Exception genum) {
						System.out.println(genum.getMessage());
						break;
					}
					Animal c=zoo.get(posicion);
					c.setPeso(peso);
					zoo.set(posicion, c);
				}
				break;
			case 4://Listar
				pintarZoo(zoo);
				break;
			case 5://Salir
				System.out.println("Gracias por utilizar este Zoo.\n"
						+ "Y acuerdate que tigres y leones, todos quieren ser los campeones.");
				break;
			default://Se ha producido un error
				break;
			}
		}while(opcion!=5);
		sca.close();
	}
	private static void pintarZoo(ArrayList<Animal> zoo) {
		for(int i=0;i<zoo.size();i++) {//Printear los animales
			Animal animal=zoo.get(i);
			animal.pintarAnimal();
		}
	}
	private static void pintarMenu() {
		System.out.println("Bienvenido al Zoo Tigres & Leones\n"
				+ "---------------------------------\n"
				+ "1-Dar de alta animal\n"
				+ "2-Dar de baja animal\n"
				+ "3-Modificar peso\n"
				+ "4-Listado animales\n"
				+ "5-Salir");
	}
	public static int leer_opcion() throws Exception{//Comprueba si la opción es válida
		Scanner s=new Scanner(System.in);
		int dato=s.nextInt();
		switch(dato) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			throw new Exception("ERROR: Opción incorrecta");
		}
		return dato;
	}
	public static char leer_letra() throws Exception{
		Scanner s=new Scanner(System.in);
		char letra=s.nextLine().charAt(0);
		switch(letra) {
		case 'l':
			break;
		case 't':
			break;
		default:
			throw new Exception("ERROR: Esto no es ni un tigre ni un león!");
		}
		return letra;
	}
	public static String leer_nombre() throws Exception{
		Scanner s=new Scanner(System.in);
		String nombre=s.nextLine();
		for(int i=0;i<10;i++) {
			int p=nombre.indexOf(i+"");
			if(p!=-1) {
				throw new Exception("ERROR: El nombre contiene el número "+i);
			}
		}
		return nombre;
	}
	public static int leer_peso() throws Exception {
		Scanner s=new Scanner(System.in);
		int peso=s.nextInt();
		if(peso<0) {
			throw new Exception("ERROR: Valor inferior a 0");
		}
		return peso;
	}
}