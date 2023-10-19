package Week06;

import java.util.Scanner;

public class W6dot1 {

    public static void main(String[] args) {
        // user's input...

        System.out.println("\nGiven an investment amount and an annual interest rate, this program");
        System.out.println("will calculate the future value of the investment for a period of");
        System.out.println("ten years.\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive, non-zero value for the investment: ");
        double invested = input.nextDouble();
        System.out.print("Enter an annual interest rate, between 0 and 100: ");
        double annualInterestRate = input.nextDouble();

        if (invested >0) {
            if (annualInterestRate >0) {
                // Calculate monthly rate by dividing annual by 12 and divide by 100 to make it to percentage
                double monthlyInterestRate = (annualInterestRate / 12) / 100;
                // Display table
                System.out.println("\nYears    Future Value");

                // loop from 1 to 30
                for (int i = 1; i <= 10; i++) {
                    //Display results
                    System.out.printf("%3d", i);
                    System.out.printf("%15.2f\n", futureInvestmentValue(invested, monthlyInterestRate, i));
                }
                System.out.println("\nGoodbye!\n");
            }
            else{
                System.out.print((annualInterestRate) + " is invalid.\n You must enter a positive number.\n Goodbye.\n");
                System.exit(1);
            }
        }
        else{
            System.out.print((invested) + " is invalid.\n You must enter a positive number.\n Goodbye.\n");
            System.exit(1);
        }
    }

    /* Future Investment Formula
     * Input: Investment Amount, Monthly Interest Rate, years
     * Output: Future Investment
     * Formula: FV1 = PV(1 + !)^n
     * Where PV = Present value, ! interest rate, n number of
     * compounding periods(years)
     */
    private static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {

        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

    }

}
