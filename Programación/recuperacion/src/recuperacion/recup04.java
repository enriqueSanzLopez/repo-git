package recuperacion;
import java.util.*;
public class recup04 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		Random r=new Random();
		int menu=0, H, Q, F2, F3, suma;
		//Generar de forma aleatoria el numero de mascarillas
		H=(int)(r.nextDouble()*950+50);
		int min=H;
		int max=H;
		String grande="Higiénicas";
		String pequeno="Higiénicas";
		Q=(int)(r.nextDouble()*950+50);
		if(Q>max) {
			max=Q;
			grande="Quirúrgicas";
		}else if(Q<min) {
			min=Q;
			pequeno="Quirúrgicas";
		}
		F2=(int)(r.nextDouble()*950+50);
		if(F2>max) {
			max=F2;
			grande="FFP2";
		}else if(F2<min) {
			min=F2;
			pequeno="FFP2";
		}
		F3=(int)(r.nextDouble()*950+50);
		if(F3>max) {
			max=F3;
			grande="FFP3";
		}else if(F3<min) {
			min=F3;
			pequeno="FFP3";
		}
		suma=H+Q+F2+F3;
		while(menu!=4) {
			//Seleccionar una opcion del menu
			System.out.println("1. Ver el pedido más grande\n"
					+ "2. Total de mascarillas pedidas\n"
					+ "3. Ver el pedido más pequeño\n"
					+ "4. Salir\n"
					+ "Elige una opción del menú:");
			menu=sca.nextInt();
			switch(menu) {
			case 1:
				//Ver el pedido mas grande
				System.out.printf("Pedido más alto: %d mascarillas tipo %s\n", max, grande);
				break;
			case 2:
				//Total de pedidos
				System.out.println("La suma de todos los pedidos es: "+suma);
				break;
			case 3:
				//Ver el pedido mas pequeno
				System.out.printf("Pedido más pequeño: %d mascarillas tipo %s\n", min, pequeno);
				break;
			case 4:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		}
		sca.close();
	}
}
