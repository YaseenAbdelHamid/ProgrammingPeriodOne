package cijfers2;

import java.util.Scanner;

public class Cijfers2
{
    /*Geef een geheel getal dat uit 4 cijfers bestaat (1000..9999): 1540
De som van de afzonderlijke cijfers is 10*/
    public static void main(String[] args)
    {
        final int MINIMUM = 1000;
        final int MAXIMUM = 9999;
        Scanner keyboard = new Scanner(System.in);
        int getal, som = 0;
        System.out.print("Geef een geheel getal dat uit 4 cijfers bestaat (1000..9999): ");
        getal = keyboard.nextInt();
        if (getal<MINIMUM||getal>MAXIMUM)
        {
            System.out.println("Het getal moet uit 4 cijfers bestaan!");
        }
        else
        {
            som += getal%10;
            getal = getal/10;
            som += getal%10;
            getal = getal/10;
            som += getal%10;
            getal = getal/10;
            som += getal%10;
            System.out.println("De som van de afzonderlijke cijfers is " + som);
        }
    }
}
