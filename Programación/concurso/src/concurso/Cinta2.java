package concurso;
import java.util.Scanner;
public class Cinta2 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int suma=0, tamano, njuegos, flag=0;
		tamano=sca.nextInt();
		suma=tamano;
		njuegos=sca.nextInt();
		int[] juegos=new int[njuegos];
		for(int i=0;i<njuegos;i++) {
			juegos[i]=sca.nextInt();
			if(juegos[i]>tamano/2) {
				flag=3;
			}else if(flag<3){
				suma=suma-juegos[i];
				if(suma<=0) {
					flag=flag+1;
				}
			}
		}
		if(flag<3) {
			System.out.print("SI");
		}else {
			System.out.print("NO");
		}
	}
}