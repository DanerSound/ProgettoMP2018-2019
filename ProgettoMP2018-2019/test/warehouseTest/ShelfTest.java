package warehouseTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import abstractModels.Product;
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
		
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		boolean isEmptyShelf=testShelf.isEmptyShelf();
		assertFalse(isEmptyShelf);
		
		boolean actualState = testShelf.isEmptyShelf();
		
		assertEquals(expectedState, actualState);
	}
	@Test
	public void GivenAFullShelfCheckElementsAfterpickOne() {		
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		
		testShelf.pickUpPrduct(0);
		
		boolean notFull = testShelf.isFull();
		assertFalse(notFull);
		
	}
	@Test
	public void Given5ElementsDecreaseSizeWhenPickOne() {
		int expectedElementsInShelf = 4;

		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);

		testShelf.pickUpPrduct(0);
		int actualElementsInShelf = testShelf.elementsInShelf();

		assertEquals(expectedElementsInShelf, actualElementsInShelf);
	}
}
