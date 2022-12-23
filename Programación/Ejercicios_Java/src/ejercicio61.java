import java.util.*;
public class ejercicio61 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int filas, a_filas=0, a_columnas=0, a_diagonal=0, a_diagonal1=0, x, y, z;
		boolean escolumna=true, esfila=true, esdiagonal=false;
		//Obtener dimensiones del cuadrado
		System.out.println("Indique las filas del cuadrado");
		filas=sca.nextInt();
		//Declarar el cuadrado
		int[][] a=new int[filas][filas];
		int[] s_filas=new int[filas];
		int[] s_columnas=new int[filas];
		int[] s_diagonales=new int[2];
		//Llenar el cuadrado
		for(int i=0;i<filas;i++) {
			for(int j=0;j<filas;j++) {
				System.out.printf("Indica el valor en la posición %d, %d del cuadrado:\n",(i+1),(j+1));
				a[i][j]=sca.nextInt();
			}
		}
		System.out.println("El cuadrado resultante es");
		//Mostrar el cuadrado
		for(int i=0;i<filas;i++) {
			for(int j=0;j<filas;j++) {
				System.out.printf("%d ",a[i][j]);
			}
			System.out.print("\n");
		}
		//Hacer las sumas
		z=filas-1;
		for(y=0;y<filas;y++) {
			for(x=0;x<filas;x++) {
				a_filas=a_filas+a[x][y];
				a_columnas=a_columnas+a[y][x];
				if(x==y) {
					//Es una diagonal
					a_diagonal=a_diagonal+a[x][y];
				}
				if((y+x)==z) {
					//Es la otra diagonal
					a_diagonal1=a_diagonal1+a[x][y];
				}
			}
			//Terminada la suma de filas la guardamos en la matriz de filas
			s_filas[y]=a_filas;
			a_filas=0;
			//Terminada la suma de filas la guardamos en la matriz de filas
			s_columnas[y]=a_columnas;
			a_columnas=0;
			//Terminada la suma de diagonales la guardamos en la matriz
			s_diagonales[0]=a_diagonal;
			s_diagonales[1]=a_diagonal1;
		}
		//Comprobar la condición de diagonal
		if(s_diagonales[0]==s_diagonales[1]) {
			esdiagonal=true;
		}
		//Comprobar las columnas
		for(int i=1;i<s_columnas.length;i++) {
			if(s_columnas[i-1]!=s_columnas[i]) {
				escolumna=false;
			}
		}
		//Comprobar las filas
		for(int i=1;i<s_filas.length;i++) {
			if(s_filas[i-1]!=s_filas[i]) {
				esfila=false;
			}
		}
		//Comprobar la igualdad de todos los términos
		if(esdiagonal==true&&escolumna==true&&esfila==true&&s_diagonales[0]==s_columnas[0]&&s_diagonales[0]==s_filas[0]) {
			//Es mágico
			System.out.println("El cuadrado es mágico");
		}else {
			System.out.println("El cuadrado no es mágico");
		}
		sca.close();
	}
}
