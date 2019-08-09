package factory;

import facotry.AbstractModels1.Chair;
import facotry.AbstractModels1.Pot;
import facotry.AbstractModels1.ProductsFactory;

public class ToyFactory extends ProductsFactory{

	@Override
	public Pot createAPot() {
		return new ToyPot();
	}

	@Override
	public Chair createAChair() {		
		return new ToyChair();
	}


    
}
