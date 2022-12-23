package ejercicio98;
import java.util.*;
public class Principal {
	private static final int TIEMPO_ESPERA = 1000;
	private static final int ASALTOS = 3;
	private static final int VICTORIAS = 2;
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		//Semifinal
		//Crear luchadores
		Luchador j1=new Luchador("Ryu");
		Luchador j2=new Luchador("Ken");
		Luchador j3=new Luchador("Mr Bison");
		Escenario campo=new Escenario("El Templo de Pekin", 1);
		Escenario campo1=new Escenario("Bison Mansion", 1);
		boolean ganador;
		ganador=combate(j1, j2, campo,", no vales ni para ser Youtuber");
		//Final
		if(ganador==false) {//Ha ganado j1
			j1.setVida(100);
			ganador=combate(j1, j3, campo1, ", pensaba que eras más fuerte coleguilla");
		}else {//Ha ganado j2
			j2.setVida(100);
			ganador=combate(j2, j3, campo1, ", pensaba que eras más fuerte coleguilla");
		}
		sca.close();
	}
	private static boolean combate(Luchador jp1, Luchador jp2, Escenario campop, String frase_victoria) throws InterruptedException {
		int damage, victorias1=0, victorias2=0;
		Random r=new Random();
		boolean ganador=false, correcto1=false, correcto2=false;
		System.out.println("Comienza la pelea entre "+jp1.getNombre()+" y "+jp2.getNombre()+" en "+campop.getNombre());
		do {//Combate
			correcto2=false;
			System.out.println("ROUND "+campop.getRonda()+"....FIGHT!!!");
			do {
				int turno=(int)(r.nextDouble()*2+0);//El turno será aleatorio entre j1 y j2
				damage=(int)(r.nextDouble()*50+1);//Calcular el daño
				if(turno==0) {//Ataca j1
					int vida=jp2.getVida();
					jp2.setVida(vida-damage);//Reducir la vida del objetivo
					System.out.println(jp1.getNombre()+" golpea a "+jp2.getNombre()+" con una intensidad de "+damage+" "+jp1.getNombre()+":"+jp1.getVida()+" - "+jp2.getNombre()+":"+jp2.getVida());
				}else {//Ataca j2
					int vida=jp1.getVida();
					jp1.setVida(vida-damage);//Reducir la vida del objetivo
					System.out.println(jp2.getNombre()+" golpea a "+jp1.getNombre()+" con una intensidad de "+damage+" "+jp1.getNombre()+":"+jp1.getVida()+" - "+jp2.getNombre()+":"+jp2.getVida());
				}
				if(jp1.getVida()<=0) {//Uno de los jugadores ha perdido
					victorias2=victorias2+1;
					correcto2=true;
				}
				if(jp2.getVida()<=0) {//Uno de los jugadores ha perdido
					victorias1=victorias1+1;
					correcto2=true;
				}
				Thread.sleep(TIEMPO_ESPERA);
			}while(correcto2==false);
			jp1.setVida(100);
			jp2.setVida(100);
			int ronda=campop.getRonda()+1;//Incrementar la ronda
			campop.setRonda(ronda);
			if(victorias1==VICTORIAS||victorias2==VICTORIAS) {
				correcto1=true;
			}
			if(ronda>ASALTOS) {//Si se pasa de las rondas máximas, entonces termina el combate
				correcto1=true;
			}
		}while(correcto1==false);
		if(victorias1>victorias2) {
			ganador=false;
			System.out.println("El ganador de esta pelea ha sido: "+jp1.getNombre());
			System.out.println(jp1.getNombre()+": "+jp2.getNombre()+frase_victoria);
		}else {
			ganador=true;
			System.out.println("El ganador de esta pelea ha sido: "+jp2.getNombre());
			System.out.println(jp2.getNombre()+": "+jp1.getNombre()+frase_victoria);
		}
		return ganador;
	}
}