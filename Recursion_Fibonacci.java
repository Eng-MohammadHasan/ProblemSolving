/**
 * Problem: Write a program to print the Fibonacci sequence up to a specified
 * number of terms.
 * The Fibonacci sequence starts with 0 and 1, and each subsequent term is the
 * sum of the previous two.
 * 
 * Example:
 * For an input of 4, the output should be: 0 1 1 2
 */

public class Recursion_Fibonacci {

    // Initial values of the Fibonacci sequence
    // Fibonacci sequence: 0 1 1 2 3 5 8 13 21 34 55 ...
    static int number0 = 0, number1 = 1, number2;

    // Recursive method to print Fibonacci numbers
    static void printFibonacci(int number) {
        // Check if the count of remaining numbers to print is greater than 0
        if (number > 0) {
            // Calculate the next Fibonacci number
            number2 = number0 + number1;

            // Update the first and second numbers for the next calculation
            number0 = number1;
            number1 = number2;

            // Print the next Fibonacci number
            System.out.print(" " + number2);

            // Recursive call to print the next number in the sequence
            printFibonacci(number - 1);
        }
    }

    public static void main(String[] args) {
        // Print the initial two numbers of the Fibonacci sequence
        System.out.print(number0 + " " + number1);
        int num = 4; // Specify how many Fibonacci numbers to print (starting from 0, 1)

        // Call the recursive method to print the rest of the sequence
        printFibonacci(num - 2);
    }
}
