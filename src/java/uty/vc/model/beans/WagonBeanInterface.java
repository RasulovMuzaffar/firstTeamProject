package uty.vc.model.beans;

import java.util.List;
import uty.vc.model.entities.wagon.Wagon;

public interface WagonBeanInterface {

    public Wagon getWagonByNumber(int nvag);
    
    public List<Wagon> getWagons();
    
    public List<Wagon> getWagonsByNumbers(String nvags);
}
