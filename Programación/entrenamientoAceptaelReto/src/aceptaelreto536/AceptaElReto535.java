package aceptaelreto536;
import java.util.Scanner;
public class AceptaElReto535 {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		while(sca.hasNextLine()) {//Valores iniciales y pedir casos
			int tamano0=-1, agua0=-1, distancia0=-1, abono0=-1, casos=sca.nextInt();
			String nombre0="", wnombre="";
			for(int i=0;i<casos;i++) {
				if(i==0) {//Primer caso
					tamano0=sca.nextInt();
					abono0=sca.nextInt();
					agua0=sca.nextInt();
					distancia0=sca.nextInt();
					nombre0=sca.nextLine();
					wnombre=nombre0;
				}else {//No es el primer caso
					int tamano=sca.nextInt();
					int abono=sca.nextInt();
					int agua=sca.nextInt();
					int distancia=sca.nextInt();
					String nombre=sca.nextLine();
					if(tamano>tamano0) {//Comenzamos comparaciones
						wnombre=nombre;
					}else if(tamano==tamano0) {
						if(agua<agua0) {
							wnombre=nombre;
						}else if(agua==agua0) {
							if(distancia<distancia0) {
								wnombre=nombre;
							}else if(distancia==distancia0) {
								if(abono<abono0) {
									wnombre=nombre;
								}
							}
						}
					}
					nombre0=nombre;//Reset del caso anterior
					tamano0=tamano;
					abono0=abono;
					agua0=agua;
					distancia0=distancia;
				}
			}
			wnombre=wnombre.substring(1,wnombre.length());//Eliminado de espacio inicial
			System.out.println(wnombre);
		}
	}
}