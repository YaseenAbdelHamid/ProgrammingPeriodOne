package verkoper;

/**
 * @author Kristiaan Behiels
 * @version 1.0 7/10/13   (zie 2012-2013 P1W6)
 */
public class Verkoper {
    private String naam;
    private int[] verkoopCijfers;

    public Verkoper(String naam) {
        this.naam = naam;
        verkoopCijfers = new int[12];
    }

    public void setVerkoopCijfers(int[] verkoopCijfers) {
        this.verkoopCijfers = verkoopCijfers;
    }
    public int verkoopTotaal(){
        int som = 0;
        for (int verkoopCijfer : verkoopCijfers) {
            som += verkoopCijfer;
        }
        return som;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("\nVerkoopcijfers van  " + naam + ": ");
        for (int verkoopCijfer : verkoopCijfers) {
            builder.append(verkoopCijfer).append(" ");

        }
        builder.append("\nTotaal: ").append(verkoopTotaal());
        return builder.toString();
    }
}
