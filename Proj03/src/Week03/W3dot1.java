package Week03;

import java.util.Scanner;

public class   W3dot1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Given today's day of the week and some number of days in the future");
        System.out.println("this program will tell you the day of the week for the future day.");
        System.out.println(" ");

        System.out.print("Enter today's day of the week (0 for Sunday, 1 for Monday, etc): ");
        int today = input.nextInt();
        System.out.print("Enter the number of days in the future: ");
        int daysElapse = input.nextInt();
        int future = (today + daysElapse) % 7;
        System.out.print("\n");


        if (future >=0) {
        if (today >=0) {
            System.out.print("Today is ");
            switch (today) {
                case 0:
                    System.out.print("Sunday");
                    break;
                case 1:
                    System.out.print("Monday");
                    break;
                case 2:
                    System.out.print("Tuesday");
                    break;
                case 3:
                    System.out.print("Wednesday");
                    break;
                case 4:
                    System.out.print("Thursday");
                    break;
                case 5:
                    System.out.print("Friday");
                    break;
                case 6:
                    System.out.print("Saturday");
                    //  break;
                    //default: System.out.print("Try again");
                    //  System.exit(1);

                }

        }

        else{
            System.out.print((today) + " is invalid.\n You must enter a positive number.\n Goodbye.\n");
            System.exit(1);
        }

            System.out.print(" and the future day is ");
            switch (future) {
                case 0:
                    System.out.print("Sunday");
                    break;
                case 1:
                    System.out.print("Monday");
                    break;
                case 2:
                    System.out.print("Tuesday");
                    break;
                case 3:
                    System.out.print("Wednesday");
                    break;
                case 4:
                    System.out.print("Thursday");
                    break;
                case 5:
                    System.out.print("Friday");
                    break;
                case 6:
                    System.out.print("Saturday");
                    break;
            }
            System.out.print(" Goodbye.");
        }
        else{
            System.out.print((daysElapse) + " is invalid.\n You must enter a positive number.\n Goodbye.\n");
            System.exit(1);
        }

    }

}
