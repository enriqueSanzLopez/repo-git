package dinamicas;
import java.util.*;
public class ejercicio86 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		ArrayList<String> nombres=new ArrayList();
		nombres.add("Enrique");
		nombres.add("Delfin");
		nombres.add("Autonomo");
		nombres.add("Funcionario");
		nombres.add("Joaquin Andres");
		nombres.add("Raquel");
		for(int i=0;i<nombres.size();i++) {
			System.out.println(nombres.get(i));
		}
		sca.close();
	}
}