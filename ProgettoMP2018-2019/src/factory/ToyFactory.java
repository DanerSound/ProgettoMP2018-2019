package factory;

import facotry.AbstractModels.Chair;
import facotry.AbstractModels.Pot;
import facotry.AbstractModels.ProductsFactory;

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
