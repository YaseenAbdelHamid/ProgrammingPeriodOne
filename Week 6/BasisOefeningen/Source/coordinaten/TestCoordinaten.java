package coordinaten;

/**
 * @author Kristiaan Behiels
 * @version 1.0 7/10/13
 */
public class TestCoordinaten {
    public static void main(String[] args) {
        Coordinaten coordinaten = new Coordinaten();

        coordinaten.markeerCoordinaten(2, 3);
        coordinaten.markeerCoordinaten(3, 5);
        coordinaten.markeerCoordinaten(5, 6);
        coordinaten.markeerCoordinaten(4, 1);

        // De volgende regel mag geen runtime error veroorzaken!
        coordinaten.markeerCoordinaten(10, 10);

        System.out.println("Aantal gemarkeerde coördinaten: " + coordinaten.getTeller());
        System.out.println("Matrix:\n" +  coordinaten);
    }
}

/*
Aantal gemarkeerde coördinaten: 4
Matrix:
0 0 0 0 0 0
0 0 1 0 0 0
0 0 0 0 1 0
1 0 0 0 0 0
0 0 0 0 0 1
0 0 0 0 0 0
*/
