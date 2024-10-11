package training;

import java.util.Scanner;

/**
 * This program generates a multiplication pattern based on user input.
 * 
 * Problem:
 * The user is prompted to enter the number of lines and the number of digits for each line.
 * The program then prints a pattern where each line contains a sequence of numbers.
 * Each number in a line is the product of the line number and the position in the line.
 * 
 * Example:
 * If the user enters 3 for the number of lines and 4 for the number of digits per line,
 * the output will be:
 * 
 * 1 2 3 4
 * 2 4 6 8
 * 3 6 9 12
 * 
 * This pattern helps to visualize multiplication in a grid format.
 */

public class MultiplicationPattern {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Declare variables for loops
        int i, j;

        // Prompt the user to enter the number of lines for the output
        System.out.println("Enter number of lines : ");
        int lines = in.nextInt(); // Read the number of lines from user input

        // Prompt the user to enter the number of digits for each line
        System.out.println("Enter number of digits for each line :");
        int Digits_Number_For_Each_Line = in.nextInt(); // Read number of digits per line

        // Outer loop to iterate over each line
        for (i = 1; i <= lines; i++) {

            // Inner loop to print the desired number of digits on each line
            for (j = 1; j <= Digits_Number_For_Each_Line; j++) {

                // Print the product of the current line and digit number, followed by a space
                System.out.print(j * i + " ");
            }

            // Print a new line after each row of digits
            System.out.println();
        }
    }
}
