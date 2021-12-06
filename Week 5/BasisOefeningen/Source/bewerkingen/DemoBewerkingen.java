package bewerkingen;

import java.util.Scanner;

public class DemoBewerkingen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef een eerste geheel getal:");
        int eerste = keyboard.nextInt();
        System.out.print("Geef een tweede geheel getal:");
        int tweede = keyboard.nextInt();

        BewerkingenNotas bewerkingen = new BewerkingenNotas(eerste, tweede);

        System.out.printf("De som is %d\n", bewerkingen.som());
        System.out.printf("Het verschil is %d\n", bewerkingen.verschil());
        System.out.printf("Het product is %d\n", bewerkingen.product());
        System.out.printf("Het quotiënt is %.2f\n", bewerkingen.quotient());
    }

}
