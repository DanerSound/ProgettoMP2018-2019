package factory;

import factory.AbstractModels.Chair;
import factory.AbstractModels.Pot;
import factory.AbstractModels.ProductsFactory;

public class RealFactory extends ProductsFactory{

	@Override
	public Pot createAPot() {
		return new RealPot();
	}

	@Override
	public Chair createAChair() {
		return new RealChair();
	}



}
