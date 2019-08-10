package factory;

import facotry.AbstractModels.Chair;

public class RealChair extends Chair{
	
	@Override
	public void creatChair() {
		System.out.println("created real chair");		
	}

}
