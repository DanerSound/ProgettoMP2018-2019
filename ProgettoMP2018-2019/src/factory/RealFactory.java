package factory;

import facotry.AbstractModels.Chair;
import facotry.AbstractModels.Pot;
import facotry.AbstractModels.ProductsFactory;

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
