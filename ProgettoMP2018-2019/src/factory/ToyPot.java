package factory;

import factory.AbstractModels.Pot;

public class ToyPot extends Pot {

    @Override
    public ToyPot createAPot() {
        return new ToyPot();
    }

}
