package Week06;

public class W6dot2 {
    public static void main(String[] args){

        System.out.println("\nThis program converts Celsius to Fahrenheit then back.");
        System.out.println("Now you'll know if you need a jacket whether your at home");
        System.out.println("or abroad.\n");

        // Displays table
        System.out.println("\n   Celsius   |   Fahrenheit   ");

        for (double celsius = 40.0; celsius >= 31.0; celsius--){

            // Displays results and calls celsiusToFahrenheit method
            System.out.printf("%8.1f", celsius);
            System.out.printf("%16.1f\n", celsiusToFahrenheit(celsius));

        }
        // Displays second table
        System.out.println("================================");
        System.out.println(" ");
        System.out.println(" Fahrenheit  |    Celsius   ");

        for(double fahrenheit = 120.0; fahrenheit >= 30.0; fahrenheit-=10){
            // Displays results and calls fahrenheitToCelsius method
            System.out.printf("%8.1f", fahrenheit);
            System.out.printf("%16.2f\n",fahrenheitToCelsius(fahrenheit));

        }
        System.out.println("\nGoodbye.\n");
    }
    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius){

        return (9.0 / 5) * celsius + 32;
    }

    /** Convert from fahrenheit to celsius */
    public static double fahrenheitToCelsius(double fahrenheit){

        return (5.0 / 9) * (fahrenheit - 32);
    }
}
