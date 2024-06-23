package model;


public class Ligne {
    private int id;
    private String numero;
    private int nombreKilometres;
    private double tarif;

    public Ligne() {}

    public Ligne(int id, String numero, int nombreKilometres, double tarif) {
        this.id = id;
        this.numero = numero;
        this.nombreKilometres = nombreKilometres;
        this.tarif = tarif;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getNombreKilometres() {
        return nombreKilometres;
    }

    public void setNombreKilometres(int nombreKilometres) {
        this.nombreKilometres = nombreKilometres;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public String getNom() {
        return numero; // Assuming 'numero' is used as the name
    }
}