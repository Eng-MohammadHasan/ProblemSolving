package diamond;

public class Diamond {

    public static void main(String[] args) {
        // Problem: Create a program that prints a diamond shape made of asterisks (*) to the console.
        // The diamond should have a specific number of rows defined by the variable 'rows'.
        
        int rows = 6; // Number of rows in the diamond

        // Upper part of the diamond
        for (int i = 1; i < rows; i++) {
            // Print leading spaces for the upper part
            for (int j = i; j <= rows; j++) {
                System.out.print("  "); // Two spaces for proper formatting
            }
            // Print left side of the diamond
            for (int j = 1; j < i; j++) {
                if (j == 1) {
                    System.out.print("* "); // First star in the row
                } else {
                    System.out.print("  "); // Print spaces for alignment
                }
            }

            // Print right side of the diamond
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print("* "); // Last star in the row
                } else {
                    System.out.print("  "); // Print spaces for alignment
                }
            }

            System.out.println(); // Move to the next line
        }

        // Lower part of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for the lower part
            for (int j = 1; j <= i; j++) {
                System.out.print("  "); // Two spaces for proper formatting
            }

            // Print left side of the diamond
            for (int j = i; j < rows; j++) {
                if (j == i) {
                    System.out.print("* "); // First star in the row
                } else {
                    System.out.print("  "); // Print spaces for alignment
                }
            }
            // Print right side of the diamond
            for (int j = i; j <= rows; j++) {
                if (j == rows) {
                    System.out.print("* "); // Last star in the row
                } else {
                    System.out.print("  "); // Print spaces for alignment
                }
            }

            System.out.println(); // Move to the next line
        }
    }
}
