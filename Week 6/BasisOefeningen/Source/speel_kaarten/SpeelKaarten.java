package speel_kaarten;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 9/10/2014
 */
public class SpeelKaarten {
    private static final String[] kleuren = {"Harten", "Schoppen", "Ruiten", "Klaveren"};
    private static final String[] waarden = {"Aas", "Twee", "Drie", "Vier", "Vijf",
            "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Dame", "Heer"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Hoeveel kaarten wens je (1..5): ");
        if (scanner.hasNextInt()) {
            int aantal = scanner.nextInt();
            if (aantal > 0 && aantal < 6) {
                for (int i = 0; i < aantal; i++) {
                    int kleurIndex = random.nextInt(4);
                    int waardenIndex = random.nextInt(10);
                    System.out.println(kleuren[kleurIndex] + " " + waarden[waardenIndex]);
                }
            } else {
                System.out.println("Dit is geen geldige waarde!");
            }
        } else {
            System.out.println("Dit is geen geldige waarde!");
        }
    }
}

/*
Hoeveel kaarten wens je (1..5): 1
Harten Tien
 */

/*
Hoeveel kaarten wens je (1..5): 5
Schoppen Zeven
Ruiten Vijf
Klaveren Acht
Ruiten Drie
Schoppen Aas
 */
