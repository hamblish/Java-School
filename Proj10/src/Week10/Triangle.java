package Week10;

// Design a class Triangle that extends GeometricObject
public class Triangle extends GeometricObject{
    /*

Shay Hamblin
06/27/2020
CIT 260-06: Brother Mark Gardner

This program stores the sides of the triangle.

*/
    // Contains 3 double data fields value to 0
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // No-arg constructor that creates a default triangle
    Triangle(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    // Constructor that creates a default triangle
    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // The accessors for all three data fields
    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }
    /*
     * Input: gets the 3 sides of the triangle
     * Output: returns the area
     */
    public double getArea(){
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s *(s - side1) * (s- side2) * (s-side3));
    }
    /*
     * INPUT: Gets the 3 sides of the triangle
     * OUTPUT: returns the perimeter
     */
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    // From Book...
    public  String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
}
