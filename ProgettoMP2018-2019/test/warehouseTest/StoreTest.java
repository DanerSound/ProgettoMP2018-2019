package warehouseTest;

import myTools.Product;
import org.junit.Before;
import org.junit.Test;
import warehouse.Store;
import warehouse.WareHouse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


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
        fullWareHouse();
        int expectedBoxSize = 0;

        store.getProduct();
        fail();
    }

    private void fullWareHouse() {

        // L'errore e' qui dentro
        // Devi instanziare producTest, non lo instanzi da nessuna parte
        // Credo che il posto piu' giusto sia dentro Before.

        for (int index = 0; index < 5; index++) {
            wh.addItemToShelf(productTest);
        }

    }

}
