package Verdeling;

import java.util.Random;

/**
 Vul deze klasse aan zodanig dat je de onderstaande (gelijkaardige) uitvoer kunt bekomen.
 Na de creatie van het object verdeling start je met een for-lus die 4 maal doorlopen wordt.
 In deze lus komt een andere lus die AANTAL keer wordt doorlopen. Hierin maak je gebruik van int waarde = random.nextInt(6) + 1;
 Deze locale variabele waarde voeg je dan met de methode voegWaardeToe aan het object verdeling toe.
 Nog altijd in de lus die 4 keer wordt doorlopen voorzie je de nodige println's en methoden om de gewenste afdruk te bekomen.
 Kijk in de klasse Verdeling voor de methoden die ter beschikking staan.
 */
public class VerdelingDemo {
    public static final int AANTAL = 100;

    public static void main(String[] args) {
        Random random = new Random();
        Verdeling verdeling = new Verdeling();
        // Vul hier het nodige aan

        for (int teller = 0; teller < 4; teller++) {
            for (int i = 0; i < AANTAL; i++) {
                int waarde = random.nextInt(6) + 1;
                verdeling.voegWaardeToe(waarde);
            }

            System.out.println("\nVerdeling:\n" + verdeling.toonVerdeling());
            System.out.println("Gemiddelde: " + verdeling.gemiddeldeWaarde());
            verdeling.reset();
        }
    }
}

/*

Verdeling:
Een:  15
Twee: 17
Drie: 17
Vier: 14
Vijf: 17
Zes:  20
Gemiddelde: 3.61

Verdeling:
Een:  10
Twee: 20
Drie: 14
Vier: 18
Vijf: 20
Zes:  18
Gemiddelde: 3.72

Verdeling:
Een:  19
Twee: 16
Drie: 12
Vier: 24
Vijf: 12
Zes:  17
Gemiddelde: 3.45

Verdeling:
Een:  22
Twee: 19
Drie: 11
Vier: 16
Vijf: 20
Zes:  12
Gemiddelde: 3.29

*/
