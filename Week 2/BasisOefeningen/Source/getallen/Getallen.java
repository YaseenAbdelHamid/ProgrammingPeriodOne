package getallen;

import java.util.Scanner;

public class Getallen
{
    /*Geef een geheel getal van 6 cijfers:  123456
    Geef nog een geheel getal van 6 cijfers: 654321
    Het product is 80779853376
    De laatste 5 cijfers zijn: 53376
    */
    /*Geef een geheel getal van 6 cijfers: 12345
    Geef nog een geheel getal van 6 cijfers: 123456
    Een van de twee getallen is te klein.
    */
    public static void main(String[] args)
    {
        final int MINIMUM = 100000;
        final int MAXIMUM = 999999;
        long getal1, getal2;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef een geheel getal van 6 cijfers:");
        getal1 = keyboard.nextInt();
        System.out.print("Geef nog een geheel getal van 6 cijfers:");
        getal2 = keyboard.nextInt();
        if (getal1>MAXIMUM||getal2>MAXIMUM)
        {
            System.out.println("Eén van de twee getallen is te groot.");
        }
        else if (getal1<MINIMUM||getal2<MINIMUM)
        {
            System.out.println("Eén van de twee getallen is te klein.");
        }
        else
        {
            long product = getal1*getal2;
            System.out.println("Het product is " + product);
            System.out.println("De laatste 5 cijfers zijn: " + product%MINIMUM);
        }
    }
}