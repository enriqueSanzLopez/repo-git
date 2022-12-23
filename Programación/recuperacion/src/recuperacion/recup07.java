package recuperacion;
import java.util.*;
public class recup07 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		String[][] rimas= {{"A", ""},{"B", ""},{"C", ""},{"D", ""},{"E", ""},{"F", ""},{"G", ""},{"H", ""},{"I", ""},{"J", ""},{"K", ""},{"L", ""},{"M", ""},{"N", ""},{"O", ""},{"P", ""},{"Q", ""},{"R", ""},{"S", ""},{"T", ""},{"U", ""},{"V", ""},{"W", ""},{"X", ""},{"Y", ""},{"Z", ""}};
		System.out.println("Introduzca el título de poema:");
		String titulo=sca.nextLine();
		System.out.println("Introduzca el número de versos para el poema:");
		int versos=sca.nextInt();
		String[] poema=new String[versos];
		//Vaciar el buffer
		sca.nextLine();
		//Escribir el poema
		for(int i=0;i<versos;i++) {
			//Leer verso
			System.out.println("Introduzca el verso número "+(i+1)+":");
			poema[i]=sca.nextLine();
			String rima=poema[i].substring(poema[i].length()-3);
			//Leer las dos ultimas letras del verso y asignarle una rima
			for(int j=0;j<26;j++) {
				if(rima.equals(rimas[i][1])) {
					//La rima ya ha sido creada
					poema[i]=poema[i]+" "+rimas[i][0];
					break;
				}else if(rimas[i][1].equals("")) {
					//Todavia no se ha usado esta letra
					rimas[i][1]=rima;
					poema[i]=poema[i]+" "+rimas[i][0];
					break;
				}
			}
		}
		//Imprimir el poema
		System.out.println(titulo+"\n============================================");
		for(int i=0;i<versos;i++) {
			//Imprimir cada verso
			System.out.println(poema[i]);
		}
		//Comprobar si es octava real
		if(poema[0].substring(poema[0].length()-1).equals("A")&&poema[1].substring(poema[1].length()-1).equals("B")&&poema[2].substring(poema[2].length()-1).equals("A")&&poema[3].substring(poema[3].length()-1).equals("B")&&poema[4].substring(poema[4].length()-1).equals("A")&&poema[5].substring(poema[5].length()-1).equals("B")&&poema[6].substring(poema[6].length()-1).equals("C")&&poema[7].substring(poema[7].length()-1).equals("C")) {
			System.out.println("\nEstructura de octava real conseguida!");
		}
		sca.close();
	}
}