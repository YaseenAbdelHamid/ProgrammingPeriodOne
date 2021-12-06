package Palindroom;

import java.util.Scanner;

public class Palindroom {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef een woord in: ");
        String woord = keyboard.nextLine();
        StringBuilder builder = new StringBuilder(woord);
        builder.reverse();
        String omgekeerdWoord = builder.toString();

        boolean isPalindroom = woord.equals(omgekeerdWoord);
        System.out.printf("Het woord %s is%s palindroom", woord, isPalindroom ? "" : " niet" );

    }
}

/*
Geef een woord in: lepel
Het woord lepel is palindroom
 */

/*
Geef een woord in: label
Het woord label is niet palindroom
 */