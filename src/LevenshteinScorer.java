
import java.util.*;

/**
 * 
 */
public class LevenshteinScorer implements DistanceStrategy<String> {

    /**
     * Default constructor
     */
    public LevenshteinScorer() {
    }

    /**
     * @param Str1 
     * @param Str2 
     * @return
     */
    public double computeDistance(String Str1, String Str2) {
        return Str1.compareTo(Str2);
    }

}