package temperaturen;

import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 17/10/13
 */
public class Temperaturen {
    public static void main(String[] args) {
        final int AANTAL_TEMPERATUREN = 7;

        double[] temperaturen = new double[AANTAL_TEMPERATUREN];
        Scanner scanner = new Scanner(System.in);

        double som = 0;
        System.out.println("Geef de " + AANTAL_TEMPERATUREN + " temperaturen:");
        for (int i = 0; i < temperaturen.length; i++) {
            System.out.print("Dag " + (i + 1) + ": " );
            temperaturen[i] = scanner.nextDouble();
            som += temperaturen[i];
        }

        System.out.println("\nOverzicht:");
        System.out.println("=================");
        for (int i = 0; i < temperaturen.length; i++) {
            System.out.printf("Dag %d: %10.1f%n", (i + 1), temperaturen[i]);
        }
        System.out.println("=================");
        System.out.format("Gemiddelde: %.2f", som / AANTAL_TEMPERATUREN);
    }
}

/*
Geef de 7 temperaturen:
Dag 1: 15,5
Dag 2: 12
Dag 3: 13,8
Dag 4: 14,8
Dag 5: 17
Dag 6: 16,5
Dag 7: 17

Overzicht:
=================
Dag 1:       15,5
Dag 2:       12,0
Dag 3:       13,8
Dag 4:       14,8
Dag 5:       17,0
Dag 6:       16,5
Dag 7:       17,0
=================
Gemiddelde: 15,23
 */
