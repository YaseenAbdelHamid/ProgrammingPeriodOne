package maanden;

import java.util.Scanner;

public class Maanden {
    public static void main(String[] args) {

        boolean isSchrikkeljaar=false;
        Scanner keyb = new Scanner(System.in);
        System.out.print("Geef een maand in in de vorm van een cijfer (1 = januari): ");
        int maand = keyb.nextInt();
        System.out.print("Geef een jaar (met 4 cijfers):  ");
        int jaar = keyb.nextInt();
        String maandNaam;
        int dagen;
        switch (maand) {
            case 1:
                maandNaam = "januari";
                dagen = 31;
                break;
            case 2:
                maandNaam = "februari";
                if ((jaar % 400 == 0) || ((jaar % 4 == 0) && (jaar % 100 != 0))) {
                    isSchrikkeljaar = true;
                }
                dagen = isSchrikkeljaar ? 29 : 28;
                break;
            case 3:
                maandNaam = "maart";
                dagen = 31;
                break;
            case 4:
                maandNaam = "april";
                dagen = 30;
                break;
            case 5:
                maandNaam = "mei";
                dagen = 31;
                break;
            case 6:
                maandNaam = "juni";
                dagen = 30;
                break;
            case 7:
                maandNaam = "juli";
                dagen = 31;
                break;
            case 8:
                maandNaam = "augustus";
                dagen = 31;
                break;
            case 9:
                maandNaam = "september";
                dagen = 30;
                break;
            case 10:
                maandNaam = "oktober";
                dagen = 31;
                break;
            case 11:
                maandNaam = "november";
                dagen = 30;
                break;
            case 12:
                maandNaam = "december";
                dagen = 31;
                break;
            default:
                System.out.println("Foutieve maand");
                maandNaam = "ongeldig";
                dagen = 0;

        }
        if (dagen > 0) {
            System.out.println("In " + jaar + " heeft " + maandNaam + " " + dagen + " dagen.");
        }
    }
}