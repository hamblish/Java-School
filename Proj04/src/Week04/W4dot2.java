package Week04;

import java.util.Scanner;

public class W4dot2 {
    public static void main (String args[]){

        // User inputs
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Given your name, hours worked, and hourly wage, this program calculates your");
        System.out.println("gross pay, state withholding tax, federal withholding tax, and your net pay.");
        System.out.println("It then displays your pay stub.");

        System.out.print("\nEnter your first and last name: ");
        String name = input.nextLine();
        System.out.print("Enter the hours you worked this week: ");
        double hours = input.nextDouble();
        System.out.print("Enter your hourly wage: ");
        double rate = input.nextDouble();

        System.out.println("\n================================================");
        // Calculations
        double grossPay = (hours * rate);
        double fedHolding = (grossPay * .2);
        double stateHolding = (grossPay * .09);
        double total = (fedHolding + stateHolding);
        double netPay = ( grossPay - total);

        // displays the employee payroll
        System.out.printf(
                "Pay Stub for " + name +
                "\nHours Worked: " + hours +
                "\nHourly Wage: $" + String.format("%3.2f", rate) +
                "\nGross Pay: $" + String.format("%3.2f", grossPay) +
                "\nDeductions:" +
                "\n   State Tax Withheld (9%%): $" + String.format("%3.2f", stateHolding) +
                "\n   Federal Tax Witheld (20%%): $" + String.format("%3.2f", fedHolding) +
                "\n   Total Deduction: $" + String.format("%3.2f", total) +
                "\nNet Pay: $" + String.format("%3.2f", netPay) +
                "\n\nGoodbye.\n"
        );
    }
}
