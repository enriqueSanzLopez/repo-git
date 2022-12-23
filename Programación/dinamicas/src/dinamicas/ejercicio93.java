package dinamicas;
import java.util.*;
public class ejercicio93 {
	public static void pintar(Queue<String> cola) {
		//Bucle for each
		for(String nombre:cola) {
			System.out.println(nombre);
		}
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		Queue<String> cola=new LinkedList<String>();
		String nombres;
		int salidas;
		boolean salir=false;
		while(salir==false) {
			salidas=0;
			System.out.println("Introduzca nombres para ENTRAR separados por @, 'nadie' para que no entre nadie, o 'salir' para finalizar el programa:");
			nombres=sca.nextLine();
			//Comprobar si finaliza el programa
			if(nombres.toUpperCase().equals("SALIR")) {
				break;
			}
			//Comprobar si entra alguien
			if(!nombres.toUpperCase().equals("NADIE")) {
				//Entra gente
				String[] individuos=nombres.split("@");
				//Llenar la cola
				for(int i=0;i<individuos.length;i++) {
					cola.add(individuos[i]);
				}
			}
			System.out.println("Estado de la cola después de ENTRAR:");
			//Mostrar la cola
			pintar(cola);
			//Salidas de la cola
			System.out.println("Introduzca el número de personas para SALIR de la cola:");
			//Validar el numero de salidas
			do {
				salidas=sca.nextInt();
				if(salidas>cola.size()) {
					System.out.println("No pueden salir 4 personas porque en la cola solo hay "+cola.size()+" personas.");
				}
			}while(salidas>cola.size());
			sca.nextLine();
			for(int i=0;i<salidas;i++) {
				System.out.println("Sale de la cola "+cola.element());
				cola.remove();
			}
			System.out.println("Estado de la cola después de SALIR:");
			pintar(cola);
		}
		sca.close();
	}
}