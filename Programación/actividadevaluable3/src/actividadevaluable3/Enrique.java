package actividadevaluable3;
import java.util.*;
public class Enrique {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		int N_Platos=0, N_Postres=0, k=0, h=-1;
		String Plato, Postre, Nombre_Platos="", Nombre_Postres="", Pedido1, Pedido2;
		String[] S_Nombre_Platos;
		String[] S_Nombre_Postres;
		//PASO 1: Platos
		//Introduccion y lectura del numero de platos con validacion de datos
		System.out.println("Bienvenido a VEGGIE-BAR!\n"
				+ "PASO1: PLATOS");
		do {
			System.out.println("¿Cuantos primeros platos tendrá el menú?");
			N_Platos=sca.nextInt();
			if(N_Platos<=0) {
				System.out.println("ERROR: El menú tiene que tener al menos 1 plato");
			}
		}while(N_Platos<=0);
		//Vaciado de buffer
		sca.nextLine();
		//Creacion de las matrices de guardado de precios
		double[] P_platos=new double[N_Platos];
		//Guardado de los platos
		for(int i=0;i<N_Platos;i++) {
			if(i==0) {
				//Primer plato
				System.out.printf("Introduzca el plato 1 de %d:\n",N_Platos);
				Plato=sca.nextLine();
				k=Plato.indexOf("verduras");
			}else {
				//Ya no es el primer plato
				System.out.printf("Introduzca el plato %d de %d:\n",(i+1),N_Platos);
				Plato=sca.nextLine();
				k=Plato.indexOf("verduras");
				h=Nombre_Platos.indexOf(Plato);
			}
			if(k==-1) {
				//El plato no contiene la palabra verduras
				System.out.println("Ojo este plato no contiene verduras!");
				i=i-1;
				k=0;
			}
			if(h!=-1&&i!=0) {
				//El plato esta repetido
				System.out.println("ERROR: El plato indicado está repetido, por favor introduzca un nuevo plato");
				i=i-1;
			}else if(k!=-1&&h==-1){
				//El plato no esta repetido
				System.out.printf("Introduzca el precio para %s:\n",Plato);
				P_platos[i]=sca.nextDouble();
				//Vaciar el buffer
				sca.nextLine();
				Nombre_Platos=Nombre_Platos+Plato+"-";
			}
		}
		//PASO 2: Postres
		//Solicitar el numero de postres
		do {
			System.out.println("¿Cuantos postres tendrá el menú?");
			N_Postres=sca.nextInt();
			if(N_Postres<=0) {
				System.out.println("ERROR: El menú tiene que tener al menos 1 postre");
			}
		}while(N_Postres<=0);
		//Vaciado de buffer y reinicializar variables
		sca.nextLine();
		h=-1;
		//Creacion de la matriz de guardado de precios
		double[] P_postres=new double[N_Postres];
		//Guardado de los platos
		for(int i=0;i<N_Postres;i++) {
			if(i==0) {
				//Primer postre
				System.out.printf("Introduzca el postre 1 de %d:\n",N_Platos);
				Postre=sca.nextLine();
			}else {
				//Ya no es el primer postre
				System.out.printf("Introduzca el plato %d de %d:\n",(i+1),N_Platos);
				Postre=sca.nextLine();
				h=Nombre_Postres.indexOf(Postre);
			}
			if(h!=-1&&i!=0) {
				//El postre esta repetido
				i=i-1;
				System.out.println("ERROR: El postre indicado está repetido, por favor introduzca un nuevo plato");
			}else {
				//El postre no esta repetido
				Nombre_Postres=Nombre_Postres+Postre+"-";
			}
			//Comprobar si el postre contiene la palabra aguacate
			k=Postre.indexOf("aguacate");
			if(k==-1) {
				//El postre no contiene la palabra aguacate
				P_postres[i]=5;
			}else {
				//El postre contiene la palabra
				P_postres[i]=8;
			}
		}
		//PASO 3: Imprimir el menu
		//Separar los platos y postres por guiones
		S_Nombre_Platos=Nombre_Platos.split("-");
		S_Nombre_Postres=Nombre_Postres.split("-");
		//Mostrar por pantalla el menu creado
		System.out.println("PRIMEROS PLATOS");
		for(int i=0;i<N_Platos;i++) {
			System.out.printf("%d : %s.....%.2f €.\n",(i+1),S_Nombre_Platos[i],P_platos[i]);
		}
		System.out.println("POSTRES");
		for(int i=0;i<N_Postres;i++) {
			System.out.printf("%d : %s.....%.2f €.\n",(i+1),S_Nombre_Postres[i],P_postres[i]);
		}
		//Paso 4: Hacer un pedido
		//Inicializar variables
		h=-1;
		k=-1;
		//Pedir el plato
		do {
			System.out.println("Introduzca el nombre del primer plato:");
			Pedido1=sca.nextLine();
			//Comprobar que el plato existe
			for(int i=0;i<S_Nombre_Platos.length;i++) {
				if(Pedido1.equals(S_Nombre_Platos[i])) {
					//El plato existe
					h=i;
				}
			}
			if(h==-1) {
				//El plato no existe
				System.out.println("ERROR: El plato indicado no existe en el menú, indique otro plato");
			}
		}while(h==-1);
		//Pedir el postre
		do {
			System.out.println("Introduzca el nombre del postre: ");
			Pedido2=sca.nextLine();
			//Comprobar que el postre existe
			for(int i=0;i<S_Nombre_Platos.length;i++) {
				if(Pedido2.equals(S_Nombre_Postres[i])) {
					//El postre existe
					k=i;
				}
			}
			if(k==-1) {
				//El postre no existe
				System.out.println("ERROR: El postre indicado no existe en el menú, indique otro plato");
			}
		}while(k==-1);
		//Imprimir por pantalla el pedido
		System.out.printf("Este es tu pedido...\n"
				+ "Primer plato: %s.....%.2f €.\n"
				+ "Postre: %s.....%.2f €.\n"
				+ "TOTAL: %.2f €.\n"
				+ "Gracias por venir a VEGGIE-BAR!",S_Nombre_Platos[h],P_platos[h],S_Nombre_Postres[k],P_postres[k],(P_platos[h]+P_postres[k]));
		sca.close();
	}
}
