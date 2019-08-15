package warehouse;

import abstractModels.AbstractSubj;
import abstractModels.BasicOperation;
import abstractModels.Product;

public class WareHouse extends AbstractSubj implements BasicOperation {

	private Boolean isWareHouseEmpty = true;
	private int wareHouseShelves;
	private Shelf[] shelves;

	public WareHouse(int shelves, int spaceShelf) {
		wareHouseShelves = shelves;
		initShelves(spaceShelf);
	}

	private void initShelves(int spaceInShelf) {
		shelves = new Shelf[wareHouseShelves];
		for (int index = 0; index < wareHouseShelves; index++) {
			shelves[index] = new Shelf(spaceInShelf);
		}
	}

	public void addItemToShelf(int selected_shelf, Product product) {
		boolean freeSpace = shelves[selected_shelf].placeProduct(product);
		if (!freeSpace) {
			notifyObservers(false);
		}
	}

	public Boolean IsWareHouseFull() {
		boolean all_shelfs_full = true;
		for (int indexShelf = 0; indexShelf < wareHouseShelves; indexShelf++) {
			all_shelfs_full &= shelves[indexShelf].isFull();
		}
		return all_shelfs_full;
	}

	public Shelf getShelf(int indexShelf) {
		return shelves[indexShelf];
	}

	public Boolean IsWareHouseEmpty() {
		return isWareHouseEmpty;
	}

	public int getWareHouseShelves() {
		return wareHouseShelves;
	}

	@Override
	public int[] find(Product product) {
		int[] productPosition = new int[2];
		int shelvesIndex, productIndex;

		for (shelvesIndex = 0; shelvesIndex < wareHouseShelves; shelvesIndex++) {
			
			int productsInShelf = getShelf(shelvesIndex).elementsInShelf();
			for (productIndex = 0; productIndex < productsInShelf; productIndex++) {
				System.out.println(getShelf(shelvesIndex).getProduct(productIndex));			
				
				if (product == getShelf(shelvesIndex).getProduct(productIndex)) {
					productPosition[0] = shelvesIndex;
					productPosition[1] = productIndex;
					break;
				} else {
					System.out.println("prodotto non presente");
				}
			}
		}

		return productPosition;
	}

	@Override
	public int productStock(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int stock() {
		int productsInWareHouse=0;
		
		for( int shelfIndex=0; shelfIndex<wareHouseShelves;shelfIndex++) {
			int porcodio = getShelf(shelfIndex).elementsInShelf();
			
			for(int elementIndex=0;elementIndex<=porcodio;elementIndex++) {
				
				for (Shelf shelf : shelves) {
					
					if (shelf.getProduct(elementIndex)!=null) {
						productsInWareHouse++;
					}
					
				}
			
			}
		}
			
		return productsInWareHouse;
	}

}
