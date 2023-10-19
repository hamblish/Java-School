package FinalProject;

public class User {

    //private variable for the users first name.
    private String firstName;

    //private variable for the users Movie Title.
    private String movieName;

    //private variable with no decimal points for the users Movie Rating.
    private int movieRating;

    //private variable for the users Movie Watch Date.
    private String dob;

    //private variable for the users movie runtime entry.
    private String movieLength;

    // no-arg constructor which creates a default User
    public User() {

    }

    //Uses the variables passed into the method when called, and places the new values into the same variables.
    public User(String firstName, String movieName, int movieRating, String dob, String movieLength) {

        //Used this.variable, with this meaning this object since we're using the same variable name as what was passed into the method.
        this.firstName = firstName;
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.dob = dob;
        this.movieLength = movieLength;
    }

    //gets the private variable firstName and returns it to be used.
    public String getFirstName() {
        return firstName;
    }

    //takes the value passed into the method in variable firstName, and sets the private variable firstName to the new value.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //gets the private variable movieName and returns it to be used.
    public String getmovieName() {
        return movieName;
    }

    //takes the value passed into the method in variable movieName, and sets the private variable movieName to the new value.
    public void setmovieName(String movieName) {
        this.movieName = movieName;
    }

    //gets the private variable movieRating and returns it to be used.
    public int getmovieRating() {
        return movieRating;
    }

    //takes the value passed into the method in variable movieRating, and sets the private variable movieRating to the new value.
    public void setmovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    //gets the private variable dob and returns it to be used.
    public String getDob() {
        return dob;
    }

    //takes the value passed into the method in variable dob, and sets the private variable dob to the new value.
    public void setDob(String dob) {
        this.dob = dob;
    }

    //gets the private variable movieLength and returns it to be used.
    public String getmovieLength() {
        return movieLength;
    }

    //takes the value passed into the method in variable movieLength, and sets the private variable movieLength to the new value.
    public void setmovieLength(String movieLength) {
        this.movieLength = movieLength;
    }


    //Method to display the users check with the users name, Movie Rating, Movie Watch Date, and social security number.
    public void UserCheck() {
        System.out.println("\nUser: " + firstName + "\nMovie Title: " + movieName + "\nMovie Watch Date: " + dob + "\nMovie Rating: " + movieRating + "\nmovieLength: " + movieLength);

    }

}
