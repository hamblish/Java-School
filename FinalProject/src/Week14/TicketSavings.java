package FinalProject;

public class TicketSavings extends FinalProject.User {

    //private variable with a decimal point for the ticket price of the movie.
    private double ticketPrice;

    //private variable that stores the average price of movies.
    private double averagePrice;

    //private variable to store the calculation of savings.
    private double savings;

    // no-arg constructor which creates a default TicketSavings
    public TicketSavings() {
    }

    //Uses the variables passed into the method when called, and places the new values into the same variables.
    public TicketSavings(double ticketPrice, double averagePrice) {

        //Used this.variable, with this meaning this object since we're using the same variable name as what was passed into the method.
        this.ticketPrice = ticketPrice;
        this.averagePrice = averagePrice;

    }

    //gets the private variable ticketPrice and returns it to be used.
    public double getticketPrice() {
        return ticketPrice;
    }

    //gets the private variable averagePrice and returns it to be used.
    public double getaveragePrice() {
        return averagePrice;
    }

    //gets the private variable savings and return it to be used.
    public double getsavings() {
        return savings;
    }

    //takes the value passed into the method in variable ticketPrice, and sets the private variable ticketPrice to the new value.
    public void setticketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    //takes the value passed into the method in variable ticketPrice, and sets the private variable averagePrice to the new value.
    public void setaveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }
    //takes the value passed into the method in variable savings, and sets the private variable savings to the new value.
    public void setsavings(double savings) {
        this.savings = savings;
    }


    //Method to calculate the Users savings or the amount they payed over the national average for a movie ticket.
    public void UserCheck() {

        //Determines if the User over payed or under payed comparative to the national average.
        if (ticketPrice < 9.16) {
            double savings = (averagePrice - ticketPrice);

            //Display's to the user the total savings with the two decimal places.
            System.out.println("You Saved: $" + String.format("%3.2f", savings));
        }

        //If the User over payed this out prints the information and the amount payed over the national average with two decimal places.
        else {
            double savings = ticketPrice - averagePrice;

            //Display's to the user the total pay with no overtime, rounded to two decimal points.
            System.out.println("You Over Payed: $" + String.format("%3.2f", savings));
        }
    }
}
