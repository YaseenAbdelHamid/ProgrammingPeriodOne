package kwadraten;

import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 4-10-13
 */
public class KwadratenBis {
    public static void main(String[] args) {
        System.out.print("Hoeveel kwadraten wens je af te drukken? : ");
        Scanner scanner = new Scanner(System.in);
        int aantal = scanner.nextInt();

        int[] kwadraten = new int[aantal];

        for (int i = 0; i < aantal; i++) {
            kwadraten[i] = (i+1)*(i+1);
        }

        for (int kwadraat : kwadraten) {
            System.out.print(kwadraat + " ");
        }
        System.out.println();
    }
}

/*
Hoeveel kwadraten wens je af te drukken? : 20
1 4 9 16 25 36 49 64 81 100 121 144 169 196 225 256 289 324 361 400
*/
