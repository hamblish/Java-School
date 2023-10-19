package Week10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                /*

        Shay Hamblin
        06/27/2020
        CIT 260-06: Brother Mark Gardner

        This program allows for the user to input the sides of a triangle it's color and whether it's filled.
        Then it outputs the user's decisions along with an area.

        */
        {

            // User input for triangle sides
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the sides of a triangle:\n");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();

            // asks user to enter a color for a triangle
            System.out.print("Enter a color for a triangle: ");
            String color = input.next();
            // is it filled ?
            System.out.print("The triangle is filled? (True/False): ");
            boolean filled = input.nextBoolean();

            // we need to create the triangle object with the input

            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color); // calls setColor from GeometricObject
            triangle.setFilled(filled);// calls setFilled as well

            // Display the triangle, very similar to TestCircleRectangle.java example
            System.out.println(" ");
            System.out.println("" + triangle.toString());
            System.out.println("The Color is " + triangle.getColor());
            System.out.println("The Perimeter is " + triangle.getPerimeter());
            System.out.printf("The Area is %.2f\n", triangle.getArea());
            System.out.println("Is it Filled? " + (triangle.isFilled() ? "" : " Not ") + "Filled");

        }
    }
}
