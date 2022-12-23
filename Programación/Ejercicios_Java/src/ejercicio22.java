import java.util.*;
public class ejercicio22 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		double suma, nota1, nota2, nota3;
		int estudiante;
		String nombre;
		System.out.println("Introduzca el número de estudiante:");
		estudiante=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduzca nombre del alumno:");
		nombre=teclado.nextLine();
		System.out.println("Introduzca nota1:");
		nota1=teclado.nextDouble();
		System.out.println("Introduzca nota2:");
		nota2=teclado.nextDouble();
		System.out.println("Introduzca nota3:");
		nota3=teclado.nextDouble();
		suma=(nota1+nota2+nota3)/3;
		System.out.printf("Alumno: %d-%s\tex.1\tex.2\tex.3\tmedia\n"
				+ "Notas 1era evaluación:\t\t%.1f\t%.1f\t%.1f\t%.2f",estudiante,nombre,nota1,nota2,nota3,suma);
		teclado.close();
	}
}
