package dagen;

import java.util.Calendar;
import java.util.Scanner;

public class Dagen
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef de naam van een dag (kleine letters): ");
        String dag = scanner.nextLine();
        int dagNummer;

        switch (dag)
        {
            case "maandag": dagNummer = 1; break;
            case "dinsdag": dagNummer = 2; break;
            case "woensdag": dagNummer = 3; break;
            case "donderdag": dagNummer = 4; break;
            case "vrijdag": dagNummer = 5; break;
            case "zaterdag": dagNummer = 6; break;
            case "zondag": dagNummer = 7; break;
            default: dagNummer = -1;
        }
        System.out.println("dagNummer = " + dagNummer);

        final int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        String dagString;
        switch (dayOfWeek)
        {
            case 1: dagString = "zondag"; break;
            case 2: dagString = "maandag"; break;
            case 3: dagString = "dinsdag"; break;
            case 4: dagString = "woensdag"; break;
            case 5: dagString = "donderdag"; break;
            case 6: dagString = "vrijdag"; break;
            case 7: dagString = "zaterdag"; break;
            default: dagString = "onbekend";

        }
        System.out.println("Vandaag is het " + dagString);
    }
}