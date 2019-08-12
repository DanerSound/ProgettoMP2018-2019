package factory;

import facotry.AbstractModels.Pot;

public class RealPot extends Pot{

	@Override
	public void createPot() {
			System.out.println("created real pot");
	}

}
