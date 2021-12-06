package StringBuilder;

import java.util.Scanner;

/**
 * Maak uitsluitend gebruik van StringBuilder-methoden (geen String-methoden)
 */
public class GetallenString {
    public static void main(String[] args) {
        final int MAX = 20;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef de hoogste getalwaarde in (1.." + MAX + "): ");
        int aantal = keyboard.nextInt();

        StringBuilder builder = new StringBuilder(MAX);
        for (int i = 1; i <= aantal; i++) {
            builder.append(i).append(' ');
        }

        System.out.println(builder.toString());

        // Verwijder alle spaties in de stringbuilder
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == ' ') {
                builder.deleteCharAt(i);
            }
        }

        System.out.println(builder.toString());

    }
}
/*
Geef de hoogste getalwaarde in (1..20): 10
1 2 3 4 5 6 7 8 9 10
12345678910
*/