package factory;

import facotry.AbstractModels.Pot;

public class ToyPot extends Pot {

    @Override
    public ToyPot createAPot() {
        return new ToyPot();
    }

}
