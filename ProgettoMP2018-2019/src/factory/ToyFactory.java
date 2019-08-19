package factory;

import factory.AbstractModels.Chair;
import factory.AbstractModels.Pot;
import factory.AbstractModels.Factory;

public class ToyFactory extends Factory {

	@Override
	public Pot createAPot() {
		return new ToyPot();
	}

	@Override
	public Chair createAChair() {
		return new ToyChair();
	}

}
