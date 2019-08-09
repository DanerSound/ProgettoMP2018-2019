package factory;

import facotry.AbstractModels1.Chair;
import facotry.AbstractModels1.Pot;
import facotry.AbstractModels1.ProductsFactory;

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
