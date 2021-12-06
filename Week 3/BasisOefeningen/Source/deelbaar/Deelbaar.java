package deelbaar;

import java.util.Scanner;

public class Deelbaar {
    public static void main(String[] args) {
        final int MAX = 1000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dit programma geeft alle getallen tussen 1 en 1000 die deelbaar zijn door ");
        System.out.println("beide opgegeven positieve delers.");

        boolean stop = false;
        do {
            System.out.print("\nGeef de eerste deler (stop met 0): ");
            int eerste = scanner.nextInt();
            if (eerste > 0) {
                System.out.print("Geef de tweede deler: ");
                int tweede = scanner.nextInt();
                if (tweede > 0) {
                    int count = 0;
                    for (int getal = 1; getal < MAX; getal++) {
                        if (getal % eerste == 0 && getal % tweede == 0) {
                            System.out.printf("%4d", getal);
                            if (++count % 10 == 0) {
                                System.out.println();
                                count = 0;
                            }
                        }
                    }
                    System.out.println();
                } else {
                    stop = true;
                }
            } else {
                stop = true;
            }
        } while (!stop);
    }
}