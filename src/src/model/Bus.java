package model;

public class Bus {
    private int id;
    private String immatriculation;
    private String type;
    private int kilometrage;
    private int nombreDePlaces;
    private Ligne ligne;
    private boolean enService;

    public Bus() {}

    public Bus(int id, String immatriculation, String type, int kilometrage, int nombreDePlaces, Ligne ligne, boolean enService) {
        this.id = id;
        this.immatriculation = immatriculation;
        this.type = type;
        this.kilometrage = kilometrage;
        this.nombreDePlaces = nombreDePlaces;
        this.ligne = ligne;
        this.enService = enService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public int getNombreDePlaces() {
        return nombreDePlaces;
    }

    public void setNombreDePlaces(int nombreDePlaces) {
        this.nombreDePlaces = nombreDePlaces;
    }

    public Ligne getLigne() {
        return ligne;
    }

    public void setLigne(Ligne ligne) {
        this.ligne = ligne;
    }

    public boolean isEnService() {
        return enService;
    }

    public void setEnService(boolean enService) {
        this.enService = enService;
    }
}
