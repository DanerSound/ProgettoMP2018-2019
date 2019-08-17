package factory;

import factory.AbstractModels.Chair;

public class RealChair extends Chair{
	
	@Override
	public RealChair createAChair() {
		return new RealChair();
	}

}
