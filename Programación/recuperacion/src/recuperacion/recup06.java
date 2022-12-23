package recuperacion;
import java.util.*;
public class recup06 {
	public static void main(String arg[]) {
		Random r=new Random();
		int fila=0, columna=0, contador=0;
		//Intentos hasta centrar la cruz
		while(fila!=4||columna!=4) {
			contador=contador+1;
			//Definir las filas y columnas en los que se dibuja
			fila=(int)(r.nextDouble()*8+0);
			columna=(int)(r.nextDouble()*8+0);
			System.out.println("Intento número "+contador);
			//Recorrer la bandera
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					if(i==fila||j==columna) {
						System.out.print("+ ");
					}else {
						System.out.print("· ");
					}
				}
				//Salto de linea
				System.out.print("\n");
			}
		}
		System.out.println("Habemus bandera!");
	}
}