package Week02;

import java.util.Scanner;

public class  W2dot1 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("This program converts a temperature in degrees Celsius into");
        System.out.println("a temperature in degrees Fahrenheit.");
        System.out.println(" ");

        System.out.println("Enter a degree in Celsius: ");
        int celsius = input.nextInt();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

    }
    
}
