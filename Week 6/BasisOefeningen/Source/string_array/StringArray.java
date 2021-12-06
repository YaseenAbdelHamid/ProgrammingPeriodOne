package string_array;

import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 17/10/13
 */
public class StringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hoeveel woorden ga je intikken? ");
        int aantal = scanner.nextInt();
        scanner.nextLine();  // Enter weglezen

        System.out.println();
        String[] woorden = new String[aantal];
        for (int i = 0; i < aantal; i++) {
            System.out.print("Woord " + (i + 1) + ": ");
            woorden[i] = scanner.nextLine();
        }

        String kortste = woorden[0];  // eerste woord
        String langste = woorden[0];

        for (String woord : woorden) {
            if (woord.length() < kortste.length()) {
                kortste = woord;
            }
            if (woord.length() > langste.length()) {
                langste = woord;
            }
        }

        System.out.println("\nkorste woord: " + kortste);
        System.out.println("langste woord: " + langste);

    }
}

/*
Hoeveel woorden ga je intikken? 5

Woord 1:vakantie
Woord 2:computer
Woord 3:HELP
Woord 4:abracadabra
Woord 5:schroevendraaier

korste woord: HELP
langste woord: schroevendraaier
*/