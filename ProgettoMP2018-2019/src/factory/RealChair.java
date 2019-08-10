package factory;

import facotry.AbstractModels.Chair;

public class RealChair extends Chair{
	
	@Override
	public void createAChair() {
		System.out.println("created real chair");		
	}

}
