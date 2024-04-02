package org.launchcode;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas have been used? ");
        Double gallons = input.nextDouble();

        Double mpg = miles / gallons;

        System.out.println("Your current MPG is " + mpg);



    }
}
