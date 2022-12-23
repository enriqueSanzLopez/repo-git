package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	/*@Test
	void testCalculadora() {
		fail("Not yet implemented");
	}*/

	@Test
	void testSuma() {
		Calculadora calc=new Calculadora(10,20);
		int res=calc.Suma();
		assertEquals(30,res);
	}

	@Test
	void testResta() {
		Calculadora calc=new Calculadora(20,10);
		int res=calc.Resta();
		assertEquals(10,res);
	}

	@Test
	void testMulti() {
		Calculadora calc=new Calculadora(10,20);
		int res=calc.Multi();
		assertEquals(200,res);
	}

	@Test
	void testDivi() {
		Calculadora calc=new Calculadora(20,10);
		int res=calc.Divi();
		assertEquals(2,res);
	}

	@Test
	void testFactorial() {
		Calculadora calc=new Calculadora(1,2);
		int res=calc.Factorial(4);
		assertEquals(24,res);
	}

}
