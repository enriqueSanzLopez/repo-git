package calculadora;
public class Calculadora {
	private int num1;
	private int num2;
	public Calculadora (int a, int b) {
		num1=a;
		num2=b;
	}
	public int Suma() {
		int res=num1+num2;
		return res;
	}
	public int Resta() {
		int res=num1-num2;
		return res;
	}
	public int Multi() {
		int res=num1*num2;
		return res;
	}
	public int Divi() {
		int res=num1/num2;
		return res;
	}
	public int Factorial(int a) {
		if(a==0) {
			return 1;
		}else{
			return (a*Factorial(a-1));
		}
	}
}