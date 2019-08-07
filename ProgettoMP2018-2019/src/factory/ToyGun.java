package factory;

import factory.AbstractModels.Gun;

public class ToyGun extends Gun{

    @Override
    public String setCode() {
            return "AK47";
    }
}
