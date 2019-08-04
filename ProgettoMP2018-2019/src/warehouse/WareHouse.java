package warehouse;

import myTools.AbstractSubj;
import myTools.Product;

import java.util.ArrayList;
import java.util.List;

public class WareHouse extends AbstractSubj {

    public int availableSpace;
    private Boolean wareHouseEmpty = true;
    private  List<Product> box;

    public WareHouse(int boxSpace) {
    	availableSpace = boxSpace;
        box = new ArrayList<>(availableSpace);

    }

    public void addItem(Product product){

        if(box.size()!= availableSpace){
            box.add(product);     
        } 
        if(box.size()== availableSpace){
            System.out.println(" il magazzino è pieno");
            setWareEmpty(false);
            notifyObservers(wareHouseEmpty);
        }
    }
    
    public void setWareEmpty(Boolean wareEmpty) {
        this.wareHouseEmpty = wareEmpty;
    }

    public Boolean getWareHouseEmpty() {
		return wareHouseEmpty;
	}

	public List<Product> getBox() {
        return box;
    }
}
