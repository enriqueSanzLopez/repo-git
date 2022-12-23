package actividadevaluabletrimestre2_1;
import java.util.*;
public class eval01 {
	public static String leer_nombre() {
		//Leer el nombre del jugador
		Scanner sca=new Scanner(System.in);
		String nombre;
		boolean fin;
		do {
			fin=true;
			System.out.println("Introduzca su nombre:");
			nombre=sca.nextLine();
			//Validar el nombre, no puede estar vacio ni tener espacios
			if(nombre.equals("")) {
				System.out.println("ERROR! El nombre está vacio!");
				fin=false;
			}
		}while(fin==false);
		return nombre;
	}
	public static int leer_numjuegos() {
		Scanner sca=new Scanner(System.in);
		int n;
		boolean fin;
		//Leer el numero de juegos que se quieren jugar
		do {
			fin=true;
			System.out.println("¿Cuantos juegos se necesitan para ganar este partido?");
			n=sca.nextInt();
			//Validar el numero de juegos superior a 0
			if(n<1) {
				System.out.println("ERROR! Al menos deberian jugar 1 juego!");
				fin=false;
			}
		}while(fin==false);
		return n;
	}
	public static String leer_lugar() {
		Scanner sca=new Scanner(System.in);
		String lugar;
		boolean fin;
		//Leer el lugar donde se jugara
		do {
			fin=true;
			System.out.println("¿Donde te gustaría jugar con NoVac?");
			lugar=sca.nextLine();
			if(lugar.equals("")) {
				fin=false;
				System.out.println("ERROR! Tienes que jugar en algún lugar!");
			}
			if(lugar.equals("Australia")) {
				fin=false;
				System.out.println("ERROR! El Sr YoCovid prefiere no jugar en Australia!");
			}
		}while(fin==false);
		return lugar;
	}
	public static boolean set(boolean par, String nombre) {
		Random r=new Random();
		int YoCovid=0, Jugador=0, devuelve=0;
		boolean victoria, jugador=false, punto=false;
		//Bucle de set
		do {
			//Decidir quien saca
			if(par==true) {
				//Saca el jugador
				jugador=true;
				System.out.println("Saca "+nombre);
			}else {
				jugador=false;
				System.out.println("Saca YoCovid");
			}
			//Rebotes
			do {
				//Comprobar si el oponente devuelve la pelota
				devuelve=(int)(r.nextDouble()*2+0);
				if(devuelve==1&&jugador==false) {
					//El jugador la ha devuelto
					jugador=true;
					System.out.println("devuelve la bola "+nombre);
				}else if(devuelve==1&&jugador==true) {
					//YoCovid la ha devuelto
					jugador=false;
					System.out.println("devuelve la bola Yocovid");
				}else if(devuelve==0&&jugador==false) {
					//Punto para YoCovid
					punto=true;
					System.out.println("y punto de Yocovid!");
				}else if(devuelve==0&&jugador==true) {
					//Punto para jugador
					punto=true;
					System.out.println("y punto de "+nombre+"!");
				}
			}while(punto==false);
			//Si no devuelve
			if(devuelve==0&&jugador==false) {
				//Punto para YoCovid
				YoCovid=puntuacion(YoCovid);
				if(YoCovid!=50) {
					//Se ha puntuado pero no se ha ganado
					System.out.println("Yocovid: "+YoCovid+" - "+nombre+": "+Jugador);
				}
			}else if(devuelve==0&&jugador==true){
				//Punto para Jugador
				Jugador=puntuacion(Jugador);
				if(Jugador!=50) {
					//Se ha puntuado pero no se ha ganado
					System.out.println("Yocovid: "+YoCovid+" - "+nombre+": "+Jugador);
				}
			}
		}while(YoCovid<50&&Jugador<50);
		if(YoCovid==50) {
			//Ha ganado YoCovid
			System.out.println("Yocovid: GANA EL JUEGO - "+nombre+": "+Jugador);
			victoria=false;
		}else {
			System.out.println("Yocovid: "+YoCovid+" - "+nombre+": GANA EL JUEGO");
			victoria=true;
		}
		return victoria;
	}
	public static int puntuacion(int n) {
		//En base a la puntuacion anterior indica la puntuacion
		//con el nuevo punto
		int resultado=0;
		switch(n) {
		case 0:
			resultado=15;
			break;
		case 15:
			resultado=30;
			break;
		case 30:
			resultado=40;
			break;
		case 40:
			resultado=50;
			break;
		default:
			break;
		}
		return resultado;
	}
	public static void main(String arg[]) {
		Scanner sca=new Scanner(System.in);
		String nombre, lugar;
		int n, YoCovid=0, Jugador=0;
		boolean par=false, victoria;
		//Nombre del jugador
		System.out.println("Bienvenido a 'Un partido con NoVac YoCovid'");
		nombre=leer_nombre();
		//Sets y lugar del partido
		n=leer_numjuegos();
		lugar=leer_lugar();
		//Bucle partido
		do {
			//Imprimir el resultado del set en pantalla
			System.out.println("==============================================\n"
					+ "RESULTADO: YoCovid "+YoCovid+"-"+nombre+" "+Jugador+"\n"
					+ "==============================================");
			victoria=set(par, nombre);
			//Cambiar de set
			if(par==false) {
				par=true;
			}else {
				par=false;
			}
			//Anotar el punto
			if(victoria==false) {
				YoCovid=YoCovid+1;
			}else {
				Jugador=Jugador+1;
			}
			if(YoCovid==n||Jugador==n) {
				//Imprimir el resultado del set en pantalla
				System.out.println("==============================================\n"
						+ "RESULTADO: YoCovid "+YoCovid+"-"+nombre+" "+Jugador+"\n"
						+ "==============================================");
			}
		}while(YoCovid<n&&Jugador<n);
		//Mostrar quien ha ganado
		if(YoCovid>Jugador) {
			//Ha ganado YoCovid
			System.out.println("Ganador del partido disputado en "+lugar+"...NoVac YoCovid!!");
		}else {
			//Ha ganado el Jugador
			System.out.println("Ganador del partido disputado en "+lugar+"..."+nombre);
		}
		sca.close();
	}
}