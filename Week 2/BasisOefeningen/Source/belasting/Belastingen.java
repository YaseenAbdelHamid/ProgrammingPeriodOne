package belasting;

import java.util.Scanner;

public class Belastingen
{
    /*Geef het BTW percentage: 21
      Geef het bedrag in €: 121
      Maak je keuze (1 = inclusief, 2 = exclusief): 1
      €100.0 + 21.0% BTW = €121.0
    */

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        float btwPercentage;
        float bedrag;
        int keuze;

        System.out.print("Geef het BTW percentage:");
        btwPercentage = keyboard.nextFloat();
        System.out.print("Geef het bedrag in €:");
        bedrag = keyboard.nextFloat();
        System.out.print("Maak je keuze (1 = inclusief, 2 = exclusief):");
        keuze = keyboard.nextInt();
        float incl, excl;
        if (keuze==1)
        {
            incl = bedrag;
            excl = incl*(100/(100+btwPercentage));
            System.out.printf("€%.1f + %.1f%% BTW = €%.1f\n",excl,btwPercentage,incl);
        } else if (keuze==2)
        {
            excl = bedrag;
            incl = excl*(1 + btwPercentage/100);
            System.out.printf("€%.1f + %.1f%% BTW = €%.1f\n",excl,btwPercentage,incl);
        } else {
            System.out.println("Foutieve keuze!");
        }
    }
}
