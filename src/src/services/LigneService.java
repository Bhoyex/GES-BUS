package services;

import model.Ligne;

import java.util.List;

public interface LigneService {
    void addLigne(Ligne ligne);
    List<Ligne> getLignesDisponibles(String date);
}
