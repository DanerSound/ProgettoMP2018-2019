package myFactory;

import myFactory.ToyCar;
import myFactory.ToyGun;
import warehouse.Factory;

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
