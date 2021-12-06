package verbruik;

import java.util.Scanner;

public class Verbruik
{
    /*Geef de vorige kilometerstand: 79114
    Geef de huidige kilometerstand: 80103
    Geef het aantal getankte liters: 60,4
    Verbruik voor 989km: 6,11 liter/100km
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int huidigeKm, vorigeKm, afstand;
        double aantalLiters, verbruik;

        System.out.print("Geef de vorige kilometerstand: ");
        vorigeKm = keyboard.nextInt();
        System.out.print("Geef de huidige kilometerstand: ");
        huidigeKm = keyboard.nextInt();
        System.out.print("Geef het aantal getankte liters: ");
        afstand = huidigeKm - vorigeKm;
        aantalLiters = keyboard.nextDouble();
        verbruik = aantalLiters * 100 / afstand;
        System.out.printf("Verbruik voor %dkm: %.2f liter/100km",afstand,verbruik);
    }
}
