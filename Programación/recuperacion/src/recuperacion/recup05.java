package recuperacion;
import java.util.*;
public class recup05 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int n, alumnos;
		System.out.println("--- GESTION DE NOTAS MEDIAS ----\n");
		//Leer cantidad de notas a tomar
		do {
			System.out.println("Introduzca cuantas notas va a almacenar por alumno:");
			n=sca.nextInt();
		}while(n<=0);
		//Leer cantidad de alumnos de las que se van a tomar
		do {
			System.out.println("Introduzca cuantas notas va a almacenar por alumno:");
			alumnos=sca.nextInt();
		}while(alumnos<=0);
		//Vaciar el buffer
		sca.nextLine();
		//Crear matriz
		String[][] alu=new String[alumnos][n+2];
		//Guardar datos en la matriz
		for(int i=0;i<alumnos;i++) {
			double media=0;
			double actual;
			//Leer nombre del alumno
			System.out.printf("Introduzca el nombre del alumno %d de %d:\n", (i+1), alumnos);
			alu[i][0]=sca.nextLine();
			//Leer notas
			for(int j=1;j<n+1;j++) {
				System.out.printf("Introduzca nota %d de %d de %s:\n", j, n, alu[i][0]);
				actual=sca.nextDouble();
				media=media+actual;
				alu[i][j]=actual+"";
			}
			//Vaciar el buffer
			sca.nextLine();
			//Calcular la media
			media=media/n;
			alu[i][n+1]=media+"";
		}
		//Mostrar las notas y medias de cada alumno
		for(int i=0;i<alumnos;i++) {
			System.out.printf("%s tiene las siguientes notas: ", alu[i][0]);
			for(int j=1;j<n+1;j++) {
				System.out.printf("%.0f ", Double.parseDouble(alu[i][j]));
			}
			//Comprobar evaluacion de la media
			System.out.printf("y nota media: %.2f ", Double.parseDouble(alu[i][n+1]));
			if(Double.parseDouble(alu[i][n+1])<5) {
				System.out.printf("(INSUFICIENTE)\n");
			}else if(Double.parseDouble(alu[i][n+1])<6) {
				System.out.printf("(APROBADO)\n");
			}else if(Double.parseDouble(alu[i][n+1])<7) {
				System.out.printf("(BIEN)\n");
			}else if(Double.parseDouble(alu[i][n+1])<9) {
				System.out.printf("(NOTABLE)\n");
			}else if(Double.parseDouble(alu[i][n+1])<10.01){
				System.out.printf("(SOBRESALIENTE)\n");
			}else {
				System.out.printf("(ERROR)\n");
			}
		}
		sca.close();
	}
}