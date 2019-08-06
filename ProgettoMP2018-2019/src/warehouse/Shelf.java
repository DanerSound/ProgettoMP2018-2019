package warehouse;

import java.util.ArrayList;

import myTools.Product;

public class Shelf {

    private boolean emptyShelf = true;
    private int availableSpace;

    private ArrayList<Product> shelf;

    public Shelf(Integer spaceInShelf) {
        this.availableSpace = spaceInShelf;
        shelf = new ArrayList<>(availableSpace);
    }

    public void placeProduct(Product product) {

        if (shelf.size() != availableSpace) {
            shelf.add(product);
        } else {
            System.out.println(" Lo scafale è pieno ");
            setEmptyShelf(false);
        }

    }

    public void setEmptyShelf(boolean emptyShelf) {
        this.emptyShelf = emptyShelf;
    }

    public Product pickUpPrduct(int index) {
        Product currentProduct;
        currentProduct = shelf.get(index);
        shelf.remove(index);

        // Quando togli devi aggiornare il numero di elementi
        // oppure devi fare in modo che la procedura is empty controlli
        // da sola se l'array e' pieno
        // usando isFull la cosa tornerebbe

        return currentProduct;
    }

    public int elementsInShelf() {
        return shelf.size();
    }

    public boolean isEmptyShelf() {
        return emptyShelf;
    }


    public boolean isFull() {
        return shelf.size() == availableSpace;
    }
}
