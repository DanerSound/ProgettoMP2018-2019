package factoryTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import factory.RealPot;

public class RealPotTest {
	
	private RealPot realpot;
	
	@Before
	public void initFixture() {
		realpot= new RealPot();
	}

	@Test
	public void checkPotCreation() {
		RealPot testPot = realpot.createAPot();
		
		assertNotNull(testPot);
		assertEquals(testPot.getClass(), RealPot.class);
		
	}

}
