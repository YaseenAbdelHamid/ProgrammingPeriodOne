package cirkels;

/**
 * @author Kristiaan Behiels
 * @version 1.0 12/10/2014 15:26
 */
public class DemoCirkel {
    public static void main(String[] args) {
        Cirkel cirkel = new Cirkel(5);
        Cirkel klein = new Cirkel(10, "Rood");
        Cirkel groot = new Cirkel(11, "Blauw");

        System.out.println(cirkel);
        System.out.println(klein);
        System.out.println(groot);

        System.out.printf("Verschil omtrek (rood - blauw): %.2f%n", klein.verschilOmtrek(groot));
        System.out.printf("Verschil oppervlakte (blauw - rood): %.2f%n", groot.verschilOppervlakte(klein));

    }
}

/*
Kleur: Zwart
Straal: 5
Omtrek: 31,42
Oppervlakte: 78,54

Kleur: Rood
Straal: 10
Omtrek: 62,83
Oppervlakte: 314,16

Kleur: Blauw
Straal: 11
Omtrek: 69,12
Oppervlakte: 380,13

Verschil omtrek (rood - blauw): 6,28
Verschil oppervlakte (blauw - rood): 65,97
 */

