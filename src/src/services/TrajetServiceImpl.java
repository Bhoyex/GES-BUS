package services;

import model.Trajet;

import java.util.ArrayList;
import java.util.List;

public class TrajetServiceImpl implements TrajetService {
    private List<Trajet> trajets = new ArrayList<>();

    @Override
    public void planifierTrajet(Trajet trajet) {
        trajets.add(trajet);
    }

    @Override
    public List<Trajet> listTrajets() {
        return trajets;
    }
}
