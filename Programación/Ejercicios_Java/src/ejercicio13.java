
public class ejercicio13 {
	public static void main(String args[]) {
		double entrada=9.00;
		double palomitas=6.00;
		double dinero_Patricia=0;
		double dinero_Oscar=0;
		dinero_Patricia=entrada+palomitas+(palomitas/2)+Math.pow((palomitas/2),3);
		dinero_Oscar=entrada+(palomitas/2);
		System.out.println("Patricia ha gastado "+dinero_Patricia+" euros.");
		System.out.println("Elena ha gastado "+dinero_Patricia+" euros.");
		System.out.println("Oscar ha gastado "+dinero_Oscar+" euros");
		System.out.println("En total la broma les ha salido por "+(2*dinero_Patricia+dinero_Oscar)+" euros");
	}
}
