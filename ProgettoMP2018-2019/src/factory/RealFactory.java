package factory;

import factory.AbstractModels.Chair;
import factory.AbstractModels.Pot;
import factory.AbstractModels.Factory;

public class RealFactory extends Factory {

	@Override
	public Pot createAPot() {
		return new RealPot();
	}

	@Override
	public Chair createAChair() {
		return new RealChair();
	}

}
