package factory;

import facotry.AbstractModels.Pot;

public class ToyPot extends Pot {

	@Override
	public void createPot() {
		System.out.println("created toy pot");	
	}

}
