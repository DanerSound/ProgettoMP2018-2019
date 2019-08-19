package warehouseTest;

import org.junit.Before;
import org.junit.Test;

import factory.AbstractModels.Product;
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
		int actualElementsInShelf = wh.getShelf(0).elementsInShelf();

		assertEquals(expectedElementsInShelf, actualElementsInShelf);
	}

	@Test
	public void GivenAFullShelfChangeState() {
		productPlacer();
		
		boolean isEmpty = wh.getShelf(0).isEmptyShelf();
		assertFalse(isEmpty);

	}

	@Test
	public void GivenAFullShelfDecreaseSizeAfterPickOne() {
		int expectedElementsInShelf = 4;

		productPlacer();
		boolean isFull = wh.getShelf(0).isFull();
		assertTrue(isFull);

		productTest = store.popProduct(0, 4);
		int actualElementsInShelf = wh.getShelf(0).elementsInShelf();

		assertEquals(expectedElementsInShelf, actualElementsInShelf);
	}

	@Test
	public void GivenAFullShelfTakeAllProduc() {
		productPlacer();
		boolean isFull = wh.getShelf(0).isFull();
		assertTrue(isFull);

		store.getProduct();
		isFull = wh.getShelf(0).isEmptyShelf();
		assertFalse(isFull);
	}

	private void productPlacer() {
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
		wh.addItemToShelf(0, productTest);
	} 

}
