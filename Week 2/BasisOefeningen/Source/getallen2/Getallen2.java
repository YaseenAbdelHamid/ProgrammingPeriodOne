package getallen2;

import java.util.Scanner;

public class Getallen2
{
    /*Geef een geheel getal van 13 cijfers: 1234567890123
    Geef een geheel getal van 8 cijfers: 87654321
    Het quotiënt is 14084.506913504014
    Zonder decimalen is dit 14084*/
    /*Geef een geheel getal van 13 cijfers: 123456789012
    Dit getal is te klein!*/
    /*Geef een geheel getal van 13 cijfers: 1234567890123
    Geef een geheel getal van 8 cijfers: 1234567
    Dit getal is te klein.*/
    public static void main(String[] args)
    {
        final long MINIMUM_DEELTAL = 1000000000000L;
        final long MINIMUM_DELER = 10000000L;
        long deeltal, deler;
        double quotient;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef een geheel getal van 13 cijfers:");
        deeltal = keyboard.nextLong();
        if (deeltal<MINIMUM_DEELTAL)
        {
            System.out.println("Dit getal is te klein!");
        }
        else
        {
            System.out.print("Geef een geheel getal van 8 cijfers:");
            deler = keyboard.nextLong();
            if (deler<MINIMUM_DELER)
            {
                System.out.println("Dit getal is te klein");
            }
            else
            {
                quotient = deeltal / (double)deler;
                System.out.println("Het quotiënt is " + quotient);
                System.out.println("Zonder decimalen is dit " + (long) quotient);
            }
        }
    }
}
