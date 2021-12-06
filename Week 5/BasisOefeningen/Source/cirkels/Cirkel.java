package cirkels;

/**
 * @author Kristiaan Behiels
 * @version 1.0 12/10/2014
 *
 */
public class Cirkel {
    private int straal;
    private String kleur = "Zwart";

    public Cirkel(int straal, String kleur) {
        this.straal = straal;
        this.kleur = kleur;
    }

    public Cirkel(int straal) {
        this.straal = straal;
    }

    // Omtrek cirkel = 2 x PI x r
    public double omtrek() {
        return 2 * Math.PI * straal;
    }

    // Oppervlakte cirkel = PI * r²
    public double oppervlakte() {
        return Math.PI * straal * straal;
    }

    // Vergelijk omtrek in absolute waarde
    public double verschilOmtrek(Cirkel andereCirkel) {
        return Math.abs(this.omtrek() - andereCirkel.omtrek());
    }

    // Verschil oppervlakte in absolute waarde
    public double verschilOppervlakte(Cirkel andereCirkel) {
        return Math.abs(this.oppervlakte() - andereCirkel.oppervlakte());
    }

    @Override
    public String toString() {
        return String.format("Kleur: %s%nStraal: %d%nOmtrek: %.2f%nOppervlakte: %.2f%n",
                kleur, straal, omtrek(), oppervlakte());
    }
}