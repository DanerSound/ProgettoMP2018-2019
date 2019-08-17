package factory;

import factory.AbstractModels.Chair;
import factory.AbstractModels.Pot;
import factory.AbstractModels.ProductsFactory;

public class ToyFactory extends ProductsFactory {

    @Override
    public Pot createAPot() {
        return new ToyPot();
    }

    @Override
    public Chair createAChair() {
        return new ToyChair();
    }


}
