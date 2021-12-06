package bewerkingen;


public class BewerkingenNotas {
    private int getalEen;
    private int getalTwee;

    public BewerkingenNotas(int getalEen, int getalTwee) {
        this.getalEen = getalEen;
        this.getalTwee = getalTwee;
    }

    public int som() {
        return getalEen + getalTwee;
    }

    public int verschil() {
        return getalEen - getalTwee;
    }

    public int product() {
        return getalEen * getalTwee;
    }

    public double quotient() {
        return (double) getalEen / getalTwee;
    }
}
