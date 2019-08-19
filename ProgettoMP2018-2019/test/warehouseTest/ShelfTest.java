package warehouseTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import factory.AbstractModels.Product;
import warehouse.Shelf;

public class ShelfTest {
	private Shelf testShelf;
	private Product productTest;

	@Before
	public void initFixture() {
		testShelf = new Shelf(5);
		productTest = new Product() {}; 
	}
	
	@Test
	public void GivenAProductIncreaseElementsInShelf() {
		int expectedElementsInShelf = 1;

		testShelf.placeProduct(productTest);
		int actualElementsInShelf = testShelf.elementsInShelf();

		assertEquals(expectedElementsInShelf, actualElementsInShelf);
	}
	@Test
	public void GivenAllElementChangeShelfState() {
		boolean expectedState = false;

		productPlacer();
		boolean isFull=testShelf.isFull();
		assertTrue(isFull);
		boolean actualState = testShelf.isEmptyShelf();
		
		assertEquals(expectedState, actualState);
	}
	@Test
	public void GivenAFullShelfCheckElementsAfterpickOne() {		
		productPlacer();
		boolean isFull = testShelf.isFull();
		assertTrue(isFull);
		
		testShelf.pickUpPrduct(0);
		boolean notFull = testShelf.isFull();
		
		assertFalse(notFull);
		
	}
	@Test
	public void GivenAFullShelfDecreaseSizeWhenPickOne() {
		int expectedElementsInShelf = 4;
		productPlacer();
		boolean isFull = testShelf.isFull();
		assertTrue(isFull);

		testShelf.pickUpPrduct(0);
		int actualElementsInShelf = testShelf.elementsInShelf();

		assertEquals(expectedElementsInShelf, actualElementsInShelf);
	}
	
	private void productPlacer() {	
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		
	}
}
