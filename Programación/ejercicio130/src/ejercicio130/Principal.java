package ejercicio130;
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro p1=new Perro("Snoopy", " 24/05/2005", 25, RazaPerro.Beagle, "Microchip001");
		Gato g1=new Gato("Garfield", "27/07/2012", 120, RazaGato.Comun, "Microchip002");
		Pajaro pj1=new Pajaro("Piolín", " 12/07/2016", 1, EspeciePajaro.Canario, true);
		Reptil r1=new Reptil("Godzilla", " 12/01/1420", 19800, EspecieReptil.LagartoGigante, false);
		ClinicaVeterinaria clinica=new ClinicaVeterinaria();
		clinica.BuscaAnimal("Pulgas");
		clinica.InsertaAnimal(p1);
		clinica.InsertaAnimal(g1);
		clinica.InsertaAnimal(pj1);
		clinica.InsertaAnimal(r1);
		clinica.ToString();
		clinica.InsertaComentarioAnimal("Snoopy", "Viene acompañado de su hermano Spike");
		clinica.InsertaComentarioAnimal("Garfield", "Llega a la consulta con un empacho de Lasaña");
		clinica.InsertaComentarioAnimal("Piolín", "Repite continuamente 'Me parece que he visto a un lindo gatito'");
		clinica.InsertaComentarioAnimal("Godzilla", "Sufre heridas de su pelea contra Gamera");
		clinica.ToString();
	}
}