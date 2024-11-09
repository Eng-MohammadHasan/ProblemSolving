
import java.util.Scanner;

public class Prac {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your name:");
        String inputName = scanner.nextLine();

        // Trim leading and trailing spaces and check if the name is empty
        inputName = inputName.trim();
        if (inputName.isEmpty()) {
            System.out.println("The input is empty.");
            return;
        } else {
            System.out.println("The number of words in your name is: " + countWords(inputName)); // calling the method
        }

    }

    // Method to count the number of words in a string :> 
    static int countWords(String userName) {
        int wordCount = 0;
        boolean isWord = false;

        // Loop through each character in the input name
        for (int i = 0; i < userName.length(); i++) {
            char character = userName.charAt(i);

            if (character != ' ') {
                if (!isWord) { // !!! --(if false)   
                    wordCount++; // Increment word count when a new word starts
                    isWord = true;
                }
            } // ! this else is for outer if  
            else {
                isWord = false; // Reset flag when encountering a space
            }
        }

        return wordCount;
    }
    /* 
    Conclusion:
    1. The main method prompts the user for their name, trims any leading/trailing spaces, 
       and checks if the input is empty. If not, it calls the countWords method to count
       and display the number of words in the input.

    2. The countWords method counts words by iterating through each character in the string:
        - 'wordCount' keeps track of the total number of words.
        - 'isWord' is a flag that checks if we are currently inside a word.
        - Each time a new word starts (when a non-space character follows a space), 
          wordCount is incremented and isWord is set to true.
        - When a space is encountered, isWord is set back to false, allowing the next 
          non-space character to start a new word.

    3. This logic allows us to count words efficiently, with 'wordCount' accurately representing 
       the number of words by the end of the loop. The method returns this count, which is then 
       displayed in the main method.
     */
}
