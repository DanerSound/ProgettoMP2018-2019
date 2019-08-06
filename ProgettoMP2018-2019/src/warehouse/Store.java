package warehouse;

import tools.AbstractObs;
import tools.Product;

public class Store implements AbstractObs {

	private WareHouse myWarehouse;

	public Store(WareHouse myWarehouse) {
		this.myWarehouse = myWarehouse;
	}

	@Override
	public void update(boolean state) {
		if (!state) {
		//	getProduct();
		}
	}

	public Product popProduct(int shelf, int position) {
		return myWarehouse.getMyShelves(shelf).pickUpPrduct(position);
	}

// 	private void getProduct() {
//		popProduct(shelf, int position);
//	}

	public WareHouse getWarehouse() {
		return myWarehouse;
	}

}
