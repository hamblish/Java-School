package Week03;

import java.util.Scanner;

public class W3dot2 {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Given a year and a month in that year, this program will tell you");
        System.out.println("the number of days in that month.");
        System.out.println(" ");


        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a value for the month(1 = Jan, 2 = Feb, etc): ");
        int month = input.nextInt();

        System.out.print("\n");

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
       // if (month > 1) {
            if (month < 13 && month > 1) {

                switch (month) {

                    case 1:
                        System.out.println("January " + year + " has 31 days");
                        break;
                    case 2:
                        System.out.println("February " + year + " has" + ((isLeapYear) ? " 29 days" : " 28 days"));
                        break;
                    case 3:
                        System.out.println("March " + year + " has 31 days");
                        break;
                    case 4:
                        System.out.println("April " + year + " has 30 days");
                        break;
                    case 5:
                        System.out.println("May " + year + " has 31 days ");
                        break;
                    case 6:
                        System.out.println("June " + year + " has 30 days ");
                        break;
                    case 7:
                        System.out.println("July " + year + " has 31 days ");
                        break;
                    case 8:
                        System.out.println("August " + year + " has 31 days ");
                        break;
                    case 9:
                        System.out.println("September " + year + " has 30 days ");
                        break;
                    case 10:
                        System.out.println("October " + year + " has 31 days ");
                        break;
                    case 11:
                        System.out.println("November " + year + " has 30 days ");
                        break;
                    case 12:
                        System.out.println("December " + year + " has 31 days ");
                        break;
                }


            }
            else{
            System.out.print((month) + " is invalid.\nMonth values must be between between 1 and 12, inclusive.\nGoodbye.\n");
            System.exit(1);
        }
    }
}
