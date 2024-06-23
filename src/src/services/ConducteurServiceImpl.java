package services;

import model.Conducteur;

import java.util.ArrayList;
import java.util.List;

public class ConducteurServiceImpl implements ConducteurService {
    private List<Conducteur> conducteurs = new ArrayList<>();

    @Override
    public void addConducteur(Conducteur conducteur) {
        conducteurs.add(conducteur);
    }

    @Override
    public List<Conducteur> listConducteurs() {
        return conducteurs;
    }
}
