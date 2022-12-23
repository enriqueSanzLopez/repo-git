package recursividad;
public class ejercicio71 {
	public static boolean esPrimo(int n) {
		boolean primo=true;
		//Calcular si es primo
		if(n!=0&&n!=1) {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					//No es primo
					primo=false;
				}
			}
		}
		return primo;
	}
	public static void main(String arg[]) {
		//Entrar en bucle para comprobar los primos entre 2 y 1000
		int columna=0;
		boolean numero;
		for(int i=2;i<1001;i++) {
			//Llamar a la funcion es primo
			numero=esPrimo(i);
			//Si es primo
			if(numero==true) {
				if(columna==4) {
					//Se ha pasado luego salto de linea
					columna=0;
					System.out.println();
				}
				columna=columna+1;
				//Mostrar el primo
				System.out.printf("%d\t",i);
			}
		}
	}
}