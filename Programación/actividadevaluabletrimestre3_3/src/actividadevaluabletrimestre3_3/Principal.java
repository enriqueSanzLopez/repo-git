package actividadevaluabletrimestre3_3;
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parte 1-Crear Aragorn, Armarlo y darle el anillo
		System.out.println("\nP1-CREACION DE ARAGORN, LE ARMAMOS Y LE DAMOS EL ANILLO\n"
				+ "-------------------------------------------------------");
		Hombre aragorn=new Hombre("Aragorn", 30, 90);
		aragorn.presentarse();
		aragorn.dar_arma("espada");
		aragorn.dar_arma("daga");
		aragorn.presentarse();
		aragorn.dar_o_quitar_anillo("dar");
		//Parte 2-Crear Boromir y darle el anillo
		System.out.println("\nP2-CREACION DE BOROMIR Y LE DAMOS EL ANILLO\n"
				+ "------------------------------------------");
		Hombre boromir=new Hombre("Boromir", 35, 95);
		boromir.dar_o_quitar_anillo("quitar");
		aragorn.dar_o_quitar_anillo("quitar");
		boromir.dar_o_quitar_anillo("dar");
		//Parte 3-Crear a Galadriel y emparejarla con Boromir
		System.out.println("\nP3-CREAMOS A GALADRIEL Y LA EMPAREJAMOS CON BOROMIR\n"
				+ "---------------------------------------------------");
		Elfo galadriel=new Elfo("Galadriel", 150, "oscuro");
		galadriel.presentarse();
		galadriel.emparejar(boromir);
		galadriel.presentarse();
		//Parte 4-Emparejar a Arwen y Legolas y sale mal. Luego con Aragorn OK.
		System.out.println("\nP4-INTENTAMOS EMPAREJAR A ARWEN Y LEGOLAS Y SALE MAL. LUEGO CON ARAGORN OK.\n"
				+ "--------------------------------------------------------------------------");
		Elfo legolas=new Elfo("Legolas", 25, "blanco");
		Elfo arwen=new Elfo("Arwen", 24, "blanco");
		arwen.emparejar(legolas);
		arwen.emparejar(aragorn);
		arwen.presentarse();
		//Parte 5-Crear un orco normal y uno temible
		System.out.println("\nP5-CREO UN ORCO NORMAL Y UN ORCO TEMIBLE.\n"
				+ "----------------------------------------");
		Orco o1=new Orco("orquito1", 100, 'S');
		o1.armar("espada");
		Orco o2=new Orco("orquito2", 200, 'S');
		o2.armar("hacha");
		o1.presentarse();
		o2.presentarse();
		//Parte 6-Crear 3 hobbits
		System.out.println("\nP6-CREO 3 HOBBITS, LE DAMOS EL ANILLO A SMEAGOL Y LO TRANSFORMAMOS EN GOLLUM.\n"
				+ "----------------------------------------------------------------------------");
		Hobbit frodo=new Hobbit("Frodo", 30, 8);
		Hobbit sam=new Hobbit("Sam", 32, 7);
		Hobbit smeagol=new Hobbit("Smeagol", 40, 10);
		frodo.presentarse();
		sam.presentarse();
		smeagol.presentarse();
		boromir.dar_o_quitar_anillo("quitar");
		smeagol.dar_o_quitar_anillo("dar");
		smeagol.presentarse();
		//Parte 7-Crear a smaug y añadirle un jinete temible
		System.out.println("\nP7-CREO A SMAUG Y LE AÑADO UN JINETE TEMIBLE\n"
				+ "-------------------------------------------");
		Criatura_con_alas smaug=new Criatura_con_alas("Smaug", 'S');
		smaug.presentarse();
		smaug.anyadir_jinete(o1);
		smaug.anyadir_jinete(o2);
		smaug.presentarse();
	}
}