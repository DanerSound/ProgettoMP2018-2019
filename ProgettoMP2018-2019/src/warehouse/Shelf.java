package warehouse;

import java.util.ArrayList;

import factory.AbstractModels.Product;

public class Shelf {

	private boolean emptyShelf = true;
	private int availableSpace;
	private ArrayList<Product> shelf;

	public Shelf(Integer spaceInShelf) {
		this.availableSpace = spaceInShelf;
		shelf = new ArrayList<>(availableSpace);
	}

	public boolean  placeProduct(Product product) {
		shelf.add(product);
		if (shelf.size() == availableSpace) {			
		setEmptyShelf(false);
		}
		return isEmptyShelf();
	}

	public Product pickUpPrduct(int index) {
		Product currentProduct;
		currentProduct = shelf.get(index);
		shelf.remove(index);

		return currentProduct;
	}

	public void setEmptyShelf(boolean emptyShelf) {
		this.emptyShelf = emptyShelf;
	}

	public boolean isFull() {
		return shelf.size() == availableSpace;
	}

	public int elementsInShelf() {
		return shelf.size();
	}

	public boolean isEmptyShelf() {
		return emptyShelf;
	}

}
