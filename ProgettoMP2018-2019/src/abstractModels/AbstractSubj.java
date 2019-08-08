package abstractModels;

import java.util.ArrayList;

import abstractModels.AbstractObs;

public abstract class AbstractSubj {

    private final  ArrayList<AbstractObs> Obs;

    public AbstractSubj() {
        this.Obs = new ArrayList<>();
    }
    
    public void attach( AbstractObs ob){     
        Obs.add(ob);   
    }
    
    public void dettach ( AbstractObs ob){
        Obs.remove(ob);
    }
      
    public  void notifyObservers (boolean state){     
    	for (int index =0; index<Obs.size();index++){
            Obs.get(index).update(state);     
        }
    }
}
