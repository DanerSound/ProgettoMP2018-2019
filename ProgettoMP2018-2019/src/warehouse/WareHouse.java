package warehouse;

import myTools.AbstractSubj;
import myTools.Product;

import java.util.ArrayList;
import java.util.List;

public class WareHouse extends AbstractSubj {

    private Boolean wareHouseEmpty = true;
    private int wareHouseShelves;
    private Shelf[] myShelves;

    public WareHouse(int shelves, int spaceShelf) {
        wareHouseShelves = shelves;
        initShelves(spaceShelf);
    }

    private void initShelves(int spaceInShelf) {

        // Ho aggiunto anche questo
        myShelves = new Shelf[wareHouseShelves];

        for (int index = 0; index < wareHouseShelves; index++) {
            myShelves[index] = new Shelf(spaceInShelf);
        }
    }

    public void addItemToShelf(Product product) {

        // Questa cosa non torna
        // Stai aggiungendo lo stesso oggetto all'interno di piu' scaffali
        // Cosa non vera se l'oggetto che aggiungi e' uno solo

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

    public Shelf getMyShelves(int indexShelf) {
        return myShelves[indexShelf];
    }

}
