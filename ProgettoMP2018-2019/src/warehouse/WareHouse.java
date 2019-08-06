package warehouse;

import myTools.AbstractSubj;
import myTools.Product;

public class WareHouse extends AbstractSubj {

    private Boolean isWareHouseEmpty = true;
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

    public void addItemToShelf(int selected_shelf, Product product) {

        // Questa cosa non torna
        // Stai aggiungendo lo stesso oggetto all'interno di piu' scaffali
        // Cosa non vera se l'oggetto che aggiungi e' uno solo

        // Ho quindi corretto il tuo codice selezionando lo scaffale

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
