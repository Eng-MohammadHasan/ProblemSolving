package training;

import java.util.Scanner;

public class WordCounter {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your name:");
        String inputName = scanner.nextLine();

        // Trim leading and trailing spaces and check if the name is empty
        inputName = inputName.trim();
        if (inputName.isEmpty()) {
            System.out.println("The input is empty.");
            return;
        }

        int wordCount = 1; // Start with 1 because there will be at least one word

        // Loop through each character in the input name
        for (int i = 0; i < inputName.length(); i++) {
            if (inputName.charAt(i) == ' ') {
                // Increment word count for each space found
                wordCount++;
            }
        }

        System.out.println("Number of words: " + wordCount);
    }
}
