package cijfers;

import java.util.Scanner;

public class Cijfers
{
    /*Geef telkens een cijfer in (0..9).
    Geef het eerste cijfer: 9
    Geef het tweede cijfer: 5
    Geef het derde cijfer: 7
    Geef het vierde cijfer: 9
    Het getal is 9579*/
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int g1,g2,g3,g4,getal;
        boolean doeVerder = true;

        while (doeVerder)
        {
            System.out.println("Geef telkens een cijfer in (0..9).");
            System.out.print("Geef het eerste cijfer:");
            g1 = keyboard.nextInt();
            if (g1==-1)
            {
                doeVerder = false;
            }
            else
            {
                System.out.print("Geef het tweede cijfer:");
                g2 = keyboard.nextInt();
                System.out.print("Geef het derde cijfer:");
                g3 = keyboard.nextInt();
                System.out.print("Geef het vierde cijfer:");
                g4 = keyboard.nextInt();
                if (g1 < 0 || g2 < 0 || g3 < 0 || g4 < 0 || g1 > 9 || g2 > 9 || g3 > 9 || g4 > 9)
                {
                    System.out.println("Zorg dat de getallen in de range [0-9] liggen!");
                }
                else
                {
                    getal = g1 * 1000 + g2 * 100 + g3 * 10 + g4;
                    System.out.println("Het getal is " + getal);
                }
            }
        }
    }
}
