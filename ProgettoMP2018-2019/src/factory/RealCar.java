package factory;

import factory.AbstractModels.Car;

class RealCar extends Car {

    @Override
    public String setName() {
        return "PANDA";
    }
}
