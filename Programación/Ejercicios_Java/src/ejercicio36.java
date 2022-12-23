
public class ejercicio36 {
	public static void main(String args[]) {
		int temporada=1, capitulo=1;
		for(temporada=1;temporada<=8;temporada++) {
			for(capitulo=1;capitulo<=10;capitulo++) {
				if(temporada==3&&capitulo==9) {
					System.out.println("Capitulo 3x9: La boda roja");
				}else if(temporada==6&&capitulo==10) {
					System.out.println("Capitulo 6x10: Vientos de invierno");
				}else {
					System.out.println("Capitulo "+temporada+"x"+capitulo);
				}
			}
		}
	}
}
