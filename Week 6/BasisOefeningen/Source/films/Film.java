package films;

/**
 * @author Kristiaan Behiels
 * @version 1.0 7/10/13   (zie 2012-2013 P1W6)
 */
public class Film {
    private String titel;
    private int jaar;

    public Film(String titel, int jaar) {
        this.titel = titel;
        this.jaar = jaar;
    }

    public String getTitel() {
        return titel;
    }

    public int getJaar() {
        return jaar;
    }
}
