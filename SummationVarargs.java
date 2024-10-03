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
}
