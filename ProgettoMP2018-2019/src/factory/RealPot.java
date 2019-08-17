package factory;

import factory.AbstractModels.Pot;

public class RealPot extends Pot {

	@Override
	public RealPot createAPot() {
		return new RealPot();
	}

}
