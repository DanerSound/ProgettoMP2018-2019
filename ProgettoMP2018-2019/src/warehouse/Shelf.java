package warehouse;

import java.util.ArrayList;

import abstractModels.Product;

public class Shelf {

	private boolean emptyShelf = true;
	private int availableSpace;
	private ArrayList<Product> shelf;

	public Shelf(Integer spaceInShelf) {
		this.availableSpace = spaceInShelf;
		shelf = new ArrayList<>(availableSpace);
	}

	public void placeProduct(Product product) {

		if (shelf.size() == availableSpace) {
			setEmptyShelf(false);
			System.out.println(" Lo scafale è pieno ");
		} else {
			shelf.add(product);
		}
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
