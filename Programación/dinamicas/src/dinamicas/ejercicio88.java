package dinamicas;
import java.util.*;
public class ejercicio88 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		HashMap<Integer, String> acceso=new HashMap<Integer, String>();
		acceso.put(1, "Enrique");
		int error=0, usuario;
		String contra;
		boolean correcto;
		do {
			System.out.println("Usuario:");
			usuario=sca.nextInt();
			//Vaciar el buffer
			sca.nextLine();
			//Comprobar si existe
			correcto=acceso.containsKey(usuario);
			if(correcto==true) {
				System.out.println("Contraseña:");
				contra=sca.nextLine();
				if(acceso.get(usuario).equals(contra)) {
					//Comprobar si la contraseña es correcta
					System.out.println("Ha accedido al área restringida");
					break;
				}else {
					System.out.println("Contraseña incorrecta");
					error=error+1;
				}
			}else {
				System.out.println("Usuario inexistente");
				error=error+1;
			}
			if(error==3) {
				System.out.println("Lo siento, no tienes acceso al área restringida");
				break;
			}
		}while(error<3);
		sca.close();
	}
}