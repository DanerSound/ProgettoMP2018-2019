package factory;

import factory.AbstractModels.Gun;

class RealGun extends Gun {

    @Override
    public String setCode() {
        return "7";
    }
}
