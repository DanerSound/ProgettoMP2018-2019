package factoryTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import facotry.AbstractModels.Chair;
import facotry.AbstractModels.Pot;
import factory.ToyFactory;

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
    }

    @Test
    public void checkChairCreation() {
        Chair createdChair = toyFactory.createAChair();

        assertNotNull(createdChair);
    }
}
