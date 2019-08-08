package warehouseTest;

import org.junit.Before;
import org.junit.Test;

import abstractModels.Product;
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
	public void GivenAProductIncreaseElemtsInshelf() {
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
		boolean	isFull = wh.getMyShelves(0).isFull();
		assertTrue(isFull);

		productTest = store.popProduct(0, 0);
		boolean notFull = wh.getMyShelves(0).isFull();
		assertFalse(notFull);
	}
	
	@Test
	public void GivenAFullShelfTakeAllProduc() {
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
		boolean	isFull = wh.getMyShelves(0).isFull();
		assertTrue(isFull);
		
		store.getProduct();
		boolean isEmpty=wh.getMyShelves(0).isEmptyShelf();
		assertTrue(isEmpty);
	 
	
	}
	
	
}
