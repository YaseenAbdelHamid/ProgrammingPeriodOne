package Random;

import java.util.Random;

public class RandomDemo  {
    public static void main(String[] args) {
        Random random = new Random();

        // geef 5 willekeurige getallen in de range 1..6 op één regel
        for (int i = 0; i < 6; i++) {
            System.out.print(random.nextInt(6) + 1 + " ");
        }
        System.out.println();

        // geef 4 willekeurige booleans op één regel
        for (int i = 0; i < 4; i++) {
            System.out.print(random.nextBoolean() + " ");
        }
        System.out.println();

        // geef 3 willekeurige getallen tussen 0 en 1 (1 niet inbegrepen)
        for (int i = 0; i < 3; i++) {
            System.out.print(random.nextDouble() + " ");
        }
    }
}

/*
1 2 6 3 4 2
false true false false
0.9997459111040459 0.672738358215759 0.16880099593669928
*/
