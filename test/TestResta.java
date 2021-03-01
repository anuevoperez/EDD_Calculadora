import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Actividad_2.Resta;

/**
 * Esta bater�a de pruebas unitarias comprueba que cada uno de los m�todos de la clase Suma 
 * arrojan el resultado esperado. Para ello, se ha comprobado con diferentes par�metros de 
 * entrada.
 * 
 * Cabe tener en cuenta como instrucciones gen�ricas que cada vez que se realiza la prueba 
 * unitaria de un m�todo, se instancia un objeto diferente para obtener resultado m�s pr�ximos
 * a la realidad
 *  
 * @author: <b>Adri�n Nuevo P�rez</b>
 * @version: 1.0
 * 
 */

class TestResta {
	
	// Prueba unitaria m�todo 1 de la clase Divisi�n @see <b>Resta</b>
	
	@Test
	public void testResta1() {
		Resta r = new Resta();

		/**
		 * Con assertEquals esperamos en el resultado coincida con el valor esperado
		 * Probamos con n�meros positivos, negativos, y con decimales
		 * 
		 */
		
		assertEquals(r.restar1(4, 2), 2);
		assertEquals(r.restar1(4, -2), 6);
		assertEquals(r.restar1(-4, 2), -6);
		assertEquals(r.restar1(-4, -2), -2);

		assertEquals(r.restar1(-4, 0), -4);
		assertEquals(r.restar1(0, -2), 2);

		// assertEquals(r.restar1(445.457, 421.396), 2);
	}
	
	// Prueba unitaria m�todo 1 de la clase Divisi�n @see <b>Resta</b>
	
	@Test
	public void testResta2() {
		Resta r = new Resta();

		/**
		 * Con assertEquals esperamos en el resultado coincida con el valor esperado
		 * Probamos con n�meros positivos, negativos, y con decimales
		 * 
		 */
		
		assertEquals(r.restar2(4, 2), 2);
		assertEquals(r.restar2(4, -2), 6);
		assertEquals(r.restar2(-4, 2), -6);
		assertEquals(r.restar2(-4, -2), -2);

		assertEquals(r.restar2(-4, 0), -4);
		assertEquals(r.restar2(0, -2), 2);
	}

	// Prueba unitaria m�todo 1 de la clase Divisi�n @see <b>Resta</b>
	
	@Test
	public void testResta3() {
		Resta r = new Resta();

		/**
		 * Con assertEquals esperamos en el resultado coincida con el valor esperado
		 * Probamos con n�meros positivos, negativos, y con decimales
		 * 
		 */
		
		assertEquals(r.restar3(4, 96, 45), -137);
		assertEquals(r.restar3(-4, 96, 45), -145);
		assertEquals(r.restar3(-4, -96, 45), 47);
		assertEquals(r.restar3(-4, -96, -45), 137);

		// assertEquals(r.restar3(445.457, 421.396, 41.35), 2);
	}
	
	// Prueba unitaria m�todo 1 de la clase Divisi�n @see <b>Resta</b>

	@Test
	private void testResta4() {
		Resta r = new Resta();

		/**
		 * Con assertEquals esperamos en el resultado coincida con el valor esperado
		 * Probamos con n�meros positivos, negativos, y con decimales
		 * 
		 */
		
		assertEquals(r.restar4(0), 0);
		assertEquals(r.restar4(5), -5);
		assertEquals(r.restar4(2.15), -7.15);
		assertEquals(r.restar4(-3.45), -3.7);
		assertEquals(r.restar4(-146.471), 142.771);
	}

}