import java.util.*;
public class ejercicio58 {
	public static void main(String arg[]) {
		Random r=new Random();
		//Tiene que estar entre 4 y 28 y ser un múltiplo de 4
		int notas, i, caso, caso1=0;
		notas=4*(int)(r.nextDouble()*7+1);
		for(i=0;i<notas;i++) {
			if(i==0) {
				caso1=(int)(r.nextDouble()*7+0);
				caso=caso1;
			}else if(i!=notas-1) {
				caso=(int)(r.nextDouble()*7+0);
			}else {
				caso=caso1;
			}
			switch(caso) {
			case 0:
				System.out.printf("do ");
				break;
			case 1:
				System.out.printf("re ");
				break;
			case 2:
				System.out.printf("mi ");
				break;
			case 3:
				System.out.printf("fa ");
				break;
			case 4:
				System.out.printf("sol ");
				break;
			case 5:
				System.out.printf("la ");
				break;
			case 6:
				System.out.printf("si ");
				break;
			default:
				System.out.printf("ERROR ");
				break;
			}
			if((i+1)%4==0&&i!=notas-1) {
				System.out.printf("| ");
			}else if(i==notas-1) {
				System.out.printf("||");
			}
		}
	}
}
