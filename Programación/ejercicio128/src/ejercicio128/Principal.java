package ejercicio128;
import java.util.*;
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		ArrayList<Vehiculo> flota=new ArrayList<Vehiculo>();
		Camion c1=new Camion("c1");
		Camion c2=new Camion("c2");
		Coche k1=new Coche("k1",4);
		Coche k2=new Coche("k2",6);
		flota.add(c1);
		flota.add(c2);
		flota.add(k1);
		flota.add(k2);
		Remolque r=new Remolque(5000);
		c1.ponRemolque(r);
		flota.set(0, c1);
		c2.ponRemolque(r);
		flota.set(1, c2);
		k1.setVelocidad(120);
		flota.set(2, k1);
		k2.setVelocidad(120);
		flota.set(3, k2);
		c1.setVelocidad(90);
		flota.set(0, c1);
		c2.setVelocidad(90);
		c2.quitaRemolque();
		flota.set(1, c2);
		for(int i=0;i<flota.size();i++) {
			System.out.println(flota.get(i));
		}
		c1.setVelocidad(20);
		for(int i=0;i<flota.size();i++) {
			System.out.println(flota.get(i));
		}
		sca.close();
	}
}