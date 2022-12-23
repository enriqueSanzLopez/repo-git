package examenFinal;

import java.io.*;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JOYERIA\n"
				+ "-------");
		Perla p1=new Perla();
		Perla p2=new Perla();
		Perla p3=new Perla();
		Collar c1=new Collar(12.34);
		c1.addPerla(p1);
		c1.addPerla(p2);
		c1.addPerla(p3);
		System.out.println(c1);
		System.out.println("\nDESAYUNO\n"
				+ "--------");
		Magdalena m1=new Magdalena(190, "Cuadrada", true);
		Magdalena m2=new Magdalena(83, "Redonda", false);
		Napolitana n1=new Napolitana(210, "Crema");
		Napolitana n2=new Napolitana(332, "Chocolate");
		ListaDesayuno l1=new ListaDesayuno();
		l1.anyadir_bollo(m1);
		l1.anyadir_bollo(m2);
		l1.anyadir_bollo(n1);
		l1.anyadir_bollo(n2);
		System.out.println(l1);
		File archivo=new File("salida.txt");
		try {
			if(!archivo.createNewFile()) {
				System.out.println("El archivo ya existía");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro al crear el archivo");
		}
		try {
			FileWriter file=new FileWriter(archivo);
			file.write("JOYERIA\n-------\n"+c1+"\n\nDESAYUNO\n--------\n"+l1);
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}