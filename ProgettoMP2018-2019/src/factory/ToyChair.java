package factory;

import factory.AbstractModels.Chair;

public class ToyChair extends Chair {

	@Override
	public ToyChair createAChair() {
		return new ToyChair();
	}
}
