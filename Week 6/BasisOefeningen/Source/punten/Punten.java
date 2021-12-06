package punten;

/**
 * @author Kristiaan Behiels
 * @version 1.0 7/10/13
 */

// Uitbreiding
public class Punten {
    private Punt[] punten = {
            new Punt(3, 4),
            new Punt(5, 12),
            new Punt(7, 24),
            new Punt(9, 40),
            new Punt(11, 60),
            new Punt(13, 84)
    };

    public Punt getPunt(int index) {
        return punten[index];
    }

    public int lengte() {
        return punten.length;
    }
}

