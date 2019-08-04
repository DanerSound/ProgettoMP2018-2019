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
    	for (int index = 0; index < this.myWarehouse.getBox().size(); index++) {
            System.out.println("ho preso l'elemento in posizione" + index + "di tipo:" + this.myWarehouse.getBox().get(index));
        }

        this.myWarehouse.getBox().clear();
        System.out.println("il numero degli elementi presenti nel Box:" + myWarehouse.getBox().size());

    }

}
