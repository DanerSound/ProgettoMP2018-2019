package warehouseTest;


import myTools.Product;
import org.junit.Before;
import org.junit.Test;
import warehouse.WareHouse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class WareHouseTest {

    private WareHouse warehouse;
    private Product productTest;

    @Before
    public void initFixture() {
        warehouse = new WareHouse(5);
    }

    @Test
    public void GivenAnProductIncreaseSize() {
        int expectedSize = 1;

        warehouse.addItem(productTest);
        int actualSize = warehouse.getBox().size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void GivenLastElementChangeWareHouseState() {
        warehouse.availableSpace = 0;
        warehouse.addItem(productTest);
        assertFalse(warehouse.getWareHouseEmpty());
    }

}
