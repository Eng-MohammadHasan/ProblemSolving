package training;

import java.util.Scanner;

/**
 * This program calculates the sum of all integers between two user-input
 * numbers, inclusive of both endpoints. The program prompts the user to enter
 * two integers (a and b), and it will add all numbers between them. If the user
 * wishes, they can continue with new inputs.
 */
public class SumBetweenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Loop to allow the user to continue entering numbers until they choose to exit
        do {
            int sum = 0; // Variable to store the sum of numbers between a and b

            // Prompt the user for the first integer
            System.out.print("Enter the first integer (a): ");
            int firstNumber = scanner.nextInt();

            // Prompt the user for the second integer
            System.out.print("Enter the second integer (b): ");
            int secondNumber = scanner.nextInt();

            // If firstNumber is greater than or equal to secondNumber
            if (firstNumber >= secondNumber) {
                // Iterate from firstNumber down to secondNumber
                for (int i = firstNumber; i >= secondNumber; i--) {
                    sum += i; // Add each integer to the sum
                }
                System.out.println("Summation: " + sum);

                // If secondNumber is greater than or equal to firstNumber
            } else {
                // Iterate from secondNumber down to firstNumber
                for (int i = secondNumber; i >= firstNumber; i--) {
                    sum += i; // Add each integer to the sum
                }
                System.out.println("Summation: " + sum);
            }

            // Prompt user to continue or exit the loop
            System.out.println("Do you want to continue? (yes/press any key to exit)");
        } while (scanner.next().equalsIgnoreCase("yes"));

        scanner.close(); // Close the scanner
    }
}
