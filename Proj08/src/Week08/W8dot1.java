package Week08;

public class W8dot1 {

    public static void main(String[] args) {

        /*

        Shay Hamblin
        06/12/2020
        CIT 260-06: Brother Mark Gardner

        This program creates two rectangle objects and displays their width, height, area and perimeter.
        Then the program finishes with a Goodbye ... message.

        */

        // Create a rectangle with height of 4 and height of 40

        System.out.println("\nThis program creates two rectangle objects and displays their width, height, area and perimeter.\n");

        simpleRectangle rectangle1 = new simpleRectangle(40, 4);

        System.out.println("Rectangle 1:");
        System.out.println("Height = " + String.format("%3.2f", rectangle1.height));
        System.out.println("Width = " + String.format("%3.2f",rectangle1.width));
        System.out.println("Area = " + String.format("%3.2f",rectangle1.getArea()));
        System.out.println("Perimeter = " + String.format("%3.2f",rectangle1.getPerimeter()));

        //Create a rectangle with a height of 3.5 and a width of 5
        simpleRectangle rectangle2 = new simpleRectangle(5, 3.5);

        System.out.println("\nRectangle 2:");
        System.out.println("Height = " + String.format("%3.2f",rectangle2.height));
        System.out.println("Width = " + String.format("%3.2f",rectangle2.width));
        System.out.println("Area = " + String.format("%3.2f",rectangle2.getArea()));
        System.out.println("Perimeter = " + String.format("%3.2f",rectangle2.getPerimeter()));

        System.out.println("\nGoodbye ...\n");
    }
}

// Define The rectangle class with two constructors
class simpleRectangle {
    double width;
    double height;

    // Construct a rectangle with a specified radius
    simpleRectangle() {
        width = 1;
        height = 1;
    }
    // Construct a rectangle with a specified radius
    simpleRectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }
    //return the area of this Rectangle
    double getArea() {
        return width * height;
    }
    //return the Perimeter of the rectangle
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
}
