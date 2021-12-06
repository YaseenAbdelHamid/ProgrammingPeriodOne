package sommeren;

import java.util.Scanner;

public class Sommeren
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int som = 0; //belangrijk: moet op 0 gezet worden!
        int getal;

        while(true)
        {
            System.out.print("Geef een getal (stop met 0): ");
            getal = scanner.nextInt();
            som = som + getal; //OF: som += getal;
            if(getal == 0) {
                System.out.println("De som van deze getallen is: " + som);
                System.out.println("Einde programma!");
                return;
            }
        }
    }
}
