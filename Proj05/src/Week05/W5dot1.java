package Week05;

public class W5dot1 {

    public static void main(String[] args) {
        // 1 Kilogram is 2.2 pounds
        final double pondsToKilogram = 2.2;
        System.out.println("\nThis Program Prints out Killograms in multiples of 3. " +
                "\nfrom 1 to 15 and calculates how much they are in pounds.\n");
        System.out.println(" Kilograms                      Pounds");

        // index start 1, counts to 15
        for(int i = 1; i <= 15; i++) {
            // if i remainder is not equals to 0
            if (i % 2 != 0) {
                // process math to find ponds to kilogram from each loop
                double result = i * pondsToKilogram;
                System.out.println("|------------------------------------------|");
                // prints out table ................................................... round to two decimals
                System.out.println("    " + i + "                           " + Math.round(result * 10) / 10.0);
            }
        }
        System.out.println("\nGoodbye.");
    }
}