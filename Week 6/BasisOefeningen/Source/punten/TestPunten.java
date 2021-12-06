package punten;

/**
 * @author Kristiaan Behiels
 * @version 1.0 7/10/13
 */

// Uitbreiding
public class TestPunten {
    public static void main(String[] args) {
        Punten punten = new Punten();

        for (int i = 0; i < punten.lengte(); i++) {
            Punt punt = punten.getPunt(i);
            System.out.println("Het punt " + punt + " heeft een afstand van " +
                    punt.afstandTotDeOorsprong() + " tot de oorsprong.");
        }
    }
}

/*
Het punt (3,4) heeft een afstand van 5.0 tot de oorsprong.
Het punt (5,12) heeft een afstand van 13.0 tot de oorsprong.
Het punt (7,24) heeft een afstand van 25.0 tot de oorsprong.
Het punt (9,40) heeft een afstand van 41.0 tot de oorsprong.
Het punt (11,60) heeft een afstand van 61.0 tot de oorsprong.
Het punt (13,84) heeft een afstand van 85.0 tot de oorsprong.
*/
