package veelvouden;

import java.util.Scanner;

public class Veelvouden {
    public static void main(String[] args) {
        final int MAX = 100;
        Scanner keyb = new Scanner(System.in);
        System.out.print("Van welk getal wens je de veelvouden? ");
        int basis = keyb.nextInt();
        int veelvoud = basis;
        while (veelvoud < MAX) {
            System.out.println(veelvoud);
            veelvoud += basis;
        }

    }
}
