import java.util.*;

public class CompID implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        return (o1.getId() - o2.getId());
    }
}