package training;

import java.util.Scanner;

/**
 * This program reverses a string input by the user.
 *
 * Problem: The user is prompted to enter a string. The program then outputs the
 * string in reverse order, displaying each character from the last to the
 * first.
 *
 * Example: If the user enters "mohammad", the output will be:
 *
 * dammahom
 *
 * This program helps practice string manipulation and iteration over characters
 * in reverse order.
 */
public class StringReverser {

    // Create a Scanner object for reading user input
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Prompt the user to enter a string
        System.out.println("Enter a String :");
        String name = in.nextLine(); // Read the string input from the user

        // Loop through the string in reverse order and print each character
        for (int i = name.length() - 1; i >= 0; i--) { // Start from the last character
            System.out.print(name.charAt(i)); // Print the current character
        }

    }
}
