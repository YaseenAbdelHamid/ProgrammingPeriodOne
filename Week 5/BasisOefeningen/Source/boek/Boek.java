package boek;

/**
 * Mark Goovaerts
 * Datum: 21-10-13
 */
public class Boek {
    private String auteur;
    private String titel;
    private int paginas;
    private boolean ontleend;

    public Boek(String auteur, String titel, int paginas) {
        this.auteur = auteur;
        this.titel = titel;
        this.paginas = paginas;
        this.ontleend = false;
    }

    public Boek() {
        this("onbekend", "onbekend", 0);
    }

    public String getTitel() {
        return titel;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setOntleend(boolean ontleend) {
        this.ontleend = ontleend;
    }

    public void printDetails() {
        System.out.print("Het boek " + titel.toUpperCase()
                + "(" + paginas + " pagina's), geschreven door " + auteur.toUpperCase()
                + " is momenteel ");
        System.out.println(ontleend ? "ontleend." : "niet ontleend.");
    }
}

