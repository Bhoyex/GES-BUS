package model;

public class Trajet {
    private int id;
    private String type;
    private String date;
    private int nombreDeTickets;
    private Bus bus;
    private Ligne ligne;
    private Conducteur conducteur;
    private int ticketsVendus;

    public Trajet() {}

    public Trajet(int id, String type, String date, int nombreDeTickets, Bus bus, Ligne ligne, Conducteur conducteur) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.nombreDeTickets = nombreDeTickets;
        this.bus = bus;
        this.ligne = ligne;
        this.conducteur = conducteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNombreDeTickets() {
        return nombreDeTickets;
    }

    public void setNombreDeTickets(int nombreDeTickets) {
        this.nombreDeTickets = nombreDeTickets;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Ligne getLigne() {
        return ligne;
    }

    public void setLigne(Ligne ligne) {
        this.ligne = ligne;
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }

    public int getTicketsVendus() {
        return ticketsVendus;
    }
}