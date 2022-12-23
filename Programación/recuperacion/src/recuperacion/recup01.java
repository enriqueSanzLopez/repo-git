package recuperacion;
import java.util.*;
public class recup01 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int opcion, posicion=0;
		String[] nombres= {"","",""};
		String[] apellidos1={"","",""};
		String[] apellidos2={"","",""};
		String nombre="", apellido1="", apellido2="";
		//Mostrar el menu por pantalla
		do {
			System.out.println("------------------\n"
					+ "1-Introduce un nombre\n"
					+ "2-Agregar un nombre a la lista\n"
					+ "3-Listar nombres en la agenda\n"
					+ "4-Salir del programa\n"
					+"------------------");
			//Leer la opcion seleccionada
			opcion=sca.nextInt();
			//Vaciar el buffer
			sca.nextLine();
			//Introducirnos en la opcion
			switch(opcion) {
			case 1:
				//Introducir un nombre
				System.out.println("Introduzca nombre y 2 apellidos por favor:");
				do {
					nombre=sca.nextLine();
					if(nombre.equals("")) {
						System.out.println("ERROR!, el nombre no puede estar vacío");
					}
				}while(nombre.equals(""));
				do {
					apellido1=sca.nextLine();
					if(apellido1.equals("")) {
						System.out.println("ERROR!, el primero apellido no puede estar vacío");
					}
				}while(apellido1.equals(""));
				do {
					apellido2=sca.nextLine();
					if(apellido2.equals("")) {
						System.out.println("ERROR!, el segundo apellido no puede estar vacío");
					}
				}while(apellido2.equals(""));
				System.out.println("Nombre: "+nombre+"\nPrimer apellido: "+apellido1+"\nSegundo apellido: "+apellido2);
				break;
			case 2:
				//Agregar el nombre
				if(nombre.equals("")&&apellido1.equals("")&&apellido2.equals("")) {
					//No se ha especificado un contacto
					System.out.println("Todavía no se ha tecleado ningún nombre.");
					break;
				}else {
					//Se ha especificado un contacto, comprobar que la agenda no este llena
					if(!nombres[0].equals("")&&!nombres[1].equals("")&&!nombres[2].equals("")) {
						//La agenda esta llena
						System.out.println("La agenda ya está llena.");
						break;
					}else {
						//La agenda no esta llena, guardamos el contacto
						nombres[posicion]=nombre;
						apellidos1[posicion]=apellido1;
						apellidos2[posicion]=apellido2;
						posicion=posicion+1;
						System.out.printf("%s %s %s agregado a la agenda en la posición %d\n",nombres[posicion-1],apellidos1[posicion-1],apellidos2[posicion-1],posicion);
						break;
					}
				}
			case 3:
				//Listar los nombres
				for(int i=0;i<3;i++) {
					System.out.println("Posicion "+(i+1)+": "+nombres[i]+" "+apellidos1[i]+" "+apellidos2[i]);
				}
				break;
			case 4:
				//Salir del programa
				break;
			default:
				//Opcion incorrecta
				System.out.println("ERROR!, la opción especificada es inexistente.");
				break;
			}
		}while(opcion!=4);
		sca.close();
	}
}