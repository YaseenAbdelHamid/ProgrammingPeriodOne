package Datum;

import java.util.Date;

public class DatumDemo {
    public static void main(String[] args) {
        Datum eenDatum = new Datum("11/11/2019");

        // Druk de datum af
        System.out.println(eenDatum.getDatum());  // kan ook rechtstreeks via eenDatum (toString-methode)

        // Druk de datum af door afzonderlijk de dag, de maand en het jaar op te halen.
        System.out.println(eenDatum.getDag() + " " + eenDatum.getMaand() + " " + eenDatum.getJaar());

        // Druk de volgende dag af --- zoek de methode hiervoor op in de klasse Datum
        eenDatum.volgendeDag();
        System.out.println(eenDatum);

        // Maak een nieuw Datum-object met als datum 12/11/2019.
        Datum volgendeDatum = new Datum("12/11/2019");

        // Vergelijk de twee datumobjecten en druk af of ze gelijk zijn.
        System.out.print("De datums zijn " + (eenDatum.isGelijk(volgendeDatum) ? "gelijk." : "verschillend.") + "\n");

        // Test met behulp van de methode isGeldigedatum of 29 februari 2012 een geldige datum is.
        // Maak eerst een Datum object met de naam schrikkel en vul met "29/02/2012".
        Datum schrikkel = new Datum("29/02/2012");

        System.out.print(schrikkel + " is ");
        if (!(schrikkel.isGeldigeDatum(29, 2, 2012))) {
            System.out.print("g");
        }
        System.out.println("een schrikkeljaar.");

        // Gebruik het object schrikkel nu opnieuw om te testen of 29 februari 2019 een geldige datum is.
        schrikkel = new Datum("29/02/2019");
        System.out.print(schrikkel + " is ");
        if (!(schrikkel.isGeldigeDatum(29, 2, 2019))) {
            System.out.print("g");
        }
        System.out.println("een schrikkeljaar.");


        // Zet nu de waarden in het object eenDatum op de datum 13 maart 1928. Doe dit via de setDatum methode
        // (gebruik het maandnummer in de plaats van de maandnaam).
        // Druk vervolgens ter controle de datum af.
        eenDatum.setDatum(13, 3, 1928);
        System.out.println(eenDatum);

        // Druk af of de actuele waarde van eenDatum vroeger of later is dan de actuele waarde van schrikkel.
        String result = (eenDatum.isVroeger(schrikkel)) ? "vroeger" : "later";
        System.out.println(eenDatum + " is " + result + " dan " + schrikkel);

    }
}

/*
11 november 2019
11 11 2019
12 november 2019
De datums zijn gelijk.
29 februari 2012 is een schrikkeljaar.
29 februari 2013 is geen schrikkeljaar.
13 maart 1928
13 maart 1928 is vroeger dan 29 februari 2019
*/
