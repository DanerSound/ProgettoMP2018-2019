package factory;

import factory.ToyCar;
import factory.ToyGun;
import factory.AbstractModels.Car;
import factory.AbstractModels.Factory;
import factory.AbstractModels.Gun;

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
