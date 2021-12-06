package letters_tellen;

import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 17/10/13
 */
public class LetterTellen {
    private static final int AANTAL_LETTERS = 26;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tik een zin in:");
        String zin = scanner.nextLine();

        int[] tellers = new int[AANTAL_LETTERS];
        zin = zin.toLowerCase();

        int totaalAantalLetters = 0;
        for (int i = 0; i < zin.length(); i++) {
            char ch = zin.charAt(i);
            if (Character.isLetter(ch)) { // alle lettertekens
                if (ch >= 'a' && ch <= 'z') { // range a..z
                    tellers[ch - 'a']++;
                }
                totaalAantalLetters++;
            }
        }

        System.out.println("Letterfrequenties:");
        int count = 0;
        for (int i = 0; i < AANTAL_LETTERS; i++) {
            System.out.print( (char)(i + 'a') + " --> " + tellers[i] + "x  ");
            //System.out.printf("%c --> %d", (char)(i + 'a'), tellers[i]);

            count++;
            if (count % 6 == 0 ) {
                count = 0;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Totaal aantal letters: " + totaalAantalLetters);
    }
}
