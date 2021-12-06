package verkoper;

import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 7/10/13
 */
public class TestVerkoper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef de naam van de verkoper: ");
        String naam = scanner.nextLine();

        Verkoper verkoper = new Verkoper(naam);
        int[] cijfers = new int[12];

        for(int i = 0; i < 12; i++){
            System.out.print("Geef de verkoopcijfers voor maand " + (i + 1) + ": ");
            cijfers[i] = scanner.nextInt();
        }

        verkoper.setVerkoopCijfers(cijfers);
        System.out.println(verkoper);

    }
}

/*
Geef de naam van de verkoper:  Jos
Geef de verkoopcijfers voor maand 1: 254
Geef de verkoopcijfers voor maand 2: 187
Geef de verkoopcijfers voor maand 3: 971
Geef de verkoopcijfers voor maand 4: 280
Geef de verkoopcijfers voor maand 5: 267
Geef de verkoopcijfers voor maand 6: 314
Geef de verkoopcijfers voor maand 7: 501
Geef de verkoopcijfers voor maand 8: 647
Geef de verkoopcijfers voor maand 9: 314
Geef de verkoopcijfers voor maand 10: 728
Geef de verkoopcijfers voor maand 11: 698
Geef de verkoopcijfers voor maand 12: 247

Verkoopcijfers van Jos: 254 187 971 280 267 314 501 647 314 728 698 247
Totaal: 5408

*/