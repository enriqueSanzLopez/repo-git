import java.util.*;
public class ejercicio33 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int Suma=0;
		boolean respuesta=false;
		System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
		respuesta=teclado.nextBoolean();
		if(respuesta==true) {
			Suma=Suma+3;
		}
		System.out.println("Ha aumentado sus gastos de vestuario.");
		respuesta=teclado.nextBoolean();
		if(respuesta==true) {
			Suma=Suma+3;
		}
		System.out.println("Ha perdido el interés que mostraba anteriormente por ti.");
		respuesta=teclado.nextBoolean();
		if(respuesta==true) {
			Suma=Suma+3;
		}
		System.out.println("Ahora se asea con más frecuencia.");
		respuesta=teclado.nextBoolean();
		if(respuesta==true) {
			Suma=Suma+3;
		}
		System.out.println("No te deja que mires la agenda de su teléfono móvil.");
		respuesta=teclado.nextBoolean();
		if(respuesta==true) {
			Suma=Suma+3;
		}
		System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
		respuesta=teclado.nextBoolean();
		if(respuesta==true) {
			Suma=Suma+3;
		}
		System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
		respuesta=teclado.nextBoolean();
		if(respuesta==true) {
			Suma=Suma+3;
		}
		System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
		respuesta=teclado.nextBoolean();
		if(respuesta==true) {
			Suma=Suma+3;
		}
		System.out.println("Has notado que últimamente se perfuma más.");
		respuesta=teclado.nextBoolean();
		if(respuesta==true) {
			Suma=Suma+3;
		}
		System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
		respuesta=teclado.nextBoolean();
		if(respuesta==true) {
			Suma=Suma+3;
		}
		if(Suma<=10) {
			System.out.println("Enhorabuena! tu pareja parece ser totalmente fiel.");
		}else if(Suma<=22) {
			System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
		}else if(Suma<=30) {
			System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
		}else if(Suma>30) {
			System.out.println("Ha habido un error.");
		}
		teclado.close();
	}
}
