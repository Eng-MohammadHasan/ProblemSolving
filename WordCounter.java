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

        int wordCount = 0;
        boolean isWord = false;

        // Loop through each character in the input name
        for (int i = 0; i < inputName.length(); i++) {
            char c = inputName.charAt(i);
            
            if (c != ' ') {
                if (!isWord) {
                    wordCount++;  // Increment word count when a new word starts
                    isWord = true;
                }
            } else {
                isWord = false;  // Reset flag when encountering a space
            }
        }

        System.out.println("Number of words: " + wordCount);
    }
}
