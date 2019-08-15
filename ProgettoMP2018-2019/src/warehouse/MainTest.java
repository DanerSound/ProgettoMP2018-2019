package warehouse;

import abstractModels.Product;
import factory.RealChair;
import factory.RealFactory;
import factory.ToyFactory;

public class MainTest {

	public static void main(String[] args) {
		WareHouse warehouse = new WareHouse(1, 5);	
		ToyFactory toyFactory = new ToyFactory();
		RealFactory realFactory = new RealFactory();
		
		Store store = new Store(warehouse);
		warehouse.attach(store);
		
		warehouse.addItemToShelf(0, realFactory.createAChair());
		warehouse.addItemToShelf(0, toyFactory.createAChair());
		warehouse.addItemToShelf(0, realFactory.createAPot());
		warehouse.addItemToShelf(0, toyFactory.createAPot());
		warehouse.addItemToShelf(0, realFactory.createAChair());
		
		Product chair = new RealChair();

		//warehouse.find(chair);
		
		int stock = warehouse.stock();
		System.out.println("products ins stock" + stock);
	}

}
