package services;

import model.Ligne;

import java.util.ArrayList;
import java.util.List;

public class LigneServiceImpl implements LigneService {
    private List<Ligne> lignes = new ArrayList<>();

    @Override
    public void addLigne(Ligne ligne) {
        lignes.add(ligne);
    }

    @Override
    public List<Ligne> getLignesDisponibles(String date) {
        // Logique pour obtenir les lignes disponibles à une date donnée
        return lignes;
    }
}
