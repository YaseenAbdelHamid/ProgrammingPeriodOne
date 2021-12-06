package maximum;

/**
 * @author Kristiaan Behiels
 * @version 1.0 10/10/13
 */

/*
De klasse Maximum bevat drie attributen (velden) van het type double, met de namen een, twee en drie.
Voorzie een lege default constructor.
Voorzie een constructor met drie int parameters waarvan de waarden aan de attributen worden toegekend.
Voorzie een constructor met drie long parameters waarvan de waarden aan de attributen worden toegekend. .
Voorzie een constructor met drie double parameters waarvan de waarden aan de attributen worden toegekend.
Voorzie een methode max zonder parameters die de grootste waarde van de attributen als double teruggeeft.
Voorzie een methode max met drie int parameters die de grootste waarde van de parameters als double teruggeeft.
Voorzie een methode max met drie long parameters die de grootste waarde van de parameters als double teruggeeft.
Voorzie een methode max met drie double parameters die de grootste waarde van de parameters als double teruggeeft.
Let op! Zorg ervoor dat je in de uitvoer van het programma kunt zien wanneer en welke constructor en/of methode wordt uitgevoerd.
Plaats daarom een aangepaste System.out.println(...) en dit bij alle constructors en methoden (zie verwachte uitvoer).
 */
public class Maximum {
    private double een;
    private double twee;
    private double drie;

    // overloaded constructors
    public Maximum() {
        System.out.println("Oproep default constructor");
    }

    public Maximum(int een, int twee, int drie) {
        this.een = een;
        this.twee = twee;
        this.drie = drie;
        System.out.println("Oproep int constructor");
    }

    public Maximum(long een, long twee, long drie) {
        this.een = een;
        this.twee = twee;
        this.drie = drie;
        System.out.println("Oproep long constructor");
    }

    public Maximum(double een, double twee, double drie) {
        this.een = een;
        this.twee = twee;
        this.drie = drie;
        System.out.println("Oproep double constructor");
    }

    // overloaded methoden
    public double max() {
        return Math.max(een, Math.max(twee, drie));
    }

    public double max(int een, int twee, int drie) {
        System.out.println("Oproep int parameters methode");
        return Math.max(een, Math.max(twee, drie));
    }

    public double max(long een, long twee, long drie) {
        System.out.println("Oproep long parameters methode");
        return Math.max(een, Math.max(twee, drie));
    }

    public double max(double een, double twee, double drie) {
        System.out.println("Oproep double parameters methode");
        return Math.max(een, Math.max(twee, drie));
    }
}

