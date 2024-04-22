package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        double radius;
        double area;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();


//        area = (radius * radius * pi);
        area = Circle.getArea(radius);
        System.out.println("The area of a circle with the radius " + radius + "is: " + area);


    }

}

