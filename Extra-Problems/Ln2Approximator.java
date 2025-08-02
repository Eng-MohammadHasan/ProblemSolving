package training;

import java.util.Scanner;

/**
 * This program approximates the natural logarithm of 2 (ln(2)) using a series.
 *
 * Problem: The user is prompted to enter the number of terms (n) to use in the
 * approximation. The program then calculates an approximation of ln(2) using
 * the alternating harmonic series:
 *
 * ln(2) = 1 - 1/2 + 1/3 - 1/4 + 1/5 - ... ± 1/n
 *
 * The more terms the user specifies, the more accurate the approximation of
 * ln(2) becomes.
 *
 * Example: If the user enters 5, the calculation would be: ln(2) ≈ 1 - 1/2 +
 * 1/3 - 1/4 + 1/5
 *
 * This program demonstrates series approximation and alternating sums.
 */
// ~~~~~~~~~~~~~~~~~ First solution ~~~~~~~~~~~~~~~~~~~~ 
public class Ln2Approximator {

    // Method to approximate the natural logarithm of 2 using n terms
    public static double approximateLn2(int terms) {

        double sum = 0.0; // Variable to store the sum of terms
        boolean isAddition = true; // Flag to alternate between addition and subtraction

        // Loop through the series and calculate the sum of terms
        for (int termNumber = 1; termNumber <= terms; termNumber++) {
            if (isAddition) {
                sum += 1.0 / termNumber; // Add term if isAddition is true
            } else {
                sum -= 1.0 / termNumber; // Subtract term if isAddition is false
            }
            isAddition = !isAddition; // Toggle the flag for alternating signs
        }

        return sum; // Return the result of the series approximation
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input

        // Get input from the user
        System.out.print("Enter the number of terms (n): ");
        int terms = scanner.nextInt(); // Read the number of terms to use in the series

        // Calculate and display the approximation of ln(2)
        System.out.println("Natural logarithm of 2 using " + terms + " terms: " + approximateLn2(terms));
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~ Second solution ~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
    /*
                // Method to approximate the natural logarithm of 2 using n terms
       public static double approximateLn2(int terms) {
           double sum = 0.0; // Variable to store the sum of terms

           // Loop through the series and calculate the sum of terms
           for (int i = 1; i <= terms; i++) {
               // Use the Taylor series formula for ln(1+x)
               if (i % 2 == 1) {
                   sum += 1.0 / i; // Add the odd terms
               } else {
                   sum -= 1.0 / i; // Subtract the even terms
               }
           }

           return sum; // Return the result of the series approximation
       }

       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in); // Create Scanner object for user input

           // Get input from the user
           System.out.print("Enter the number of terms (n): ");
           int terms = scanner.nextInt(); // Read the number of terms to use in the series

           // Calculate and display the approximation of ln(2)
           System.out.println("Approximate natural logarithm of 2 using " + terms + " terms: " + approximateLn2(terms));
       }
    
     */
}
