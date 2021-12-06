package bewerkingen;

import java.util.Scanner;

public class Bewerkingen
{
    public static void main(String[] args)
    {
        //declaratie:
        int keuze;
        double getal1, getal2;
        Scanner toetsenbord = new Scanner(System.in);

        //input:
        System.out.print("Geef een getal: ");
        getal1 = toetsenbord.nextDouble();
        System.out.print("Geef nog een getal: ");
        getal2 = toetsenbord.nextDouble();
        System.out.println("Kies een bewerking:\n" +
                "\t1 optellen\n" +
                "\t2 aftrekken\n" +
                "\t3 vermenigvuldigen\n" +
                "\t4 delen");
        System.out.print("Jouw keuze: ");
        keuze = toetsenbord.nextInt();

        //berekening en output:
        if(keuze == 1)
        { //optellen
            double result = getal1 + getal2;
            System.out.println(getal1 + " + " + getal2 + " = " + result);
        }
        if(keuze == 2)
        { //aftrekken
            double result = getal1 - getal2;
            System.out.println(getal1 + " - " + getal2 + " = " + result);
        }
        if(keuze == 3)
        { //product
            double result = getal1 * getal2;
            System.out.println(getal1 + " * " + getal2 + " = " + result);
        }
        if(keuze == 4)
        { //delen
            double result = getal1 / getal2;
            System.out.println(getal1 + " / " + getal2 + " = " + result);
        }
    }
}
