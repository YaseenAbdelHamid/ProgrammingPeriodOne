package machten;

import java.util.Scanner;

public class Machten {
    public static void main(String[] args) {
        final int MAX = 10000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Van welk getal wens je de machten? ");
        int getal = scanner.nextInt();

        int macht = getal;
        while (macht < MAX) {
            System.out.println(macht);
            macht *= getal;
        }

        System.out.println();
        for (int i = getal; i < MAX;  i *= getal) {
            System.out.println(i);
        }



    }
}