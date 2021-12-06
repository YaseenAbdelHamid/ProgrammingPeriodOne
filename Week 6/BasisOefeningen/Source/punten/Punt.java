package punten;


/**
 * @author Kristiaan Behiels
 * @version 1.0 7/10/13
 */
public class Punt {
    private int x;
    private int y;

    public Punt() {
    }

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Is de afstand tot het punt met de coördinaten 0,0
    // Wordt gegeven
    public double afstandTotDeOorsprong() {
        return Math.sqrt(x * x + y * y);
    }
}