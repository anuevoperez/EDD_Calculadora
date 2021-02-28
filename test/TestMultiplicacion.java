import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Actividad_2.Multiplicacion;

class TestMultiplicacion {

	@Test
	public void testMultiplicar1() {
		Multiplicacion m = new Multiplicacion();
		
		assertEquals(m.multiplicar1(5, 5), 25);
		assertEquals(m.multiplicar1(5, -5), -25);
		assertEquals(m.multiplicar1(-5, -5), 25);
		
		assertEquals(m.multiplicar1(2.487, 4), 9.948);
		assertEquals(m.multiplicar1(2, 4.9314), 9.8628);
		assertEquals(m.multiplicar1(2.487, 4), 9.948);
		assertEquals(m.multiplicar1(2.487432, 4.1214), 10.2517022448);
		
		assertEquals(m.multiplicar1(2.4422, 4.446132), 10.858343570400002);
	}
	
	@Test
	public void testMultiplicar2() {
		Multiplicacion m = new Multiplicacion();
		
		assertEquals(m.multiplicar2(4, 3), 12);
		assertEquals(m.multiplicar2(-4, 3), -12);
		assertEquals(m.multiplicar2(4, -3), -12);
		assertEquals(m.multiplicar2(-4, -3), 12);
		
		assertEquals(m.multiplicar2(4, 0), 0);
		assertEquals(m.multiplicar2(0, 3), 0);
		assertEquals(m.multiplicar2(-4, 0), 0);
		assertEquals(m.multiplicar2(0, -3), 0);
	}
	
	@Test
	public void testMultiplicar3() {
		Multiplicacion m = new Multiplicacion();
		
		assertEquals(m.multiplicar3(4, 3, 6), 72);
		
		assertEquals(m.multiplicar3(-4, 3, 6), -72);
		assertEquals(m.multiplicar3(-4, -3, 6), 72);
		assertEquals(m.multiplicar3(-4, -3, -6), -72);
		
		assertEquals(m.multiplicar3(4.35, 3, 6), 78.3);
		assertEquals(m.multiplicar3(4.35, 3.1, 6), 80.91);
		assertEquals(m.multiplicar3(4.35, 3.1, 6.36), 85.7646);
	}
	
	@Test
	public void testMultiplicar4 () {
		Multiplicacion m = new Multiplicacion();
		
		assertEquals(m.multiplicar4(2, 2), 4);
		assertEquals(m.multiplicar4(2.5, 2), 6.25);
		assertEquals(m.multiplicar4(2, 2.2), 4.59479341998814);
		
		assertEquals(m.multiplicar4(2, -2), 0.25);
		assertEquals(m.multiplicar4(-2, 2), 4);
		assertEquals(m.multiplicar4(-2, 3), -8);
		
		assertEquals(m.multiplicar4(2, 0), 1);
		assertEquals(m.multiplicar4(0, 2), 0);
		
		//assertEquals(m.multiplicar4(25454, 25),5);
		
	}
	

}
