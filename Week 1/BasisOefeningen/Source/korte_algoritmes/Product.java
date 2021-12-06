package korte_algoritmes;


import java.util.Scanner;

public class Product
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Input:
        System.out.print("Geef een getal: ");
        int eerste = scanner.nextInt();
        System.out.print("Geef nog een getal: ");
        int tweede = scanner.nextInt();
        System.out.print("Geef een laatste getal: ");
        int derde = scanner.nextInt();
        //Berekening en output:
        int product = eerste * tweede * derde;
        System.out.println("Het product is " + product);
    }
}
