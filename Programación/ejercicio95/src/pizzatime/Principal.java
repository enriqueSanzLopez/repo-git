package pizzatime;
public class Principal {
	public static void main(String arg[]) {
		Pizza p1=new Pizza("margarita","mediana");
		System.out.println(p1.estado_pizza());
		Pizza p2=new Pizza("hawaiana","familiar");
		System.out.println(p2.estado_pizza());
		System.out.println(Pizza.totalpedidas);
		p1.servir();
		System.out.println(p1.estado_pizza());
		p1.servir();
		System.out.println(Pizza.totalpedidas);
		System.out.println(Pizza.totalpedidas);
	}
}