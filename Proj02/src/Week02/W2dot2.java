package Week02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class W2dot2 {

    public static void main(String[] args){

        Scanner input =  new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Given the price of a meal and a percentage to use for the tip, ");
        System.out.println("this program calculates the tip, the tax, and the total amount of the bill.");
        System.out.println(" ");

        System.out.println("Enter the cost of the meal: ");

        double subtotal = input.nextDouble();

        System.out.println("Enter the tip percentage: ");

        double gratiuty = input.nextDouble();
        double tax = subtotal * .032;
        double gratiutyRate = gratiuty / 10;
        double total = subtotal + gratiutyRate +tax;

        System.out.println(" ");
        System.out.println("The tip is $" + String.format("%.2f", gratiutyRate));
        System.out.println("The tax is $" + String.format("%.2f", tax));
        System.out.println("The total bill is $" + String.format("%.2f", total));

    }

}
