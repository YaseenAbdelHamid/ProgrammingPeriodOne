package Veelhoek;


import java.util.Random;

/**
 * @author Kristiaan Behiels
 * @version 1.0 3/10/2014 20:35
 *
 * Zie ook opdracht 1 uit het boek (pagina 83)
 */
public class RandomTwee {
    public static void main(String[] args) {
        Random random = new Random();

        // Genereer 5 willekeurige decimale getallen
        // en druk ze af op 1 regel afgerond op 2 cijfers na de komma.
        for (int i = 0; i < 5; i++) {
            System.out.printf("%.2f ", random.nextDouble());
        }
        System.out.println();

        // Maak 2 random objecten die je dezelfde 'seed' 42 geeft.
        // Genereer voor beide 5 willekeurige gehele getallen in de range 1..42 en druk ze
        // op 1 regel af waarbij je telkens van random object wisselt.
        Random eerste = new Random(42);
        Random tweede = new Random(42);

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d %d ", eerste.nextInt(42) + 1, tweede.nextInt(42) + 1);
        }
    }
}

/*
0,40 0,17 0,34 0,77 0,07  <-- Willekeurig
9 9 34 34 7 7 39 39 13 13 26 26 30 30 39 39 14 14 18 18 <--- Vast
 */