package warehouseTest;

import org.junit.Before;
import org.junit.Test;

import abstractModels.Product;
import warehouse.WareHouse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WareHouseTest {

	private WareHouse warehouse;
	private Product productTest;

	@Before
	public void initFixture() {
		warehouse = new WareHouse(1, 5);
		productTest = new Product() {
		};
	}
	
	@Test
	public void GivenAnProductIncreaseShelfSize() {
		int expectedShelfSize = 1;

		warehouse.getShelf(0).placeProduct(productTest);
		int actualShelfSize = warehouse.getShelf(0).elementsInShelf();

		assertEquals(expectedShelfSize, actualShelfSize);
	}
	
	@Test
	public void GivenAllElementsToShelfCheckState() {
		
		warehouse.addItemToShelf(0, productTest);
		warehouse.addItemToShelf(0, productTest);
		warehouse.addItemToShelf(0, productTest);
		warehouse.addItemToShelf(0, productTest);
		warehouse.addItemToShelf(0, productTest);
		warehouse.addItemToShelf(0, productTest);

		boolean actualState = warehouse.IsWareHouseFull();
		assertTrue(actualState);
	}
	
	@Test
	public void GivenAWareHouseCheckIfiSFull() {
		warehouse.addItemToShelf(0, productTest);
		warehouse.addItemToShelf(0, productTest);
		warehouse.addItemToShelf(0, productTest);
		warehouse.addItemToShelf(0, productTest);
		warehouse.addItemToShelf(0, productTest);
		warehouse.addItemToShelf(0, productTest);
		
		boolean actualState=warehouse.IsWareHouseFull();
		assertTrue(actualState);
	}
}
