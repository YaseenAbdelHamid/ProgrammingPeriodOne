package gemiddelde;

import java.util.Random;

/**
 * @author Kristiaan Behiels
 * @version 1.0 5/10/13
 */
public class Gemiddelde {
    public static void main(String[] args) {
        int[] getallen  = {
                12, 17, 14, 18, 13, 13, 14, 17, 17, 16,
                10, 18, 13, 18, 12, 12, 10, 17, 10, 15,
                10, 11, 16, 12, 16, 11,  8, 10, 16, 14,
                17,  7, 11, 10, 15, 10, 14,  8,  9, 14
        };

        int som = 0;
        for (int getal : getallen) {
            som += getal;
        }

        System.out.println("Het gemiddelde is: " + (double)som / getallen.length);

    }
}

/*
Het gemiddelde is: 13.125
*/