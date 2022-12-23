package examen2;
import java.util.*;
public class melomano {
	public static void pintar_menu() {//Funcion encargada de pintar el menu por consola
		System.out.println("------------------\n"
				+ "MENU DEL MELOMANO\n"
				+ "------------------\n"
				+ "1-Gestion grupos musicales\n"
				+ "2-Gestion cds\n"
				+ "3-Gestion vinilos\n"
				+ "4-Gestion cassetes\n"
				+ "5-Gestion dvds\n"
				+ "6-Listar información del grupo\n"
				+ "7-Salir");
	}
	public static boolean alta(String palabra) {//Validador de si queremos dar de alta o de baja
		Scanner sca=new Scanner(System.in);
		boolean alta=false, correcto;
		char registro;
		do {//Bucle validador y lector de registro
			correcto=false;
			System.out.println("¿Damos de alta o damos de baja "+palabra+"? (a/b):");
			registro=sca.nextLine().charAt(0);
			if(registro=='a'||registro=='b') {//Validacion de registro
				correcto=true;
			}else {
				System.out.println("ERROR! opcion "+registro+" incorrecta!, solo se admiten los valores a/b");
			}
		}while(correcto==false);
		if(registro=='a') {
			alta=true;
		}else {
			alta=false;
		}
		return alta;
	}
	public static void grupo(ArrayList<String> grupos) {
		Scanner sca=new Scanner(System.in);
		boolean correcto;
		String nombre, palabra="grupos";
		int posicion;
		System.out.println("¡Vamos a gestionar los grupos!");
		correcto=alta(palabra);
		if(correcto==true) {//Queremos dar de alta a un grupo
			do {//Bucle validador del nombre a dar de alta
				correcto=false;
				System.out.println("Introduzca nombre del grupo a dar de alta:");
				nombre=sca.nextLine();
				if(nombre.equals("")) {//Comprobar si el nombre esta vacio
					System.out.println("ERROR! nombre del grupo vacio!");
				}else {
					grupos.add(nombre);//Si el nombre es valido se introduce en la lista
					correcto=true;
					System.out.println("grupo nuevo dado de alta: "+nombre);
				}
			}while(correcto==false);
		}else {//Queremos dar de baja a un grupo
			do {//Bucle validador del nombre a dar de baja
				correcto=false;
				System.out.println("Introduzca nombre del grupo a dar de baja:");
				nombre=sca.nextLine();
				posicion=grupos.indexOf(nombre);//Buscar la posicion del grupo a dar de baja
				if(posicion==-1) {//Validar la existencia del grupo en la lista
					System.out.println("El grupo "+nombre+" no esta en la lista.");
				}else {
					grupos.remove(posicion);//Eliminar el grupo seleccionado
					correcto=true;
					System.out.println("grupo nuevo dado de alta: "+nombre);
				}
			}while(correcto==false);
		}
		System.out.println("Listado de grupos actualizado:");
		arrays(grupos);
	}
	public static void cd(ArrayList<String> grupos, ArrayList<String> cds) {//Funcion encargada de gestionar los cds de los grupos
		Scanner sca=new Scanner(System.in);
		String palabra="cds", nombre;
		boolean correcto;
		int posicion;
		System.out.println("¡Vamos a gestionar los cds!");
		correcto=alta(palabra);
		if(correcto==true) {//Queremos dar de alta
			do {//Bucle validador del cd
				correcto=true;
				System.out.println("Introduzca los datos del cd, (nombre del grupo:nombre del cd):");
				nombre=sca.nextLine();
				posicion=nombre.indexOf(":");
				if(posicion==-1) {//Validar el formato introduciro
					System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
					correcto=false;
				}else {
					String[]datos=nombre.split(":");//Separa grupo de cd
					posicion=grupos.indexOf(datos[0]);//Comproar que el grupo existe
					if(posicion==-1) {
						System.out.println("ERROR! El grupo "+datos[0]+" no existe!");
						correcto=false;
					}else {//El grupo existe luego introducimos el cd
						cds.add(nombre);
						correcto=true;
						System.out.println("cd "+datos[1]+" dado de alta para el grupo "+datos[0]+"!");
					}
				}
			}while(correcto==false);
		}else {//Queremos dar de baja a un cd
			do {//Bucle validador del cd
				System.out.println("Introduzca los datos del cd, (nombre del grupo:nombre del cd):");
				nombre=sca.nextLine();
				posicion=nombre.indexOf(":");
				if(posicion==-1) {//Validar el formato introduciro
					System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
					correcto=false;
				}else {
					String[]datos=nombre.split(":");//Separa grupo de cd
					posicion=grupos.indexOf(datos[0]);//Comproar que el grupo existe
					if(posicion==-1) {
						System.out.println("ERROR! El grupo "+datos[0]+" no existe!");
						correcto=false;
					}else {//El grupo existe
						posicion=cds.indexOf(nombre);
						if(posicion==-1) {
							System.out.println("ERROR! el cd "+datos[1]+" no existe!");
							correcto=false;
						}else {//El cd existe
							cds.remove(nombre);
							correcto=true;
							System.out.println("cd "+datos[1]+" dado de baja para el grupo"+datos[0]+"!");
						}
					}
				}
			}while(correcto=false);
		}
		System.out.println("Listado de cds actualizado:");
		arrays(cds);
	}
	public static void vinilos(ArrayList<String> grupos, ArrayList<String> vinilos) {//Funcion encargada de gestionar los cds de los grupos
		Scanner sca=new Scanner(System.in);
		String palabra="vinilos", nombre;
		boolean correcto;
		int posicion;
		System.out.println("¡Vamos a gestionar los vinilos!");
		correcto=alta(palabra);
		if(correcto==true) {//Queremos dar de alta
			do {//Bucle validador del cd
				correcto=true;
				System.out.println("Introduzca los datos del vinilo, (nombre del grupo:nombre del vinilo):");
				nombre=sca.nextLine();
				posicion=nombre.indexOf(":");
				if(posicion==-1) {//Validar el formato introduciro
					System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
					correcto=false;
				}else {
					String[]datos=nombre.split(":");//Separa grupo de cd
					posicion=grupos.indexOf(datos[0]);//Comproar que el grupo existe
					if(posicion==-1) {
						System.out.println("ERROR! El grupo "+datos[0]+" no existe!");
						correcto=false;
					}else {//El grupo existe luego introducimos el cd
						vinilos.add(nombre);
						System.out.println("vinilo "+datos[1]+" dado de alta para el grupo "+datos[0]+"!");
						correcto=true;
					}
				}
			}while(correcto==false);
		}else {//Queremos dar de baja a un cd
			do {//Bucle validador del cd
				System.out.println("Introduzca los datos del vinilo, (nombre del grupo:nombre del vinilo):");
				nombre=sca.nextLine();
				posicion=nombre.indexOf(":");
				if(posicion==-1) {//Validar el formato introduciro
					System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
					correcto=false;
				}else {
					String[]datos=nombre.split(":");//Separa grupo de cd
					posicion=grupos.indexOf(datos[0]);//Comproar que el grupo existe
					if(posicion==-1) {
						System.out.println("ERROR! El grupo "+datos[0]+" no existe!");
						correcto=false;
					}else {//El grupo existe
						posicion=vinilos.indexOf(nombre);
						if(posicion==-1) {
							System.out.println("ERROR! el vinilo "+datos[1]+" no existe!");
							correcto=false;
						}else {//El cd existe
							vinilos.remove(nombre);
							System.out.println("vinilo "+datos[1]+" dado de baja para el grupo"+datos[0]+"!");
							correcto=true;
						}
					}
				}
			}while(correcto=false);
			System.out.println("Listado de vinilos actualizado:");
			arrays(vinilos);
		}
		System.out.println("Listado de vinilos actualizado:");
		arrays(vinilos);
	}
	public static void casetes(ArrayList<String> grupos, ArrayList<String> casetes) {//Funcion encargada de gestionar los cds de los grupos
		Scanner sca=new Scanner(System.in);
		String palabra="cassetes", nombre;
		boolean correcto;
		int posicion;
		System.out.println("¡Vamos a gestionar los cassetes!");
		correcto=alta(palabra);
		if(correcto==true) {//Queremos dar de alta
			do {//Bucle validador del cd
				correcto=true;
				System.out.println("Introduzca los datos del cassete, (nombre del grupo:nombre del cassete):");
				nombre=sca.nextLine();
				posicion=nombre.indexOf(":");
				if(posicion==-1) {//Validar el formato introduciro
					System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
					correcto=false;
				}else {
					String[]datos=nombre.split(":");//Separa grupo de cd
					posicion=grupos.indexOf(datos[0]);//Comproar que el grupo existe
					if(posicion==-1) {
						System.out.println("ERROR! El grupo "+datos[0]+" no existe!");
						correcto=false;
					}else {//El grupo existe luego introducimos el cd
						casetes.add(nombre);
						correcto=true;
						System.out.println("cassete "+datos[1]+" dado de alta para el grupo "+datos[0]+"!");
					}
				}
			}while(correcto==false);
		}else {//Queremos dar de baja a un cd
			do {//Bucle validador del cd
				System.out.println("Introduzca los datos del cd, (nombre del grupo:nombre del cd):");
				nombre=sca.nextLine();
				posicion=nombre.indexOf(":");
				if(posicion==-1) {//Validar el formato introduciro
					System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
					correcto=false;
				}else {
					String[]datos=nombre.split(":");//Separa grupo de cd
					posicion=grupos.indexOf(datos[0]);//Comproar que el grupo existe
					if(posicion==-1) {
						System.out.println("ERROR! El grupo "+datos[0]+" no existe!");
						correcto=false;
					}else {//El grupo existe
						posicion=casetes.indexOf(nombre);
						if(posicion==-1) {
							System.out.println("ERROR! el cd "+datos[1]+" no existe!");
							correcto=false;
						}else {//El cd existe
							casetes.remove(nombre);
							correcto=true;
							System.out.println("cassete "+datos[1]+" dado de baja para el grupo"+datos[0]+"!");
						}
					}
				}
			}while(correcto=false);
			System.out.println("Listado de cassetes actualizado:");
			arrays(casetes);
		}
	}
	public static void dvd(ArrayList<String> grupos, ArrayList<String> dvds) {//Funcion encargada de gestionar los cds de los grupos
		Scanner sca=new Scanner(System.in);
		String palabra="dvds", nombre;
		boolean correcto;
		int posicion;
		System.out.println("¡Vamos a gestionar los dvds!");
		correcto=alta(palabra);
		if(correcto==true) {//Queremos dar de alta
			do {//Bucle validador del cd
				correcto=true;
				System.out.println("Introduzca los datos del dvd, (nombre del grupo:nombre del dvd):");
				nombre=sca.nextLine();
				posicion=nombre.indexOf(":");
				if(posicion==-1) {//Validar el formato introduciro
					System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
					correcto=false;
				}else {
					String[]datos=nombre.split(":");//Separa grupo de cd
					posicion=grupos.indexOf(datos[0]);//Comproar que el grupo existe
					if(posicion==-1) {
						System.out.println("ERROR! El grupo "+datos[0]+" no existe!");
						correcto=false;
					}else {//El grupo existe luego introducimos el cd
						dvds.add(nombre);
						correcto=true;
						System.out.println("dvd "+datos[1]+" dado de alta para el grupo "+datos[0]+"!");
					}
				}
			}while(correcto==false);
		}else {//Queremos dar de baja a un cd
			do {//Bucle validador del cd
				System.out.println("Introduzca los datos del dvd, (nombre del grupo:nombre del dvd):");
				nombre=sca.nextLine();
				posicion=nombre.indexOf(":");
				if(posicion==-1) {//Validar el formato introduciro
					System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
					correcto=false;
				}else {
					String[]datos=nombre.split(":");//Separa grupo de cd
					posicion=grupos.indexOf(datos[0]);//Comproar que el grupo existe
					if(posicion==-1) {
						System.out.println("ERROR! El grupo "+datos[0]+" no existe!");
						correcto=false;
					}else {//El grupo existe
						posicion=dvds.indexOf(nombre);
						if(posicion==-1) {
							System.out.println("ERROR! el dvd "+datos[1]+" no existe!");
							correcto=false;
						}else {//El cd existe
							dvds.remove(nombre);
							correcto=true;
							System.out.println("dvd "+datos[1]+" dado de baja para el grupo"+datos[0]+"!");
						}
					}
				}
			}while(correcto=false);
		}
		System.out.println("Listado de dvds actualizado:");
		arrays(dvds);
	}
	public static void listar(ArrayList<String> grupos, ArrayList<String> cds, ArrayList<String> vinilos, ArrayList<String> casetes, ArrayList<String> dvds) {
		Scanner sca=new Scanner(System.in);
		String nombre, frase;
		int posicion, contador=0;
		boolean correcto=false;
		do {//Bucle validador del nombre del grupo
			System.out.println("Introduzca nombre del grupo:");
			nombre=sca.nextLine();
			correcto=false;
			posicion=grupos.indexOf(nombre);
			if(posicion==-1) {
				System.out.println("ERROR! El grupo no existe!");
			}else {
				correcto=true;
			}
		}while(correcto==false);
		System.out.println("Esto es lo que tengo de "+nombre+":\n-CDs:");
		for(int i=0;i<cds.size();i++) {//Bucle para recorrer el array de CDs
			frase=cds.get(i);
			String[] datos=frase.split(":");
			if(datos[0].equals(nombre)) {//Si el grupo es correcto imprime el CD por consola
				System.out.println("\t"+datos[1]);
				contador=contador+1;
			}
		}
		if(contador==0) {
			System.out.println("\tNada");
		}
		contador=0;
		System.out.println("-Vinilos:");
		for(int i=0;i<vinilos.size();i++) {//Bucle para recorrer el array de CDs
			frase=vinilos.get(i);
			String[] datos=frase.split(":");
			if(datos[0].equals(nombre)) {//Si el grupo es correcto imprime el CD por consola
				System.out.println("\t"+datos[1]);
				contador=contador+1;
			}
		}
		if(contador==0) {
			System.out.println("\tNada");
		}
		contador=0;
		System.out.println("-Cassetes:");
		for(int i=0;i<casetes.size();i++) {//Bucle para recorrer el array de CDs
			frase=casetes.get(i);
			String[] datos=frase.split(":");
			if(datos[0].equals(nombre)) {//Si el grupo es correcto imprime el CD por consola
				System.out.println("\t"+datos[1]);
				contador=contador+1;
			}
		}
		if(contador==0) {
			System.out.println("\tNada");
		}
		contador=0;
		System.out.println("-DVDs");
		for(int i=0;i<dvds.size();i++) {//Bucle para recorrer el array de CDs
			frase=dvds.get(i);
			String[] datos=frase.split(":");
			if(datos[0].equals(nombre)) {//Si el grupo es correcto imprime el CD por consola
				System.out.println("\t"+datos[1]);
				contador=contador+1;
			}
		}
		if(contador==0) {
			System.out.println("\tNada");
		}
		contador=0;
	}
	public static void arrays(ArrayList<String> a) {
		for(int i=0;i<a.size();i++) {
			System.out.println("-"+a.get(i));
		}
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		ArrayList<String> grupos=new ArrayList<String>();
		ArrayList<String> cds=new ArrayList<String>();
		ArrayList<String> vinilos=new ArrayList<String>();
		ArrayList<String> casetes=new ArrayList<String>();
		ArrayList<String> dvds=new ArrayList<String>();
		int opcion=0;
		do {//Bucle para seleccionar y llamar a las opciones, se termina cuando se selecciona la opcion 7-Salir
			pintar_menu();
			opcion=sca.nextInt();
			switch(opcion) {
			case 1://Gestion grupos
				grupo(grupos);
				break;
			case 2://Gestion cds
				cd(grupos, cds);
				break;
			case 3://Gestion vinilos
				vinilos(grupos, vinilos);
				break;
			case 4://Gestion cassetes
				casetes(grupos, casetes);
				break;
			case 5://Gestion dvds
				dvd(grupos, dvds);
				break;
			case 6://Listar información de un grupo
				listar(grupos, cds, vinilos, casetes, dvds);
				break;
			case 7://Salir
				System.out.println("Gracias por utilizar este software!");
				break;
			default://Opcion inexistente
				System.out.println("ERROR! Opción inexistente!");
				break;
			}
		}while(opcion!=7);
		sca.close();
	}
}