import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import Actividad_2.Division;

class TestDivision {

	@Test
	public void testDividir1() throws Exception {
		Division d = new Division();
		
		assertEquals(d.dividir1(4, 2), 2);
		assertEquals(d.dividir1(4.35, 2), 2.175);
		assertEquals(d.dividir1(7.46, 4.45), 1.6764044943820224);
		
		assertEquals(d.dividir1(-546, 2), -273);
		assertEquals(d.dividir1(546, -2), -273);
		assertEquals(d.dividir1(-546, -2), 273);
		
		assertEquals(d.dividir1(0, 456), 0);
		assertEquals(d.dividir1(0, 2.345), 0);
		//assertEquals(d.dividir1(0, -7.456), 0);
		
		assertThrows(Exception.class, () -> d.dividir1(4, 0));
	}
	
	@Test
	public void testDividir2 () throws Exception{
		Division d = new Division();
		
		assertEquals(d.dividir2(4, 2), 2);
		assertEquals(d.dividir2(-4, 2), -2);
		assertEquals(d.dividir2(4, -2), -2);
		assertEquals(d.dividir2(4555543, 3), 1518514);

		assertEquals(d.dividir2(0, 4), 0);
		assertEquals(d.dividir2(0, -4), 0);
		
		assertThrows(Exception.class, () -> d.dividir1(-5, 0));
	}
	
	@Test
	public void testDividir3 () throws Exception {
		Division d = new Division ();
		
		assertEquals(d.dividir3(5), 0.2);
		assertEquals(d.dividir3(-5), -0.2);
		
		assertEquals(d.dividir3(5.64), 0.1773049645390071);
		assertEquals(d.dividir3(-5.64), -0.1773049645390071);
		
		assertThrows(Exception.class, () -> d.dividir3(0));
	}
	
	@Test
	public void testDividir4 () throws Exception {
		Division d = new Division();
		
		assertEquals(d.dividir4(25), 5);
		assertEquals(d.dividir4(7.1289), 2.67);
		assertEquals(d.dividir4(0), 0);
		
		assertThrows(Exception.class, () -> d.dividir4(-5));
		assertThrows(Exception.class, () -> d.dividir4(-5.431));
	}
	

}
