package model;

public class Conducteur {
    private int id;
    private String matricule;
    private String nom;
    private String prenom;
    private String telephone;
    private String typePermis;

    public Conducteur() {}

    // Ajout du constructeur manquant dans la classe Conducteur
    public Conducteur(int id, String code, String nom, String telephone, String typePermis) {
        this.id = id;
        this.matricule = code; // Change 'code' to 'matricule'
        this.nom = nom;
        this.telephone = telephone;
        this.typePermis = typePermis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTypePermis() {
        return typePermis;
    }

    public void setTypePermis(String typePermis) {
        this.typePermis = typePermis;
    }
}
