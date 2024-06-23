package services;

import model.Trajet;

import java.util.List;

public interface TrajetService {
    void planifierTrajet(Trajet trajet);
    List<Trajet> listTrajets();
}
