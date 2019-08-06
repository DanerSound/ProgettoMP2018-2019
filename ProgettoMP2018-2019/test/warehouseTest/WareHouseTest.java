package warehouseTest;


import org.junit.Before;
import org.junit.Test;

import tools.Product;
import warehouse.WareHouse;

import static org.junit.Assert.assertEquals;

public class WareHouseTest {

    private WareHouse warehouse;
    private Product productTest;

    @Before
    public void initFixture() {
        warehouse = new WareHouse(5, 5);
        productTest = new Product() {}; 
    }

    @Test
    public void GivenAnProductIncreaseShelfSize() {
        int expectedShelfSize = 1;

        warehouse.getMyShelves(0).placeProduct(productTest);
        int actualShelfSize = warehouse.getMyShelves(0).elementsInShelf();

        assertEquals(expectedShelfSize, actualShelfSize);
    }

    @Test
    public void GivenLastElementChangeWareHouseState() {
        boolean expectedState = false;

        warehouse.addItemToShelf(0, productTest);
        warehouse.addItemToShelf(0, productTest);
        warehouse.addItemToShelf(0, productTest);
        warehouse.addItemToShelf(0, productTest);
        warehouse.addItemToShelf(0, productTest);
        warehouse.addItemToShelf(0, productTest);

        boolean actualState = warehouse.IsWareHouseFull();
        assertEquals(expectedState, actualState);
    }

}
