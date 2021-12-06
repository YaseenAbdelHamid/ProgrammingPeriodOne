package StringBuilder;

import java.nio.charset.Charset;
import java.util.Scanner;

public class GetallenString2 {
    public static void main(String[] args) {
        final int MAX;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef de maximale waarde in: ");
        if (keyboard.hasNextInt()) {
            MAX = keyboard.nextInt();
            System.out.print("Geef de hoogste getalwaarde in (1.." + MAX + "): ");
            if (keyboard.hasNextInt()) {
                int aantal = keyboard.nextInt();
                if (aantal < 1 && aantal > MAX) {
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
                } else {
                    System.out.println("Foutieve waarde, dit is geen getal in de range 1.." + MAX + "!");
                }
            } else {
                System.out.println("Foutieve waarde, dit is geen geldig getal!");
            }
        } else {
            System.out.println("Foutieve waarde, dit is geen getal!");
        }
    }
}

/*
Geef de maximale waarde in:  abc
Foutieve waarde, dit is geen getal!
*/

/*
Geef de maximale waarde in: 25
Geef de hoogste getalwaarde in (1..25): abc
Foutieve waarde, dit is geen geldig getal!
*/

/*
Geef de maximale waarde in: 25
Geef de hoogste getalwaarde in (1..25): 30
Foutieve waarde, dit is geen getal in de range 1..25!
*/

/*
Geef de hoogste getalwaarde in (1..20): 10
1 2 3 4 5 6 7 8 9 10
12345678910
 */