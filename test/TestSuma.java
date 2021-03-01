
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import Actividad_2.Suma;

class TestSuma {
	
	@Test
	public void testSumar1() {
		Suma s = new Suma ();
		
		assertEquals(s.sumar1(5.3, 2), 7.3);
		assertEquals(s.sumar1(2, 9.7), 11.7);
		assertEquals(s.sumar1(1.16, 6.35), 7.51);
		assertEquals(s.sumar1(0, 5.36), 5.36);
		
		assertEquals(s.sumar1(1.6483,-4.15489), -2.50659);
		assertEquals(s.sumar1(-2, -3.6), -5.6);
		assertEquals(s.sumar1(-1.25, -3), -4.25);
		assertEquals(s.sumar1(-1.96, -4.61), -6.57);
	}
	
	@Test
	public void testSumar2 () {
		Suma s = new Suma ();
		
		assertEquals(s.sumar2(2, 5), 7);
		assertEquals(s.sumar2(-4, 5), 1);
		assertEquals(s.sumar2(-6, 4), -2);
		assertEquals(s.sumar2(-7, -9), -16);
	}
	
	@Test
	public void testSumar3 () {
		Suma s = new Suma ();
		
		assertEquals(s.sumar3(2, 5, 9), 16);
		assertEquals(s.sumar3(-2, 5, 9), 12);
		assertEquals(s.sumar3(2, -5, 9), 6);
		assertEquals(s.sumar3(2, 5, -9), -2);
		
		assertEquals(s.sumar3(2, -5, -9), -12);
		assertEquals(s.sumar3(-2, 5, -9), -6);
		assertEquals(s.sumar3(-2, -5, 9), 2);
		assertEquals(s.sumar3(-2, -5, -9), -16);
		
		assertEquals(s.sumar3(0, 0, 0), 0);
		assertEquals(s.sumar3(0, 5, -9), -4);
		assertEquals(s.sumar3(2, 0, 9), 11);
		assertEquals(s.sumar3(2, 5, 0), 7);
	}
	
	@Test
	public void testSumar4 () {
		Suma s = new Suma ();
		
		assertEquals(s.sumar4(0), 0);
		assertEquals(s.sumar4(3), 3);
		assertEquals(s.sumar4(5), 8);
		assertEquals(s.sumar4(-8), 0);
		assertEquals(s.sumar4(-5), -5);
		assertEquals(s.sumar4(10), 5);
	}

}