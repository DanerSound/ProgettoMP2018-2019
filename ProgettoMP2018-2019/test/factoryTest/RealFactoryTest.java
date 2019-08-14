package factoryTest;

import static org.junit.Assert.*;

import factory.RealChair;
import factory.RealPot;
import org.junit.Before;
import org.junit.Test;

import facotry.AbstractModels.Chair;
import facotry.AbstractModels.Pot;
import factory.RealFactory;

public class RealFactoryTest {

	private RealFactory realFactory;

	@Before
	public void initFixture() {
		realFactory = new RealFactory();
	}

	@Test
	public void checkPotCreation() {
		Pot createdPot = realFactory.createAPot();

		assertNotNull(createdPot);
		assertEquals(createdPot.getClass(), RealPot.class);
	}

	@Test
	public void checkChairCreation() {
		Chair createdChair = realFactory.createAChair();

		assertNotNull(createdChair);
		assertEquals(createdChair.getClass(), RealChair.class);
	}

}
