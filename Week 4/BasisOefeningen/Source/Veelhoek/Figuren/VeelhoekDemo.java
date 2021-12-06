package Veelhoek.Figuren;

import java.util.Scanner;

public class VeelhoekDemo {
    public static void main(String[] args) {
        // Creatie objecten
        Rechthoek rechthoek = new Rechthoek();
        RechthoekigeDriehoek driehoek = new RechthoekigeDriehoek();

        Scanner scanner = new Scanner(System.in);

        // Rechthoek
        System.out.print("Geef de breedte van de rechthoek: ");
        int breedte = scanner.nextInt();
        rechthoek.setBreedte(breedte);

        System.out.print("Geef de hoogte van de rechthoek: ");
        int hoogte = scanner.nextInt();
        rechthoek.setHoogte(hoogte);

        System.out.println("\nRechthoek\nOmtrek: " + rechthoek.omtrek() + "\nOppervlakte: " + rechthoek.oppervlakte());


        // Driehoek
        System.out.print("\nGeef de basis van de driehoek: ");
        int basis = scanner.nextInt();
        driehoek.setBasis(basis);

        System.out.print("Geef de hoogte van de driehoek: ");
        hoogte = scanner.nextInt();
        driehoek.setHoogte(hoogte);

        System.out.println("\nDriehoek\nOmtrek: " + driehoek.omtrek() + "\nOppervlakte: " + driehoek.oppervlakte());

        // Alle attributen via getters
        System.out.print("Overzicht: Rechthoek " + rechthoek.getBreedte() + "x" + rechthoek.getHoogte());
        System.out.println("   Driehoek b" + driehoek.getBasis() + " h" + driehoek.getHoogte());
    }
}

/*
Geef de breedte van de rechthoek: 10
Geef de hoogte van de rechthoek: 5

Rechthoek
Omtrek: 30.0
Oppervlakte: 50.0

Geef de basis van de driehoek: 4
Geef de hoogte van de driehoek: 3

Driehoek
Omtrek: 12.0
Oppervlakte: 6.0

Overzicht: Rechthoek 10x5   Driehoek b4 h3
*/