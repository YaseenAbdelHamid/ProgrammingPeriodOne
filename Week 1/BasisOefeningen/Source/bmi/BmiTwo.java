package bmi;

import java.util.Scanner;

public class BmiTwo
{
    public static void main(String[] args)
    {
        //declaraties:
        Scanner keyboard = new Scanner(System.in);
        int gewicht;
        double lengte;
        double bmi;

        //input:
        System.out.println("Beste patient, dit programma berekent je BMI.");
        System.out.print("Geef je gewicht in kilogram: ");
        gewicht = keyboard.nextInt();
        System.out.print("Geef je lengte in meters: ");
        lengte = keyboard.nextDouble();
        //berekening en output:
        bmi = gewicht / (lengte * lengte);
        System.out.println("Je BMI is: " + bmi);
        //Uitbreiding: advies
        System.out.print("Dat is: ");
        if (bmi < 18)
        {
            System.out.println("ondergewicht!");
        } else if (bmi < 25)
        {
            System.out.println("in orde!");
        } else if (bmi < 30)
        {
            System.out.println("overgewicht!");
        } else {
            System.out.println("obesitas!");
        }
    }
}
