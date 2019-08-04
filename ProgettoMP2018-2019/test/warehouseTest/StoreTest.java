package warehouseTest;

import myTools.Product;
import org.junit.Before;
import org.junit.Test;
import warehouse.Store;
import warehouse.WareHouse;

import static org.junit.Assert.assertEquals;


public class StoreTest {
	
	private Store store;
	private WareHouse wh;
	private Product productTest;
	
	@Before
	public void initFixture() {
		wh = new WareHouse(5);
		store = new Store(wh);
	}

	@Test
	public void GivenAproductDecreaseBoxSize(){
		wh.addItem(productTest);
		int expectedBoxSize=0;
		
		store.getProduct();
		int actualBoxSize=wh.getBox().size();
		
		assertEquals(expectedBoxSize,actualBoxSize);
	}

}
