import java.util.*;
public class Matrizpizarra2 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int tamano;
		Random r=new Random();
		//Obtener el tamano
		do {
			System.out.println("Introduce el numero de filas de la matriz:");
			tamano=sca.nextInt();
			if(tamano<=0) {
				System.out.println("ERROR: El valor tiene que ser superior que 0");
			}
		}while(tamano<=0);
		int[][] matriz1=new int[tamano][tamano];
		int[][] matriz2=new int[tamano][tamano];
		int[][] matriz3=new int[tamano][tamano];
		//Leer los valores de las matrices y sumar
		for(int i=0;i<tamano;i++) {
			//Recorre las filas
			for(int j=0;j<tamano;j++) {
				//Llenar las matrices y hacer la suma
				matriz1[i][j]=(int)(r.nextDouble()*100+1);
				matriz2[i][j]=(int)(r.nextDouble()*100+1);
				matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
			}
		}
		//Imprime las matrices y el resultado
		System.out.println("Matriz 1:");
		for(int i=0;i<tamano;i++) {
			for(int j=0;j<tamano;j++) {
				if(j==tamano-1) {
					//Es el ultimo valor a mostrar
					System.out.print(matriz1[i][j]+"\n");
				}else {
					System.out.print(matriz1[i][j]+", ");
				}
			}
		}
		System.out.println("Matriz 2:");
		for(int i=0;i<tamano;i++) {
			for(int j=0;j<tamano;j++) {
				if(j==tamano-1) {
					//Es el ultimo valor a mostrar
					System.out.print(matriz2[i][j]+"\n");
				}else {
					System.out.print(matriz2[i][j]+", ");
				}
			}
		}
		System.out.println("Y la matriz resultante es:");
		for(int i=0;i<tamano;i++) {
			for(int j=0;j<tamano;j++) {
				if(j==tamano-1) {
					//Es el ultimo valor a mostrar
					System.out.print(matriz3[i][j]+"\n");
				}else {
					System.out.print(matriz3[i][j]+", ");
				}
			}
		}
		sca.close();
	}
}
