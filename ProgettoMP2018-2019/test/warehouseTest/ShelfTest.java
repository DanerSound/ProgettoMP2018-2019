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
	public void GivenAproductIncreaseElementsInShelf() {
		int expectedElementsInShelf=1;
		
		testShelf.placeProduct(productTest);
		int actualElementsInShelf = testShelf.elementsInShelf();
		
		assertEquals(expectedElementsInShelf, actualElementsInShelf);
	}
		
	@Test 
	public void GivenLastElementChangeShelfState() {
		boolean expectedShelfState=false;
		
		add4ElementsToShelf();
		testShelf.placeProduct(productTest);
		boolean actualShelfState = testShelf.isEmptyShelf();
		
		assertEquals(expectedShelfState, actualShelfState);
		
	}
	
	@Test
	public void Given5ElementsDecreaseSizeWhenPickOne() {
		int expectedElementsInShelf=4;				
		fullShelf();
		
		testShelf.pickUpPrduct(0);
		int actualElementsInShelf = testShelf.elementsInShelf();
		
		assertEquals(expectedElementsInShelf, actualElementsInShelf);
			
	}
	
	private void add4ElementsToShelf() {
	 	for(int index=0;index<4;index++) {
    		testShelf.placeProduct(productTest);
    	}
	}
	
	private void fullShelf() {
	 	for(int index=0;index<5;index++) {
    		testShelf.placeProduct(productTest);
    	}
	}

}
