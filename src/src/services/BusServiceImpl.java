package services;

import model.Bus;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class BusServiceImpl implements BusService {
    private List<Bus> buses = new ArrayList<>();

    @Override
    public void addBus(Bus bus) {
        buses.add(bus);
    }

    @Override
    public List<Bus> listBuses() {
        return new ArrayList<>(buses);
    }

    @Override
    public void decommissionBus(int busId) {
        for (Bus bus : buses) {
            if (bus.getId() == busId) {
                bus.setEnService(false);
                break;
            }
        }
    }

    @Override
    public List<Bus> getBusesByLine(int lineId) {
        return buses.stream()
                    .filter(bus -> bus.getLigne() != null && bus.getLigne().getId() == lineId)
                    .collect(Collectors.toList());
    }

    @Override
    public List<Bus> getBusesOutOfService() {
        return buses.stream()
                    .filter(bus -> !bus.isEnService())
                    .collect(Collectors.toList());
    }
}
