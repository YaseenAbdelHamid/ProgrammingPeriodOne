package punten;

/**
 * @author Kristiaan Behiels
 * @version 1.0 7/10/13
 */
public class TestPunt {
    public static void main(String[] args) {
        Punt puntEen = new Punt();
        Punt puntTwee = new Punt(3, 4);

        System.out.println("Het punt " + puntEen + " heeft een afstand van " +
                puntEen.afstandTotDeOorsprong() + " tot de oorsprong.");
        System.out.println("Het punt " + puntTwee + " heeft een afstand van " +
                puntTwee.afstandTotDeOorsprong() + " tot de oorsprong.");
    }
}

/*
Het punt (0,0) heeft een afstand van 0.0 tot de oorsprong.
Het punt (3,4) heeft een afstand van 5.0 tot de oorsprong.
*/