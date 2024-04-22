package org.launchcode;

import java.util.Scanner;

public class Rectangle {
    public static void main (String[] args) {

        Scanner lengthInput = new Scanner(System.in);
        System.out.println("What is the length of your rectangle? ");
        Double length = lengthInput.nextDouble();

        Scanner widthInput = new Scanner(System.in);
        System.out.println("What is the length of your rectangle? ");
        Double width = widthInput.nextDouble();

        Double area = width * length;

        System.out.println("The area of your rectangle is " + area + ".");

    }

}

