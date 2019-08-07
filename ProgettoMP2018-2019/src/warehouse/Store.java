package warehouse;

import abstractModels.AbstractObs;
import abstractModels.Product;

public class Store implements AbstractObs {

	private WareHouse warehouse;

	public Store(WareHouse warehouse) {
		this.warehouse = warehouse;
	}

	@Override
	public void update(boolean state) {
		if (!state) {
			getProduct();
		}
	}

	public void getProduct() {
	//	TODO : devi prendere tutti gli elementi da uno scaffale e poi passare al succesivo,
		for(int index=0;index<warehouse.getWareHouseShelves();index++){		
		System.out.println(popProduct(index, index));	
		}
		
	}

	public Product popProduct(int shelf, int position) {
		return warehouse.getMyShelves(shelf).pickUpPrduct(position);
	}
	
	public WareHouse getWarehouse() {
		return warehouse;
	}
}
