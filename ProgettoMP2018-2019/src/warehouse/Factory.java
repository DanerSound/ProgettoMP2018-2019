package warehouse;

import myFactory.Car;
import myFactory.Gun;

public abstract class Factory {
    public abstract Car CreateCar();
    public abstract Gun CreateGun();
    
}
