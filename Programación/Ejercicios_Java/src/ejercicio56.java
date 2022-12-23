import java.util.*;
public class ejercicio56 {
	public static void main(String arg[]) {
		Scanner src=new Scanner(System.in);
		int filas, columnas;
		System.out.println("Introduce las filas de la matriz:");
		filas=src.nextInt();
		System.out.println("Introduce las columnas de la matriz:");
		columnas=src.nextInt();
		double[][] a=new double[filas][columnas];
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.println("Introduce un valor:");
				a[i][j]=src.nextDouble();
			}
		}
		System.out.println("La matriz resultante es:");
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		src.close();
	}
}
