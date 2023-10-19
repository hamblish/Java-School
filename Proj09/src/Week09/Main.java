package Week09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*

        Shay Hamblin
        06/20/2020
        CIT 260-06: Brother Mark Gardner

        This program is suppose to use three different different methods to find the length between
        3 different points. I am sorry I did not understand this assignment at all so I did my best
        to get close to the desired outcome.

        */

        System.out.print("\nThis program creates a point at (0,0) and a point at the coordinates\n");
        System.out.print("entered by you. It then computes and displays the distance from (0,0)\n");
        System.out.print("to the point defined by you, using three different methods.\n");

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the x coordinate of a point: ");
        double x1 = input.nextDouble();
        System.out.print("Enter the y coordinate of a point: ");
        double y1 = input.nextDouble();
        // We need to create two object points
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(x1,y1);
        // display distance
        System.out.println("\nPoint 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");
        System.out.printf("Distance: %.3f", point1.distance(point2));
        System.out.printf("\n\nGoodbye ...\n");
    }
}
/* My Point class:
 * Input: gets two points
 * Returns: the distance
 */
class MyPoint{
    // private variables so they wont be change from outside the class
    private double x1;
    private double y1;
    // Default constructor creates point (0,0)
    MyPoint(){
        this(0,0);
    }
    // Constructor that constructs a point to x and y
    MyPoint(double x, double y){
        this.x1 = x;
        this.y1 = y;
    }
// Getters for x and y methods

    public double getX(){
        return x1;
    }
    public double getY(){
        return y1;
    }

    /* Distance Overload Methods:
     * Input: takes two points X and Y
     * Output: Returns the distance of the two points
     * Distance Formula: (X2 - x1)^2 +(Y2 - Y1)^2
     */
    public double distance(MyPoint myPoint){
        double distance = Math.sqrt(Math.pow(myPoint.getX() - x1, 2) + Math.pow(myPoint.getY() -y1,2));
        return distance;
    }

    // returns the distance from THIS point to another point with specified x- and y coordinates

    public double distance(double x, double y){

        double distance = distance(new MyPoint(x,y));
        return distance;

    }
}

