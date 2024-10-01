package trying;

import java.util.Scanner;

// Main class to execute the program
public class Main {
    // How can we modify the validation to support multiple valid email domains (e.g., "@gmail.com", "@yahoo.com")?

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their email
        System.out.println("Please enter your email: ");
        String userEmail = in.nextLine();  // Get user input

        // Create an object of CheckEmailValidity class
        CheckEmailValidity emailObj = new CheckEmailValidity();

        // Set and validate the email
        emailObj.setEmail(userEmail);

        // If email is valid and set, print the stored email
        if (emailObj.getEmail() != null) {
            System.out.println("Stored email: " + emailObj.getEmail());
        }
    }
}
