package ejercicio97;

public class Fraccion {
	private int numerador;
	private int denominador;
	public Fraccion(int numerador, int denominador) {
		//Método constructor
		this.numerador=numerador;
		this.denominador=denominador;
	}
	public Fraccion multiplicar(Fraccion f) {
		int num=f.getNumerador();
		int den=f.getDenominador();
		Fraccion f2=new Fraccion(this.numerador*num,this.denominador*den);
		return f2;
	}
	public Fraccion dividir(Fraccion f) {
		int num=f.getNumerador();
		int den=f.getDenominador();
		Fraccion f2=new Fraccion(this.numerador*den,this.denominador*num);
		return f2;
	}
	public void escribir_fraccion() {
		System.out.println(this.numerador+"/"+this.denominador);
	}
	public Fraccion invertir() {
		Fraccion f=new Fraccion(this.denominador, this.numerador);
		return f;
	}
	//Getters y Settters
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
}