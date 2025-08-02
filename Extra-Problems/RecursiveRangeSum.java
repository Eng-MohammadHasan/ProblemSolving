
/**
 * Problem: Write a recursive program to calculate the sum of all integers between two given numbers (inclusive).
 * The program should work regardless of whether the first number is smaller or larger than the second number.
 *
 * Example:
 * For an input of 6 and 4, the output should be: "The sum of 6 and 4 is: 15"
 */
public class RecursiveRangeSum {

    // Recursive method to calculate the sum between two numbers
    static int sum(int number1, int number2) {
        if (number1 == number2) { // Base case: if both numbers are equal, return the number itself
            return number1;
        } else {
            // Recursive case: calculate sum based on which number is larger
            if (number1 < number2) {
                return number1 + sum(number1 + 1, number2);
            } else {
                return number1 + sum(number1 - 1, number2);
            }
        }
    }

    public static void main(String[] args) {
        int number1 = 6; // First number
        int number2 = 4; // Second number

        // Output the sum of the numbers between number1 and number2
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum(number1, number2));
    }
}
