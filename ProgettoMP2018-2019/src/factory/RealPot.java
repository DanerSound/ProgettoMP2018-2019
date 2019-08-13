package factory;

import facotry.AbstractModels.Pot;

public class RealPot extends Pot {

    @Override
    public Pot createPot() {
        return  new RealPot();
    }

}
