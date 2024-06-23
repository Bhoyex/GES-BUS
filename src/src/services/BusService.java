package services;

import model.Bus;
import java.util.List;

public interface BusService {
    void addBus(Bus bus);
    List<Bus> listBuses();
    void decommissionBus(int busId);
    List<Bus> getBusesByLine(int ligneId);
    List<Bus> getBusesOutOfService();
}
