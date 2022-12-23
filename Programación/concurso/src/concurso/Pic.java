package concurso;
import java.util.Scanner;
public class Pic {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int sonidos=1;
		String sonido;
		boolean lado=false;
		while(sonidos!=0) {
			int izquierda=0, derecha=0;
			sonidos=sca.nextInt();
			sca.nextLine();
			if(sonidos==0){
				break;
			}
			for(int i=0;i<sonidos;i++) {
				sonido=sca.nextLine();
				if(sonido.equals("PIC")) {
					lado=true;
				}else if(sonido.equals("POC")) {
					lado=false;
				}else if(sonido.equals("PONG!")) {
					if(lado==true) {
						izquierda=izquierda+1;
					}else {
						derecha=derecha+1;
					}
				}
			}
			System.out.println(izquierda+" "+derecha);
		}
	}
}