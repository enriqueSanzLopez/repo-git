import java.util.*;
public class ejercicio55 {
	public static void main(String arg[]) {
		Scanner src=new Scanner(System.in);
		int menu=7, i, a, b, j=0;
		String c1="", c2="";
		//Opciones del menú
		System.out.println("1.-Longitud de una cadena\n"
				+ "2.-Comparación de 2 cadenas\n"
				+ "3.-Concatenación de 2 cadenas\n"
				+ "4.-Obtener subcadenas\n"
				+ "5.-Invertir cadenas\n"
				+ "6.-Es palíndromo\n"
				+ "9.-Salir");
		do {
			System.out.println("Selecciona una opción:");
			menu=src.nextInt();
			//Vaciar buffer
			src.nextLine();
			switch(menu){
			case 1:
				//Longitud de la cadena
				System.out.println("Introduce la cadena:");
				c1=src.nextLine();
				System.out.printf("La longitud es: %d\n",c1.length());
				break;
			case 2:
				//Comparación de 2 cadenas
				System.out.println("Introduce la primera cadena:");
				c1=src.nextLine();
				System.out.println("Introduce la segunda cadena:");
				c2=src.nextLine();
				i=c1.compareTo(c2);
				if(i==0) {
					System.out.println("Las 2 cadenas son iguales");
				}else if(i<0) {
					System.out.println("La segunda cadena es superior");
				}else {
					System.out.println("La primera cadena es superior");
				}
				break;
			case 3:
				//Concatenación de 2 cadenas
				System.out.println("Introduce la primera cadena:");
				c1=src.nextLine();
				System.out.println("Introduce la segunda cadena:");
				c2=src.nextLine();
				c1=c1+c2;
				System.out.println("La cadena resultante es: "+c1);
				break;
			case 4:
				//Obtener subcadenas
				System.out.println("Introduce una cadena:");
				c1=src.nextLine();
				System.out.println("Introduce 2 números:");
				a=src.nextInt();
				b=src.nextInt();
				if(a<b) {
					for(i=a;i<=b;i++) {
						c2=c2+c1.charAt(i);
					}
				}else if(a>b) {
					for(i=b;i<=a;i++) {
						c2=c2+c1.charAt(i);
					}
				}else {
					c2=c2+c1.charAt(a);
				}
				System.out.println("La cadena resultante es: "+c2);
				break;
			case 5:
				//Invertir cadenas
				System.out.println("Introduce la cadena:");
				j=0;
				c1=src.nextLine();
				for(i=c1.length()-1;i>=0;i--) {
					c2 +=c1.charAt(i);
					j=j+1;
				}
				System.out.println("La cadena resultante es: "+c2);
				break;
			case 6:
				//Es palíndromo
				System.out.println("Introduce la palabra o frase:");
				c1=src.nextLine();
				for(i=c1.length()-1;i>=0;i--) {
					c2 +=c1.charAt(i);
					j=j+1;
				}
				if(c1.equals(c2)) {
					System.out.println("La palabra o frase "+c1+" es un palíndromo");
				}else {
					System.out.println("La palabra o frase "+c1+" no es un palíndromo");
				}
				break;
			case 9:
				//Salir
				break;
			default:
				//Error
				break;
			}
			//Vaciar las cadenas
			c1="";
			c2="";
		}while(menu!=9);
		src.close();
	}
}
