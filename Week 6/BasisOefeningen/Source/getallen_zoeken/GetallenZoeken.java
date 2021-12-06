package getallen_zoeken;

import java.util.Arrays;

/**
 * @author Kristiaan Behiels
 * @version 1.0 7/10/13  (zie 2012-2013 P1W6)
 *
 *
De klasse GetallenZoeken bevat als enige attribuut getallen van het type int[].
De constructor heeft als parameter (int[] deGetallen), in de constructor moet de tabel getallen gemaakt worden met dezelfde lengte als de parametertabel.
Daarna moeten alle waarden van de parametertabel in de tabel getallen gekopieerd worden.
Voorzie een methode toonGetallen die een String teruggeeft met alle getallen op één regel (zie uitvoer).
Voorzie een methode aantalKeer(int getal) die telt hoeveel keer het getal in de tabel voorkomt.
Voorzie een methode isAanwezig(int getal) die true teruggeeft als het getal in de tabel aanwezig is en false indien dit niet zo is.
 */

public class GetallenZoeken {
    private int[] getallen;

    public GetallenZoeken(int[] deGetallen) {
        //  getallen = Arrays.copyOf(deGetallen, deGetallen.length);

        getallen = new int[deGetallen.length];
        for (int i = 0; i < deGetallen.length; i++) {
            getallen[i] = deGetallen[i];
        }
    }

    public String toonGetallen() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < getallen.length; i++) {
            result.append(" ").append(getallen[i]);
            if (i < getallen.length - 1) {
                result.append(",");
            }
        }
        return result.toString();
    }

    public int aantalKeer(int hetGetal) {
        int aantal = 0;
        for (int getal : getallen) {
            if (getal == hetGetal) {
                aantal++;
            }
        }
        return aantal;
    }

    public boolean isAanwezig(int hetGetal) {
        /*
        Arrays.sort(getallen);
        int result = Arrays.binarySearch(getallen, hetGetal);
        return result >= 0;
        */

        for (int getal : getallen) {
            if (getal == hetGetal) {
                return true;
            }
        }
        return false;
    }

}

