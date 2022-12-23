import java.util.*;
public class ejercicio54 {
	public static void main(String arg[]) {
		Scanner src=new Scanner(System.in);
		int[] a=new int[8];
		int i=0, DNI;
		String s="";
		String letra;
		//Leer el DNI
		System.out.println("Introduce el DNI con los dígitos separados por espacios");
		do {
			a[i]=src.nextInt();
			if(a[i]>=0) {
				//Valor correcto
				i=i+1;
			}else {
				System.out.println("Introduce el DNI con los dígitos separados por espacios");
			}
		}while(i<a.length);
		//Unir todos los valores de a como una cadena
		for(i=0;i<a.length;i++) {
			s=s+String.valueOf(a[i]);
		}
		//Convertir la cadena en un número íntegro
		DNI=Integer.valueOf(s);
		//Sacar el resto
		DNI=DNI%23;
		switch(DNI){
		case 0:
			letra="T";
			break;
		case 1:
			letra="R";
			break;
		case 2:
			letra="W";
			break;
		case 3:
			letra="A";
			break;
		case 4:
			letra="G";
			break;
		case 5:
			letra="M";
			break;
		case 6:
			letra="Y";
			break;
		case 7:
			letra="F";
			break;
		case 8:
			letra="P";
			break;
		case 9:
			letra="D";
			break;
		case 10:
			letra="X";
			break;
		case 11:
			letra="B";
			break;
		case 12:
			letra="N";
			break;
		case 13:
			letra="J";
			break;
		case 14:
			letra="Z";
			break;
		case 15:
			letra="S";
			break;
		case 16:
			letra="Q";
			break;
		case 17:
			letra="V";
			break;
		case 18:
			letra="H";
			break;
		case 19:
			letra="L";
			break;
		case 20:
			letra="C";
			break;
		case 21:
			letra="K";
			break;
		case 22:
			letra="E";
			break;
		default:
			letra="ERROR";
			break;
		}
		s=s+letra;
		System.out.print("Tu DNI completo es: "+s);
		src.close();
	}
}
