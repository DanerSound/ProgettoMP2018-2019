package factory;

import facotry.AbstractModels.Chair;

public class ToyChair extends Chair {

	@Override
	public void createAChair() {
		System.out.println("created Toy Chair");

	}
}
