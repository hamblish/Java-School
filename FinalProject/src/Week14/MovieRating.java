package FinalProject;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MovieRating {

    public static void main(String[] args)throws IOException {

        /*

        Shay Hamblin
        07/16/2020
        CIT 260-06: Brother Mark Gardner

        This program is allows a User to make a movie review and prints it in a txt document. The User rating includes
        their name, the name of the movie, their rating of the movie, the day they watched it, and the length of the
        film. The program also has a side function that calculates how the price of their movie ticket compares to the
        national average.

        */

        //Scanner object to get the users input.
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        //Prompts the user to enter their first name and stores the value in the firstName variable.
        System.out.print("Please Enter First Name: ");
        String firstName = input.next();
        //Prompts the user to enter their Movie Title and stores the value in the movieName variable.
        System.out.print("Please Enter Movie Title: ");
        String movieName = input.next();

        //Prompts the user to enter their Movie Rating and stores the value in the movieRating variable.
        System.out.print("Please Enter Your Movie Rating (0-100): ");
        int movieRating = input.nextInt();

        //Prompts the user to enter their movie watch date and stores the value in the dob variable.
        String dob = null;
        boolean continueInput = true;
        // if the user enters the wrong format, try again
        do {
            System.out.print("Please Enter Your Movie Watch Date (mm-dd-yyyy): ");
            dob = input.next();
            // Creates object dateFormat and sets a pattern
            DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            try {
                // parse string
                dateFormat.parse(dob);
                // exit if matches pattern
                continueInput = false;
            } // throws an exception
            catch (ParseException e){
                System.out.println("Invalid date. Please try again.");
            }
        } while (continueInput);
        //Prompts the user to enter the runtime of their movie and stores the value in the movieLength variable.
        System.out.print("Please Enter Length of Movie (hh:mm) format: ");
        String movieLength = input.next();

        //1 Object that calls its variables firstName, movieName, movieRating, dob, and movieLength.
        FinalProject.User Users = new FinalProject.User(firstName, movieName, movieRating, dob, movieLength);

        // Switch statement to determine the type of User, prompts the user to enter 1 or 2 depending on whether they would like to continue or start over.
        System.out.println("\nReview Type: ");
        System.out.println("1: See Savings");
        System.out.println("2: Cancel Movie Review");
        System.out.print("Choice: ");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                //Prompts the user to enter the price of their movie ticket and stores the value in variable ticketPrice.
                System.out.print("Please Enter The Price of Your Movie Ticket: ");
                double ticketPrice = input.nextDouble();

                //This is the average price for a movie ticket and will be compared to the user's ticket price.
                double averagePrice = 9.16;

                //Polymorphism (Array of base class User, and TicketSavings reference.) Points to an instance in the two derived classes.
                FinalProject.User[] people = {new FinalProject.User(firstName, movieName, movieRating, dob, movieLength), new FinalProject.TicketSavings(ticketPrice, averagePrice)};

                //for loop to invoke the UserCheck method within the User Class, and TicketSavings Class.
                for (int i = 0; i < people.length; i++) {
                    people[i].UserCheck();
                }
                break;

            case 2:
                System.exit(1);
                break;
            default: System.out.println("Error: Invalid Option Selected");
                System.exit(1);
        }
        // Creates a file name txt and checks if it already exist.
        java.io.File file = new java.io.File(Users.getFirstName() + Users.getmovieName()+ "MovieRating.txt");
        // if file already exist, display message and exit.
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }
        // else create a new file and get its name.
        else {
            System.out.println("\nFile created: " + file.getName());
        }
        {
            // Writes to the file and print that it wrote successfully.
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            // writes data to MovieRating.txt
            output.println("First Name: " + Users.getFirstName());
            output.println("Movie Title: " + Users.getmovieName());
            output.println("Movie Rating: " + Users.getmovieRating());
            output.println("Movie Watch Date: " + Users.getDob());
            output.println("Movie Length: " + Users.getmovieLength());
            System.out.println("Successfully wrote to the file.");
            output.close();
        }

        System.out.println("\nDisplay content from MovieRating.txt\n");

        // Read content from MovieRating.txt and displays it
        java.io.File display = new java.io.File(Users.getFirstName()+ Users.getmovieName()+"MovieRating.txt");
        Scanner inputDisplay = new Scanner(display);
        // display everything line by line until ends.
        while (inputDisplay.hasNextLine()){
            String info = inputDisplay.nextLine();
            System.out.println(info);
        }
        inputDisplay.close(); // close display

        System.out.println("\nThank you!\n");

    }
}
