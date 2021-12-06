package korte_algoritmes;
import java.util.Scanner;

public class Begroeting
{
    public static void main(String[] args)
    {
        String naam;

        System.out.print("Wat is je naam? ");
        Scanner keyboard = new Scanner(System.in);
        naam = keyboard.nextLine();
        System.out.println("Welkom " + naam + "!");
    }
}
