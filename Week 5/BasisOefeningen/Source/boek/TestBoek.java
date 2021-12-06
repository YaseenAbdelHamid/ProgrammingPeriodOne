package boek;

/**
 * Mark Goovaerts
 * Datum: 21-10-13
 */
public class TestBoek {
    public static void main(String[] args) {
        Boek b1 = new Boek("Barnes & Kolling", "Programmeren in Java met BlueJ", 556);
        Boek b2 = new Boek("Louis Paul Boon", "De Kappelekensbaan", 291);
        Boek b3 = new Boek("Jef Geeraerts", "Drugs", 333);

        b1.setOntleend(true);
        b1.printDetails();
        b2.printDetails();
        b3.setOntleend(true);
        b3.printDetails();
    }
}