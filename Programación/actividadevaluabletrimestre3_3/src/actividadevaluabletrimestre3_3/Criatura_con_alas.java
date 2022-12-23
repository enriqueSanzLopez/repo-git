package actividadevaluabletrimestre3_3;
public class Criatura_con_alas extends Criatura {
	private char fuego;
	private Criatura_sin_alas jinete;
	public Criatura_con_alas(String nombre, char fuego) {
		super(nombre);
		this.fuego=fuego;
		jinete=new Hobbit("",0,0);
	}
	public void anyadir_jinete(Criatura_sin_alas jinete) {
		if(jinete.getClase().equals("Orco") && jinete.getTemible()=='S') {
			this.jinete=jinete;
		}else {
			System.out.println(jinete.getNombre()+" no es un orco temible, por lo que no sirve de jinete!");
		}
	}
	public void presentarse() {
		if(jinete.getNombre().equals("") && fuego=='S') {
			System.out.println("Hola soy una criatura con alas, me llamo "+nombre+", tiro fuego y de momento no tengo jinete.");
		}else if(jinete.getNombre().equals("") && fuego=='N') {
			System.out.println("Hola soy una criatura con alas, me llamo "+nombre+", no tiro fuego y de momento no tengo jinete.");
		}else if(!jinete.getNombre().equals("") && fuego=='S') {
			System.out.println("Hola soy una criatura con alas, me llamo "+nombre+", tiro fuego y mi jinete se va a presentar:");
			jinete.presentarse();
		}else if(!jinete.getNombre().equals("") && fuego=='N') {
			System.out.println("Hola soy una criatura con alas, me llamo "+nombre+", no tiro fuego y mi jinete se va a presentar:");
			jinete.presentarse();
		}
	}
	public String getClase() {
		// TODO Auto-generated method stub
		return "Criatura con alas";
	}
}