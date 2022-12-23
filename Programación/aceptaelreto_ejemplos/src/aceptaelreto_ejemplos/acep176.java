package aceptaelreto_ejemplos;
import java.util.Scanner;
public class acep176 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		while(sca.hasNext()) {
			int columnas=sca.nextInt();
			int filas=sca.nextInt();
			sca.nextLine();//Vacia buffer
			if(columnas==0&&filas==0) {
				break;
			}
			char[][] campo = getcampo(sca, columnas, filas);
			contar6minas(columnas, filas, campo);
		}
	}

	private static void contar6minas(int columnas, int filas, char[][] campo) {
		int contador2, contador=0;
		for(int i=1;i<filas-1;i++) {
			for(int j=1;j<columnas-1;j++) {
				if(campo[i][j]=='-') {
					contador2=0;
					if(campo[i-1][j-1]=='*') {//Arriba izquierda
						contador2=contador2+1;
					}
					if(campo[i-1][j]=='*') {//Arriba
						contador2=contador2+1;
					}
					if(campo[i-1][j+1]=='*') {//Arriba derecha
						contador2=contador2+1;
					}
					if(campo[i][j-1]=='*') {//Izquierda
						contador2=contador2+1;
					}
					if(campo[i][j+1]=='*') {//Derecha
						contador2=contador2+1;
					}
					if(campo[i+1][j-1]=='*') {//Abajo izquierda
						contador2=contador2+1;
					}
					if(campo[i+1][j]=='*') {//Abajo
						contador2=contador2+1;
					}
					if(campo[i+1][j+1]=='*') {//Abajo derecha
						contador2=contador2+1;
					}
					if(contador2>=6) {
						contador=contador+1;
					}
				}
			}
		}
		System.out.println(contador);
	}

	private static char[][] getcampo(Scanner sca, int columnas, int filas) {
		char[][] campo=new char[filas][columnas];
		for(int i=0;i<filas;i++) {//Guardar el campo de minas
			String linea=sca.nextLine();
			for(int j=0;j<columnas;j++) {//Recorrer la línea y divirla en caracteres
				campo[i][j]=linea.charAt(j);
			}
		}
		return campo;
	}
}