package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;

        System.out.println("Enter a radius: ");

        do {
            radius = input.nextDouble();
            if (radius <= 0) {
                System.out.println("please enter a positive number");
            }
        } while (radius <= 0);

        System.out.println("The area of the circle is " + Circle.getArea(radius));

    }
}
