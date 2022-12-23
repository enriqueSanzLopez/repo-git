package recursividad;
import java.util.Scanner;
public class ejercicio83 {
	public static String elegir_frase_maquina(int n) {
		String frase="";
		switch(n) {
		case 1:
			frase="1-Eres tan repulsivo como una mona marrana";
			break;
		case 2:
			frase="2-Mis ataques han dejado islas enteras sin soldados";
			break;
		case 3:
			frase="3-Tu cara haría vomitar hasta el cerdo menos aseado";
			break;
		case 4:
			frase="4-Mis habilidades con la espada son muy veneradas";
			break;
		case 5:
			frase="5-Piedad, te lo ruego, no mas insultos por favor";
			break;
		default:
			frase="ERROR DE EJECUCIÓN";
			break;
		}
		return frase;
	}
	public static String elegir_opcion_humano() {
		Scanner sca=new Scanner(System.in);
		String frase="";
		char opcion;
		System.out.println("a) Que pena que todas esten inventadas\n"
				+ "b) Y eso sin contar a las otras con las que te has citado\n"
				+ "c) Tu olor y tu cara me recuerda a un queso sin frescor\n"
				+ "d) Eso es porque me parezco mucho a tu hermana\n"
				+ "e) Con tu aliento, seguro que todos fueron asfixiados");
		opcion=sca.next().charAt(0);
		switch(opcion) {
		case 'a':
			frase="a) Que pena que todas esten inventadas";
			break;
		case 'b':
			frase="b) Y eso sin contar a las otras con las que te has citado";
			break;
		case 'c':
			frase="c) Tu olor y tu cara me recuerda a un queso sin frescor";
			break;
		case 'd':
			frase="d) Eso es porque me parezco mucho a tu hermana";
			break;
		case 'e':
			frase="e) Con tu aliento, seguro que todos fueron asfixiados";
		}
		return frase;
	}
	public static boolean exito(int puntos, String Jfrase) {
		boolean exito=false;
		String[] dividida=Jfrase.split("");
		switch(puntos) {
		case 1:
			if(dividida[0].equals("d")) {
				exito=true;
			}
			break;
		case 2:
			if(dividida[0].equals("e")) {
				exito=true;
			}
			break;
		case 3:
			if(dividida[0].equals("b")) {
				exito=true;
			}
			break;
		case 4:
			if(dividida[0].equals("a")) {
				exito=true;
			}
			break;
		case 5:
			if(dividida[0].equals("c")) {
				exito=true;
			}
			break;
		default:
			System.out.println("ERROR!");
			break;
		}
		return exito;
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		String Mfrase, Jfrase;
		int puntos=0, errores=0;
		boolean exito;
		System.out.println("COMIENZA LA BATALLA DE INSULTOS DE MONKEY ISLAND!");
		do {
			Mfrase=elegir_frase_maquina(puntos+1);
			System.out.println(Mfrase);
			Jfrase=elegir_opcion_humano();
			exito=exito(puntos+1,Jfrase);
			if(exito==true) {
				//El jugador ha rimado
				puntos=puntos+1;
				System.out.println("Punto para mi");
			}else {
				errores=errores+1;
				if(errores!=3) {
					System.out.println("Fallo "+errores+" de 3!. Me han hecho pupita! Intentalo de nuevo!");
				}else {
					System.out.println("Fallo 3 de 3!");
				}
			}
		}while(puntos<5&&errores<3);
		//Comprobar si has ganado o has perdido
		if(puntos==5) {
			System.out.println("Enhorabuena! Has ganado la batalla de insultos de Monkey Island!");
		}else {
			System.out.println("Has perdido!\n"
					+ "GAME OVER!");
		}
		sca.close();
	}
}