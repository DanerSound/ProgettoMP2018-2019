package warehouseTest;


import myTools.Product;
import org.junit.Before;
import org.junit.Test;
import warehouse.WareHouse;

import static org.junit.Assert.assertEquals;

public class WareHouseTest {

    private WareHouse warehouse;
    private Product productTest;

    @Before
    public void initFixture() {
        warehouse = new WareHouse(5,5);
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
    	
    	boolean expectedState= false;
        
        add4ElementsForTest();
        warehouse.addItemToShelf(productTest);
        
        boolean actualState = warehouse.getWareHouseEmpty();
        assertEquals(expectedState, actualState);
    }
    
    private void add4ElementsForTest(){
    	for(int index=0;index<4;index++) {
    		warehouse.addItemToShelf(productTest);
    	}
    }

}
