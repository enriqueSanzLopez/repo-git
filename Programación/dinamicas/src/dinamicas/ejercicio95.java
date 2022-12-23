package dinamicas;
import java.util.*;
public class ejercicio95 {
	public static String apodo() {
		Scanner sca=new Scanner(System.in);
		String nombre="";
		Random r=new Random();
		int indice;
		char confirmacion='N';
		boolean correcto=false;
		String[] palabra1= {"Big","Small","The","Perfect","Extraordinary"};
		String[] palabra2= {"Fighter","Neo","Paco"};
		do {
			System.out.println("Vamos a generar de forma aleatoria u nombre de youtuber:");
			indice=(int)(r.nextDouble()*5+0);
			nombre=palabra1[indice]+" ";
			indice=(int)(r.nextDouble()*3+0);
			nombre=nombre+palabra2[indice];
			System.out.println("Por ejemplo..."+nombre);
			do {
				System.out.println("¿Te gusta (S/N)?");
				confirmacion=sca.nextLine().charAt(0);
				confirmacion=Character.toUpperCase(confirmacion);
				if(confirmacion=='S'||confirmacion=='N') {
					correcto=true;
				}else {
					System.out.println("La respuesta tiene que ser S o N!");
					correcto=false;
				}
			}while(correcto==false);
		}while(confirmacion!='S');
		return nombre;
	}
	public static void leerArray(ArrayList<Integer> followers) {
		for(int i=0;i<followers.size();i++) {
			System.out.print(followers.get(i)+" ");
		}
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		String nombre=apodo();
		boolean correcto=false;
		int contador=0, seguidores, max=0;
		ArrayList<Integer> followers=new ArrayList<Integer>();
		do {
			contador=contador+1;
			System.out.println("Introduzca la lectura "+contador+":");
			seguidores=sca.nextInt();
			if(seguidores==-1&&contador>2) {
				correcto=true;
				break;
			}else if(seguidores==-1) {
				System.out.println("Necesitamos, al menos, 2 lecturas de followers!");
				contador=contador-1;
			}else {
				if(contador==1) {
					followers.add(seguidores);
					max=seguidores;
				}else {
					if(seguidores<=max) {
						System.out.println("Dato erróneo. Recuerda, las lecturas son solo ascendentes!");
						contador=contador-1;
					}else {
						followers.add(seguidores);
						max=seguidores;
					}
				}
			}
		}while(correcto==false);
		System.out.println("Se ha dado de alta al youtuber "+nombre+" con la evolución siguiente:");
		leerArray(followers);
		sca.close();
	}
}