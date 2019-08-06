package warehouse;

import myTools.AbstractSubj;
import myTools.Product;

import java.util.ArrayList;
import java.util.List;

public class WareHouse extends AbstractSubj {

    private Boolean wareHouseEmpty = true;
    private int wareHouseShelves;
    private Shelf[] myShelves;

    public WareHouse(int numberOfShelf, int spaceShelf) {
        wareHouseShelves = numberOfShelf;
        initShelves(spaceShelf);
    }

    private void initShelves(int spaceInShelf) {

        // Ho aggiunto anche questo
        myShelves = new Shelf[wareHouseShelves];

        for (int index = 0; index < wareHouseShelves; index++) {
            myShelves[index] = new Shelf(spaceInShelf);
        }
    }

    public void addItem(Product product) {
        for (int index = 0; index < wareHouseShelves; index++) {
            myShelves[index].placeProduct(product);
        }
        notifyObservers(false);
    }

    public void setWareEmpty(Boolean wareEmpty) {
        this.wareHouseEmpty = wareEmpty;
    }

    public Boolean getWareHouseEmpty() {
        return wareHouseEmpty;
    }

}
