import java.util.*;

public class Promotion {

    public Promotion() {
        listEtud = new ArrayList<Etudiant>();
    }

    public Promotion(List<Etudiant> listEtud) {
        this.listEtud = listEtud;
    }

    private List<Etudiant> listEtud;

    public List<Etudiant> getListEtud() {
        return listEtud;
    }

    public void setListEtud(List<Etudiant> listEtud) {
        this.listEtud = listEtud;
    }

    public void triParID() {
        Collections.sort(listEtud, new CompID());
    }

    public void TriparAlpha() {
        Collections.sort(listEtud, new CompAlpha());
    }

    public static void main () {
        Promotion promo = new Promotion();
    }
}