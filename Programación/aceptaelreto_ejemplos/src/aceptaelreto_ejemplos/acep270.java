package aceptaelreto_ejemplos;
import java.util.*;
public class acep270 {
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		while(sca.hasNext()) {//Se ejecuta mientras no se pidan 0 notas o se termine el fichero, el programa termina
			int n_ejercicios=sca.nextInt();//Determinar numero de ejercicios por caso
			if(n_ejercicios==0) {
				break;
			}
			sca.nextLine();
			ArrayList<String> a=new ArrayList<String>();//Array de nombres
			ArrayList<Integer> b=new ArrayList<Integer>();//Array de notas
			leerNombresyNotas(sca, n_ejercicios, a, b);
			String[]fin=new String[a.size()];
			for(int i=0;i<a.size();i++) {//Guardar los alumnos y las notas en una matriz nueva
				fin[i]=a.get(i)+", "+b.get(i);
			}
			Arrays.sort(fin);//Organizar la matriz
			pintarNombresyNotas(fin);
		}
	}

	private static void pintarNombresyNotas(String[] fin) {
		String individuo;
		for(int i=0;i<fin.length;i++) {//Imprimir por pantalla todos los alumnos con sus notas mientras la nota sea distinta de 0
			individuo=fin[i];
			String[]nuevo=individuo.split(", ");
			if(!nuevo[1].equals("0")) {
				System.out.println(individuo);
			}
		}
		System.out.println("---");
	}

	private static void leerNombresyNotas(Scanner sca, int n_ejercicios, ArrayList<String> a, ArrayList<Integer> b) {
		int res;
		for(int i=0;i<n_ejercicios;i++) {//Leer nombre y resultado
			String nombre=sca.nextLine();
			String resultado=sca.nextLine();//Solo puede ser CORRECTO o INCORRECTO
			int posicion=a.indexOf(nombre);
			if(posicion!=-1) {//Comprobar si el nombre ya se ha dado antes en este caso
				res=b.get(posicion);
				if(resultado.equals("CORRECTO")) {//Cambiar la nota en función del resultado
					res=res+1;
				}else {
					res=res-1;
				}
				b.set(posicion, res);//Guardar la nueva nota
			}else {//Como no existe creamos al nuevo alumno y su nueva nota
				if(resultado.equals("CORRECTO")) {
					b.add(1);
				}else {
					b.add(-1);
				}
				a.add(nombre);
			}
		}
	}
}