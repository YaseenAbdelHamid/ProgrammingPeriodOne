package korte_algoritmes;

import java.time.LocalDate;
import java.util.Scanner;

public class Leeftijd
{
    public static void main(String[] args)
    {
        //declaraties:
        String naam;
        int jaar;
        int huidigJaar;
        int leeftijd;
        Scanner keyboard = new Scanner(System.in);

        //algoritme:
        System.out.print("Wat is je naam? ");
        naam = keyboard.nextLine();
        System.out.print("Beste " + naam + ", geef je geboortejaar: ");
        jaar = keyboard.nextInt();
        //opvragen huidige jaar aan systeemtijd:
        huidigJaar = LocalDate.now().getYear();
        //Berekening en output:
        leeftijd = huidigJaar - jaar;
        System.out.println("Als alles goed loopt word je dit jaar " + leeftijd);
    }
}
