import java.util.*;

public class Etudiant {

    public Etudiant(int id, String nom, String prenom) {
        this.id = ++lastId;
        this.nom = nom;
        this.prenom = prenom;
    }

    private static  int lastId = 0;
    private int id;
    private String nom;
    private String prenom;

    public int getId() {
        return id;
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

    @java.lang.Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}