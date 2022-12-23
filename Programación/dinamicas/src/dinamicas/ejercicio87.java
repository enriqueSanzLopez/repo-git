package dinamicas;
import java.util.*;
public class ejercicio87 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		Random r=new Random();
		int tamano, numero, suma=0, max, min;
		tamano=(int)(r.nextDouble()*11+10);
		ArrayList<Integer> datos=new ArrayList();
		for(int i=0;i<tamano;i++) {
			numero=(int)(r.nextDouble()*101+0);
			datos.add(numero);
		}
		max=datos.get(0);
		min=datos.get(0);
		for(int i=0;i<datos.size();i++) {
			suma=suma+datos.get(i);
			if(max<datos.get(i)) {
				max=datos.get(i);
			}
			if(min>datos.get(i)) {
				min=datos.get(i);
			}
		}
		System.out.println("La suma es: "+suma+
				"\nLa media es: "+suma/tamano+
				"\nEl máximo es: "+max+
				"\nEl mínimo es: "+min);
		sca.close();
	}
}