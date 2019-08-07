package factory;

import factory.RealCar;
import factory.RealGun;
import factory.AbstractModels.Car;
import factory.AbstractModels.Factory;
import factory.AbstractModels.Gun;

public class RealFactory extends Factory{

    @Override
    public Car CreateCar() {
        return new RealCar();
    }
    @Override
    public Gun CreateGun() {
        return new RealGun();
    } 
}
