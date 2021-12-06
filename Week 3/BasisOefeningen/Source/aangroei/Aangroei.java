package aangroei;

import java.util.Scanner;

public class Aangroei
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double beginBedrag;
        double aangroeiPercentage;
        int aantalJaren;
        double eindbedrag = 0;

        boolean stop = false;

        do
        {
            System.out.print("\nGeef het bedrag in € (stop met 0): ");
            beginBedrag = scanner.nextDouble();
            if (beginBedrag <= 0)
            {
                stop = true;
            }
            else
            {
                System.out.print("Geef het aangroeipercentage in %: ");
                aangroeiPercentage = scanner.nextDouble();

                System.out.print("Geef het aantal jaren: ");
                aantalJaren = scanner.nextInt();

                eindbedrag = beginBedrag;
                for (int i = 0; i < aantalJaren; i++)
                {
                    eindbedrag *= 1 + (aangroeiPercentage / 100);
                }
                System.out.printf("\nBij een aangroei van %.0f%% heb je na %d jaren een bedrag van %.0f€\n",
                        aangroeiPercentage, aantalJaren, eindbedrag);

                // Uitbreiding: bereken na hoeveel jaar je geld verdubbeld is
                eindbedrag = beginBedrag;
                aantalJaren = 0;
                do
                {
                    aantalJaren++;
                    eindbedrag *= 1 + (aangroeiPercentage / 100);
                }
                while (eindbedrag < beginBedrag * 2);
                System.out.printf("Het duurt het %d jaren om het bedrag te verdubbelen\n", aantalJaren);
            }
        } while (!stop);
    }
}