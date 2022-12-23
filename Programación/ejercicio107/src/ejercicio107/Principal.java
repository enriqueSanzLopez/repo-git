package ejercicio107;
import java.util.*;
import java.io.*;
public class Principal {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.println("¿Cuántas carpetas quiere crear en el escritorio?");
		int n;
		try {
			n=sca.nextInt();
		}catch(Exception e) {
			System.out.println("ERROR! El número tiene que ser entero y positivo!");
			n=0;
		}
		sca.nextLine();//Vaciar el buffer
		System.out.println("¿Qué nombre quiere que aparezca en las carpetas?");
		String nombre=sca.nextLine();
		for(int i=1;i<=n;i++) {
			String ruta="/home/enrlop/Escriptori/"+nombre+i;//Define ruta
			File carpeta=new File(ruta);//Define carpetas
			boolean exito=carpeta.mkdir();//Crea carpetas
			if(exito) {
				System.out.println("Directorio "+(nombre+i)+" creado!");
			}else {
				System.out.println("Directorio "+(nombre+i)+" no creado!");
			}
		}
		sca.close();
	}
}