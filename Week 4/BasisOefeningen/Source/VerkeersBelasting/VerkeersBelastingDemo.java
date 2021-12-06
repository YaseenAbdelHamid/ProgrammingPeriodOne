package VerkeersBelasting;

import java.util.Scanner;

public class VerkeersBelastingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer telkens merk, type en fiscaal vermogen in.");
        System.out.println("Stop door voor het merk onmiddellijk <Enter> te geven.");

        String merk;
        do {
            System.out.print("\nGeef het merk: ");
            merk = scanner.nextLine();
            if (!merk.isEmpty()) {
                System.out.print("Geef het type: ");
                String type = scanner.nextLine();
                System.out.print("Geef het fiscaal vermogen: ");
                int fiscaalVermogen = scanner.nextInt();
                scanner.nextLine(); // Weglezen van <enter> in de keyboard buffer!
                if (fiscaalVermogen >= 3) {
                    Auto auto = new Auto(merk, type, fiscaalVermogen);
                    System.out.printf("Voor een %s %s met %dpk betaal je €%.2f\n",
                            auto.getMerk(), auto.getType(), auto.getFiscaalVermogen(), auto.berekenVerkeersbelasting());
                } else {
                    System.out.println("De verkeersbelasting kan niet bepaald worden.");
                }
            }
        } while (!merk.isEmpty());
    }

}

/*
Voer telkens merk, type en fiscaal vermogen in.
Stop door voor het merk onmiddellijk <Enter> te geven.

Geef het merk: Renault
Geef het type: Scénic
Geef het fiscaal vermogen: 8
Voor een Renault Scénic met 8pk betaal je €221,50

Geef het merk: Porche
Geef het type: 911 GT3
Geef het fiscaal vermogen: 19
Voor een Porche 911 GT3 met 19pk betaal je €1702,93

Geef het merk: Rolls-Royce
Geef het type: Phantom
Geef het fiscaal vermogen: 32
Voor een Rolls-Royce Phantom met 32pk betaal je €3207,44

Geef het merk: Oxford
Geef het type: Herenfiets
Geef het fiscaal vermogen: 1
De verkeersbelasting kan niet bepaald worden.

Geef het merk: Ford
Geef het type: Focus
Geef het fiscaal vermogen: 9
Voor een Ford Focus met 9pk betaal je €263,87

Geef het merk:


*/
