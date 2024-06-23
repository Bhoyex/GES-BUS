package services;

import model.Conducteur;

import java.util.List;

public interface ConducteurService {
    void addConducteur(Conducteur conducteur);
    List<Conducteur> listConducteurs();
}
