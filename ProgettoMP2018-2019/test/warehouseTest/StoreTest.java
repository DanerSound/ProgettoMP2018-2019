package warehouseTest;

import org.junit.Before;
import org.junit.Test;

import tools.Product;
import warehouse.Store;
import warehouse.WareHouse;

import static org.junit.Assert.*;

public class StoreTest {

	private Store store;
	private WareHouse wh;
	private Product productTest;

	@Before
	public void initFixture() {
		wh = new WareHouse(1, 5);
		store = new Store(wh);
		productTest = new Product() {
		};
	}

	@Test
	public void GivenAproductIncreaseElemtsInshelf() {
		int expectedElementsInShelf = 1;

		wh.addItemToShelf(0, productTest);
		int actualElementsInShelf = wh.getMyShelves(0).elementsInShelf();

		assertEquals(expectedElementsInShelf, actualElementsInShelf);
	}

	@Test
	public void GivenAFullShelfChangeState() {
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);

		assertTrue(wh.getMyShelves(0).isFull());

		productTest = store.popProduct(0, 0);
		assertFalse(wh.getMyShelves(0).isFull());
	}
	
	@Test
	public void GivenAFullShelfTakeAllProduc() {
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
		assertTrue(wh.getMyShelves(0).isFull());
		
		store.getProduct();
		
		assertFalse(wh.getMyShelves(0).isFull());	
	}
	
	
}
