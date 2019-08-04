package myFactory;

import myFactory.RealCar;
import myFactory.RealGun;
import warehouse.Factory;

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
