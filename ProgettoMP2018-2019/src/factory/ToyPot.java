package factory;

import facotry.AbstractModels.Pot;

public class ToyPot extends Pot {

    @Override
    public ToyPot createPot() {
        return new ToyPot();
    }

}
