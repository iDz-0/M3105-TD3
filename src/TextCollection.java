import java.util.*;

/**
 * 
 */
public class TextCollection {
    static private String loremIpsum1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
            + "sed do eiusmod tempor " + "incididunt ut labore et dolore magna aliqua.";
    static private String loremIpsum2 = "Ut enim ad minim veniam, quis nostrud exercitation "
            + "ullamco laboris nisi ut aliquip ex ea commodo consequat.";
    static private String loremIpsum3 = "Duis aute irure dolor in reprehenderit in voluptate "
            + "velit esse cillum dolore eu " + "fugiat nulla pariatur.";
    static private String loremIpsum4 = "Excepteur sint occaecat cupidatat non "
            + "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    static private Collection<String> theCollec;
    static public String[] textArray = { loremIpsum1, loremIpsum2, loremIpsum3, loremIpsum4 };
    static {
        theCollec = new TreeSet<>(Arrays.asList(textArray));
    }

    public static Collection<String> getTheCollec() {
        return theCollec;
    }

    public static void setTheCollec(Collection<String> theCollec) {
        TextCollection.theCollec = theCollec;
    }

    /**
     * Default constructor
     */
    public TextCollection() {
    }

}