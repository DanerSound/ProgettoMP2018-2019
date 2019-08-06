package warehouse;

import tools.AbstractSubj;
import tools.Product;

public class WareHouse extends AbstractSubj {

    private Boolean isWareHouseEmpty = true;
    private int wareHouseShelves;
    private Shelf[] myShelves;

    public WareHouse(int shelves, int spaceShelf) {
        wareHouseShelves = shelves;
        initShelves(spaceShelf);
    }

    private void initShelves(int spaceInShelf) {
        myShelves = new Shelf[wareHouseShelves];
        for (int index = 0; index < wareHouseShelves; index++) {
            myShelves[index] = new Shelf(spaceInShelf);
        }
    }

    public void addItemToShelf(int selected_shelf, Product product) {
        myShelves[selected_shelf].placeProduct(product);
        notifyObservers(false);
        
    }

    public Boolean IsWareHouseEmpty() {
        return isWareHouseEmpty;
    }

    public Boolean IsWareHouseFull() {
        boolean all_shelfs_full = true;
        for (int i = 0; i < wareHouseShelves; i++) {
            all_shelfs_full &= myShelves[i].isFull();
        }
        return all_shelfs_full;
    }

    public Shelf getMyShelves(int indexShelf) {
        return myShelves[indexShelf];
    }

}
