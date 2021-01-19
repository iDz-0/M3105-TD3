
import java.util.*;

/**
 * 
 */
public class CheckPlagiarism {

    /**
     * Default constructor
     */
    public CheckPlagiarism() {
        this (new LevenshteinScorer(), 0);
    }
    public CheckPlagiarism(DistanceStrategy<String> strat) {
        this(strat, 0);
    }
    public CheckPlagiarism(DistanceStrategy<String> strat, double threshold) {
        distStrategy = strat;
        this.threshold = threshold;
        lowestScore = Double.MAX_VALUE;
    }

    /**
     * 
     */
    private double threshold;

    /**
     * 
     */
    private String closestText;

    /**
     * 
     */
    private double lowestScore;

    DistanceStrategy<String> distStrategy;

    /**
     * @param str 
     * @return
     */
    public boolean checkPlagiarism(String str) {
        double dist;
        for (Iterator<String> ite = TextCollection.getTheCollec().iterator(); ite.hasNext();) {
            String t = ite.next();
            dist = distStrategy.computeDistance(str, t);
            if (dist < lowestScore)
            {
                lowestScore = dist;
                closestText = t;
            }
        }
        return lowestScore <= threshold;
    }

    public static void main(String[] args)
    {
        CheckPlagiarism checker = new CheckPlagiarism(new LevenshteinScorer(), 0.0d);
        String txt1 = "Lorem ipsum", txt2 = "toto";

        System.out.println("Test txt 1");
        System.out.println(checker.checkPlagiarism(txt1));
        System.out.println(checker.closestText);
        System.out.println(checker.lowestScore);
        System.out.println(checker.toString());

        checker = new CheckPlagiarism(new LevenshteinScorer(), 0.0d);
        System.out.println("Test txt 2");
        System.out.println(checker.checkPlagiarism(txt2));
        System.out.println(checker.closestText);
        System.out.println(checker.lowestScore);
        System.out.println(checker.toString());
    }
}