package getallen_zoeken;

import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 7/10/13
 */
/*
Gebruik deze klasse om je klassen GetallenZoeken te testen.
 */
public class TestGetallenZoeken {
    public static void main(String[] args) {

        int[] tabel = {16, 14, 19, 18, 4, 10, 2, 3, 12, 17, 14, 12, 4, 10, 10, 16, 12, 10, 12, 20};

        GetallenZoeken getallen = new GetallenZoeken(tabel);
        System.out.println("GetallenZoeken: " + getallen.toonGetallen());

        System.out.println("\nGetal " + 12 + " komt " + getallen.aantalKeer(12) + " keer voor.");
        System.out.println("Getal " + 20 + " komt " + getallen.aantalKeer(20) + " keer voor.");
        System.out.println("Getal " + 13 + " komt " + getallen.aantalKeer(13) + " keer voor.\n");

        Scanner scanner = new Scanner(System.in);
        int getal;
        do {
            System.out.print("Welk getal wil je zoeken? (stop met -1): ");
            getal = scanner.nextInt();
            if (getal >= 0) {
                System.out.print("Het getal " + getal + " komt");
                if (!getallen.isAanwezig(getal)) {
                    System.out.print(" NIET");
                }
                System.out.println(" voor in de tabel");
            }
        } while (getal >= 0);
    }
}

/*
GetallenZoeken:  16, 14, 19, 18, 4, 10, 2, 3, 12, 17, 14, 12, 4, 10, 10, 16, 12, 10, 12, 20

Getal 12 komt 4 keer voor.
Getal 20 komt 1 keer voor.
Getal 13 komt 0 keer voor.

Welk getal wil je zoeken? (stop met -1): 10
Het getal 10 komt voor in de tabel
Welk getal wil je zoeken? (stop met -1): 13
Het getal 13 komt NIET voor in de tabel
Welk getal wil je zoeken? (stop met -1): 0
Het getal 0 komt NIET voor in de tabel
Welk getal wil je zoeken? (stop met -1): 16
Het getal 16 komt voor in de tabel
Welk getal wil je zoeken? (stop met -1): 20
Het getal 20 komt voor in de tabel
Welk getal wil je zoeken? (stop met -1): 0
Het getal 0 komt NIET voor in de tabel
Welk getal wil je zoeken? (stop met -1): -1
*/

