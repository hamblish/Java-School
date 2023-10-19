package Week08;

public class W8dot2 {
    public static void main(String[] args){

        /*

        Shay Hamblin
        06/12/2020
        CIT 260-06: Brother Mark Gardner

        This program uses the Date class to display a set of dates and times.
        Then the program finishes with a Goodbye ... message.

        */

        System.out.println("\nThis program uses the Date class to display a set of dates and times.\n");
        // Chapter 9.6.1
        java.util.Date date = new java.util.Date();

        for (long i = 10; i <= 100000000L; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
        System.out.println("\nGoodbye ...");
    }
}
