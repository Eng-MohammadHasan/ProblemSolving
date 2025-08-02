// Problem Solving: Sort an ArrayList of Strings based on the first character (case-insensitive)

import java.util.Scanner;
import java.util.ArrayList;

class Main {
 
    static Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
      
        words.add("zakaria");
        words.add("ahmed");
        words.add("Fasel");
       
        // Bubble sort based on the first character (case-insensitive)
        for (int i = 0; i < words.size() - 1; i++) {
            for (int j = 0; j < words.size() - 1 - i; j++) {
                if (words.get(j).toLowerCase().charAt(0) > words.get(j + 1).toLowerCase().charAt(0)) {
                    // swap 
                    String temp = words.get(j);
                    words.set(j, words.get(j + 1));
                    words.set(j + 1, temp);
                }
            }
        }

        System.out.print(words);
    }
}
