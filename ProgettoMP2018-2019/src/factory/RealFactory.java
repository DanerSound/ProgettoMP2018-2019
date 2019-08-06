package factory;

import factory.RealCar;
import factory.RealGun;
import factory.tools.Car;
import factory.tools.Factory;
import factory.tools.Gun;

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
