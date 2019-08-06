package warehouseTest;

import myTools.Product;
import org.junit.Before;
import org.junit.Test;
import warehouse.Store;
import warehouse.WareHouse;

import static org.junit.Assert.*;


public class StoreTest {

    private Store store;
    private WareHouse wh;
    private Product productTest;

    @Before
    public void initFixture() {
        wh = new WareHouse(1, 5);
        store = new Store(wh);

        // Inizializzazione di un Mock
        productTest = new Product() {
        };
    }

    @Test
    public void GivenAproductDecreaseBoxSize() {

        // Si imposta il magazzino come pieno
        wh.addItemToShelf(0, productTest);
        wh.addItemToShelf(0, productTest);
        wh.addItemToShelf(0, productTest);
        wh.addItemToShelf(0, productTest);
        wh.addItemToShelf(0, productTest);
        wh.addItemToShelf(0, productTest);

        // Si controlla che sia davvero pieno
        assertTrue(wh.IsWareHouseFull());


        // Per notrazione i metodi che tolgono un elemento da
        // liste e array si chiamano Pop
        Product product = store.popProduct();
        assertFalse(wh.IsWareHouseFull());
    }

    private void fullWareHouse() {

        // L'errore e' qui dentro
        // Devi instanziare producTest, non lo instanzi da nessuna parte
        // Credo che il posto piu' giusto sia dentro Before.

        // Stesso discorso, devi sistemare il prodotto dentro uno scaffale
//
//        for (int index = 0; index < 5; index++) {
//            wh.addItemToShelf(productTest);
//        }

    }

}
