package ejercicio97;
public class Principal {
	public static void main(String arg[]) {
		Fraccion f1=new Fraccion(2,3);
		Fraccion f2=new Fraccion(2,3);
		Fraccion fmul=f1.multiplicar(f2);
		fmul.escribir_fraccion();
		fmul=fmul.invertir();
		fmul.escribir_fraccion();
		Fraccion fdiv=f1.dividir(f2);
		fdiv.escribir_fraccion();
	}
}