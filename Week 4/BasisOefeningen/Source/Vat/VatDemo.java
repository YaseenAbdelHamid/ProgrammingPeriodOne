package Vat;

public class VatDemo {
    public static void main(String[] args) {
        // DEEL 1
        // Maak een biervat met een capaciteit van 50 liter
        Vat biervat = new Vat(50);

        // Vraag de capaciteit en de inhoud op en druk het resultaat op twee regels af
        int capaciteit = biervat.getCapaciteit();
        System.out.println("Capaciteit: " + capaciteit + " liter");
        int inhoud = biervat.getInhoud();
        System.out.println("Inhoud: " + inhoud + " liter");

        // Vul het vat volledig
        biervat.vulVolledig();

        // Tap 8 pintjes van 25cl (= 2 liter) en druk vervolgens de inhoud af
        biervat.verwijder(2);
        System.out.println("Inhoud na 8 pintjes: " + biervat.getInhoud() + " liter");

        // Druk af voor hoeveel procent het biervat nu gevuld is
        System.out.println("Percentage gevuld: " + biervat.getPercentageGevuld() + "%");

        // Tap nu telkens reeksen van 4 pintjes (= 1 liter) tot het vat leeg is  (gebruik een lus)
        // Hou ook bij hoeveel pintjes er getapt zijn en druk dit aantal af als het vat leeg is.
        int pintjes = 0;
        while (biervat.getInhoud() != 0) {
            biervat.verwijder(1);
            pintjes += 4;
        }
        System.out.println("Aantal pintjes: " + pintjes);

        // DEEL 2
        // Maak een wijnvat met een capaciteit van 100 liter
        Vat wijnvat = new Vat(100);

        // Tracht het vat met 110 liter wijn te vullen, druk de capaciteit en de uiteindelijke inhoud af
        wijnvat.vul(110);
        System.out.println("Capaciteit: " + wijnvat.getCapaciteit() + " liter");
        System.out.println("Inhoud: " + wijnvat.getInhoud() + " liter");

        // Druk "Het vat is vol" af als het vol is, druk anders het "vat is leeg" af
        // Maak gebruik van de ternaire ?: operator
        System.out.println("Het vat is " + (wijnvat.isVol() ? "vol" : "leeg"));

        // Maak vervolgens het vat volledig leeg in één bewerking
        wijnvat.maakLeeg();

        // Vul nu het lege vat door er telkens 3 liter per keer aan toe te voegen
        // Gebruik hiervoor een do-while lus
        // Druk het aantal keer dat je 3 liter hebt aangevuld en ook de uiteindelijke inhoud af.
        int aantal = 0;
        do  {
            wijnvat.vul(3);
            aantal++;
        } while(!wijnvat.isVol());
        System.out.println("Aantal keer bijgevuld: " + aantal);
        System.out.println("Inhoud: " + wijnvat.getInhoud() + " liter");
    }
}

/*
Capaciteit: 50 liter
Inhoud: 0 liter
Inhoud na 8 pintjes: 48 liter
Percentage gevuld: 96.0%
Aantal pintjes: 192
Capaciteit: 100 liter
Inhoud: 100 liter
Het vat is vol
Aantal keer bijgevuld: 34
Inhoud: 100 liter
*/



