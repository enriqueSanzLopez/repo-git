package ejercicio125;
public class ListaMultimedia {
	private Multimedia[] lista;
	private int cantidad;
	public ListaMultimedia(int maximo) {
		int cantidad=0;
		lista=new Multimedia[maximo];
		for(int i=0;i<lista.length;i++) {
			lista[i]=null;
		}
	}
	public int size() {
		cantidad=0;
		for(int i=0;i<lista.length;i++) {
			if(lista[i]!=null) {
				cantidad=cantidad+1;
			}else {
				break;
			}
		}
		return cantidad;
	}
	public boolean add(Multimedia m) {
		boolean correcto=false;
		for(int i=0;i<lista.length;i++) {
			if(lista[i]==null) {
				lista[i]=m;
				correcto=true;
				break;
			}
		}
		return correcto;
	}
	public Multimedia get(int posicion) {
		Multimedia m=lista[posicion];
		return m;
	}
	public int indexOf(Multimedia m) {
		int posicion=-1;
		for(int i=0;i<lista.length;i++) {
			if(lista[i]!=null) {
				boolean correcto=m.equals(lista[i]);
				if(correcto==true) {
					posicion=i;
					break;
				}
			}else {
				break;
			}
		}
		return posicion;
	}
	@Override
	public String toString() {
		String resultado="";
		for(int i=0;i<lista.length;i++) {
			if(lista[i]!=null) {
				Multimedia m=lista[i];
				resultado=resultado+"\n"+m;
			}
		}
		return resultado;
	}
}