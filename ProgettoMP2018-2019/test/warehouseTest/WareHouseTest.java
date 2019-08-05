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
    	
    	boolean expectedState= false;
        
        add4ElementsForTest();
        warehouse.addItem(productTest);
        
        boolean actualState = warehouse.getWareHouseEmpty();
        assertEquals(expectedState, actualState);
    }
    
    private void add4ElementsForTest(){
    	for(int index=0;index<4;index++) {
    		warehouse.addItem(productTest);
    	}
    }

}
