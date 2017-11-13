package uty.vc.model.beans;

import java.util.List;
import uty.vc.model.entities.wagon.Wagon;

public interface WagonBeanInterface {

    public String getVersionDB();

    public Wagon getWagonByNumber(int nvag);

    public List<Wagon> getAllWagons();

    public List<Wagon> getWagonsByNumbers(String nvags);
}
