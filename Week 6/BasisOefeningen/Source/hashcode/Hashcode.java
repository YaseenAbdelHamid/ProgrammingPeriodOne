package hashcode;

import java.util.Random;

/**
 * @author Kristiaan Behiels
 * @version 1.0 5/10/13
 */
public class Hashcode {
    public static final int MAX = 20;

    public static void main(String[] args) {
        int[] getallen = new int[MAX];

        Random generator = new Random();
        for (int i = 0; i < MAX; i++) {
            getallen[i] = generator.nextInt(900) + 100; // 100..999
        }

        for (int i = 0; i< MAX; i++) {
            System.out.print(getallen[i] + " ");
        }
        System.out.println();

        int[] hashcodes = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            hashcodes[i] = getallen[i] % 10;
        }

        for (int i = 0; i < MAX; i++) {
            System.out.print(hashcodes[i] + " ");
        }
    }
}

/*
136 969 430 662 524 238 494 810 892 575 523 503 197 309 881 844 912 754 800 868
6 9 0 2 4 8 4 0 2 5 3 3 7 9 1 4 2 4 0 8
*/

/*
161 336 762 150 300 857 366 998 168 890 622 875 231 439 713 687 186 595 809 730
1 6 2 0 0 7 6 8 8 0 2 5 1 9 3 7 6 5 9 0
*/

/*
465 542 511 899 873 304 364 628 106 606 408 913 507 847 906 697 112 567 636 896
5 2 1 9 3 4 4 8 6 6 8 3 7 7 6 7 2 7 6 6
*/