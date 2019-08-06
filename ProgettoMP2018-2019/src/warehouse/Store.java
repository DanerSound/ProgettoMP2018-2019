package warehouse;

import myTools.AbstractObs;
import myTools.Product;

public class Store implements AbstractObs {

    private WareHouse myWarehouse;

    public Store(WareHouse myWarehouse) {
        this.myWarehouse = myWarehouse;
    }

    @Override
    public void update(boolean state) {
        if (!state) {
            getProduct();
        }
    }

    private void getProduct() {


    }

    public WareHouse getWarehouse() {
        return myWarehouse;
    }

    public Product popProduct() {
        return myWarehouse.getMyShelves(0).pickUpPrduct(0);
    }
}
