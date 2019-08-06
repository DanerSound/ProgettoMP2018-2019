package factory;

import factory.tools.Car;

class RealCar extends Car {

    @Override
    public String setName() {
        return "PANDA";
    }
}
