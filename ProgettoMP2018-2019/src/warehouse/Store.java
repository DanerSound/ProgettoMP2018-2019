package warehouse;

import myTools.AbstractObs;

public class Store implements AbstractObs {

    WareHouse myWarehouse;

    public Store(WareHouse myWarehouse) {
        this.myWarehouse = myWarehouse;
    }

    @Override
    public void update(boolean state) {
        if (!state) {
            getProduct();
        }
    }

    public void getProduct() {


    }

}
