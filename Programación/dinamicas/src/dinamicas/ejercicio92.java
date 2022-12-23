package dinamicas;
import java.util.*;
public class ejercicio92 {
	public static String paises(HashMap<String, Integer> eurovision) {
		Scanner sca=new Scanner(System.in);
		Random r=new Random();
		int max=0, votos, i=0;
		String pais, p_ganador="";
		boolean correcto=false;
		while(correcto==false) {
			System.out.println("Introduzca el nombre del pais "+i);
			pais=sca.nextLine();
			if(pais.toUpperCase().equals("SALIR")&&i>=3) {
				break;
			}
			votos=(int)(r.nextDouble()*12+1);
			if(votos>max) {
				max=votos;
				p_ganador=pais;
			}
			eurovision.put(pais, votos);
			i=i+1;
		}
		return p_ganador;
	}
	public static void auditoria(HashMap<String, Integer> eurovision) {
		Scanner sca=new Scanner(System.in);
		String pais;
		int votos;
		boolean correcto=false;
		while(correcto==false) {
			System.out.println("Introduzca el nombre del país para saber su puntuación:");
			pais=sca.nextLine();
			if(pais.toUpperCase().equals("SALIR")) {
				break;
			}
			//Comprobar si el pais ha participado
			if(eurovision.containsKey(pais)==false) {
				System.out.println(pais+" no ha participado en el festival.");
			}else {
				//Obtener los votos del pais
				votos=eurovision.get(pais);
				System.out.println(pais+" ha recibido "+votos+".");
			}
		}
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		//Declarar el HashMap
		HashMap<String, Integer> eurovision=new HashMap<String, Integer>();
		int votos;
		String p_ganador;
		//Leer paises minimo 3
		System.out.println("¡Bienvenidos al festival de Eurovisión!");
		//Hallar pais ganador y votos
		p_ganador=paises(eurovision);
		votos=eurovision.get(p_ganador);
		System.out.println("Con las puntuaciones repartidas, el país ganador es: "+p_ganador+" con "+votos+" puntos.");
		//Auditoria
		auditoria(eurovision);
		sca.close();
	}
}