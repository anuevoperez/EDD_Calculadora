import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import Actividad_2.Division;

/**
 * Esta batería de pruebas unitarias comprueba que cada uno de los métodos de la clase Suma 
 * arrojan el resultado esperado. Para ello, se ha comprobado con diferentes parámetros de 
 * entrada.
 * 
 * Cabe tener en cuenta como instrucciones genéricas que cada vez que se realiza la prueba 
 * unitaria de un método, se instancia un objeto diferente para obtener resultado más próximos
 * a la realidad
 * 
 * @author: <b>Raúl Lópes López</b>
 * @version: 1.0
 * 
 */

class TestDivision {

// Prueba unitaria método 1 de la clase División @see <b>Division</b>
	
	@Test
	public void testDividir1() throws Exception {
		Division d = new Division();
		
		/**
		 * Con assertEquals esperamos en el resultado coincida con el valor esperado
		 * Probamos con números positivos y con decimales
		 * 
		 */
		
		assertEquals(d.dividir1(4, 2), 2);
		assertEquals(d.dividir1(4.35, 2), 2.175);
		assertEquals(d.dividir1(7.46, 4.45), 1.6764044943820224);
		
		// Probamos con números negativos
		
		assertEquals(d.dividir1(-546, 2), -273);
		assertEquals(d.dividir1(546, -2), -273);
		assertEquals(d.dividir1(-546, -2), 273);
		
		// Hacemos lo mismo empleando el 0
		
		assertEquals(d.dividir1(0, 456), 0);
		assertEquals(d.dividir1(0, 2.345), 0);
		
		/**
		 *  Con assertThrows comprobamos que la excepción para las casuísticas concebida,
		 *  es decir, cuando el denominador es 0. La prueba es con números positivos, 
		 *  decimales y negativos.
		 *  
		 */
		
		assertThrows(Exception.class, () -> d.dividir1(4, 0));
	}
	
	// Prueba unitaria método 2 de la clase División @see <b>Division</b>
	 
	@Test
	public void testDividir2 () throws Exception{
		Division d = new Division();
		
		/**
		 * Con assertEquals esperamos en el resultado coincida con el valor esperado
		 * Probamos con números positivos y con decimales
		 * 
		 */
		
		assertEquals(d.dividir2(4, 2), 2);
		assertEquals(d.dividir2(-4, 2), -2);
		assertEquals(d.dividir2(4, -2), -2);
		assertEquals(d.dividir2(4555543, 3), 1518514);
		
		// Hacemos lo mismo empleando el 0

		assertEquals(d.dividir2(0, 4), 0);
		assertEquals(d.dividir2(0, -4), 0);
		
		/**
		 *  Con assertThrows comprobamos que la excepción para las casuísticas concebida,
		 *  es decir, cuando el denominador es 0. La prueba es con números positivos, 
		 *  decimales y negativos.
		 *  
		 */
		
		assertThrows(Exception.class, () -> d.dividir1(-5, 0));
	}
	
	// Prueba unitaria método 3 de la clase División @see <b>Division</b>
	
	@Test
	public void testDividir3 () throws Exception {
		Division d = new Division ();
		
		/**
		 * Con assertEquals esperamos en el resultado coincida con el valor esperado
		 * Probamos con números positivos y con decimales.
		 * 
		 */
		
		assertEquals(d.dividir3(5), 0.2);
		assertEquals(d.dividir3(-5), -0.2);
		
		/** 
		 * En este caso se prueba el comportamiento con números de varios dígitos decimales 
		 * tanto positivos como negativos.
		 * 
		 */
		
		assertEquals(d.dividir3(5.64), 0.1773049645390071);
		assertEquals(d.dividir3(-5.64), -0.1773049645390071);
		
		/**
		 *  Con assertThrows comprobamos que la excepción para las casuística concebida,
		 *  es decir, cuando el denominador es 0. La prueba es con números positivos, 
		 *  decimales y negativos.
		 *  
		 */
		
		assertThrows(Exception.class, () -> d.dividir3(0));
	}
	
	// Prueba unitaria método 3 de la clase División @see <b>Division</b>
	
	@Test
	public void testDividir4 () throws Exception {
		Division d = new Division();
		
		/**
		 * Con assertEquals esperamos en el resultado coincida con el valor esperado
		 * Probamos con números positivos y con decimales
		 * 
		 */
		
		assertEquals(d.dividir4(25), 5);
		assertEquals(d.dividir4(7.1289), 2.67);
		assertEquals(d.dividir4(0), 0);
		
		/**
		 *  Con assertThrows comprobamos que la excepción para las casuística concebida,
		 *  es decir, cuando el denominador es 0. La prueba es con números positivos, 
		 *  decimales y negativos.
		 *  
		 */
		
		assertThrows(Exception.class, () -> d.dividir4(-5));
		assertThrows(Exception.class, () -> d.dividir4(-5.431));
	}
	

}
