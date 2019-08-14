package factoryTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import factory.ToyChair;

public class ToyChairTest {

	private ToyChair toychair;

	@Before
	public void initFixture() {
		toychair = new ToyChair();
	}

	@Test
	public void checkToyChairCreation() {
		ToyChair testChair = toychair.createAChair();

		assertNotNull(testChair);
		assertEquals(testChair.getClass(), ToyChair.class);
	}

}
