package pizza;

import java.util.Scanner;

public class Pizza
{
    /*Hoeveel pizza's wens je: 3
    Hoeveel extra toppings voor pizza 1: 2
    Hoeveel extra toppings voor pizza 2: 3
    Hoeveel extra toppings voor pizza 3: 0
    Te betalen: €26.5
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        final int PRIJS_PIZZA = 800;
        final int PRIJS_TOPPING = 50;
        int aantalPizzas;
        int aantalToppings;
        int teller = 1;
        int totalePrijs = 0;

        System.out.print("Hoeveel pizza's wens je:");
        aantalPizzas = keyboard.nextInt();
        totalePrijs += aantalPizzas*PRIJS_PIZZA;
        while (teller<=aantalPizzas)
        {
            System.out.print("Hoeveel extra toppings voor pizza " + teller + ":");
            aantalToppings = keyboard.nextInt();
            totalePrijs += aantalToppings*PRIJS_TOPPING;
            teller++;
        }
        System.out.printf("Te betalen: €%.1f\n", totalePrijs/100.0);
    }
}