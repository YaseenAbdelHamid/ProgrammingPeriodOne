package kwadraten;

/**
 * @author Kristiaan Behiels
 * @version 1.0 7/09/13
 *
 * Maak eerst een tabel waarin je 10 gehele getallen kunt plaatsen maar plaats er nog geen getallen in.
 * Gebruik vervolgens een for lus om de tabel in te vullen met de reeks 1 4 9 16 25 36 49 64 81 100.
 * Druk dan de inhoud van de tabel af op één regel. Maak hierbij gebruik van een for-each lus.
 */
public class Kwadraten {
    public static void main(String[] args) {
        int[] kwadraten = new int[10];

        for (int i = 0; i < 10; i++) {
            kwadraten[i] = (i+1)*(i+1);
        }

        for (int kwadraat : kwadraten) {
            System.out.print(kwadraat + " ");
        }
        System.out.println();
    }
}

/*
1 4 9 16 25 36 49 64 81 100
*/

