package factoryTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import factory.RealChair;

public class RealChairTest {
	
	private RealChair realchair;
	
	@Before
	public void initFixture() {
		realchair = new RealChair();
	}

	@Test
	public void checkChairCreation() {
		RealChair testChair = realchair.createAChair();
		
		assertNotNull(testChair);
		assertEquals(testChair.getClass(), RealChair.class);
	}

}
