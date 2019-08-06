package factory;

import factory.ToyCar;
import factory.ToyGun;
import factory.tools.Car;
import factory.tools.Factory;
import factory.tools.Gun;

public class ToyFactory extends Factory{

    @Override
    public Car CreateCar() {
        return new ToyCar();
    }

    @Override
    public Gun CreateGun() {
        return new ToyGun();
    }
    
}
