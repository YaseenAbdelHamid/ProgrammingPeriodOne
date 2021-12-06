package String;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een zin in: ");
        String zin = scanner.nextLine().trim();

        System.out.println("Deze zin heeft een lengte van " + zin.length() + " characters.");

        String hoofdletters = zin.toUpperCase();
        System.out.println(hoofdletters);

        String kleineLetters = zin.toLowerCase();
        System.out.println(kleineLetters);

        char eersteLetter = zin.charAt(0);
        System.out.println("eerste letter: " + eersteLetter);

        char laatsteLetter = zin.charAt(zin.length() -  1);
        System.out.println("laatste letters: " + laatsteLetter);

        String eersteHelft = zin.substring(0, zin.length() / 2);
        System.out.println(eersteHelft);

        String vervangLetterO = zin.replaceAll("o", "_");
        System.out.println(vervangLetterO);

        String zonderSpaties = zin.replace(" ", "");
        System.out.println(zonderSpaties);

        // Verwijder alle klinkers uit de string  (regEx versie)
        String zonderKlinkers = zin.replaceAll("[aeiou]", "");
        System.out.println(zonderKlinkers);

        // Idem met for lus
        String result = "";
        for (int i = 0; i < zin.length(); i++) {
            char ch = Character.toLowerCase(zin.charAt(i));
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                result += ch;
            }
        }
        System.out.println(result);

    }
}

/*
THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
the quick brown fox jumps over the lazy dog
eerste letter: T
laatste letters: g
The quick brown fox j
The quick br_wn f_x jumps _ver the lazy d_g
Thequickbrownfoxjumpsoverthelazydog
Th qck brwn fx jmps vr th lzy dg
*/