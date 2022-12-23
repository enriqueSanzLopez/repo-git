package ejercicio99b;
import java.util.*;
public class Principal {
	private static final int NUMERO_JUGADORES = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		int equipos=validarEquipos(sca);
		sca.nextLine();
		String[] todos=new String[3];
		ArrayList<Equipo> e=new ArrayList<Equipo>();
		declararEquipos(sca, equipos, todos, e);
		pintarPares(equipos, e);
		pintarImpares(equipos, e);
		sca.close();
	}

	private static void pintarPares(int equipos, ArrayList<Equipo> e) {
		System.out.println("Lista de los jugadores con los dorsales pares:");
		for(int i=0;i<equipos;i++) {
			Equipo a=e.get(i);
			Jugador j1=a.getJ1();
			Jugador j2=a.getJ2();
			Jugador j3=a.getJ3();
			String d1=j1.getDorsal();//Obtener todos los dorsales del equipo
			String d2=j2.getDorsal();
			String d3=j3.getDorsal();
			int dorsal1=Integer.parseInt(d1);//Pasar de String a int
			int dorsal2=Integer.parseInt(d2);
			int dorsal3=Integer.parseInt(d3);
			if(dorsal1%2==0) {//Es par
				System.out.println("\t"+j1.getDorsal()+":\t"+j1.getNombre());
			}
			if(dorsal2%2==0) {//Es par
				System.out.println("\t"+j2.getDorsal()+":\t"+j2.getNombre());
			}
			if(dorsal3%2==0) {//Es par
				System.out.println("\t"+j3.getDorsal()+":\t"+j3.getNombre());
			}
		}
	}
	
	private static void pintarImpares(int equipos, ArrayList<Equipo> e) {
		System.out.println("Lista de los jugadores con los dorsales pares:");
		for(int i=0;i<equipos;i++) {
			Equipo a=e.get(i);
			Jugador j1=a.getJ1();
			Jugador j2=a.getJ2();
			Jugador j3=a.getJ3();
			String d1=j1.getDorsal();//Obtener todos los dorsales del equipo
			String d2=j2.getDorsal();
			String d3=j3.getDorsal();
			int dorsal1=Integer.parseInt(d1);//Pasar de String a int
			int dorsal2=Integer.parseInt(d2);
			int dorsal3=Integer.parseInt(d3);
			if(dorsal1%2!=0) {//Es impar
				System.out.println("\t"+j1.getDorsal()+":\t"+j1.getNombre());
			}
			if(dorsal2%2!=0) {//Es impar
				System.out.println("\t"+j2.getDorsal()+":\t"+j2.getNombre());
			}
			if(dorsal3%2!=0) {//Es impar
				System.out.println("\t"+j3.getDorsal()+":\t"+j3.getNombre());
			}
		}
	}

	private static void declararEquipos(Scanner sca, int equipos, String[] todos, ArrayList<Equipo> e) {
		String nombre;
		String player;
		for(int i=0;i<equipos;i++) {
			//Leer nombre del equipo
			System.out.println("Introduzca nombre del equipo "+(i+1)+":");
			nombre=sca.nextLine();//No necesita validación
			for(int j=0;j<NUMERO_JUGADORES;j++) {
				player = declararJugador(sca, nombre, j);
				todos[j]=player;
			}
			Equipo a=new Equipo(nombre, todos[0], todos[1], todos[2]);//Declarar el equipo
			pintarEquipo(a);
			e.add(a);
		}
	}

	private static String declararJugador(Scanner sca, String nombre, int j) {
		boolean correcto;
		String player;
		do {
			correcto=false;
			System.out.println("Para el "+nombre+", introduzca dorsal y nombre del jugador "+(j+1)+":");
			player=sca.nextLine();
			if(player.indexOf(" ")!=-1) {
				correcto=true;//Condición de salida del bucle
			}else {
				System.out.println("ERROR!, falta un dato!");
			}
		}while(correcto==false);
		return player;
	}

	private static void pintarEquipo(Equipo a) {
		Jugador j1=a.getJ1();
		Jugador j2=a.getJ2();
		Jugador j3=a.getJ3();
		System.out.println("NOMBRE: "+a.getNombre()+"\n"
				+ "JUGADORES:\n"
				+ "\t"+j1.getDorsal()+":\t"+j1.getNombre()+"\n"
				+ "\t"+j2.getDorsal()+":\t"+j2.getNombre()+"\n"
				+ "\t"+j3.getDorsal()+":\t"+j3.getNombre()+"\n");
	}

	private static int validarEquipos(Scanner sca) {//Valida que el número de equipos sea correcto
		int equipos=0;
		boolean correcto;
		do {
			System.out.println("Introduzca numero de equipos a dar de alta:");
			try{
				equipos=sca.nextInt();
				if(equipos>0) {
					correcto=true;
				}else {
					correcto=false;
				}
			}catch(InputMismatchException e) {
				System.out.println("Entrada incorrecta!, la entrada tiene que ser un número superior a 0!");
				correcto=false;
			}
		}while(correcto==false);
		return equipos;
	}
}