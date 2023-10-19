package Week07;

import java.util.Scanner;

public class W7dot1 {

    public static void main(String[] args) {

        /*

        Shay Hamblin
        06/06/2020
        CIT 260-06: Brother Mark Gardner

        This program allows for the user to input 5 numbers into the array I have created.
        Then the array calculates the average of the five numbers and outputs the solution at
        the end of the program. Then finishes with a Goodbye ... message.

        */

        // Scans for user input
        Scanner input = new Scanner(System.in);
        // Asks user to enter some data
        System.out.print("\nThis Program Calculates the Average of 5 numbers.\n\n");
        // creates a new array of size 5
        double array[] =  new double[5];
        // loops through the array
        for ( int i =0; i < array.length; i++ ){
            // inserts elements from the array
            System.out.print("Please enter a number: ");
            array[i] = input.nextDouble();
            //System.out.println(array[i]); just to test the array
        }
        // Displays the average...
        System.out.print("\nThe average of these five numbers is " + average(array) + "\n");
        System.out.print("\nGoodbye ...\n");
    }
    public static int average(int[] array){

        // initialize sum to 0
        int sum = 0;
        // better for loop to use
        for(int i : array)
            // add the index value to the sum
            sum += i;
        // returns the average
        return sum / array.length;

    }

    public static double average(double[] array){
        // same as above but in type double
        double sum = 0;
        for(double i : array)
            sum += i;
        return sum / array.length;


    }
}
