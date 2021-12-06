package coordinaten;

/**
 * @author Kristiaan Behiels
 * @version 1.0 7/10/13  (zie 2012-2013 P1W6)
 */
public class Coordinaten {
    private static final int GROOTTE = 6;
    private int[][] matrix;
    private int teller;

    public Coordinaten() {
        matrix = new int[GROOTTE][GROOTTE];
    }

    public int getTeller() {
        return teller;
    }

    public void markeerCoordinaten(int rij, int kolom) {
        rij--;
        kolom--;
        if ((rij >= 0 && rij < GROOTTE) && ( kolom >= 0 && kolom < GROOTTE)) {
            matrix[rij][kolom] = 1;
            teller++;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < GROOTTE; i++) {
            for (int j = 0; j< GROOTTE; j++) {
                builder.append(matrix[i][j]).append(" ");
            }
            builder.append('\n');
        }
        builder.append('\n');
        return builder.toString();
    }

}
