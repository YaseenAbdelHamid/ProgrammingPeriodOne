package Woord;


import java.util.Scanner;

public class WoordDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Geef telkens een woord in (eindig met direct <ENTER>:");

        Woord woord;
        do {
            System.out.print("\nGeef een woord: ");
            String string = keyboard.nextLine();
            woord = new Woord(string);
            if (!woord.isLeeg()) {
                System.out.println("\nJe gaf " + "\'" + woord.getWoord() + "\' in.");
                System.out.println("Dit woord heeft " + woord.aantalLetters() + " letters.");
                System.out.println("Het woord in met eerste letter een hoofdletter: " + woord.eersteLetterNaarHoofdletter());
                System.out.println("Het woord in hoofdletters: " + woord.naarHoofdletters());
            }
        } while (!woord.isLeeg());
    }
}

/*
Geef telkens een woord in (eindig met direct <ENTER>:

Geef een woord: lepels

Je gaf 'lepels' in.
Dit woord heeft 6 letters.
Het woord in met eerste letter een hoofdletter: Lepels
Het woord in hoofdletters: LEPELS

Geef een woord: treinbestuurder

Je gaf 'treinbestuurder' in.
Dit woord heeft 15 letters.
Het woord in met eerste letter een hoofdletter: Treinbestuurder
Het woord in hoofdletters: TREINBESTUURDER

Geef een woord:
*/
