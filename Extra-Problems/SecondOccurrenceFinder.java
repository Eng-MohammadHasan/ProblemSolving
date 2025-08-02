package training;

import java.util.Scanner;

/**
 * This program finds the second occurrence of a specified letter in a user's
 * name.
 *
 * Problem: The user is prompted to enter their name, which should contain three
 * syllables. Then, they are asked to enter a letter, and the program will find
 * the second occurrence of this letter in their name.
 *
 * Example: If the user enters "mohammad" and the letter 'm', the program will
 * output the position of the second occurrence of 'm'. If the letter does not
 * appear twice, the program will notify the user accordingly.
 */
public class SecondOccurrenceFinder {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Prompt the user to enter their name
        System.out.println("Please enter your name (from three syllables):");
        String name = in.nextLine();

        // Prompt the user to enter a letter to find its second occurrence
        System.out.println("Please enter a letter to find its second occurrence in your name:");
        char letter = in.next().charAt(0);

        // Find the first occurrence of the specified letter
        int firstOccurrence = name.indexOf(letter);
        // Find the second occurrence of the specified letter, starting from after the first occurrence
        int secondOccurrence = name.indexOf(letter, firstOccurrence + 1);

        // Check if the user has entered an empty string for the name
        if (name.isEmpty()) {
            System.out.println("Nothing is entered!");

        } else {
            // Check if the letter exists in the name
            if (firstOccurrence == -1) {
                System.out.println("The letter you entered doesn't exist!");

                // Check if the letter does not have a second occurrence
            } else if (secondOccurrence == -1) {
                System.out.println("The letter you entered doesn't have a second occurrence!");

            } else {
                // Output the index of the second occurrence
                System.out.println("Second occurrence: " + secondOccurrence);
            }
        }
    }
}
