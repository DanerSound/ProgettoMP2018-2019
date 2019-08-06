package warehouse;

import tools.AbstractSubj;
import tools.Product;

public class WareHouse extends AbstractSubj {

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
        shelves[selected_shelf].placeProduct(product);
        notifyObservers(false);      
    }
    
    public Boolean IsWareHouseFull() {
        boolean all_shelfs_full = true;
        for (int indexShelf = 0; indexShelf < wareHouseShelves; indexShelf++) {
            all_shelfs_full &= shelves[indexShelf].isFull();
        }
        return all_shelfs_full;
    }

    public Shelf getMyShelves(int indexShelf) {
        return shelves[indexShelf];
    }

    public Boolean IsWareHouseEmpty() {
        return isWareHouseEmpty;
    }

	public int getWareHouseShelves() {
		return wareHouseShelves;
	}

}
