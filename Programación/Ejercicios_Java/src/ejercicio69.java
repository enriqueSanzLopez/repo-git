import java.util.*;
public class ejercicio69 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		String correo;
		int k, error=0, h;
		int[] extension=new int[4];
		//Pedir el correo
		System.out.println("Introduzca su e-mail:");
		correo=sca.nextLine();
		//Error 1: no existe el caracter @
		k=correo.indexOf("@");
		//Error 4: no existe el caracter .
		h=correo.indexOf(".");
		//Error 6: no tiene una extension adecuada
		extension[0]=correo.indexOf(".com");
		extension[1]=correo.indexOf(".es");
		extension[2]=correo.indexOf(".org");
		extension[3]=correo.indexOf(".gov");
		if(extension[0]==-1&&extension[1]==-1&&extension[2]==-1&&extension[3]==-1) {
			//El correo no tiene una extension valida
			error=6;
		}
		//Error 5: identificador2 es mas pequeno que 3 caracteres
		if((h-k)<4) {
			//El indentificador2 es demasiado pequeno
			error=5;
		}
		//Error 4
		if(h==-1||h<k) {
			//El correo no tiene punto depues de la @
			error=4;
		}
		//Error 3: el identificador 1 tiene una longitud inferior a 4 caracteres
		if(k<4) {
			//identificador1 es demasiado pequeno
			error=3;
		}
		//Error 2: antes del @ no hay un identificador1
		if(k==0) {
			//No existe identificador1
			error=2;
		}
		//Error 1:
		if(k==-1) {
			//Falta el @
			error=1;
		}
		switch(error) {
		case 0:
			//Correo correcto
			System.out.println("Enhorabuena! Mail correcto!");
			break;
		case 1:
			//Falta el @
			System.out.println("ERROR1: No existe una @");
			break;
		case 2:
			//No existe el identificador1
			System.out.println("ERROR2: La dirección empieza por una @");
			break;
		case 3:
			//identificador1 es demasiado pequeno
			System.out.println("ERROR3: El identificador1 no llega a 4 caracteres");
			break;
		case 4:
			//El correo no tiene un punto despues de la @
			System.out.println("ERROR4: Después de la @ no hay un punto");
			break;
		case 5:
			//El identificador2 no llega a 3 caracteres
			System.out.println("ERROR5: El identificador2 no llega a 3 caracteres");
			break;
		case 6:
			//Dominio inadecuado
			System.out.println("ERROR6: Dominio distinto a .com, .es, .org y .gov");
			break;
		default:
			System.out.println("ERROR desconocido");
			break;
		}
		sca.close();
	}
}
