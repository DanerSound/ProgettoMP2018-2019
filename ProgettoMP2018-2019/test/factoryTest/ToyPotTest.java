package factoryTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import factory.ToyPot;

public class ToyPotTest {

	private ToyPot toypot;

	@Before
	public void initFixture() {
		toypot = new ToyPot();
	}

	@Test
	public void ckeckToyPotCreation() {
		ToyPot testpot = toypot.createAPot();

		assertNotNull(testpot);
		assertEquals(testpot.getClass(), ToyPot.class);
	}
}
