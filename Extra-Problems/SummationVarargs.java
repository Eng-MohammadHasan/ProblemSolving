package Varargs;

import java.util.ArrayList;
import java.util.Scanner;

public class SummationVarargs {

    // (Varargs) ---> Variable_Number_Of_Arguments :)
    /*
    
    Write a Java program that prompts the user to enter an unknown number of integers,
    then uses a method that accepts a variable number of arguments 
    to calculate and print the summation of these integers.

        Requirements:
           1- The program should keep asking the user for integers until the user enters a non-integer (e.g., a character or a word).
           2- After the user stops inputting numbers, the program should pass all the integers to a method that uses varargs to compute the sum.
           3- Print the result of the summation.
     */
    static Scanner input = new Scanner(System.in);

    // Varargs method to sum the numbers
    public static int summation(int... n) {
        int summation = 0;
        for (int z : n) {
            summation += z;
        }
        return summation;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); // To store all numbers
        boolean validation = true;

        System.out.println("Enter (-1) to exit :) ");
        while (validation) {
            System.out.println("Please Enter an Integer: ");
            int number = input.nextInt();

            if (number == -1) {
                validation = false; // Stop the input loop if -1 is entered
            } else {
                numbers.add(number); // Add the number to the list
            }
        }

        // Create an array to store the numbers (without using streams)
        int[] numArray = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            numArray[i] = numbers.get(i); // Copy elements from ArrayList to array
        }

        // Call the summation method and pass the array
        int finalSummation = summation(numArray);
        System.out.println("The final Summation of all Entered integers = " + finalSummation);
    }

/* 
    ///////~~~~~ Professional-solution ~~~~~~////////
                
        public class SummationVarargs {
            
            // Method to calculate the sum using varargs
            public static int summation(int... numbers) {
                int sum = 0;
                for (int num : numbers) {
                    sum += num; // Add each number to the sum
                }
                return sum; // Return the final sum
            }
        
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ArrayList<Integer> numberList = new ArrayList<>(); // List to store the entered numbers
        
                System.out.println("Enter integers (enter a non-integer to stop):");
        
                // Continuously prompt the user for input until a non-integer is entered
                while (true) {
                    try {
                        System.out.print("Enter a number: ");
                        int number = scanner.nextInt(); // Try to read an integer
                        numberList.add(number); // Add the integer to the list
                    } catch (Exception e) {
                        // When a non-integer is entered, break out of the loop
                        System.out.println("Non-integer entered, stopping input...");
                        break;
                    }
                    scanner.nextLine(); // Clear the buffer
                }
        
                // Convert the ArrayList to an array of integers
                int[] numbersArray = numberList.stream().mapToInt(i -> i).toArray();
        
                // Call the summation method and pass the array using varargs
                int totalSum = summation(numbersArray);
        
                // Output the result
                System.out.println("The summation of the entered numbers is: " + totalSum);
            }
        }
*/

}
