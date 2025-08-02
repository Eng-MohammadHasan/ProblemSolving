import java.util.Scanner;
/*
Write a method that prompt the user to enter 10 strings & spilt each String from the middle &
then display each String on a line in which the second substring from each string will be first and the
first substring will be the second ... 
*/
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] stringArr = new String[10];

        // Prompt the user to enter 10 strings
        for (int i = 0; i < 10; i++) {
            System.out.println("Please Enter string Number " + (i + 1) + " : ");
            stringArr[i] = in.nextLine();
        }

        // Process each string
        for (int i = 0; i < 10; i++) {
            int middleIndex = stringArr[i].length() / 2;
            String firstHalf = stringArr[i].substring(0, middleIndex);
            String secondHalf = stringArr[i].substring(middleIndex);
            stringArr[i] = secondHalf + firstHalf; // Swap the halves
        }

        // Display the processed strings
        System.out.println("**************************************\n\n\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(stringArr[i]);
        }

        in.close(); // Close the scanner
    }
}
