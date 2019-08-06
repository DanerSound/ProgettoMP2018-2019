package warehouseTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import myTools.Product;
import warehouse.Shelf;

public class ShelfTest {
	private Shelf testShelf;
	private Product productTest;

	@Before
	public void initFixture() {
		testShelf = new Shelf(5);
	}
	
	@Test
	public void checkElementsInShelfAfterPickUpOne() {		
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		
		testShelf.pickUpPrduct(0);
			
		assertFalse(testShelf.isFull());
		
	}
	
	@Test
	public void GivenAproductIncreaseElementsInShelf() {
		int expectedElementsInShelf = 1;

		testShelf.placeProduct(productTest);
		int actualElementsInShelf = testShelf.elementsInShelf();

		assertEquals(expectedElementsInShelf, actualElementsInShelf);
	}

	@Test
	public void GivenLastElementChangeShelfState() {
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		testShelf.placeProduct(productTest);
		assertEquals(testShelf.isFull(), false);

		testShelf.placeProduct(productTest);
		assertEquals(testShelf.isFull(), true);

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
