import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Actividad_2.Resta;

class TestResta {

	@Test
	public void testResta1() {
		Resta r = new Resta();

		assertEquals(r.restar1(4, 2), 2);
		assertEquals(r.restar1(4, -2), 6);
		assertEquals(r.restar1(-4, 2), -6);
		assertEquals(r.restar1(-4, -2), -2);

		assertEquals(r.restar1(-4, 0), -4);
		assertEquals(r.restar1(0, -2), 2);

		// assertEquals(r.restar1(445.457, 421.396), 2);
	}

	@Test
	public void testResta2() {
		Resta r = new Resta();

		assertEquals(r.restar2(4, 2), 2);
		assertEquals(r.restar2(4, -2), 6);
		assertEquals(r.restar2(-4, 2), -6);
		assertEquals(r.restar2(-4, -2), -2);

		assertEquals(r.restar2(-4, 0), -4);
		assertEquals(r.restar2(0, -2), 2);
	}

	@Test
	public void testResta3() {
		Resta r = new Resta();

		assertEquals(r.restar3(4, 96, 45), -137);
		assertEquals(r.restar3(-4, 96, 45), -145);
		assertEquals(r.restar3(-4, -96, 45), 47);
		assertEquals(r.restar3(-4, -96, -45), 137);

		// assertEquals(r.restar3(445.457, 421.396, 41.35), 2);
	}

	@Test
	private void testResta4() {
		Resta r = new Resta();

		assertEquals(r.restar4(0), 0);
		assertEquals(r.restar4(5), -5);
		assertEquals(r.restar4(2.15), -7.15);
		assertEquals(r.restar4(-3.45), -3.7);
		assertEquals(r.restar4(-146.471), 142.771);
	}

}