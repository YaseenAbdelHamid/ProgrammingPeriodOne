package reeksen;

import java.util.Scanner;

public class Reeksen
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Input:
        System.out.print("Hoeveel getallen wil je afdrukken? ");
        int aantal = scanner.nextInt();
        System.out.print("Met welke waarde wil je starten? ");
        int beginwaarde = scanner.nextInt();
        System.out.print("Met welke waarde wil je verhogen? ");
        int stapwaarde = scanner.nextInt();

        //Lus en verwerking:
        int teller = 0;
        while(teller < aantal)
        {
            System.out.print(beginwaarde + " ");
            beginwaarde = beginwaarde + stapwaarde;
            teller++;
        }
    }
}
