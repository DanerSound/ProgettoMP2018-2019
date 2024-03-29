package warehouse;

import abstractModels.AbstractObs;
import factory.AbstractModels.Product;

public class Store implements AbstractObs {

	private WareHouse warehouse;

	public Store(WareHouse warehouse) {
		this.warehouse = warehouse;
	}

	@Override
	public void update(boolean state) {
		if (!state) {
			getProduct();
			System.out.println("Taked all products from Warehouse");
		}
	}

	public void getProduct() {	
		for(int shelvesIndex=0;shelvesIndex<warehouse.getWareHouseShelves();shelvesIndex++){
			Shelf shelf = warehouse.getShelf(shelvesIndex);
			int	productsInShelf=shelf.elementsInShelf();
			for(int productIndex =0;productIndex<productsInShelf;productIndex++) {
				popProduct(shelvesIndex, shelvesIndex);
			}	
		}
	}

	public Product popProduct(int shelf, int position) {
		return warehouse.getShelf(shelf).pickUpPrduct(position);
	}
	
	public WareHouse getWarehouse() {
		return warehouse;
	}
}
