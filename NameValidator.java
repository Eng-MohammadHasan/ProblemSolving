package java1;

import java.util.Scanner;

/**
 * Problem Statement:
 * Write a Java program that validates a user's name based on specific conditions:
 * 1. The name should not contain the character '$' or the digit '5'.
 * 2. The name should have at least 2 characters.
 * 3. If the name passes the validation, determine whether it starts with a vowel or a consonant.
 *
 * Task:
 * - If the name contains '$' or '5', or is shorter than 2 characters, output "Error: Invalid name format".
 * - Otherwise, check if the first character is a vowel (a, e, i, o, u). If yes, output "The name starts with a vowel".
 * - If the name starts with any other letter, output "The name starts with a consonant".
 */

public class NameValidator {

    // Creating a Scanner object for user input
    static Scanner scanner = new Scanner(System.in);

    /**
     * This method checks the validity of the provided name.
     * It ensures the name doesn't contain special characters or numbers and
     * checks if it starts with a vowel or a consonant.
     *
     * @param name The input name to be validated
     */
    public static void validateName(String name) {
        // Check if the name contains the character '$', the digit '5', or is less than 2 characters long
        if (name.indexOf("$") != -1 || name.indexOf("5") != -1 || name.length() < 2) {
            System.out.println("Error: Invalid name format");
        } else {
            // Check if the name starts with a vowel
            if (name.indexOf("a") == 0 || name.indexOf("u") == 0 || name.indexOf("e") == 0 
                || name.indexOf("i") == 0 || name.indexOf("o") == 0) {
                System.out.println("The name starts with a vowel");
            } else {
                System.out.println("The name starts with a consonant");
            }
        }
    }

    public static void main(String[] args) {
        // Prompt the user to enter their name
        System.out.println("Enter your name:");
        String userName = scanner.nextLine();

        // Validate the entered name
        validateName(userName);
    }
}
