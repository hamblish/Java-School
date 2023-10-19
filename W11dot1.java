package Week11;

import java.util.Scanner;
public class W11dot1 {

    /*

Shay Hamblin
07/04/2020
CIT 260-06: Brother Mark Gardner

This program gets 10 numbers from the user and calculates the average.

*/

    public static void main(String[] args) {
        System.out.println("\nThis program gets ten numbers from the user, and\n" +
                           "computes and displays the average.\n");
        System.out.println("Please enter ten integer values.\n");

        Scanner scanner = new Scanner(System.in);

        /* Declaring array of elements */

        double[] arr = new double[10];
        double total = 0;

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter integer "+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }



        double average = total / arr.length;

        System.out.format("\nThe average of the input values is %.2f", average);
        System.out.format("\nGoodbye...\n");
    }
}