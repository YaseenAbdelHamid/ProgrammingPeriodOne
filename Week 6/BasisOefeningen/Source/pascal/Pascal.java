package pascal;


import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 2/10/13
 *
 * Schrijf een programma dat een aantal rijen (max) 12 van de driehoek van Pascal afdrukt.
 * Vul eerst de eerste kolom met allemaal 1-waarden.
 * In de driehoek is de waarde telkens de som van de waarde erboven en die links ervan (van de waarde erboven).
 */
public class Pascal {
    private static final int MAX = 12;

    public static void main(String[] args) {
        int[][] driehoek;
        int aantal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef de het aantal rijen: ");
        aantal = scanner.nextInt();
        if (aantal < 1 || aantal > MAX) aantal = MAX;

        // Creatie driehoek
        driehoek = new int[aantal][];       // alternatief: driehoek = new int[aantal][aantal];
        for (int i = 0; i < aantal; i++) {
            driehoek[i] = new int[i + 2];   // voldoende lang
        }

        // Vul driehoek
        for (int i = 0; i < aantal; i++) {
            driehoek[i][0] = 1;   // allemaal 1'en in de eerste kolom
        }
        for (int i = 1; i < aantal; i++) {
            for (int j = 1; j < i + 1; j++) {
                driehoek[i][j] = driehoek[i - 1][j - 1] + driehoek[i - 1][j];
            }
        }

        // Toon driehoek
        for (int i = 0; i < aantal; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.printf("%4d", driehoek[i][j]);
            }
            System.out.println();
        }
    }
}

/*
Geef de het aantal rijen: 5
   1
   1   1
   1   2   1
   1   3   3   1
   1   4   6   4   1
*/

/*
Geef de het aantal rijen: 24
   1
   1   1
   1   2   1
   1   3   3   1
   1   4   6   4   1
   1   5  10  10   5   1
   1   6  15  20  15   6   1
   1   7  21  35  35  21   7   1
   1   8  28  56  70  56  28   8   1
   1   9  36  84 126 126  84  36   9   1
   1  10  45 120 210 252 210 120  45  10   1
   1  11  55 165 330 462 462 330 165  55  11   1
*/
