package bmi;

import java.util.Scanner;

public class BmiOne
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
    }
}
