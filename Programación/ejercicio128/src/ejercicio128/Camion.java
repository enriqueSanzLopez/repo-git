package ejercicio128;

public class Camion extends Vehiculo {
	private Remolque cargamento;
	public Camion(String matricula) {
		super(matricula);
		cargamento=null;
	}
	public Remolque getCargamento() {
		return cargamento;
	}
	public void ponRemolque(Remolque cargamento) {
		this.cargamento = cargamento;
	}
	public void quitaRemolque() {
		cargamento=null;
	}
	@Override
	public String toString() {
		if(cargamento==null) {
			return matricula+"|"+velocidad;
		}else {
			return matricula+"|"+velocidad+"|"+cargamento;
		}
	}
	@Override
	public void setVelocidad(int aceleracion) {
		try {
			this.velocidad = leer_velocidad(aceleracion);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public int leer_velocidad(int aceleracion) throws Exception{
		this.velocidad=this.velocidad+aceleracion;
		if(velocidad>100) {
			throw new Exception("Frenando Alonso!");
		}
		return velocidad;
	}
}