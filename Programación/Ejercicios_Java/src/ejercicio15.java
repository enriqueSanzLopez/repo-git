import java.util.Scanner;
public class ejercicio15 {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		double General=0.21;
		double Reducido=0.1;
		double Super=0.04;
		double x=0;
		double resultado=0;
		System.out.print("Introduce el valor: ");
		x=teclado.nextDouble();
		System.out.println("\nEl importe de tu producto es de "+x+" euros.");
		resultado=x-(x*General);
		System.out.println("Si tu producto tuviera un IVA General, su importe descontando el IVA sería: "+resultado);
		resultado=x-(x*Reducido);
		System.out.println("Si tu producto tuviera un IVA Reducido, su importe descontando el IVA sería: "+resultado);
		resultado=x-(x*Super);
		System.out.println("Si tu producto tuviera un IVA Superreducido, su importe descontando el IVA sería: "+resultado);
	}
}
