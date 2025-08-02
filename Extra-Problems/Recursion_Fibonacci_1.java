/**
 * Problem: Write a recursive program to find the Fibonacci number at a specific
 * position.
 * The Fibonacci sequence starts with 0 and 1, and each subsequent term is the
 * sum of the previous two.
 * 
 * Example:
 * For an input of 7, the output should be: "Fibonacci number at position 7 is
 * 13"
 */

public class Recursion_Fibonacci_1 {

    // Recursive method to calculate the Fibonacci number at a given position
    public static int fibonacci(int number) {
        // Fibonacci sequence positions: 0 1 2 3 4 5 6 7 8 9 10
        // Corresponding values: 0 1 1 2 3 5 8 13 21 34 55

        // Base case: if the position is 0 or 1, return the position itself
        if (number == 0 || number == 1) {
            return number;
        }
        // Recursive case: return the sum of the previous two Fibonacci numbers
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        int number = 7; // Specify the position in the Fibonacci sequence
        // Output the Fibonacci number at the specified position
        System.out.println("Fibonacci number at position " + number + " is " + fibonacci(number));
    }
}
