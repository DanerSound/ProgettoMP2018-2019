package factoryTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import factory.ToyChair;
import factory.ToyFactory;
import factory.ToyPot;
import factory.AbstractModels.Chair;
import factory.AbstractModels.Pot;

public class ToyFactoryTest {

	private ToyFactory toyFactory;

	@Before
	public void initFixture() {
		toyFactory = new ToyFactory();
	}

	@Test
	public void checkPotCreation() {
		Pot createdPot = toyFactory.createAPot();

		assertNotNull(createdPot);
		assertEquals(createdPot.getClass(), ToyPot.class);
	}

	@Test
	public void checkChairCreation() {
		Chair createdChair = toyFactory.createAChair();

		assertNotNull(createdChair);
		assertEquals(createdChair.getClass(), ToyChair.class);
	}
}
