package Week07;

import java.util.Scanner;

public class W7dot2 {

    public static void main(String[] args) {

        /*

        Shay Hamblin
        06/06/2020
        CIT 260-06: Brother Mark Gardner

        This program allows for the user to input 5 numbers into the array I have created.
        Then these entries are placed in the calculations for Mean and Standard deviation.
        The Solutions are output at the end of the program.
        Then the program finishes with a Goodbye ... message.

        */

        Scanner input = new Scanner(System.in);
        // Ask user to enter some data
        System.out.print("\nThis program computes the mean and the standard deviation for a set of numbers.\n\n");

        //creates an array of size 10
        double array[] = new double[5];

        // loops through the array
        for (int i = 0; i < array.length; i++){
            //places index of array
            System.out.print("Please enter a number: ");
            array[i] = input.nextDouble();
        }

        // Displays results to user, uses printf to format it
        System.out.printf("\nThe mean of this set of numbers is %.2f %n", mean(array));
        System.out.printf("The standard deviation is %.2f %n", deviation(array));
        System.out.println("\nGoodbye ...");

    }

// Compute the deviation for double values
    public static double deviation(double[] x){
        // initialize deviation to 0
        double deviation = 0;
        // n - 1
        int length = x.length - 1;
        // calls the mean method
        double m = mean(x);
        // loops through the array
        for(double i: x) {
            // xi - mean
            deviation += Math.pow(i - m, 2);
        }
        return Math.sqrt(deviation / length);

    }

    // Used same code as previous assignment, median and average is the same thing...
    public static double mean(double[] x){
        // initialize sum to 0
        double sum = 0;
        // loops
        for(double i : x)
            //adds the index value to sum
            sum += i;
        // returns the average
        return sum / x.length;
    }
}
