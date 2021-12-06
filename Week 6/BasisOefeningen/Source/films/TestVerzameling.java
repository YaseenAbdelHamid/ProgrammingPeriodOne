package films;

/**
 * @author Kristiaan Behiels
 * @version 1.0 7/10/13
 */
public class TestVerzameling {
    public static void main(String[] args) {
        Verzameling verzameling = new Verzameling();

        verzameling.voegFilmToe(new Film("Batman", 1989));
        verzameling.voegFilmToe(new Film("When Harry Met Sally", 1989));
        verzameling.voegFilmToe(new Film("Dances With Wolves", 1990));
        verzameling.voegFilmToe(new Film("Pretty Woman", 1990));
        verzameling.voegFilmToe(new Film("Total Recal", 1990));
        verzameling.voegFilmToe(new Film("Thelma & Louise", 1991));
        verzameling.voegFilmToe(new Film("The Silence Of The Lambs", 1991));
        verzameling.voegFilmToe(new Film("Reservoir Dogs", 1992));
        verzameling.voegFilmToe(new Film("Jurassic Park", 1993));
        verzameling.voegFilmToe(new Film("Schindler's List", 1993));

        Film[] films = verzameling.getFilms();
        for (int i = 0; i < verzameling.getIndex(); i++) {
            System.out.printf("%2d. %-25s %d%n", (i + 1),
                    films[i].getTitel(), films[i].getJaar());
        }
        System.out.println("De tabel is " + (verzameling.isVol() ? "" : "niet ") + "vol!");
    }
}

/*
 1. Batman                    1989
 2. When Harry Met Sally      1989
 3. Dances With Wolves        1990
 4. Pretty Woman              1990
 5. Total Recal               1990
 6. Thelma & Louise           1991
 7. The Silence Of The Lambs  1991
 8. Reservoir Dogs            1992
 9. Jurassic Park             1993
De tabel is vol!
*/