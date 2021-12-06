package films;
import java.util.Arrays;

/**
 * @author Kristiaan Behiels
 * @version 1.0 7/10/13
 */
public class Verzameling {
    private static final int MAX_AANTAL = 9;
    private Film[] films;
    private int index; // 0 .. MAX_AANTAL-1
    private boolean isVol;

    public Verzameling() {
        films = new Film[MAX_AANTAL];
    }

    public Film[] getFilms() {
        // return Arrays.copyOf(films, films.length);
        return films;
    }

    public int getIndex() {
        return index;
    }

    public boolean isVol() {
        return isVol;
    }

    public void voegFilmToe(Film film) {
        if (index >= MAX_AANTAL) {
            isVol = true;
        } else {
            films[index++] = film;
        }
    }

}
